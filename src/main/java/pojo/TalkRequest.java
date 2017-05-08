package pojo;

public class TalkRequest {
	private int empid;
	private String empName;
	private String topic;
	public TalkRequest(int empid, String empName, String topic) {
		super();
		this.empid = empid;
		this.empName = empName;
		this.topic = topic;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getTopic() {
		return topic;
	}
	public void setTopic(String topic) {
		this.topic = topic;
	}
	public TalkRequest() {
		super();
	}
	
	

}
