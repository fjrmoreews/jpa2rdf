
package uml2rdf.test.inra_dev_test;
import javax.validation.constraints.*;
import java.util.*;


	
 
 
 
 
 
public class  ProgressiveCurveExperimentAnalysis extends EnzymaticActivityMeasurementsAnalysis  {
 //declarations

      /**
       * declaration MeasurementTime
       * visibility public forced to private
       */ 
    
       @NotNull
       private   Float measurementTime;
 

      /**
       * declaration Frequence
       * visibility public forced to private
       */ 
    
       @NotNull
       private   Float frequence;
 
//getter
 
      /**
       * Gets the value of MeasurementTime
       
       class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
        classS:PrimitiveTypeImpl
        typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@7a362b6b (eProxyURI: pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat)
        typeName:
        
          eProxyURI:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat
          
            nofragment:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml
            fragment:EFloat
          
          
  
        
        
       */
       public  Float getMeasurementTime() {
          return this.measurementTime;
       }
 
 
      /**
       * Gets the value of Frequence
       
       class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
        classS:PrimitiveTypeImpl
        typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@5a2d131d (eProxyURI: pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat)
        typeName:
        
          eProxyURI:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat
          
            nofragment:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml
            fragment:EFloat
          
          
  
        
        
       */
       public  Float getFrequence() {
          return this.frequence;
       }
 
//setter
  
       /**
        * Sets the value of MeasurementTime
        */
        public void setMeasurementTime( Float MeasurementTime) {
           this.measurementTime = MeasurementTime;
        }
  
       /**
        * Sets the value of Frequence
        */
        public void setFrequence( Float Frequence) {
           this.frequence = Frequence;
        }
}



