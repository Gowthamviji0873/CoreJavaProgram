package singleinheritance;

public class Citizen {
	private int cid;
	private String cname;
	private int age;
	public Citizen()
	{
		System.out.println("Citizen object created");
	}
	public Citizen(int cid,String cname,int age)
	{
		this.cid=cid;
		this.cname=cname;
		this.age=age;
	}
	
	//Getter and Setter
	
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	//Tostring method
	
	@Override
	public String toString() {
		return "Citizen [cid=" + cid + ", cname=" + cname + ", age=" + age + "]";
	}
	
}
