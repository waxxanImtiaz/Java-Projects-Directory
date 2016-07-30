import java.io.*;
import java.util.Scanner;

public class NewTestFile {
    public static void main( String[] args )
            throws IOException
    {
        String file = "E:/hello/";
        File myf = new File( file );
        
        if( !myf.exists() )
        {
            myf.mkdir();
        }
        File f = new File( myf ,"t.txt");
        f.createNewFile();
        
        Scanner input = new Scanner( System.in );
        int temp = 0;
        System.out.println("Enter any nmber: and press 12 to terminate:");
        DataOutputStream dos = new DataOutputStream( new BufferedOutputStream(new FileOutputStream( f ),1) );
        while( !((temp = input.nextInt()) == 12) )
        {
            System.out.println("Enter your name: and press ok to terminate: and size is"+  dos.size());
            dos.writeInt(temp);
             
            dos.flush();
            
        }
     // dos.close();
     
    }
}
