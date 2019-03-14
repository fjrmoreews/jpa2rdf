
package uml2rdf.test.inra_dev_test;
import javax.validation.constraints.*;
import java.util.*;


	
 
 
 
 
 
public class  SequencingAnalysis extends GeneralAnalysis  {
 //declarations

      /**
       * declaration ReadLign
       * visibility public forced to private
       */ 
    
       @NotNull
       private   String readLign;
 

      /**
       * declaration Flowcell
       * visibility public forced to private
       */ 
    
       @NotNull
       private   String flowcell;
 

      /**
       * declaration PoolNum
       * visibility public forced to private
       */ 
    
       @NotNull
       private   String poolNum;
 
//getter
 
      /**
       * Gets the value of ReadLign
       
       class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
        classS:PrimitiveTypeImpl
        typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@76f4b65 (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String)
        typeName:
        
          eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String
          
            nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
            fragment:String
          
          
  
        
        
       */
       public  String getReadLign() {
          return this.readLign;
       }
 
 
      /**
       * Gets the value of Flowcell
       
       class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
        classS:PrimitiveTypeImpl
        typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@36328d33 (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String)
        typeName:
        
          eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String
          
            nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
            fragment:String
          
          
  
        
        
       */
       public  String getFlowcell() {
          return this.flowcell;
       }
 
 
      /**
       * Gets the value of PoolNum
       
       class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
        classS:PrimitiveTypeImpl
        typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@7f0d96f2 (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String)
        typeName:
        
          eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String
          
            nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
            fragment:String
          
          
  
        
        
       */
       public  String getPoolNum() {
          return this.poolNum;
       }
 
//setter
  
       /**
        * Sets the value of ReadLign
        */
        public void setReadLign( String ReadLign) {
           this.readLign = ReadLign;
        }
  
       /**
        * Sets the value of Flowcell
        */
        public void setFlowcell( String Flowcell) {
           this.flowcell = Flowcell;
        }
  
       /**
        * Sets the value of PoolNum
        */
        public void setPoolNum( String PoolNum) {
           this.poolNum = PoolNum;
        }
}



