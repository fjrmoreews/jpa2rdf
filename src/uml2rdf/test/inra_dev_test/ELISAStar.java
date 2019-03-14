
package uml2rdf.test.inra_dev_test;
import javax.validation.constraints.*;
import java.util.*;


	
 
 
 
 
 
public class  ELISAStar extends EnzymaticActivityMeasurementsAnalysis  {
 //declarations

      /**
       * declaration tracer
       * visibility public forced to private
       */ 
    
       @NotNull
       private   String tracer;
 

      /**
       * declaration SensiThreshold
       * visibility public forced to private
       */ 
    
       @NotNull
       private   Float sensiThreshold;
 

      /**
       * declaration RefAC1
       * visibility public forced to private
       */ 
    
       @NotNull
       private   String refAC1;
 

      /**
       * declaration RefAC2
       * visibility public forced to private
       */ 
    
       @NotNull
       private   String refAC2;
 

      /**
       * declaration SampleDilution
       * visibility public forced to private
       */ 
    
       @NotNull
       private   Float sampleDilution;
 
//getter
 
      /**
       * Gets the value of tracer
       
       class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
        classS:PrimitiveTypeImpl
        typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@33308786 (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String)
        typeName:
        
          eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String
          
            nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
            fragment:String
          
          
  
        
        
       */
       public  String getTracer() {
          return this.tracer;
       }
 
 
      /**
       * Gets the value of SensiThreshold
       
       class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
        classS:PrimitiveTypeImpl
        typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@a87f8ec (eProxyURI: pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat)
        typeName:
        
          eProxyURI:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat
          
            nofragment:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml
            fragment:EFloat
          
          
  
        
        
       */
       public  Float getSensiThreshold() {
          return this.sensiThreshold;
       }
 
 
      /**
       * Gets the value of RefAC1
       
       class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
        classS:PrimitiveTypeImpl
        typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@63787180 (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String)
        typeName:
        
          eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String
          
            nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
            fragment:String
          
          
  
        
        
       */
       public  String getRefAC1() {
          return this.refAC1;
       }
 
 
      /**
       * Gets the value of RefAC2
       
       class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
        classS:PrimitiveTypeImpl
        typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@48e92c5c (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String)
        typeName:
        
          eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String
          
            nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
            fragment:String
          
          
  
        
        
       */
       public  String getRefAC2() {
          return this.refAC2;
       }
 
 
      /**
       * Gets the value of SampleDilution
       
       class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
        classS:PrimitiveTypeImpl
        typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@22356acd (eProxyURI: pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat)
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
        * Sets the value of tracer
        */
        public void setTracer( String tracer) {
           this.tracer = tracer;
        }
  
       /**
        * Sets the value of SensiThreshold
        */
        public void setSensiThreshold( Float SensiThreshold) {
           this.sensiThreshold = SensiThreshold;
        }
  
       /**
        * Sets the value of RefAC1
        */
        public void setRefAC1( String RefAC1) {
           this.refAC1 = RefAC1;
        }
  
       /**
        * Sets the value of RefAC2
        */
        public void setRefAC2( String RefAC2) {
           this.refAC2 = RefAC2;
        }
  
       /**
        * Sets the value of SampleDilution
        */
        public void setSampleDilution( Float SampleDilution) {
           this.sampleDilution = SampleDilution;
        }
}



