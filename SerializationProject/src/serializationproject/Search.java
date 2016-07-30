
package serializationproject;

import java.io.*;
import java.util.*;


public class Search {
    
    private String userInput;
    private Scanner input;
    private String file;
    
    public Search()
    throws IOException,ClassNotFoundException
    {
        input = new Scanner( System.in );
        start();
    }//end of constructor
    
    public void start()
    throws IOException,ClassNotFoundException       
    {
        userInput = getInput();
        Person p = new Person();; 
        //de-serializaton
        FileInputStream fis = new FileInputStream( "m.ser" );
        ObjectInputStream ois = new ObjectInputStream( fis );
        
        while( true ){
        
        try{
            
            p = ( Person )ois.readObject();
        
        }catch( EOFException e )
        {
            System.err.println( userInput+" not found" );
            System.exit( 0 );
        }
        
        
        if( p.getName().equals( userInput ) )
        {
            System.out.println( "name found:"+userInput );
            System.exit( 0 );
        }
        }//end of while loop...
    }
    public String getInput()
    {
        System.out.println( "Enter any name:" );
        return input.next();
    }//end of getInput method
    
    public static void main( String ... args )
    throws IOException,ClassNotFoundException
    {
        Search object = new Search();
    }
}
