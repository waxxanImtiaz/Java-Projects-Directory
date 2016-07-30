
package file.handling;

import java.io.*;



public class BufferedInputStreamTestClas {
      public static void main(String[] args) throws java.io.IOException {
           FileInputStream fos = new FileInputStream("E:/f1.txt");
           
           BufferedInputStream bf = new BufferedInputStream( fos );
           
           int i;
           while( (i = bf.read()) != -1 )
           {
               System.out.print((char) i);
           }
           
           bf.close();
           fos.close();
           System.out.println("Success");
    }
}
