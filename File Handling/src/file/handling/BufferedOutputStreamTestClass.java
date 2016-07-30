
package file.handling;

import java.io.*;



public class BufferedOutputStreamTestClass {
       public static void main(String[] args) throws java.io.IOException {
           FileOutputStream fos = new FileOutputStream("E:/f1.txt");
           
           BufferedOutputStream bf = new BufferedOutputStream( fos );
           byte[ ] i = "We are muslims".getBytes();
           bf.write(i);
           
           bf.close();
           fos.close();
           System.out.println("Success");
    }
}
