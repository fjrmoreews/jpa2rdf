package uml2rdf.utils;

public class StringFormat {

	
	public static  String firstToLowerCase(String str) {
		if(str!=null){
			String formatted = str;
			if(str.length()==0){
				
			}
			else if(str.length()==1){
				 formatted = str.toLowerCase() ;
				 
			}else{
				 formatted = str.substring(0, 1).toLowerCase() + str.substring(1);
					
			}
			 
			return formatted;
		}
		return str;
	}
	
	public static  String firstToUpperCase(String str) {
		if(str!=null){
			String formatted = str;
			if(str.length()==0){
				
			}
			else if(str.length()==1){
				 formatted = str.toUpperCase() ;
				 
			}else{
				 formatted = str.substring(0, 1).toUpperCase() + str.substring(1);
					
			}
			 
			return formatted;
		}
		return str;
	}
	
}
