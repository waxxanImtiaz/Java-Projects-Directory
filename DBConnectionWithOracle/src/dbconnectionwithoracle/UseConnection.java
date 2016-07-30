
package dbconnectionwithoracle;

import java.sql.*;
import java.util.*;

public class UseConnection {
 
    private DBConnection connection;
    private Connection con;
    private String name;
    private int id;
    private Scanner input;
    
    public UseConnection()
    {
        this( "","","","" );
    }
    public UseConnection(String className,String url,String userName,String password)
    {
        setConnection( className,url,userName,password );
    }//end of constructor..
    
    public void setConnection(String className,String url,String userName,String password )
    {
        input = new Scanner( System.in );
        connection = new DBConnection(  className,url,userName,password );
        connection.setConnection();
    }//end of setConnection method
    
    public void start()
    {
        if( connection.isConnected() )
        {
            System.out.println( "Connection successful" );
            con = connection.getConnection();
            try{
            //Statement st = con.createStatement();
              PreparedStatement pst = con.prepareStatement( "insert into employee values(?,?)" );
                int check;
                while( true )
                {
                   getUserInput();
                   
                   //check = st.executeUpdate( "insert into employee values("+getID()+",'"+getName()+"')" );
                   
                   pst.setInt( 1, getID());
                   pst.setString( 2 , getName());
                   
                   check = pst.executeUpdate();
                   
                   if( check != 0 )
                        System.out.println( "Data inserted successfully" );
                   else
                        System.out.println( "Data not inserted" );
                   
                   System.out.println( "Press \'y\' to continue and press \'n\' to terminate." );
                   if( !input.next().equals( "y" )  )
                   {
                       connection.closeConnection();
                       con.close();
                       System.exit( 1 );
                   }
                }//end of while loop...
            
            }catch( SQLException e )
            {
                System.err.println( "Statement not created:"+e.getMessage() );
                System.exit( 1 );
            }//end of try-catch
        }//end of outer if
        else
        {
            System.out.println( "Connection failed" );
            System.exit( 1 );
        }//end of else
    }//end of start method..
    
    public void getUserInput()
    {
        System.out.println( "Enter ID:" );
        setID( input.nextInt() );
        
        System.out.println( "Enter name:" );
        setName( input.next() );
    }
    
    public void setID( int id )
    {
        this.id = id;
    }//end of setID method.
    public int getID()
    {
        return id;
    }//end of getID method
    
    public void setName( String name )
    {
        this.name = name;
    }//end of setName method..
    public String getName()
    {
        return name;
    }//end of getName method.
    
    
}

