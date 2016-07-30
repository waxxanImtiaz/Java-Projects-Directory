
package controller2;

import java.io.*;
import java.util.*;
public class FileInputTest {
    
    public static void main( String[] args )
    {
        String dirName = "E:/imtiaz/";
        String fileName = "newFile.txt";
        File dir = new File( dirName );
        
        File myFile = new File( dir,fileName );
        
        try{
        DataInputStream in = new DataInputStream( new BufferedInputStream(
                new FileInputStream( myFile )) );
       
       
        int x = 0;
       while( x!= -1 )
       {    x = in.read();
            
            
            System.out.print(""+(char)x);
       }
        }
         catch( FileNotFoundException e )
        {
            e.printStackTrace();
        }
        catch( IOException e )
        {
            e.printStackTrace();
            return;
        }
       
        
    }
}
