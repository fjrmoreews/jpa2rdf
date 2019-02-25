package uml2rdf;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Collection;

import org.apache.commons.io.FileUtils;

import thewebsemantic.Bean2RDF;
import thewebsemantic.binding.Jenabean;
import uml2rdf.entity.example.Address;
import uml2rdf.entity.example.Person;
import uml2rdf.entity.example.WorkingGenre;
import uml2rdf.entity.example.WorkingSong;

import com.hp.hpl.jena.ontology.OntModel;
import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.rdf.model.ModelFactory;

public class MainExample1 {
	public static void main(String[] args) throws FileNotFoundException {
	
		testN3(null);
		
		testMultiFormat(null);
	}
	public static void testN3(String[] args) throws FileNotFoundException {
		
		Address a1 = new Address();
		a1.setCity("Sydney");
		a1.setStreet("Main St.");
		Model m = ModelFactory.createDefaultModel();
		Bean2RDF writer = new Bean2RDF(m);
		Person p = new Person("http://jsmith.myopenid.com");
		p.setName("John Smith");
		p.setAddress(a1);
		writer.save(p);
		writeToFile(m, "test/adress-with-Namespace__rdf_xml.rdf", "RDF/XML");
		
		final OntModel om = ModelFactory.createOntologyModel();
		
		final Bean2RDF owriter = new Bean2RDF(om);
		owriter.save(p);
		
		writeToFile(om, "test/adress-ontomodel-with-Namespace_rdf_xml.rdf", "RDF/XML");
		
	}
	
	public static void testMultiFormat(String[] args) throws FileNotFoundException {
		
		    WorkingSong s0 = new WorkingSong();
		    s0.setComposer("aa");
		    s0.setGenre(new WorkingGenre("s"));
		    s0.setTitle("t1");
		   // s0.save();
		    final OntModel om = ModelFactory.createOntologyModel();
		    
		    
		    final Bean2RDF owriter = new Bean2RDF(om);
		    owriter.save(s0);
		    
 
		    
			writeToFile(om, "test/workingsong-ontomodel-without-load_rdf_xml.rdf", "RDF/XML");
			writeToFile(om, "test/workingsong-ontomodeln_triple.rdf", "N-TRIPLE");
			writeToFile(om, "test/workingsong-ontomodeln3.rdf", "N3");	 
			writeToFile(om, "test/workingsong-ontomodel_xml_abbrev.rdf", "RDF/XML-ABBREV");
			
		  //  FileUtils.writeStringToFile(file, data);
		    
		    
			Model m1 = ModelFactory.createDefaultModel();
			//Jenabean.instance().bind(m1); not useful
			 final Bean2RDF  writer2 = new Bean2RDF(m1);
			     writer2.save(s0);
			   
		  writeToFile(m1, "test/workingsong-defaultmodel-with-without-load.rdf", "RDF/XML");  
		    
	

	}

	private static void writeToFile( Model m, String filename, String rdfFormat) throws FileNotFoundException {
		PrintStream writetfile = new PrintStream(
			     new FileOutputStream(filename, false)); 
		
   
		m.write(writetfile,rdfFormat);
   
 
		m.write(System.out);
	}
}
