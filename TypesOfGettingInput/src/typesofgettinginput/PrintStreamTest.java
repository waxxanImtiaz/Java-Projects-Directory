
package typesofgettinginput;

import java.io.*;
public class PrintStreamTest {
      public static void main(String[] args) throws IOException {
          FileOutputStream fr = new FileOutputStream("E:/t.txt");
          PrintStream pr = new PrintStream( fr );
          
          pr.println("Hello\n");
          pr.format("i = %d",12);
          
    }
}
