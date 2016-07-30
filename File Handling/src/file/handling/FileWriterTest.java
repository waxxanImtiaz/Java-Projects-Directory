
package file.handling;

import java.io.*;
public class FileWriterTest {
      public static void main(String[] args) throws IOException {
          FileWriter fw = new FileWriter( "E:/test.txt" );
          
          fw.write("Hello this is a demo program");
          
          fw.flush();
          
          fw.close();
       }
}
