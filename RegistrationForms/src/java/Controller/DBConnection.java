
package Controller;

import java.sql.*;


public class DBConnection {
    private String name;
    private String age;
    private String father_name;
    private String qualification;
    private String address;
    private String cast;
    //DB data
    private String url;
    private String userName;
    private String password;
    private String className;
    private Connection con;
    
    public DBConnection()
    {
        this("jdbc:oracle:thin:@localhost:1521:ORCL","hr","12345","oracle.jdbc.OracleDriver");
    }
    public DBConnection( String url,String userName,String password,String className )
    {
             url = "jdbc:oracle:thin:@localhost:1521:ORCL";
             userName = "hr";
             password = "12345";
             className = "oracle.jdbc.OracleDriver";
    }//end of constructor
    
    public void setData( String name,String cast,String father_name,String address,String qualification,String age )
    {
        this.name = name;
        this.father_name = father_name;
        this.cast = cast;
        this.address = address;
        this.age = age;
        this.qualification = qualification;
    }
    
    public boolean inserted()
    {
        boolean isInserted = false;
        try{
            Class.forName( className );
            
            con = DriverManager.getConnection(url,userName,password);
            
            
            PreparedStatement pst = con.prepareStatement("insert into servlet_user_data values(?,?,?,?,?,?)");
            
            pst.setString( 1, name );
            pst.setString( 2,father_name );
            pst.setString( 3, cast );
            pst.setString( 4,age );
            pst.setString( 5,qualification );
            pst.setString( 6, address );
            
            int flag = pst.executeUpdate();
            
            if( flag != 0 ){
                isInserted = true;
                System.out.println( "Data entered successfully" );
            }
            else
            {
                System.out.println( "Data not inserted" );
                isInserted = false;
            }//end of if-else
        }catch( Exception e )
        {
            
        }
        return isInserted;
    }//end of  method...
}//end of class
