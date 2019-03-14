
package uml2rdf.test.inra_dev_test;
import javax.validation.constraints.*;
import java.util.*;


	
 
 
 
 
 
public class  ConcentrationAnalysis extends GeneralAnalysis  {
 //declarations

      /**
       * declaration SampleVol
       * visibility public forced to private
       */ 
    
       @NotNull
       private   Float sampleVol;
 
//getter
 
      /**
       * Gets the value of SampleVol
       
       class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
        classS:PrimitiveTypeImpl
        typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@632ceb35 (eProxyURI: pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat)
        typeName:
        
          eProxyURI:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat
          
            nofragment:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml
            fragment:EFloat
          
          
  
        
        
       */
       public  Float getSampleVol() {
          return this.sampleVol;
       }
 
//setter
  
       /**
        * Sets the value of SampleVol
        */
        public void setSampleVol( Float SampleVol) {
           this.sampleVol = SampleVol;
        }
}



