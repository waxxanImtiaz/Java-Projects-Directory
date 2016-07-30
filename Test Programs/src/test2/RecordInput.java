
package test2;

import java.io.FileNotFoundException;
import java.lang.SecurityException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class RecordInput {
    
    private Formatter output;
    private InputStreamReader isr;
    private BufferedReader br;
    
    public RecordInput()
    {
        isr = new InputStreamReader( System.in );
        br = new BufferedReader( isr );
    }
    public void openFile( String file )
    {
        try{
            output = new Formatter( file );
        }
        catch( FileNotFoundException e )
        {
            e.printStackTrace();
        }
    }
    public void addRecord()
    {
        Record r = new Record();
        
        System.out.println( "Press t for terminate:" );
        String name = "";
        
        while( !name.equals( "t" ) )
        {
            try{
                
            name = br.readLine();
            r.setName(name );
            if( !name.equals( "t") )
            output.format("%s\n", name );
            
            }
            catch( IOException e )
            {
              e.printStackTrace();
            }
        }
    }//end of method addRecord
    
    public void closeFile()
    {
        try{
        if( output != null)
        {
            output.close();
            br.close();
            isr.close();
        }}catch( IOException e )
        {
            
        }
    }
}
