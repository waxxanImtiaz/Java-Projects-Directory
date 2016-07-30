
package file.handling;

import java.io.*;



public class FileReaderClassTest {
     public static void main(String[] args) throws IOException {
          FileReader fr = new FileReader("E:/test.txt");
          
          int i;
          
          while( (i = fr.read()) != -1 )
          {
              System.out.println((char)i);
          }
          
          fr.close();
       }
}
