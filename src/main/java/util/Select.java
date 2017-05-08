package util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import pojo.AttendingPeople;
import pojo.TalkPojo;
import pojo.TalkRequest;

public class Select {

	public static ArrayList<TalkPojo> getAddedTalksList() throws ClassNotFoundException, SQLException
	{
		Connection con = Connections.getconnection();
		String sql = "select * from addedtalks; ";
		PreparedStatement stmt = con.prepareStatement(sql);
		ResultSet result=stmt.executeQuery();
		
		ArrayList<TalkPojo> listOfTalks =new ArrayList<TalkPojo>();
		TalkPojo obj=null;
		while(result.next())
		{
			obj=new TalkPojo();
			obj.setTalkid(result.getInt("talkid"));
			obj.setDate(result.getString("date"));
			obj.setTime(result.getString("time"));
			obj.setTopic(result.getString("topic"));
			obj.setSpeaker(result.getString("speaker"));
			listOfTalks.add(obj);
		}	
		con.close();
		return listOfTalks;
		
	}
	public static TalkPojo getSingleTalk(int talkid) throws ClassNotFoundException, SQLException
	{
		Connection con = Connections.getconnection();
		String sql = "select * from addedtalks where talkid="+talkid+"; ";
		PreparedStatement stmt = con.prepareStatement(sql);
		ResultSet result=stmt.executeQuery();
		
		TalkPojo obj=null;
		while(result.next())
		{
			obj=new TalkPojo();
			obj.setTalkid(result.getInt("talkid"));
			obj.setDate(result.getString("date"));
			obj.setTime(result.getString("time"));
			obj.setTopic(result.getString("topic"));
			obj.setSpeaker(result.getString("speaker"));
		}
		con.close();
		return obj;
		
	}
	public static ArrayList<TalkRequest> getRequestedTalks() throws ClassNotFoundException, SQLException
	{
		Connection con = Connections.getconnection();
		String sql = "select * from maketalkrequest; ";
		PreparedStatement stmt = con.prepareStatement(sql);
		ResultSet result=stmt.executeQuery();
		
		ArrayList<TalkRequest> listOfTalkRequest =new ArrayList<TalkRequest>();
		TalkRequest obj=null;
		while(result.next())
		{
			obj=new TalkRequest();
			obj.setEmpid(result.getInt("empid"));
			obj.setEmpName(result.getString("name"));
			obj.setTopic(result.getString("topicName"));			
			listOfTalkRequest.add(obj);
		}	
		con.close();
		return listOfTalkRequest;
		
	}
	
	public static ArrayList<AttendingPeople> getAttendingPeopleList(String topicname) throws ClassNotFoundException, SQLException
	{
		Connection con = Connections.getconnection();
		String sql = "select * from attendingpeoples where topic='"+topicname+"'; ";
		PreparedStatement stmt = con.prepareStatement(sql);
		ResultSet result=stmt.executeQuery();
		
		ArrayList<AttendingPeople> listOfAttendent =new ArrayList<AttendingPeople>();
		AttendingPeople obj=null;
		while(result.next())
		{
			obj=new AttendingPeople();
			obj.setTopic(result.getString("topic"));
			obj.setEmp(result.getString("empname"));
			listOfAttendent.add(obj);
		}	
		con.close();
		return listOfAttendent;
		
	}

	
}
