
package uml2rdf.test.inra_dev_test;
import javax.validation.constraints.*;
import java.util.*;


	
 
 
 
 
 
public class  TwoDgelElectrophoresisAnalysis extends GelElectrophoresisAnalysis  {
 //declarations

      /**
       * declaration StripNum
       * visibility public forced to private
       */ 
    
       @NotNull
       private   String stripNum;
 

      /**
       * declaration GelIdent
       * visibility public forced to private
       */ 
    
       @NotNull
       private   String gelIdent;
 

      /**
       * declaration ScanIdent
       * visibility public forced to private
       */ 
    
       @NotNull
       private   String scanIdent;
 

      /**
       * declaration Coloration
       * visibility public forced to private
       */ 
    
       @NotNull
       private   String coloration;
 

      /**
       * declaration ResolutionLevel
       * visibility public forced to private
       */ 
    
       @NotNull
       private   String resolutionLevel;
 

      /**
       * declaration SoftwareAnalysis
       * visibility public forced to private
       */ 
    
       @NotNull
       private   String softwareAnalysis;
 
//getter
 
      /**
       * Gets the value of StripNum
       
       class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
        classS:PrimitiveTypeImpl
        typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@3cdf2c61 (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String)
        typeName:
        
          eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String
          
            nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
            fragment:String
          
          
  
        
        
       */
       public  String getStripNum() {
          return this.stripNum;
       }
 
 
      /**
       * Gets the value of GelIdent
       
       class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
        classS:PrimitiveTypeImpl
        typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@1c33c17b (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String)
        typeName:
        
          eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String
          
            nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
            fragment:String
          
          
  
        
        
       */
       public  String getGelIdent() {
          return this.gelIdent;
       }
 
 
      /**
       * Gets the value of ScanIdent
       
       class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
        classS:PrimitiveTypeImpl
        typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@1e097d59 (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String)
        typeName:
        
          eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String
          
            nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
            fragment:String
          
          
  
        
        
       */
       public  String getScanIdent() {
          return this.scanIdent;
       }
 
 
      /**
       * Gets the value of Coloration
       
       class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
        classS:PrimitiveTypeImpl
        typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@6581dc0a (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String)
        typeName:
        
          eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String
          
            nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
            fragment:String
          
          
  
        
        
       */
       public  String getColoration() {
          return this.coloration;
       }
 
 
      /**
       * Gets the value of ResolutionLevel
       
       class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
        classS:PrimitiveTypeImpl
        typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@6ce86ce1 (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String)
        typeName:
        
          eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String
          
            nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
            fragment:String
          
          
  
        
        
       */
       public  String getResolutionLevel() {
          return this.resolutionLevel;
       }
 
 
      /**
       * Gets the value of SoftwareAnalysis
       
       class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
        classS:PrimitiveTypeImpl
        typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@3fed2870 (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String)
        typeName:
        
          eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String
          
            nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
            fragment:String
          
          
  
        
        
       */
       public  String getSoftwareAnalysis() {
          return this.softwareAnalysis;
       }
 
//setter
  
       /**
        * Sets the value of StripNum
        */
        public void setStripNum( String StripNum) {
           this.stripNum = StripNum;
        }
  
       /**
        * Sets the value of GelIdent
        */
        public void setGelIdent( String GelIdent) {
           this.gelIdent = GelIdent;
        }
  
       /**
        * Sets the value of ScanIdent
        */
        public void setScanIdent( String ScanIdent) {
           this.scanIdent = ScanIdent;
        }
  
       /**
        * Sets the value of Coloration
        */
        public void setColoration( String Coloration) {
           this.coloration = Coloration;
        }
  
       /**
        * Sets the value of ResolutionLevel
        */
        public void setResolutionLevel( String ResolutionLevel) {
           this.resolutionLevel = ResolutionLevel;
        }
  
       /**
        * Sets the value of SoftwareAnalysis
        */
        public void setSoftwareAnalysis( String SoftwareAnalysis) {
           this.softwareAnalysis = SoftwareAnalysis;
        }
}



