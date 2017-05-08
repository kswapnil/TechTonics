package util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Update {

	public static int updateTalk(int talkId,String date,String time,String topic ,String speaker) throws ClassNotFoundException, SQLException
	{
		Connection con = Connections.getconnection();
		String sql = "update addedtalks set date='"+date+"',time='"+time+"',topic='"+topic+"',speaker='"+speaker+"' where talkid="+talkId+";";
		PreparedStatement stmt=con.prepareStatement(sql);
		int x=stmt.executeUpdate();
		con.close();		
		return x;
		
	}
}
