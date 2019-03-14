
package uml2rdf.test.inra_dev_test;
import javax.validation.constraints.*;
import java.util.*;


	
 
 
 
 
 
public class  ELISAanalysis extends EnzymaticActivityMeasurementsAnalysis  {
 //declarations

      /**
       * declaration PlatePlan
       * visibility public forced to private
       */ 
    
       @NotNull
       private   String platePlan;
 

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
       * Gets the value of PlatePlan
       
       class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
        classS:PrimitiveTypeImpl
        typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@32a68f4f (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String)
        typeName:
        
          eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String
          
            nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
            fragment:String
          
          
  
        
        
       */
       public  String getPlatePlan() {
          return this.platePlan;
       }
 
 
      /**
       * Gets the value of SensiThreshold
       
       class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
        classS:PrimitiveTypeImpl
        typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@6eb2384f (eProxyURI: pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat)
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
        typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@3a4621bd (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String)
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
        typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@4ed5eb72 (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String)
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
        typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@19b93fa8 (eProxyURI: pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat)
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
        * Sets the value of PlatePlan
        */
        public void setPlatePlan( String PlatePlan) {
           this.platePlan = PlatePlan;
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



