
package file.handling;

import java.io.*;
public class ByteArrayOutputStreamTest {
   public static void main(String[] args) throws java.io.IOException {
      FileOutputStream fos1 = new FileOutputStream("E:/f1.txt");
      FileOutputStream fos2 = new FileOutputStream("E:/f2.txt");
      
      ByteArrayOutputStream b = new ByteArrayOutputStream();
      byte[] d = "my name is imtiaz ali".getBytes();
      b.write(d);
      b.writeTo(fos1);
      b.writeTo(fos2);
      
      b.flush();
      
      b.close();
      fos1.close();
      fos2.close();
    }
     
}
