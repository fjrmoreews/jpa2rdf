
package uml2rdf.test.inra_dev_test;
import javax.validation.constraints.*;
import java.util.*;


	
 
 
 
 
 
public class  ChromametryAnalysis extends GeneralAnalysis  {
 //declarations

      /**
       * declaration MeasuringFieldNumber
       * visibility public forced to private
       */ 
    
       @NotNull
       private   Integer measuringFieldNumber;
 
//getter
 
      /**
       * Gets the value of MeasuringFieldNumber
       
       class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
        classS:PrimitiveTypeImpl
        typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@10a9d961 (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#Integer)
        typeName:
        
          eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#Integer
          
            nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
            fragment:Integer
          
          
  
        
        
       */
       public  Integer getMeasuringFieldNumber() {
          return this.measuringFieldNumber;
       }
 
//setter
  
       /**
        * Sets the value of MeasuringFieldNumber
        */
        public void setMeasuringFieldNumber( Integer MeasuringFieldNumber) {
           this.measuringFieldNumber = MeasuringFieldNumber;
        }
}



