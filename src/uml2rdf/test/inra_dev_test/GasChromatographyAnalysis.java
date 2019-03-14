
package uml2rdf.test.inra_dev_test;
import javax.validation.constraints.*;
import java.util.*;


	
 
 
 
 
 
public class  GasChromatographyAnalysis extends ChromatographyAnalysis  {
 //declarations

      /**
       * declaration ExtracType
       * visibility public forced to private
       */ 
    
       @NotNull
       private   String extracType;
 
//getter
 
      /**
       * Gets the value of ExtracType
       
       class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
        classS:PrimitiveTypeImpl
        typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@56928307 (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String)
        typeName:
        
          eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String
          
            nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
            fragment:String
          
          
  
        
        
       */
       public  String getExtracType() {
          return this.extracType;
       }
 
//setter
  
       /**
        * Sets the value of ExtracType
        */
        public void setExtracType( String ExtracType) {
           this.extracType = ExtracType;
        }
}



