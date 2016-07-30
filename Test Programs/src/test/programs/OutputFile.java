package test.programs;

import java.io.FileNotFoundException;
import java.lang.SecurityException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class OutputFile {
    
    
    private Formatter output;
    private InputStreamReader isr = new InputStreamReader( System.in );;
    private BufferedReader br = new BufferedReader( isr );;
    
    public OutputFile()
    {
        
    }
    
    public void openFile( String file )
    {
        try{
          output = new Formatter( file );  
        }catch( SecurityException e )
        {
            e.printStackTrace();
            System.exit( 1 );
        }catch( FileNotFoundException e  )
        {
            System.err.println( file+" not found" );
            System.exit( 1 );
        }
    }
    public void addRecord()
    {
        AccountRecord record = new AccountRecord();
        
        Scanner input = new Scanner( System.in );
        
        boolean flag = true;
        
        while( flag )
        {
            try{
                
                System.out.println( "\nEnter name:" );
                record.setName( br.readLine() );
                
                System.out.println( "\nEnter account number(>0):" );
                record.setAccNum( input.nextInt() );
                
                if( record.getAccNum()>0 )
                {
                    output.format("\n%d %s \n", record.getAccNum(),record.getName() );
                }else{
                    System.out.println( "Account number must be greater than zero" );
                    
                }
            }catch( FormatterClosedException e )
            {
                System.err.println( "Formatter is closed" );
                System.exit( 1 );
            }
            catch( NoSuchElementException e )
            {
                System.err.println( "Invalid input" );
                System.exit( 1 );
            }
             catch( IOException e )
             {
                 System.err.println( "Invalid input" ); 
                 System.exit( 1 );
                  
             }
            
            System.out.printf("%s\n%s", "Press t to terminate","If you want to continue then press any key:" );
            if( input.next().equals( "t" ) )
            {
                flag = false;
            }
        
        }//end of while loop..
    }//end of addRecord method
    
    public void closeFile()
    {
        try{
        if( output != null )
        {
            br.close();
            isr.close();
            output.close();
        }}catch( IOException e )
        {
            
        }
    }
}//end of class
