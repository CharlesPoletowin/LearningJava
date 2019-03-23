package sqlDemo;
import java.sql.*;

public class SQLtest {
	// JDBC 驱动名及数据库 URL
    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";  
    static final String DB_URL = "jdbc:mysql://localhost:3306/awesome";
 
    // 数据库的用户名与密码，需要根据自己的设置
    static final String USER = "test";
    static final String PASS = "test";
    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        try {
            conn =
               DriverManager.getConnection("jdbc:mysql://localhost/awesome?" +
                                           "user=test&password=test"+"&serverTimezone=GMT%2B8");

            // Do something with the Connection
            stmt = conn.createStatement();
            rs = stmt.executeQuery("SELECT name FROM users");
            if (stmt.execute("SELECT name FROM users")) {
                rs = stmt.getResultSet();
            }
            while(rs.next()) {
            	String name = rs.getString("name");
            	System.out.print(name+" ");
            }

        } catch (SQLException ex) {
            // handle any errors
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
    }
}
