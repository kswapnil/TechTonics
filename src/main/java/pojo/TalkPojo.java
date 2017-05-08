package pojo;

public class TalkPojo {

	private int talkid;
	private String date;
	private String time;
	private String topic;
	private String speaker;
	public TalkPojo(int talkid, String date, String time, String topic, String speaker) {
		super();
		this.talkid = talkid;
		this.date = date;
		this.time = time;
		this.topic = topic;
		this.speaker = speaker;
	}
	
	public TalkPojo() {
		// TODO Auto-generated constructor stub
	}
	public int getTalkid() {
		return talkid;
	}
	public void setTalkid(int talkid) {
		this.talkid = talkid;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getTopic() {
		return topic;
	}
	public void setTopic(String topic) {
		this.topic = topic;
	}
	public String getSpeaker() {
		return speaker;
	}
	public void setSpeaker(String speaker) {
		this.speaker = speaker;
	}
	@Override
	public String toString() {
		return "TalkPojo [talkid=" + talkid + ", date=" + date + ", time=" + time + ", topic=" + topic + ", speaker="
				+ speaker + "]";
	}
	
	
	
}
