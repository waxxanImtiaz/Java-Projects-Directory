
package test2;

import java.io.*;
import java.util.*;

public class ReadRecord2 {
        private Scanner input;
        
        
        public void openFile( String file )
        {
            try{
                input = new Scanner( new File( file ) );
            }catch( FileNotFoundException e )
            {
                
            }
        }//end of method openFile
        
        public void readRecord()
        {
            Record r = new Record();
            
            System.out.println( "Name:" );     
            while( input.hasNext() )
            {
                r.setName( input.next() );
                System.out.printf( "%s%n", r.getName());
            }
        }//end of method readRecord
        public void closeFile()
        {
            if( input != null )
            {
                input.close();
            }
    
        }
}
