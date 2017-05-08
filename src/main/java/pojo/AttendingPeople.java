package pojo;

public class AttendingPeople {
	private String topic;
	private String emp;
	public AttendingPeople(String topic, String emp) {
		super();
		this.topic = topic;
		this.emp = emp;
	}
	public String getTopic() {
		return topic;
	}
	public void setTopic(String topic) {
		this.topic = topic;
	}
	public String getEmp() {
		return emp;
	}
	public void setEmp(String emp) {
		this.emp = emp;
	}
	public AttendingPeople() {
		super();
	}
	
	

}
