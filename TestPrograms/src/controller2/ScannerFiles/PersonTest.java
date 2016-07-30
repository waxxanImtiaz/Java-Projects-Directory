package controller2.ScannerFiles;

import java.util.*;
import java.io.*;
public class PersonTest {
    public static void main( String[] args )
    {
        Formatter output = null;
        try{
        output = new Formatter( "E:/imtiaz/client.txt" );
        }catch( FileNotFoundException e  )
        {
            e.printStackTrace();
        }
        
        Scanner input = new Scanner( System.in );
        Person p = new Person();
        System.out.println("Enter any name and press \'n\' to terminate.");
        String temp = "y";
        
        try{
        while( !temp.equals("n") )
        {
            
            p.setName( input.nextLine() );
            temp = p.getName();
            
            if( !temp.equals("n") )
            output.format("%s\n", p.getName());
            
            
           
            
          
           
        }
          
            }catch(FormatterClosedException e )
            {
                e.printStackTrace();
                return;
            }catch( NoSuchElementException e )
            {
                e.printStackTrace();
                return;
            }finally{
                    output.flush();
                    output.close();
                    input.close();
                 }
    }
}
