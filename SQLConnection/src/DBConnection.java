
import java.sql.*;
public class DBConnection {
    
    private Connection con;
    private Statement st;
    private ResultSet rs;
    
    public DBConnection()
    {
        try{
            Class.forName( "com.mysql.jdbc.Driver" );
            
            con = DriverManager.getConnection( "jdbc:mysql://localhost:3308/studentinfo","root","12345" );
            Statement st = con.createStatement();
            System.out.println(con);
            
            
            String query = "insert into student(name) values('vijay')";
            int flag = st.executeUpdate(query);
            
            if(flag!= -1)
            {
                System.out.println(flag+" rows effected");
            }
            else
            {
                System.out.println("data not inserted");
            }
//  con.setAutoCommit( false );
 //           try{
//		PreparedStatement ps = con.prepareStatement("insert into testtable values(?,?)");
//                   
//		ps.setInt(1, 7);
//                ps.setString(2, "Amjad");
//                
//                ps.executeUpdate();
//                
//                ps.setInt(1, 20);
//                ps.setString(2, "Imdad");
                
               // ps.executeUpdate();
                   // int flag = st.executeUpdate( "insert into testtable values( 33,'imtiaz' )" );
                   // System.out.println("rows effected:"+flag);
//  while( rs.next() )
//                {
//                    System.out.printf( "%d%10s" , rs.getInt( "id" ),rs.getString( "name" ));
//                    System.out.println();
//                }
//                
//                ResultSetMetaData md = rs.getMetaData();
//                
//                int c = md.getColumnCount();
//                
//                for( int i = 1; i<= c; i++ )
//                {
//                    String name = md.getColumnName( i );
//                    String dt = md.getColumnTypeName(i);
//                    int n = Types.INTEGER;
//                    System.out.println(md.getColumnType(i));
//                    String cn = rs.getCursorName();
//                    
//                    
//                    System.out.println( n );
//                    System.out.println("column number = "+i+",column name = "+name+",colum data type="+dt);
                
//		}catch( SQLException e )
//		{
//			e.printStackTrace();
//		}
          }catch( Exception e )
           {
           System.err.println("Error:"+e); 
           }
    }
}
