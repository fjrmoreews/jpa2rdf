package uml2rdf.generator.test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Date;

import com.hp.hpl.jena.ontology.OntModel;
import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.rdf.model.ModelFactory;

import thewebsemantic.Bean2RDF;
import thewebsemantic.RDF2Bean;
import thewebsemantic.binding.RdfBean;
import uml2rdf.test.inra_dev_test.AIAanalysis;
import uml2rdf.utils.PrimaryKeyUtils;

public class MainInraDevTest {
	public static void main(String[] args) throws Exception {
		System.out.println("hello");
		
		// first Instance of the JPA
		AIAanalysis myInstance = new AIAanalysis();

		myInstance.setOperator("myBiologist45");
		myInstance.setDateExp(new Date());
		myInstance.setSampleID("mySampleID1010");
		myInstance.setDevice("Linux");
		myInstance.setMol("mol1");
		myInstance.setCalibPrecGammeBlanc("blancBlanc");
		myInstance.setProdCrit("redCrit");
		myInstance.setSampleDilution(0.23F);
		myInstance.setSampleVol(0.70F);
		myInstance.setPrimaryKey(PrimaryKeyUtils.definePrimaryKey(myInstance.getOperator(), myInstance.getDateExp(), myInstance.getSampleID()));
		
		final OntModel om = ModelFactory.createOntologyModel();
		final Bean2RDF owriter = new Bean2RDF(om);
		
		// second Instance
		AIAanalysis myInstance2 = new AIAanalysis();
		
		myInstance2.setOperator("myBiologist42");
		myInstance2.setDateExp(new Date());
		myInstance2.setSampleID("mySampleID404");
		myInstance2.setDevice("Windows");
		myInstance2.setMol("mol2");
		myInstance2.setCalibPrecGammeBlanc("blancNoir");
		myInstance2.setProdCrit("yellowCrit");
		myInstance2.setSampleDilution(0.22F);
		myInstance2.setSampleVol(5.02F);
		myInstance2.setPrimaryKey(PrimaryKeyUtils.definePrimaryKey(myInstance2.getOperator(), myInstance2.getDateExp(), myInstance2.getSampleID()));
		
		
		owriter.save(myInstance);
		owriter.save(myInstance2); // add the second instance of the JPA on the first
		writeToFile(om, "test/pegaseAIA-dev-onthology_turtle2-5.ttl", "TURTLE", "N3-TRIPLE");
	}
	
	private static void writeToFile( Model m, String filename, String rdfFormat, String rdfstyle) throws FileNotFoundException {
		PrintStream writetfile = new PrintStream(
			     new FileOutputStream(filename, false)); 
		
   
		m.write(writetfile,rdfFormat,rdfstyle);
   
 
		m.write(System.out,rdfFormat,rdfstyle);
	}
}
