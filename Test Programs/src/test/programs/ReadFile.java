
package test.programs;

import java.io.*;
import java.util.*;


public class ReadFile {
    private Scanner input;
    
    public void openFile( String file )
    {
        try{
            input = new Scanner( new File( file) );
        }catch( FileNotFoundException e )
        {
            System.out.println( file+" not found" );
        }
    }
    
    public void readRecord()
    {
        AccountRecord record = new AccountRecord();
        
        System.out.printf( "%-10s%-10s\n" ,"Name","Account Number" );
        
        while( input.hasNext() )
        {
            try{ 
                record.setAccNum( input.nextInt() );
                record.setName( input.next() );
                
                System.out.printf(  "%-10s%-10d%n" , record.getName(),record.getAccNum() );
            }catch( NoSuchElementException e )
            {
                System.out.println( "Invalid input" );
                System.exit( 1 );
            }
            
        }
    }//end of method readRecord
    
    public void closeFile()
    {
        if( input != null )
            input.close();
    }
}
