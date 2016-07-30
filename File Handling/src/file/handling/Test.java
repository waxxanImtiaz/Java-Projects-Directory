
package file.handling;
    import java.io.*;

    public class Test {
        public static void main(String[] args) throws IOException {
          FileOutputStream fos = new FileOutputStream("E:/t.txt");
          String s = "My Name is imtiaz ali";

          byte[] b = s.getBytes();

          fos.write(b ,2,6);

          fos.write(b);
          fos.close();;
        }

    }
