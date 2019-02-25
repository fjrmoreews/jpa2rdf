package uml2rdf;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

import com.hp.hpl.jena.ontology.OntModel;
import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.rdf.model.ModelFactory;

import thewebsemantic.Bean2RDF;

public class Maintest3 {
	public static void main(String[] args) throws FileNotFoundException {

		Model m = ModelFactory.createDefaultModel();
		m.read("test3/ClassA.java");
		Bean2RDF writer = new Bean2RDF(m);
		//writer.;
		writeToFile(m, "test/test3_rdf_xml.rdf", "RDF/XML");
		
		final OntModel om = ModelFactory.createOntologyModel();
		final Bean2RDF owriter = new Bean2RDF(om);
		//owriter.save();
		writeToFile(om, "test/test3-ontology_rdf_xml.rdf", "RDF/XML");
	}
	
	private static void writeToFile( Model m, String filename, String rdfFormat) throws FileNotFoundException {
		PrintStream writetfile = new PrintStream(
			     new FileOutputStream(filename, false)); 
		
   
		m.write(writetfile,rdfFormat);
   
 
		m.write(System.out);
	}
}
