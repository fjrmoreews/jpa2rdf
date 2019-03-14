
package uml2rdf.test.inra_dev_test;
import javax.validation.constraints.*;
import java.util.*;


	
 
 
 
 
 
public class  CapillaryElectrophoresisAnalysis extends ElectrophoresisAnalysis  {
 //declarations

      /**
       * declaration ArrayType
       * visibility public forced to private
       */ 
    
       @NotNull
       private   String arrayType;
 
//getter
 
      /**
       * Gets the value of ArrayType
       
       class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
        classS:PrimitiveTypeImpl
        typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@1608bcbd (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String)
        typeName:
        
          eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String
          
            nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
            fragment:String
          
          
  
        
        
       */
       public  String getArrayType() {
          return this.arrayType;
       }
 
//setter
  
       /**
        * Sets the value of ArrayType
        */
        public void setArrayType( String ArrayType) {
           this.arrayType = ArrayType;
        }
}



