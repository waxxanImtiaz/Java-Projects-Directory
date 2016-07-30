
package serializationproject;

 import java.io.FileInputStream;
 import java.io.FileOutputStream;
 import java.io.ObjectOutputStream;
 import java.io.ObjectInputStream;  

public class SerializationProject {

   
    public static void main(String[] args) {
        
        //Serialization
        String file = "lal.ser";
        Dog d1;
        Dog d2;
        
        
        try{
        System.out.println( "Serialization" );
        FileOutputStream fos = new FileOutputStream( file );
        ObjectOutputStream oos = new ObjectOutputStream( fos );
        
        d1 = new Dog();
        
        System.out.println(" i = "+d1.i+",j="+d1.j );
        
        oos.writeObject( d1 );
        
        System.out.println( "Deserialization" );
       
        FileInputStream fis = new FileInputStream( file );
        ObjectInputStream ois = new ObjectInputStream ( fis );
        
        d2 = ( Dog )ois.readObject();
        
        System.out.println( "i = "+d2.i+",j="+d2.j );
        
       }catch( Exception e )
       {
           e.printStackTrace();
       }
        
        
    }
    
}
