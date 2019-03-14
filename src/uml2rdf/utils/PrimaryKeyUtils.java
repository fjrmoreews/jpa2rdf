package uml2rdf.utils;

import java.util.Date;

// Utility use for set the Primarykey of the JPA for export in RDF
public class PrimaryKeyUtils {
	
	private static String primaryKey;
	
	public static String definePrimaryKey(String operator ,Date date,String sampleID)  throws Exception{
		if(operator!=null && date!=null && sampleID!=null) {
			primaryKey=operator +"-"+ date +"-"+ sampleID;
		}else {
		 //FIXME throw exception ??	
			throw new Exception("need keep fragments");
		}
		return primaryKey;
	}
}
