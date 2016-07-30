
package controller2;

import java.io.*;

public class FileStreamTest {
    
    public static void main( String[] args )
    {
        File myFile = new File("F:/important docs.txt");
        
        System.out.printf("exists %b\n",myFile.exists());
        System.out.printf("isDirectory %b\n",myFile.isDirectory());
        System.out.printf("getPath %b\n",myFile.isFile());
        System.out.printf("isHidden %b\n",myFile.isHidden());
        System.out.printf("isAbsolute  %b\n",myFile.isAbsolute());
        System.out.printf("exists %b\n",myFile);
        File myFile2 = new File( "F:/index.txt" );
        
        System.out.printf("are equal? %b\n",myFile.equals(myFile2));
        
        
        try{
            
            System.out.printf("canRead %b\n",myFile.canRead());
            System.out.printf("canWrite %b\n",myFile.canWrite());
        
        
        }catch(SecurityException e)
        {
            e.printStackTrace();
        }
        
        
        
        
      System.out.printf("getName  %s\n",myFile.getName());
      System.out.printf("getPath %s\n",myFile.getPath());
      System.out.printf("getAbsolutePath %s\n",myFile.getAbsolutePath()); 
      System.out.printf("getParent %s\n",myFile.getParent());
      System.out.printf("length %d\n",myFile.length());
       System.out.printf("lastModified %d\n",myFile.lastModified());
       System.out.printf("toString %s\n",
               myFile);
        System.out.printf("hashcode %d\n",myFile.hashCode());
        
        myFile2 = new File( "F:/" );
        try{
        String[] arr = myFile2.list();
        
            System.out.println("List of files are ");
        for(String s : arr )
        {
            System.out.println(s);
        }
        File[] root = File.listRoots();
        
            System.out.println("listRoots method");
            for( int i = 0; i< root.length; i++ )
                System.out.println( root[ i ] );
        
        }catch(SecurityException e)
        {
            e.printStackTrace();
        }
    }
    
}
