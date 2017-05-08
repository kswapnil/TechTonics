package util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Delete {

	public static int deleteTalk(int talkid) throws ClassNotFoundException, SQLException{
	Connection con = Connections.getconnection();
	String sql = "delete from addedtalks where talkid="+talkid;
	PreparedStatement stmt = con.prepareStatement(sql);
	int x=stmt.executeUpdate();
	con.close();		
	return x;
	}
	
	public static int deleteTalkRequest(int empid) throws ClassNotFoundException, SQLException{
		Connection con = Connections.getconnection();
		String sql = "delete from maketalkrequest where empid="+empid;
		PreparedStatement stmt = con.prepareStatement(sql);
		int x=stmt.executeUpdate();
		con.close();		
		return x;
		}
	
}
