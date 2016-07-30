
package controller2;

import java.io.*;
import java.util.Date;

public class FileListFilterMain {
    public static void main( String[] args )
    {
        File myDir = new File( "F:\\program\\" );
        
        System.out.println(myDir.getAbsolutePath()+(myDir.isDirectory()?" is ":" is not"
                + "") + "a directory");
        
        System.out.println("The parent of "+myDir.getName()+" is "+myDir.getParent());
        
        FilenameFilter select = new FileListFilter("AverageSpeed","java");
        
        File[] contents = myDir.listFiles(select);
        
        
        if( contents != null )
        {
            System.out.println("The "+contents.length+" matching items in the directory,"
            +myDir.getName()+" are:");
            
            for( int i =0; i < contents.length; i++ )
            {
                System.out.println(contents[i]+" is a "+(contents[ i ].isDirectory()?" directory":"file")+" last"
                        + " modified "+ new Date( contents[ i ].lastModified() ));
            }
        }
        
        File myFile = new File("F:\\program\\c.txt");
//        
//        myFile.renameTo(new File("F:\\program\\c.txt"));
        
        System.out.println("File renamed");
        try{
        if( myFile.delete())
                System.out.println("File deleted");
        else
                System.out.println("Not deleted");
        }catch( Exception e  )
        {
            System.out.println("Error:"+e.getStackTrace());
        }
    }
}
