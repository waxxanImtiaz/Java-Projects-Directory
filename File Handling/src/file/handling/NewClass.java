
package file.handling;
import java.io.*;
public class NewClass {
    public static void main( String[] args )
    throws IOException 
    {
        FileInputStream fis = new FileInputStream("E:/Orace account.txt");
        FileOutputStream fos = new FileOutputStream("E:/new.txt");
        
        
        int i = 0;
        
        while((i = fis.read()) != -1)
        {
            fos.write((byte)i);
        }
    }
}
