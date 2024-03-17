package multilevelinheritacne.vehicle;

public class VehicleDemo {
	
	public static void main(String[] args)
	{
		Car c;
		c=new Car();
		c.Vehicletype();
		
		Maruthi m=new Maruthi();
		m.Vehicletype();
		m.brand();
		m.speed();
		
		Maruthi800 m1=new Maruthi800();
		m1.Vehicletype();
		m1.brand();
		m1.speed();
	}

}
