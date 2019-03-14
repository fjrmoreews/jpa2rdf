
package uml2rdf.test.inra_dev_test;
import javax.validation.constraints.*;
import java.util.*;


	
 
 
 
 
 
public class  QRTPCR_Analysis extends PCR_Analysis  {
 //declarations

      /**
       * declaration RTParam
       * visibility public forced to private
       */ 
    
       @NotNull
       private   String rTParam;
 

      /**
       * declaration TechnoType
       * visibility public forced to private
       */ 
    
       @NotNull
       private   String technoType;
 

      /**
       * declaration PrimersGenes
       * visibility public forced to private
       */ 
    
       @NotNull
       private   String primersGenes;
 

      /**
       * declaration PrimerEfficiency
       * visibility public forced to private
       */ 
    
       @NotNull
       private   Float primerEfficiency;
 

      /**
       * declaration QtcDNA
       * visibility public forced to private
       */ 
    
       @NotNull
       private   String qtcDNA;
 

      /**
       * declaration PlatePlan
       * visibility public forced to private
       */ 
    
       @NotNull
       private   String platePlan;
 
//getter
 
      /**
       * Gets the value of RTParam
       
       class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
        classS:PrimitiveTypeImpl
        typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@29526c05 (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String)
        typeName:
        
          eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String
          
            nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
            fragment:String
          
          
  
        
        
       */
       public  String getRTParam() {
          return this.rTParam;
       }
 
 
      /**
       * Gets the value of TechnoType
       
       class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
        classS:PrimitiveTypeImpl
        typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@77102b91 (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String)
        typeName:
        
          eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String
          
            nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
            fragment:String
          
          
  
        
        
       */
       public  String getTechnoType() {
          return this.technoType;
       }
 
 
      /**
       * Gets the value of PrimersGenes
       
       class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
        classS:PrimitiveTypeImpl
        typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@7fb95505 (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String)
        typeName:
        
          eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String
          
            nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
            fragment:String
          
          
  
        
        
       */
       public  String getPrimersGenes() {
          return this.primersGenes;
       }
 
 
      /**
       * Gets the value of PrimerEfficiency
       
       class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
        classS:PrimitiveTypeImpl
        typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@7331196b (eProxyURI: pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat)
        typeName:
        
          eProxyURI:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat
          
            nofragment:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml
            fragment:EFloat
          
          
  
        
        
       */
       public  Float getPrimerEfficiency() {
          return this.primerEfficiency;
       }
 
 
      /**
       * Gets the value of QtcDNA
       
       class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
        classS:PrimitiveTypeImpl
        typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@ab7395e (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String)
        typeName:
        
          eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String
          
            nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
            fragment:String
          
          
  
        
        
       */
       public  String getQtcDNA() {
          return this.qtcDNA;
       }
 
 
      /**
       * Gets the value of PlatePlan
       
       class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
        classS:PrimitiveTypeImpl
        typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@2bd08376 (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String)
        typeName:
        
          eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String
          
            nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
            fragment:String
          
          
  
        
        
       */
       public  String getPlatePlan() {
          return this.platePlan;
       }
 
//setter
  
       /**
        * Sets the value of RTParam
        */
        public void setRTParam( String RTParam) {
           this.rTParam = RTParam;
        }
  
       /**
        * Sets the value of TechnoType
        */
        public void setTechnoType( String TechnoType) {
           this.technoType = TechnoType;
        }
  
       /**
        * Sets the value of PrimersGenes
        */
        public void setPrimersGenes( String PrimersGenes) {
           this.primersGenes = PrimersGenes;
        }
  
       /**
        * Sets the value of PrimerEfficiency
        */
        public void setPrimerEfficiency( Float PrimerEfficiency) {
           this.primerEfficiency = PrimerEfficiency;
        }
  
       /**
        * Sets the value of QtcDNA
        */
        public void setQtcDNA( String QtcDNA) {
           this.qtcDNA = QtcDNA;
        }
  
       /**
        * Sets the value of PlatePlan
        */
        public void setPlatePlan( String PlatePlan) {
           this.platePlan = PlatePlan;
        }
}



