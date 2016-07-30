package databasecon;

import java.sql.*;

public class Databasecon {

    public static void main(String[] args) throws ClassNotFoundException {
       
        try{
            
            //load class
            Class.forName( "oracle.jdbc.OracleDriver" );
            
            //get connection.
            
            Connection con = DriverManager.getConnection( "jdbc:oracle:thin:@localhost:1521:ORCL","hr","12345" );
            
            //Statement ps = con.createStatement();
            
           // int count = ps.executeUpdate( "create table db(id int not null,name varchar(50) not null)" );
            
            
            PreparedStatement pst = con.prepareStatement( "insert into db(?,?)" );
            
            pst.setInt( 1 , 122);
            pst.setString( 2 , "imtiaz");
            
            int count = pst.executeUpdate();
            
            if( count != 0 )
            {
                System.out.println( count+" rows effected" );
            }
            else
                System.out.println( "data not inserted" );
            
        }catch( SQLException e )
        {
            
        }
    }
    
}
