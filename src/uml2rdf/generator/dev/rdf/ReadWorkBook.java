package uml2rdf.generator.dev.rdf;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.net.URLClassLoader;
import java.net.URLDecoder;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import java.io.FileWriter;
import java.lang.annotation.Annotation;

import org.apache.commons.beanutils.PropertyUtils;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.hp.hpl.jena.ontology.OntModel;
import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.rdf.model.ModelFactory;

import thewebsemantic.Bean2RDF;
import uml2rdf.utils.CSVCreatorUtils;
import uml2rdf.utils.PrimaryKeyUtils;
import uml2rdf.utils.StringFormat;
import uml2rdf.utils.Xref;

import javax.validation.Validation;
import javax.validation.ValidationException;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.apache.commons.lang.builder.ReflectionToStringBuilder;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;


public class ReadWorkBook {

	private static final String ANNOT_VALUE = "AVALUE";
	private static final String ANNOT_NAME = "ANAME";
	private static final String PK_FIELDNAME = "primarykey";
	final OntModel om = ModelFactory.createOntologyModel();
	final Bean2RDF owriter = new Bean2RDF(om);

	private final Log logger = LogFactory.getLog(getClass());
	private boolean  showUnknownFieldException=false;
	private String file;

	private String fileType;
	// overwritePK=true overwrite PK even if already present in data
	private boolean  overwritePK=true;
	private String generatedjar;

	boolean exportRDF = false;
	boolean exportCSV = false;

	public String getGeneratedjar() {
		return generatedjar;
	}

	public void setGeneratedjar(String jar) {
		this.generatedjar = jar;
	}

	public String getFileType() {
		return fileType;
	}

	public void setFileType(String fileType) {
		this.fileType = fileType;
	}

	public String getFile() {
		return file;
	}

	public void setFile(String file) {
		this.file = file;
	}

	public ReadWorkBook(String file, String fType, String jar){
		this.file = file;
		this.fileType=fType;
		this.generatedjar=jar;

	}

	public ReadWorkBook(){}

	public Set validate(Object ba) {
		logger.info(String.format("going to validate instance of %s ",ba.getClass() ));
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<?> constraintViolations = validator.validate(ba);
		return constraintViolations;
	}

	//*********** How to read An Excel File ***********
	public void parseFile(String export, String exportformat, String ouputpath) {
		logger.info("start:parseFile");
		// To access an input file content
		if (export.equals("RDF")) {
			exportRDF = true;
		}
		if (export.equals("CSV")) {

			exportCSV = true;
		}
		try {
			FileInputStream file = new FileInputStream(new File(this.file));
			Sheet sheet =null;
			if(this.fileType.toLowerCase().equals("excel")){
				Workbook workbook = new HSSFWorkbook(file);
				sheet = workbook.getSheetAt(0);	
			}
			else if (this.fileType.toLowerCase().equals("oo")){
				Workbook workbook = new XSSFWorkbook(file);
				sheet = workbook.getSheetAt(0);	
			}
			else if (this.fileType.toLowerCase().equals("csv")){
				//TODO implement is  ??
			}
			parseSheet(sheet, exportformat, ouputpath);
			file.close();
		}
		catch (Exception e) {
			e.printStackTrace();
			System.err.println("jar not found ");
			System.exit(1);
		}
		logger.info("end:parseFile");
	}

	@SuppressWarnings("null")
	private void parseSheet(Sheet sheet, String exportformat, String ouputpath ) throws Exception {
		boolean goon=true;
		String stopCause="";
		String  exportFormat = ""; //csv_askomics, rdf_xml ...
		String outputFilePath= ouputpath;

		if (exportformat.equals("turtle")) {
			exportFormat ="TURTLE";
		}
		if (exportformat.equals("XML")) {
			exportFormat ="RDF/XML";
		}

		int maxHeaderColIndex=0;
		HashMap<Integer,String> colIdx2FieldN = new HashMap<Integer,String>();

		//Find the referenced template according to the sheet
		String sheetName = sheet.getSheetName();
		String classN=extractClassNameFromLabel(sheetName);
		Object ba = selectTargetClass(classN);
		outputFilePath= outputFilePath+classN;



		//Iteration trough each rows
		int rowIndex=0;

		//sheet.getRow(2);
		Iterator<Row> rowIterator = sheet.iterator();
		FileWriter writerCSV = new FileWriter(outputFilePath+".csv");
		boolean Header = false;
		while (rowIterator.hasNext()) {

			Row row = rowIterator.next();

			//row.getCell(2);
			Iterator<Cell> cellIterator = row.cellIterator();
			int columnIndex=0;

			// Iteration through each cells and content reading
			boolean isCommentRow=false;
			boolean isHeaderRow=false;


			while (cellIterator.hasNext()) {

				Cell cell = cellIterator.next();

				Object v =null;
				if (cell.getCellTypeEnum().equals(CellType.NUMERIC)){
					v = new Double(cell.getNumericCellValue());
				}
				else if(cell.getCellTypeEnum().equals(CellType.STRING)){
					v = cell.getStringCellValue();
				}
				else{
					v = cell.toString();
				}
				logger.debug("Cell value type checked");
				String fieldName=null;
				if(rowIndex==0){

					isHeaderRow=true;
					//header parsing
					String vc=null;
					if(v!=null ){
						vc=v.toString().trim();
						if(!vc.equals("")){
							fieldName=StringFormat.firstToLowerCase(vc);

							colIdx2FieldN.put(columnIndex, fieldName);

							maxHeaderColIndex++;
						}
						else{
							goon=false;
							stopCause=String.format(" header field index %s is an empty string",columnIndex);
						}
					}
					else{
						goon=false;
						stopCause=String.format(" header field index %s has a null value",columnIndex);
					}
				}

				if(rowIndex==1 && v.toString().trim().startsWith("#") && columnIndex==0){
					isCommentRow=true;
				}

				if(isCommentRow==false && isHeaderRow==false) {

					//data row parsing
					if(columnIndex > maxHeaderColIndex){
						goon=false;
						stopCause=String.format("data row has column number greater than headers (%s/%s) ",columnIndex, maxHeaderColIndex);
					}
					fieldName=colIdx2FieldN.get(columnIndex);
					Object r = defineValueType(v, ba, fieldName,cell);
					logger.debug(String.format("+++ index:%s, field:%s, value:%s", columnIndex,fieldName,r));

					populateFieldWithInheritance(ba, columnIndex, fieldName, r);
					logger.debug("val: "+r);
				}
				logger.debug( String.format("Cell value indexation row %s , col %s"  ,(rowIndex+1), (columnIndex+1)  ));
				columnIndex++;
			}
			if(isCommentRow==false && isHeaderRow==false && this.overwritePK==true && colIdx2FieldN.containsValue(PK_FIELDNAME)) {

				populateFieldPK(ba);	
			}


			if(goon==false){
				throw new DataParsingException(stopCause);
			}
			if(rowIndex!=0 && isCommentRow==false && isHeaderRow==false ){
				boolean doval =true;//TODO  this.doval or fct parameter
				boolean doexport =false;

				if(doval==true) {
					//validate each datarow using validation framework  after last col
					doValidate(colIdx2FieldN, rowIndex, columnIndex, ba);
					doexport =true;
				}
				if(doexport==true && exportRDF==true && rowIndex>0) {
					owriter.save(ba);
				}
				if (doexport==true && exportCSV==true && rowIndex!=1) {

					List<String> values = new ArrayList<>();
					String head ;

					Map<String, Map<String, String >> annotation = AnnotationImpl(ba);

					if (Header == false) {
						for(int i =0; i<columnIndex ; i++) {
							//TODO : adapt header ==> sampliID, class projet
							//TODO : 2 cas de figure pour les association / association dans le modèle UML ou association avec des base externe (gène, prot)
							//TODO : possibilité d'implémentation 1 - introspection détection issue des contraintes UML mot clé spé concernant lien extern (XREF) création de class d'annotation XREF / 2 - pour les association intra UML se référer au jeu d'annotation JPA 
							head = colIdx2FieldN.get(i);
							System.out.println(annotation.containsKey(head));
							if (annotation!=null && annotation.containsKey(head)) {

								Map<String, String > objAnnot = annotation.get(head);

								String annotValue=objAnnot.get(ANNOT_VALUE);
								//askomics specific annotation
								/* in askomics, a relation between two entity is represented by
								 *  a specific syntax in the header <name_of_relation<@name_of_header
								 *  this relation name point a the first column of an other entity
								 */
								head = annotValue+"@"+head;
							}

							values.add(head);
						}
						Header = true;
						CSVCreatorUtils.writeLine(writerCSV, values);
						values.clear();
					}
					if (Header == true) {
						for(int i =0; i<columnIndex ; i++) {
							head = colIdx2FieldN.get(i);
							Object cell = PropertyUtils.getSimpleProperty(ba, head);						
							String value = cell.toString();
							values.add(value);
						}
						CSVCreatorUtils.writeLine(writerCSV, values);
					}
				}
			}
			logger.debug("");
			rowIndex++;
		}
		if(exportCSV==true) {
			writerCSV.flush();
			writerCSV.close();
		}

		if(exportRDF==true) {
			writeToFile(om, outputFilePath+".ttl", exportFormat, "N3-TRIPLE");
		}
	}

	private Object selectTargetClass(String name)
			throws ClassNotFoundException, IOException, InstantiationException, IllegalAccessException {
		Object classInst = null;
		List<Class<?>> classList =new ArrayList<Class<?>>();
		String jarPath=this.generatedjar;
		@SuppressWarnings({ "resource", "deprecation" })
		URLClassLoader loader1 = new URLClassLoader(new URL[] {new File(jarPath).toURL()}, Thread.currentThread().getContextClassLoader());
		if(name==null) {
			throw new ClassNotFoundException("sheet class name not provided");
		}
		Set<String> clFiles= selectClassFromJar(jarPath);
		for(String clf: clFiles) {
			try {
				Class<?> cl = loader1.loadClass(clf);
				classList.add(cl);
				logger.debug("cl:"+cl);
			}
			catch(Exception e) {
				// e.printStackTrace();
			}
		}
		for (Class<?> cls : classList) {
			String className = cls.getSimpleName();

			logger.debug("repo:"+className);
			if (name.toLowerCase().equals(className.toLowerCase())) {

				logger.debug("dyn data class:"+cls.getName());
				classInst = cls.newInstance();
				break;
			}
		}
		if(classInst==null) {
			throw new ClassNotFoundException("target class "+ name+ " not found");
		}
		return classInst;
	}

	private static Set<String> selectClassFromJar(String jarPath) throws IOException, UnsupportedEncodingException {
		JarFile jar = new JarFile(URLDecoder.decode(jarPath, "UTF-8"));
		Enumeration<JarEntry> entries = jar.entries(); //gives ALL entries in jar
		Set<String> result = new HashSet<String>(); //avoid duplicates in case it is a subdirectory
		while(entries.hasMoreElements()) {
			String name = entries.nextElement().getName();
			String entry = name ;
			if(entry.endsWith(".class")) {
				entry=entry.replace(".class", "");
				entry=entry.replaceAll("/", ".");
				result.add(entry);
			}
		}
		result.toArray(new String[result.size()]);
		return result ;
	}

	private   String extractClassNameFromLabel(String s) {
		if(s!=null) {
			int sidx=s.indexOf("(");
			if(sidx>=0) {
				int eidx=s.indexOf(")");
				if(eidx>=0 && eidx > sidx) {
					s=s.substring(sidx+1, eidx);
				}
			}
		}
		logger.debug("class label:"+ s);
		return s;
	}

	private Set<String> getClassFields(final Class<?> type){
		Set<String> fields = new HashSet<String>();
		for (Field field : type.getDeclaredFields()) {
			fields.add(field.getName());
		}
		return fields;
	}

	private boolean listHasProperty(final Set<String> properties, final String propertyName) {
		if (properties.contains(propertyName)) {
			return true;
		} 
		return false;
	}

	private Field iterateFieldsRec(Class cls , String fieldName, Field fi) throws NoSuchFieldException {
		Set<String> currentFields = getClassFields(cls);
		boolean isCurrentField = listHasProperty(currentFields, fieldName);
		if  (isCurrentField) {
			fi = cls.getDeclaredField(fieldName);
			return fi;
		}else{
			if(cls.equals(Object.class)){

			}else{
				fi=iterateFieldsRec(cls.getSuperclass(), fieldName, fi);
			}
		}
		return fi;
	}

	private Object defineValueType(Object v, Object ba, String fieldName, Cell cell) throws Exception {
		//TODO : evaluate if we need  to manage static attribute : 
		Field fi = null;
		fi = iterateFieldsRec(ba.getClass(), fieldName, fi);

		Object r=null;
		if(fi!=null) {
			Class<?> tp = fi.getType();
			logger.info(String.format("=======field: %s, type: %s, value: %s", fieldName,tp,v));
			if(tp.equals(Long.class) || tp.getName().equals("long") ) {
				if(v.getClass().equals(String.class)) {
					r = new Long(v.toString());
				}
				else if (v.getClass().equals(Double.class)) {
					Double d = (Double)v;
					r = new Long(d.longValue());
				}
			}
			else if(tp.equals(Double.class) || tp.getName().equals("double")) {
				if(v.getClass().equals(String.class)) {
					r = new Double(v.toString());
				}
				else if (v.getClass().equals(Double.class)) {
					r = (Double)v;
				}
			}
			else if(tp.equals(Float.class) || tp.getName().equals("float") ) {
				if(v.getClass().equals(String.class)) {
					r = new Float(v.toString());
				}
				else if (v.getClass().equals(Double.class)) {
					Double d = (Double)v;
					r = new Float(d.floatValue());
				}
			}
			else if(tp.equals(Integer.class) || tp.getName().equals("int")) {
				if(v.getClass().equals(String.class)) {
					r = new Integer(v.toString());
				}
				else if (v.getClass().equals(Double.class)) {
					Double d = (Double)v;
					r = new Integer(d.intValue());
				}
			}
			else if(tp.equals(Boolean.class) || tp.getName().equals("boolean")) {
				if(v.getClass().equals(Boolean.class)) {
					//WARNING !!! this is a hard coded conversion rule
					//TODO what about 1/0 values for boolean ? 
					String bo= v.toString().toLowerCase();
					if(bo.equals("true")) {
						r=true;
					}
					else if(bo.equals("false")) {
						r=false;
					}
					else if(bo.equals("t") || bo.equals("T")) {
						r=true;
					}
					else if(bo.equals("f") || bo.equals("F")) {
						r=false;
					}
				}
				else if (v.getClass().equals(Double.class)) {
					//WARNING !!! this is a hard coded conversion rule
					Double d = (Double)v;
					Integer bo=d.intValue();
					if(bo>0) {
						r=true;
					}else {
						r=false;   
					}
				}
			}
			else if(tp.equals(Short.class) || tp.getName().equals("short") ) {
				if(v.getClass().equals(String.class)) {
					r = new Short(v.toString());
				}
				else if (v.getClass().equals(Double.class)) {
					Double d = (Double)v;
					r = new Short(d.shortValue());
				}
			}
			else if(tp.equals(String.class)) {
				r=v.toString();
			}
			else if(tp.equals(Date.class) || tp.getName().equals("date")){
				//logger.info("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
				//System.out.println("@@@@@@@@@date");
				if(v.getClass().equals(String.class)) {
					System.out.println("@@@@@@@@@date:string");
					SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); //extract from annotation or conf+ create conf
					Date date = sdf.parse((String) v);
					if (v.equals(sdf.format(date))) {
						r = date;
					}
					else {
						System.out.println("@@@@@@@@@date:no  expected SimpleDateFormat compatibility");
						throw new Exception ("Invalid date format : " + v + " ==> dd/MM/yyyy format expected");
					}
				}
				else{
					System.out.println("@@@@@@@@@date:other:"+v.getClass().getSimpleName());
					System.out.println("@@@"+cell.getDateCellValue());
					if(v.getClass().equals(Double.class)){
						try{
							Date date = cell.getDateCellValue();
							r=date;
						}
						catch(Exception ex){
							ex.printStackTrace();
						}
					}
				}
			}
			else {
				throw new Exception("type "+tp.getName()+" not managed ");
			}
		}
		//TODO :  Character, Byte, Void
		return r;
	}

	private void populateFieldPK(Object ba) throws Exception {

		//need to be manage with external configuration
		//example: UML annotations
		Object a=PropertyUtils.getSimpleProperty(ba, "dateexp");
		Object b=PropertyUtils.getSimpleProperty(ba, "operator");
		Object c=PropertyUtils.getSimpleProperty(ba, "sampleid");

		Object r = PrimaryKeyUtils.definePrimaryKey(a,b,c);

		System.out.println(ba.getClass().getName());
		populateFieldWithInheritanceImpl(ba, PK_FIELDNAME, r);
	}

	private void populateFieldWithInheritance(Object ba, int columnIndex, String fieldName, Object r) throws Exception {

		populateFieldWithInheritanceImpl(ba, fieldName, r);

	}

	private void populateFieldWithInheritanceImpl(Object ba, String fieldName, Object r)
			throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {


		try {
			PropertyUtils.setSimpleProperty(ba, fieldName, r);
		}
		catch(java.lang.NoSuchMethodException e) {
			if(showUnknownFieldException==true){
				e.printStackTrace();
				for (Field field : ba.getClass().getDeclaredFields()) {
					String ev="==NA==";
					try {
						Object ob=PropertyUtils.getSimpleProperty(ba, field.getName()) ;
						ev= ob.toString();
					}catch(Exception e2) {
						e2.printStackTrace();
					}
					//	logger.info(String.format("    FIELD_in_cls:  ********  field:%s ", field.getName() ,ev ));
				}
				for (Field field : ba.getClass().getSuperclass().getDeclaredFields()) {
					//	logger.info(String.format("    SUPER_FIELD_in_cls:  ********  field:%s ", field.getName()));
				}
			}
		}

	}

	private void doValidate(HashMap<Integer, String> colIdx2FieldN,
			int rowIndex, int columnIndex, Object ba) {
		//TODO: make the validator more permissive for upercase or lowercase
		//TODO : validate the header

		Set<?> violations = validate(ba);
		if (!violations.isEmpty()){
			String serializedObject	= ReflectionToStringBuilder.toString(ba);
			String	msg=String.format("error:%s \n== rowIndex:%s , colIndex:%s \n== header : %s \n object:%s ",
					violations.toString(),
					(rowIndex+1),(columnIndex+1),colIdx2FieldN,serializedObject);
			throw new ValidationException(msg);

		}
	}
	private static void writeToFile( Model m, String filename, String rdfFormat, String rdfstyle) throws FileNotFoundException {
		PrintStream writetfile = new PrintStream(
				new FileOutputStream(filename, false)); 
		if (rdfFormat == "RDF/XML") {
			m.write(writetfile,rdfFormat);
		}
		else {

			m.write(writetfile,rdfFormat,rdfstyle);

			m.write(System.out,rdfFormat,rdfstyle);
		}
	}

	public static Map<String, Map<String, String >> AnnotationImpl(Object ba) throws IllegalArgumentException, IllegalAccessException {
		Class<Xref> annot = Xref.class;

		Map<String, Map<String, String >> m =  extractXrefInfo(ba,annot);    

		System.out.println(m);
		return m;
	}

	private static  Map<String, Map<String, String >> extractXrefInfo(Object ba, Class<Xref> annot) throws IllegalAccessException {
		Class<?> clazz = ba.getClass();

		List<Field> fields = new ArrayList<>();
		while (clazz != Object.class) {
			fields.addAll(Arrays.asList(clazz.getDeclaredFields()));
			clazz = clazz.getSuperclass();
		}

		Map<String, Map<String, String >> m = new HashMap<>();
		for (Field field : fields) {
			System.out.println("->"+field);
			field.setAccessible(true);
			Annotation[] anl = field.getAnnotations();
			if(anl!=null){
				for(Annotation a : anl){
					System.out.println("0"+a);
				}
			}
			if (field.isAnnotationPresent(annot)) {
				System.out.println("1");
				//m.put(annot.getSimpleName(),getKey(field,annot));
				Map<String, String > objAnnot = new HashMap<String, String >();
				objAnnot.put(ANNOT_NAME,annot.getSimpleName());
				objAnnot.put(ANNOT_VALUE, getKey(field,annot));
				m.put(field.getName(), objAnnot);
			}
		}
		return m;
	}

	private static String getKey(Field field, Class c) {
		Xref anno = (Xref) field.getAnnotation(c);
		String value = anno.arg1();
		return value.isEmpty() ? field.getName() : value;
	}
}	