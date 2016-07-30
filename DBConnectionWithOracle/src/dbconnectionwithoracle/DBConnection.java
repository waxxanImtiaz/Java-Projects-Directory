
package dbconnectionwithoracle;

import java.sql.*;

public class DBConnection {
  private Connection con;
  private String url;
  private String userName;
  private String password;
  private String className;
  private boolean connected;
  
  public DBConnection()
  {
      this( "","","","" );
  }//end of default constructor..
  
  public DBConnection(String className,String url,String userName,String password )
  {
      setData( className,url,userName,password );
      
  }//end of constructor
  public void setData(String className,String url,String userName,String password )
  {
      setClassName( className );
      setUrl( url );
      setUserName( userName );
      setPassword( password );
      
  }//end of setData method
 
 
  public void setConnection()
  {
      try{
      
      setClass();
      con = DriverManager.getConnection( getUrl(),getUserName(),getPassword() );
      
      if( con != null )
          setConnected( true );
      else 
          setConnected( false );
      
      }catch( SQLException e )
      {
          System.err.println( "Exception in connection:"+e.getMessage() );
          System.exit( 1 );
      }
      
  }//end of setConnection method
  
  public void setConnected( boolean connected )
  {
      this.connected = connected;
  }//end of setConnected method..
  
  public boolean isConnected()
  {
      return connected;
  }//end of getConnected method.
  
  public void setClassName( String className )
  {
      this.className = className;
  }//end of setClassName method.
  
  public String getClassName()
  {
      return className;
  }//end of getClassName method

  public Connection getConnection()
  {
      return con;
  }//end of getConnection method
  public void setClass( )
  {
      
      try{
      Class.forName( getClassName() );
      
          System.out.println( "Class set" );
      }catch( ClassNotFoundException e ){
          System.err.println( getClassName()+" class not found." );
          System.exit( 1 );
      }//end of try-catch
  }//end of setClass method

  
  public void setUserName( String userName )
  {
      this.userName = userName;
  }//end of setUserName method
  
  public String getUserName()
  {
      return userName;
  }//end of getUserName method
  
  public void setPassword( String password )
  {
      this.password = password;
  }//end of setPassword method
  
  public String getPassword()
  {
      return password;
  }//end of getPassword
  
  public void setUrl( String url )
  {
      this.url = url;
  }//end of setUrl method
  public String getUrl()
  {
      return url;
  }//end of getUrl method
  
  public void closeConnection()
  {
      try{
      if( con != null )
          con.close();
      }catch( SQLException e )
      {
          System.err.println( "Connection not closed:"+e.getMessage() );
      }
  }
  
}//end of class
