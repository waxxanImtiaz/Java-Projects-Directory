
package controller2;

import java.io.*;
import java.util.zip.*;

public class TryZipFile {
    
    public static void main( String[] args ) throws IOException
    {
        String dirName = "E:/new/";
        String zipName = "myZip.zip";
        String fileName = "Test.bin";
        
        
        File file = new File( dirName );
        
        if( !file.exists() )
            file.mkdir();
        
        else
            if( !file.isDirectory() )
            {
            System.out.println(dirName+" is not a directory.");
            return;
            }
        
        File myzip = new File( file,zipName );
        
        myzip.createNewFile();
        
        ZipOutputStream zip = new ZipOutputStream( new FileOutputStream( myzip ) );
        
        ZipEntry entry = new ZipEntry( fileName );
        zip.putNextEntry(entry);
        
        
        DataOutputStream dos = new DataOutputStream( new BufferedOutputStream(zip) );
        
        for( int i = 10; i<100; i++ )
        {
            dos.writeInt( i );
        }
        
        dos.flush();
        zip.closeEntry();
        dos.close();
        
        System.out.println("File size:"+dos.size());
        System.out.println("Compressed file size = "+entry.getCompressedSize());
    }
    
}
