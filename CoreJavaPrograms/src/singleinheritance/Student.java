package singleinheritance;

public class Student extends Citizen {
	private int sid;
	private String course;
	public Student()
	{
		System.out.println("Student object created");
	}
	public Student(int cid,String cname,int age,int sid,String course)
	{
		super(cid,cname,age);
		this.sid=sid;
		this.course=course;
	}
	
	//Getter and Setter
	
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	
	//Tostring method
	
	@Override
	public String toString() {
		return "Student [cid="+ super.getCid() +", cname="+ super.getCname() +", age="+ super.getAge() +", sid=" + sid + ", course=" + course + "]";
	}
	
	

}
