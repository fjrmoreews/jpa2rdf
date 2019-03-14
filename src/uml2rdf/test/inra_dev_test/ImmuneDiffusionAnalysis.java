
package uml2rdf.test.inra_dev_test;
import javax.validation.constraints.*;
import java.util.*;


	
 
 
 
 
 
public class  ImmuneDiffusionAnalysis extends GeneralAnalysis  {
 //declarations

      /**
       * declaration MethodIDR
       * visibility public forced to private
       */ 
    
       @NotNull
       private   String methodIDR;
 
//getter
 
      /**
       * Gets the value of MethodIDR
       
       class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
        classS:PrimitiveTypeImpl
        typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@4b23c30a (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String)
        typeName:
        
          eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String
          
            nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
            fragment:String
          
          
  
        
        
       */
       public  String getMethodIDR() {
          return this.methodIDR;
       }
 
//setter
  
       /**
        * Sets the value of MethodIDR
        */
        public void setMethodIDR( String MethodIDR) {
           this.methodIDR = MethodIDR;
        }
}



