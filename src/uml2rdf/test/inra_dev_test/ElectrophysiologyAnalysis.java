
package uml2rdf.test.inra_dev_test;
import javax.validation.constraints.*;
import java.util.*;


	
 
 
 
 
 
public class  ElectrophysiologyAnalysis   {
 //declarations

      /**
       * declaration RoomNum
       * visibility public forced to private
       */ 
    
       @NotNull
       private   String roomNum;
 

      /**
       * declaration RoomVol
       * visibility public forced to private
       */ 
    
       @NotNull
       private   Float roomVol;
 

      /**
       * declaration SampleVol
       * visibility public forced to private
       */ 
    
       @NotNull
       private   Float sampleVol;
 
//getter
 
      /**
       * Gets the value of RoomNum
       
       class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
        classS:PrimitiveTypeImpl
        typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@a4add54 (eProxyURI: pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String)
        typeName:
        
          eProxyURI:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml#String
          
            nofragment:pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml
            fragment:String
          
          
  
        
        
       */
       public  String getRoomNum() {
          return this.roomNum;
       }
 
 
      /**
       * Gets the value of RoomVol
       
       class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
        classS:PrimitiveTypeImpl
        typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@5f9be66c (eProxyURI: pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat)
        typeName:
        
          eProxyURI:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat
          
            nofragment:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml
            fragment:EFloat
          
          
  
        
        
       */
       public  Float getRoomVol() {
          return this.roomVol;
       }
 
 
      /**
       * Gets the value of SampleVol
       
       class:class org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl
        classS:PrimitiveTypeImpl
        typeToString:org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl@66c61024 (eProxyURI: pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat)
        typeName:
        
          eProxyURI:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml#EFloat
          
            nofragment:pathmap://UML_LIBRARIES/EcorePrimitiveTypes.library.uml
            fragment:EFloat
          
          
  
        
        
       */
       public  Float getSampleVol() {
          return this.sampleVol;
       }
 
//setter
  
       /**
        * Sets the value of RoomNum
        */
        public void setRoomNum( String RoomNum) {
           this.roomNum = RoomNum;
        }
  
       /**
        * Sets the value of RoomVol
        */
        public void setRoomVol( Float RoomVol) {
           this.roomVol = RoomVol;
        }
  
       /**
        * Sets the value of SampleVol
        */
        public void setSampleVol( Float SampleVol) {
           this.sampleVol = SampleVol;
        }
}



