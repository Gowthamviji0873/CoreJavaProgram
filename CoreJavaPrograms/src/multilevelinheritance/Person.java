package multilevelinheritance;

import java.util.Date;

public class Person {
	private String name;
	private long contactno;
	private Date dateofbirth;
	
	public Person(String name,long contactno,Date dateofbirth)
	{
		super();
		this.name=name;
		this.contactno=contactno;
		this.dateofbirth=dateofbirth;
	}
	
	//Getter and Setter

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getContactno() {
		return contactno;
	}

	public void setContactno(long contactno) {
		this.contactno = contactno;
	}

	public Date getDateofbirth() {
		return dateofbirth;
	}

	public void setDateofbirth(Date dateofbirth) {
		this.dateofbirth = dateofbirth;
	}

	
	//Tostring method

	@Override
	public String toString() {
		return "Person [name=" + name + ", contactno=" + contactno + ", dateofbirth=" + dateofbirth + "]";
	}
}
