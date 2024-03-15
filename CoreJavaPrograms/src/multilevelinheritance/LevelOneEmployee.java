package multilevelinheritance;

import java.util.Date;

public class LevelOneEmployee extends Employee {
	
	private int noofshares;
	private String authority;
	
	public LevelOneEmployee(String name,long contactno,Date dateofbirth,String deptname,double basesalary,int noofshares,String authority)
	{
		super(name,contactno,dateofbirth,deptname,basesalary);
		this.noofshares=noofshares;
		this.authority=authority;
	}
	
	//Gettr and Setter

	public int getNoofshares() {
		return noofshares;
	}

	public void setNoofshares(int noofshares) {
		this.noofshares = noofshares;
	}

	public String getAuthority() {
		return authority;
	}

	public void setAuthority(String authority) {
		this.authority = authority;
	}
	
	//Tostring method

	@Override
	public String toString() {
		return "LevelOneEmployee ["+super.toString()+"noofshares=" + noofshares + ", authority=" + authority + "]";
	}
	
	

}
