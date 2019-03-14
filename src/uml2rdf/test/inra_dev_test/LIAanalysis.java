
package uml2rdf.test.inra_dev_test;
import javax.validation.constraints.*;
import java.util.*;


	
 
 
 
 
 
public class  LIAanalysis extends LuminescenceAnalysis  {
 //declarations

      /**
       * declaration SensiThreshold
       * visibility public forced to private
       */ 
    
       @NotNull
       private   Float sensiThreshold;
 

      /**
       * declaration SampleVol
       * visibility public forced to private
       */ 
    
       @NotNull
       private   Float sampleVol;
 

      /**
       * declaration SampleDilution
       * visibility public forced to private
       */ 
    
       @NotNull
       private   Float sampleDilution;
 
//getter
 
      /**
       * Gets the value of SensiThreshold
       
       class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
        classS:PrimitiveTypeImpl
        typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@5460cf3a (eProxyURI: pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat)
        typeName:
        
          eProxyURI:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat
          
            nofragment:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml
            fragment:EFloat
          
          
  
        
        
       */
       public  Float getSensiThreshold() {
          return this.sensiThreshold;
       }
 
 
      /**
       * Gets the value of SampleVol
       
       class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
        classS:PrimitiveTypeImpl
        typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@2e6a5539 (eProxyURI: pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat)
        typeName:
        
          eProxyURI:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat
          
            nofragment:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml
            fragment:EFloat
          
          
  
        
        
       */
       public  Float getSampleVol() {
          return this.sampleVol;
       }
 
 
      /**
       * Gets the value of SampleDilution
       
       class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
        classS:PrimitiveTypeImpl
        typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@6d025197 (eProxyURI: pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat)
        typeName:
        
          eProxyURI:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat
          
            nofragment:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml
            fragment:EFloat
          
          
  
        
        
       */
       public  Float getSampleDilution() {
          return this.sampleDilution;
       }
 
//setter
  
       /**
        * Sets the value of SensiThreshold
        */
        public void setSensiThreshold( Float SensiThreshold) {
           this.sensiThreshold = SensiThreshold;
        }
  
       /**
        * Sets the value of SampleVol
        */
        public void setSampleVol( Float SampleVol) {
           this.sampleVol = SampleVol;
        }
  
       /**
        * Sets the value of SampleDilution
        */
        public void setSampleDilution( Float SampleDilution) {
           this.sampleDilution = SampleDilution;
        }
}



