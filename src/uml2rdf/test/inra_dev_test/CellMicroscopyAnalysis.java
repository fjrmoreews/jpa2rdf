
package uml2rdf.test.inra_dev_test;
import javax.validation.constraints.*;
import java.util.*;


	
 
 
 
 
 
public class  CellMicroscopyAnalysis extends ImagingAnalysis  {
 //declarations

      /**
       * declaration DilutionFactor
       * visibility public forced to private
       */ 
    
       @NotNull
       private   Float dilutionFactor;
 

      /**
       * declaration CellCount
       * visibility public forced to private
       */ 
    
       @NotNull
       private   Integer cellCount;
 
//getter
 
      /**
       * Gets the value of DilutionFactor
       
       class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
        classS:PrimitiveTypeImpl
        typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@27216cd (eProxyURI: pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat)
        typeName:
        
          eProxyURI:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat
          
            nofragment:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml
            fragment:EFloat
          
          
  
        
        
       */
       public  Float getDilutionFactor() {
          return this.dilutionFactor;
       }
 
 
      /**
       * Gets the value of CellCount
       
       class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
        classS:PrimitiveTypeImpl
        typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@8576fa0 (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#Integer)
        typeName:
        
          eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#Integer
          
            nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
            fragment:Integer
          
          
  
        
        
       */
       public  Integer getCellCount() {
          return this.cellCount;
       }
 
//setter
  
       /**
        * Sets the value of DilutionFactor
        */
        public void setDilutionFactor( Float DilutionFactor) {
           this.dilutionFactor = DilutionFactor;
        }
  
       /**
        * Sets the value of CellCount
        */
        public void setCellCount( Integer CellCount) {
           this.cellCount = CellCount;
        }
}



