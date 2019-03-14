package uml2rdf.test.arq;
import com.hp.hpl.jena.query.Query;
import com.hp.hpl.jena.query.QueryExecution;
import com.hp.hpl.jena.query.QueryExecutionFactory;
import com.hp.hpl.jena.query.QueryFactory;
import com.hp.hpl.jena.query.QuerySolution;
import com.hp.hpl.jena.query.ResultSet;
import com.hp.hpl.jena.rdf.model.Literal;
import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.rdf.model.ModelFactory;
import com.hp.hpl.jena.rdf.model.RDFNode;
import com.hp.hpl.jena.rdf.model.Resource;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.commons.io.*;

// Use the Turtle file and the Sparql file and return the solution of the
// query. Use arq.jar so Jena is not necessary for crate and request rdf file

public class TestQuery1 {
	public static void main(String[] args) throws IOException {
		String rqpath=args[0];
		String ttlpath=args[1];

		try {
			if (rqpath == null && ttlpath == null) {
				throw new Exception() ;
			}
			/*if (rqpath. == null && ttlpath == null) {
				throw new Exception() ;*/
		}
		catch (Exception e){
			System.err.println(e.getMessage());
			System.exit(1);
		}

		File file= new File(rqpath);
		String queryString=FileUtils.readFileToString(file, "UTF-8");
		Model model = ModelFactory.createDefaultModel();
		model.read(new FileInputStream(ttlpath),null,"TTL");

		Query query = QueryFactory.create(queryString) ;
		QueryExecution qexec = QueryExecutionFactory.create(query, model) ;

		ResultSet results = qexec.execSelect() ;
		for ( ; results.hasNext() ; )
		{
			QuerySolution soln = results.nextSolution() ;
			RDFNode x = soln.get("varname") ;       // Get a result variable by name.
			Resource r = soln.getResource("varR") ; // Get a result variable - must be a resource
			Literal l = soln.getLiteral("varL") ;   // Get a result variable - must be a literal
			System.out.println(soln.toString());

		}
	}
}
