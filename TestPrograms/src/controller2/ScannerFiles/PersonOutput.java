
package controller2.ScannerFiles;

import java.io.*;
import java.util.*;

public class PersonOutput {
    public static void main( String[] args )
    {
        Scanner input = null;
        
        try{
            
            input = new Scanner( new File("E:/imtiaz/client.txt") );
        }catch( SecurityException e  )
        {
            e.printStackTrace();
        }
        catch( FileNotFoundException e )
        {
          e.printStackTrace();
        }
        Person p = new Person();
        try{
        while( input.hasNext()  )
        {
            p.setName( input.nextLine() );
            
            System.out.printf("%s\n",p.getName());
        }
        }catch( NoSuchElementException e ){
            e.printStackTrace();
        }finally
        {
            input.close();
        }
                
    }
}
