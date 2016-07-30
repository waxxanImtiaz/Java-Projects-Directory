package serializationproject;

import java.io.*;

public class ExternalizableTest {
    
    public static void main( String[ ] args )
     throws IOException,ClassNotFoundException
    {
        Teacher t1 = new Teacher( "Lal",10 );
        
        System.out.println( "Serialization" );
        FileOutputStream fos = new FileOutputStream( "ext.ser" );
        ObjectOutputStream oos = new ObjectOutputStream( fos );
        
        oos.writeObject( t1 );
        
        System.out.println( "\nde-serialization" );
        
        Teacher t2 = new Teacher();
        
        FileInputStream fis = new FileInputStream( "ext.ser" );
        ObjectInputStream ois = new ObjectInputStream( fis );
        
        t2 = ( Teacher )ois.readObject();
        
        System.out.println("name="+t2.name+",id="+t2.id );
       
    }
}
