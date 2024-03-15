package multilevelinheritance;

import java.util.Date;
import java.text.SimpleDateFormat;
public class MultilevelInheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		@SuppressWarnings("deprecation")
		Person p1=new Person("Gowtham",904748449 ,new Date(2004,04,8));
		System.out.println(p1);
		  
		@SuppressWarnings("deprecation")
		Employee e1=new Employee("Priya",843860637,new Date(2003,11,19),"Sales",45000);
		System.out.println(e1);
		
		@SuppressWarnings("deprecation")
		LevelOneEmployee l1=new LevelOneEmployee("Sakthivel",978665126,new Date(1970,12,4),"Account",8500,200,"Signing Authority");
		System.out.println(l1);

	}

}
