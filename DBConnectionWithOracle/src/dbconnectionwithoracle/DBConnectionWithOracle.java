
package dbconnectionwithoracle;

public class DBConnectionWithOracle {

    
    public static void main(String[] args) {
    String url = "jdbc:oracle:thin:@localhost:1521:ORCL";
    String userName = "hr";
    String password = "12345";
    String className = "oracle.jdbc.OracleDriver";
    
    UseConnection c = new UseConnection( className,url,userName,password );
    c.start();
    }
    
}
