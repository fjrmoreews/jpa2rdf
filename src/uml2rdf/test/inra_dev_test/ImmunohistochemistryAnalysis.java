
package uml2rdf.test.inra_dev_test;
import javax.validation.constraints.*;
import java.util.*;


	
 
 
 
 
 
public class  ImmunohistochemistryAnalysis extends HistologyAnalysis  {
 //declarations

      /**
       * declaration AntibodyRefAndDilu
       * visibility public forced to private
       */ 
    
       @NotNull
       private   String antibodyRefAndDilu;
 
//getter
 
      /**
       * Gets the value of AntibodyRefAndDilu
       
       class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
        classS:PrimitiveTypeImpl
        typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@2ea6e30c (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String)
        typeName:
        
          eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String
          
            nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
            fragment:String
          
          
  
        
        
       */
       public  String getAntibodyRefAndDilu() {
          return this.antibodyRefAndDilu;
       }
 
//setter
  
       /**
        * Sets the value of AntibodyRefAndDilu
        */
        public void setAntibodyRefAndDilu( String AntibodyRefAndDilu) {
           this.antibodyRefAndDilu = AntibodyRefAndDilu;
        }
}



