
package file.handling;
import java.io.*;
import java.util.*;
public class SequenceInputStreamTest {
    public static void main(String[] args) throws IOException {
        FileInputStream fis1= new FileInputStream("E:/f1.txt");
        FileInputStream fis2 = new FileInputStream("E:/f2.txt");
        
        Vector v = new Vector();
        
        v.add(fis1);
        v.add(fis2);
        
        Enumeration e = v.elements();
        
        SequenceInputStream sis = new SequenceInputStream(e);
        int i;
        FileOutputStream fos = new FileOutputStream( "E:/a.txt" );
        
        while( (i=sis.read()) != -1 ){
            fos.write((byte)i);
        }
        
        fos.close();
        fis1.close();
        fis2.close();
        sis.close();
        }
}
