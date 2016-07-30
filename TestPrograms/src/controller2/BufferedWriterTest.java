
package controller2;

import java.io.*;


public class BufferedWriterTest {

    public static void main( String[] args )
            throws IOException
    {
        String[] data = {"my name is imtiaz ali.","My father name is sobdar.",""
                + "I live in sanghar.","I study in dawood university of engineering"
                + " and technology.","I am computer system engineer."};
        
        String myDir = "E:/imtiaz/";
        String file = "newFile.txt";
        File dir = new File( myDir );
        
        if( !dir.exists())
        {
            System.out.println(dir.getPath()+" not existis.");
            return;
        }
        
        File myD = new File( dir, file );
        
        if( !myD.exists() ){
            System.out.println(file+" does not exists");
            return ;
        }
        
        BufferedWriter out = new BufferedWriter( new FileWriter(myD,true) );
        
        for( int i = 0; i< data.length; i++ )
        {
            out.write("\n");
            out.write(data[i]);
        }
        
        out.close();
        
    }
    
}
