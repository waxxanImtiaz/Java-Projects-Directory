
package databaseconnection;

import java.sql.*;

public class DatabaseConnection {

   public static void main(String[] args) {
        
        try{
            //step 1: load class
            Class.forName("oracle.jdbc.OracleDriver");
            
            //step 2: get connection
            
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","hr","12345");
            
            //step 3: get statement
            
            String query = "insert into animal values(\'1\',\'Cat\')";
            
            
//            
             Statement st = con.createStatement();
//            
            int flag = st.executeUpdate(query);
                
//            
            if(flag != -1)
            {
                System.out.println(flag+" rows effected");
            }
            else
                System.out.println("not inserted");
//            PreparedStatement ps = con.prepareStatement(query);
//            
//          
//            
//            ResultSet rs = ps.executeQuery();
//            
//            while( rs.next() )
//            {
//                System.out.println("username:"+rs.getString("username"));
//                System.out.println("password:"+rs.getString("password"));
//                
//            }
            
            
        }catch( SQLException e )
        {
            System.out.println(e.getMessage());
        }catch( ClassNotFoundException e )
        {
            System.out.println(e.getMessage());
        }
        
    }
    
}
