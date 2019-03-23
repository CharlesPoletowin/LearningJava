package sqlDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SQLConnectDemo {
	public static void main(String[] args) throws Exception{
		DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/awesome?"+"user=test&password=test"+"&serverTimezone=GMT%2B8");
		PreparedStatement pstm=conn.prepareStatement("select * from users");
		ResultSet rs=pstm.executeQuery();
		while (rs.next()){
			System.out.println(rs.getString("name"));
		}
		rs.close();
		pstm.close();
		conn.close();
	}
}
