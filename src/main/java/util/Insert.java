package util;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;

public class Insert {

	public static int requestTalkinsert(int empid,String empname,String topic) throws ClassNotFoundException, SQLException
	{
		Connection con = Connections.getconnection();
		String sql = "insert into maketalkrequest values("+empid+",'"+empname+"','"+topic+"');";
		PreparedStatement stmt = con.prepareStatement(sql);
		int x=stmt.executeUpdate();
		con.close();		
		return x;
		
	}
	
	public static int registerTodb(String username,String email,String password) throws ClassNotFoundException, SQLException
	{
		Connection con = Connections.getconnection();
		String sql = "insert into registered_users values ('"+username+"','"+email+"','"+password+"')";
		PreparedStatement stmt = con.prepareStatement(sql);
		int x=stmt.executeUpdate();
		con.close();		
		return x;
	}
	
	public static int wantToattendInsert(String topic,String empname) throws ClassNotFoundException, SQLException
	{
		Connection con = Connections.getconnection();
		String sql = "insert into attendingpeoples (topic,empname)values('"+topic+"','"+empname+"');";
		PreparedStatement stmt = con.prepareStatement(sql);
		int x=stmt.executeUpdate();
		con.close();		
		return x;
	}
	
	public static int addTalk(String date,String time,String topic,String speaker) throws ClassNotFoundException, SQLException
	{		
        
		Connection con = Connections.getconnection();
		String sql = "select talkid from addedtalks ORDER BY talkid desc limit 1; ";
		PreparedStatement stmt = con.prepareStatement(sql);
		ResultSet result=stmt.executeQuery();
		int talkid=0;
		while(result.next())
		{
			talkid=result.getInt("talkid");
		}
		if(talkid==0)
			talkid=1;
		else
			talkid=talkid+1;
		
		//insertiing talks
		sql = "INSERT INTO  addedtalks VALUES ("+talkid+",'"+date+"','"+time+"','"+topic+"','"+speaker+"')";
		stmt=con.prepareStatement(sql);
		int x=stmt.executeUpdate();
		con.close();		
		return x;
		
	}
}
