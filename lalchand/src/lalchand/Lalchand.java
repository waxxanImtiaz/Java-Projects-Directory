
package lalchand;
import java.sql.*;

public class Lalchand {

    public static void main(String[] args) {
        byte a = 10;
        byte b = 20;
        byte c = (byte)(a%b);//max(int,type of a byte,type of b byte);
        b= (byte)(b+1);//max(int,type of b byte,int)
        b++;//b = (byte)(b+1);
        System.out.println(c);
    
//        try
//        {
//        Class.forName("oracle.jdbc.driver.OracleDriver");
//        System.out.println("Driver loaded");
//        
//        Connection conn= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","system","12345");
//            System.out.println("connection Established");
//            
//            
//         Statement stmt;
//         stmt = conn.createStatement();
//         String qq="create table person(id int,name varchar(20))";
//         int b = stmt.executeUpdate(qq);
//         if( b != -1  )
//         {
//             System.out.println("table created");
//         }
////         ResultSet rs= stmt.executeQuery(qq);
////         while(rs.next())
////         {
////             System.out.println("username:"+rs.getString("username")+"\t"+"password:"+rs.getString("password"));
////             
////         }
//        }//end of try
//            catch(SQLException e){
//            System.out.println("SQL error");
//            }
//            catch( ClassNotFoundException e)
//            {
//            System.out.println("Class not found");
//            }
    }
    
    }
