package day_1javabasics;
import java.util.* ;
public class Subtraction {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a,b,c;
		System.out.println("Enter a and b value:");
		a=s.nextInt();
		b=s.nextInt();
		c=a-b;
		System.out.println("Subtraction of a="+a+" and b="+b+" is:"+c);
	}

}
