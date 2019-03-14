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
import uml2rdf.test.test3.ClassA;
import uml2rdf.test.test3.ClassB;

public class MainTest3 {
	public static void main(String[] args) throws FileNotFoundException {
		System.out.println("hello");
		// "jpa2rdf/src/uml2rdf/entity/example/test3/ClassA.class"
		
		Model m = ModelFactory.createDefaultModel();
		
		//RDF2Bean read = new RDF2Bean (m);
		//read.bind(ClassA.class);
		
		//Bean2RDF writer = new Bean2RDF(m);
		
		//writer.("test3/ClassA.class");

		//writeToFile(m, "test/test3_rdf_xml.rdf", "RDF/XML");
		
		ClassA myInstance = new ClassA();
		myInstance.setName("myname");
		myInstance.setAge(10);
		myInstance.setDate(new Date());
		ClassB  b= new ClassB();
		b.setAttribute1("attribute1");
		b.setNumber(10);
		myInstance.setClassb(b);
		final OntModel om = ModelFactory.createOntologyModel();
		final Bean2RDF owriter = new Bean2RDF(om);
		owriter.save(myInstance);
		writeToFile(om, "test/myInstance2-onthology_rdf_xml.rdf", "RDF/XML");
	}
	
	private static void writeToFile( Model m, String filename, String rdfFormat) throws FileNotFoundException {
		PrintStream writetfile = new PrintStream(
			     new FileOutputStream(filename, false)); 
		
   
		m.write(writetfile,rdfFormat);
   
 
		m.write(System.out);
	}
}
