
package serializationproject;

import java.io.*;
import java.util.*;


public class PersonMain
{
    private Scanner input;
    private String file;
    private Person p1;
    private Person p2;
    //constructor..
    public PersonMain( String file )
    {
        input = new Scanner( System.in );
        this.file = file;
        start();
    }///end of constructor
    //start method
    public void start()
    {
        boolean flag = true;
        
        try{
            
//           //serialization
//           System.out.println("Serialization");
//           
//           FileOutputStream fos = new FileOutputStream( file ); 
//           ObjectOutputStream oos = new ObjectOutputStream( fos );
//          
//           do
//           {
//               p1 = new Person();
//               
//               getUserInput();
//               
//               oos.writeObject( p1 );
//               
//               System.out.println( " Press \'y\' for continue and press \'n\' for terminate. " );
//               
//               if( input.next().equals( "n" )  )
//               {
//                   flag = false;
//               }
//           }while( flag );//end of do-while loop
//           
           //de-serialization
            System.out.println("De-serialization");
             
            FileInputStream fis = new FileInputStream( file ); 
            ObjectInputStream ois = new ObjectInputStream( fis );
           
            flag = false;
            do{
           
                p2 = new Person();
           
                p2 = ( Person ) ois.readObject();
                
                if( !p2.equals(null) )
                {
                System.out.println(""+p2);
                flag = true;
                }
                else
                    flag = false;
                
            }while( flag );//end of do-while loop

        }
        catch( EOFException e )
        {
            System.err.println( "File ended" );
            System.exit( 0 );
        }
        catch( Exception e )
        {
            e.printStackTrace();
        }//end of try-catch
        
    }//end of start method
    //get input from user
    public void getUserInput()
    {
        
        try{
        System.out.println( "Enter name:" );
        p1.setName( input.next() );
        
        System.out.println( "Enter cast:" );
        p1.setCast( input.next() );
        }catch( NoSuchElementException e )
        {
            System.err.println( "Invalid input.. Thanx:"+e.getMessage() );
        }
    }//end of getUserMethod...
    
    public static void main( String[] args )
    {
        String file = "m.ser";
        PersonMain obj = new PersonMain( file );
        
    }
}
