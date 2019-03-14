
package uml2rdf.test.inra_dev_test;
import javax.validation.constraints.*;
import java.util.*;


	
 
 
 
 
 
public class  EnzymaticEndpointAssayAnalysis extends EnzymaticActivityMeasurementsAnalysis  {
 //declarations

      /**
       * declaration Dilution
       * visibility public forced to private
       */ 
    
       @NotNull
       private   Float dilution;
 
//getter
 
      /**
       * Gets the value of Dilution
       
       class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
        classS:PrimitiveTypeImpl
        typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@291a7e3c (eProxyURI: pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat)
        typeName:
        
          eProxyURI:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat
          
            nofragment:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml
            fragment:EFloat
          
          
  
        
        
       */
       public  Float getDilution() {
          return this.dilution;
       }
 
//setter
  
       /**
        * Sets the value of Dilution
        */
        public void setDilution( Float Dilution) {
           this.dilution = Dilution;
        }
}



