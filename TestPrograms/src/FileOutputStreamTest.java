
import java.io.*;


public class FileOutputStreamTest {

        public static void main( String[] args )
        {
            
            File myFile = new File("E:\\myFile.txt");
            
            
            try{
                myFile.createNewFile();
                if( myFile.exists() )
                {
                    FileOutputStream file = new FileOutputStream( myFile ,true );
                    System.out.println("myFile.txt file created");
                    
                    
                }
                else
                {
                    System.out.println("myFile.txt already exists");
                }
            }catch( IOException e  ){
                e.printStackTrace();
            }
            
        }
}
