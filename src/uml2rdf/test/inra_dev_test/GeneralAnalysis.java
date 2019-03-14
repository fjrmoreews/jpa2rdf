
package uml2rdf.test.inra_dev_test;
import javax.validation.constraints.*;

import com.hp.hpl.jena.sparql.vocabulary.FOAF;

import thewebsemantic.Id;
import thewebsemantic.Namespace;
import thewebsemantic.RdfProperty;

import java.util.*;


	
 
 
 
 
@Namespace("http://inra/pegase#")
public class  GeneralAnalysis   {

	@Id   
	private String primaryKey;
	//declarations

      /**
       * declaration DateExp
       * visibility public forced to private
       */ 
         //@  
    
       @NotNull
       private   Date dateExp;
 

      /**
       * declaration Operator
       * visibility public forced to private
       */ 
         //@  
    
       @NotNull
       private   String operator;
 

      /**
       * declaration SampleID
       * visibility public forced to private
       */ 
         //@  
    
       @NotNull
       private   String sampleID;
 

      /**
       * declaration Device
       * visibility public forced to private
       */ 
         //@  
    
       @NotNull
       private   String device;
 

      /**
       * declaration ProdCrit
       * visibility public forced to private
       */ 
         //@  
    
       @NotNull
       private   String prodCrit;
 

      /**
       * declaration mol
       * visibility public forced to private
       */ 
         //@  
    
       @NotNull
       private   String mol;
 
//getter
 
      /**
       * Gets the value of DateExp
       
       class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
        classS:PrimitiveTypeImpl
        typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@56673b2c (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#Date)
        typeName:
        
          eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#Date
          
            nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
            fragment:Date
          
          
  
        
        
       */
       public  Date getDateExp() {
          return this.dateExp;
       }
 
 
      /**
       * Gets the value of Operator
       
       class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
        classS:PrimitiveTypeImpl
        typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@51fadaff (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String)
        typeName:
        
          eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String
          
            nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
            fragment:String
          
          
  
        
        
       */
       public  String getOperator() {
          return this.operator;
       }
 
 
      /**
       * Gets the value of SampleID
       
       class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
        classS:PrimitiveTypeImpl
        typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@31ff43be (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String)
        typeName:
        
          eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String
          
            nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
            fragment:String
          
          
  
        
        
       */
       public  String getSampleID() {
          return this.sampleID;
       }
 
 
      /**
       * Gets the value of Device
       
       class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
        classS:PrimitiveTypeImpl
        typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@5c44c582 (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String)
        typeName:
        
          eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String
          
            nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
            fragment:String
          
          
  
        
        
       */
       public  String getDevice() {
          return this.device;
       }
 
 
      /**
       * Gets the value of ProdCrit
       
       class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
        classS:PrimitiveTypeImpl
        typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@2c78d320 (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String)
        typeName:
        
          eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String
          
            nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
            fragment:String
          
          
  
        
        
       */
       public  String getProdCrit() {
          return this.prodCrit;
       }
 
 
      /**
       * Gets the value of mol
       
       class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
        classS:PrimitiveTypeImpl
        typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@7b205dbd (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String)
        typeName:
        
          eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String
          
            nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
            fragment:String
          
          
  
        
        
       */
       public  String getMol() {
          return this.mol;
       }
 
//setter
  
       /**
        * Sets the value of DateExp
        */
        public void setDateExp( Date DateExp) {
           this.dateExp = DateExp;
        }
  
       /**
        * Sets the value of Operator
        */
        public void setOperator( String Operator) {
           this.operator = Operator;
        }
  
       /**
        * Sets the value of SampleID
        */
        public void setSampleID( String SampleID) {
           this.sampleID = SampleID;
        }
  
       /**
        * Sets the value of Device
        */
        public void setDevice( String Device) {
           this.device = Device;
        }
  
       /**
        * Sets the value of ProdCrit
        */
        public void setProdCrit( String ProdCrit) {
           this.prodCrit = ProdCrit;
        }
  
       /**
        * Sets the value of mol
        */
        public void setMol( String mol) {
           this.mol = mol;
        }


     //-----------------------------------------
	public String definePrimaryKey()  throws Exception{
		if(this.operator!=null && this.dateExp!=null && this.sampleID!=null) {
			this.primaryKey=this.operator +"-"+ this.dateExp +"-"+ this.sampleID;
		}else {
		 //FIXME throw exception ??	
			throw new Exception("need keep fragments");
		}
		return primaryKey;
	}
	//------------------------------------------
	
	public String getPrimaryKey() {
		 
		return primaryKey;
	}



	public void setPrimaryKey(String primaryKey) {
		this.primaryKey = primaryKey;
	}
}



