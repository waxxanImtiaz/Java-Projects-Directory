
package file.handling;
import java.io.*;

public class CharArrayWriterClass {
    public static void main(String[] args) throws IOException {
         CharArrayWriter ch = new CharArrayWriter();
         ch.write("My name is imtiaz");
         FileWriter f1 = new FileWriter("E:/b.txt");
         FileWriter f2 = new FileWriter("E:/c.txt");
         FileWriter f3 = new FileWriter("E:/d.txt");
         
         ch.writeTo(f1);
         ch.writeTo(f2);
         ch.writeTo(f3);
         
         f1.close();
         f2.close();
         f3.close();
       }
}
