
package uml2rdf.test.inra_dev_test;
import javax.validation.constraints.*;

import thewebsemantic.Namespace;

import java.util.*;


	
 
 
 
 
@Namespace("http://inra/pegase#")
public class  AIAanalysis extends FluorescenceAnalysis  {
 //declarations

      /**
       * declaration CalibPrecGammeBlanc
       * visibility public forced to private
       */ 
    
       @NotNull
       private   String calibPrecGammeBlanc;
 

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
       * Gets the value of CalibPrecGammeBlanc
       
       class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
        classS:PrimitiveTypeImpl
        typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@10cf09e8 (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String)
        typeName:
        
          eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String
          
            nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
            fragment:String
          
          
  
        
        
       */
       public  String getCalibPrecGammeBlanc() {
          return this.calibPrecGammeBlanc;
       }
 
 
      /**
       * Gets the value of SampleVol
       
       class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
        classS:PrimitiveTypeImpl
        typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@ee86bcb (eProxyURI: pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat)
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
        typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@7f132176 (eProxyURI: pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat)
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
        * Sets the value of CalibPrecGammeBlanc
        */
        public void setCalibPrecGammeBlanc( String CalibPrecGammeBlanc) {
           this.calibPrecGammeBlanc = CalibPrecGammeBlanc;
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



