package util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class Validator {

	
	public static boolean validate(String username, String password) throws ClassNotFoundException, SQLException
	{
		Connection con=Connections.getconnection();
		String sql = "SELECT * FROM users where username='"+username+"' and password='"+password+"'";
		PreparedStatement stmt = con.prepareStatement(sql);
		ResultSet rs = stmt.executeQuery(sql);
	    if(rs.next())  		
		return true;
	    else
	    	return false;
	}
}
