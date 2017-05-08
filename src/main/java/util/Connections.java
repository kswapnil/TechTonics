package util;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class Connections {

	public static Connection getconnection() throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost/techtonic","root","root");
		return con;
		
	}
	
}
