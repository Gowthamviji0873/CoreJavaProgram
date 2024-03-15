package multilevelinheritance;

import java.util.Date;

public class Employee extends Person{
	private String deptname;
	private double basesalary;
	
	public Employee(String name,long contactno, Date dateofbirth,String deptname,double basesalary)
	{
		super(name, contactno, dateofbirth);
		this.deptname=deptname;
		this.basesalary=basesalary;
	}
	
	//Getter and Setter

	public String getDeptname() {
		return deptname;
	}

	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}

	public double getBasesalary() {
		return basesalary;
	}

	public void setBasesalary(double basesalary) {
		this.basesalary = basesalary;
	}
	
    //Tostring method
	
	@Override
	public String toString() {
		return "Employee ["+super.toString()+", deptname=" + deptname + ", basesalary=" + basesalary + "]";
	}
	
	

}
