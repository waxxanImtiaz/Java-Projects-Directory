package serializationproject;

import java.io.*;

public class CatClassTest {
    public static void main( String [] args )
    throws IOException,ClassNotFoundException
    {
//        serialization
        FileOutputStream fos = new FileOutputStream( "cat.ser" );
        ObjectOutputStream oos = new ObjectOutputStream( fos );
        
        Cat c1 = new Cat();
        
        c1.setI( 122 );
        c1.setJ( 2200 );
        c1.setAnimalName( "Cat" );
        
        System.out.println( "Before serialization" );
        System.out.println( "i="+c1.getI()+",j="+c1.getJ()+",Animal name ="+c1.getAnimalName() );
        oos.writeObject( c1 );
        
        
        //De-serialization
        
        FileInputStream fis = new FileInputStream( "cat.ser" );
        ObjectInputStream ois = new ObjectInputStream( fis );
        
        c1 = ( Cat )ois.readObject();
        
        
        System.out.println( "After de-serialization" );
        System.out.println( "i = "+c1.getI()+",j="+c1.getJ()+",Animal name ="+c1.getAnimalName() );
        
        
        
        fos.close();
        fis.close();
        oos.close();
        ois.close();
        
    }
}
