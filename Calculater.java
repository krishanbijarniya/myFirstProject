import java.util.*;
public class Calculater {

	public static  void main(String[] args) {
		long a,b;
		System.out.println("enter a number=");
		Scanner sc=new Scanner(System.in);
		a=sc.nextLong();
		System.out.println("enter the 2nd number=");
		b=sc.nextLong();
		
		Calculater c=new Calculater();
		System.out.println("Choose your operation from + - * /");
		char choice=sc.next().charAt(0);
		if(choice=='+') {
		 
		c.addition(a,b);
		}
		else if(choice=='-') {
		c.substraction(a,b);
		}
		else if(choice=='/'){
		c.division(a,b);
		}
		else if(choice=='*') {
		c.multiply(a,b);
		}
		else {
			System.out.println(" please enetr right operator ");
		}
	}

	public void addition(long a,long b) {
	
			System.out.println("Sum is: "+(a+b));
	}
	public void substraction(long a,long b)
	{
			System.out.println("Substraction is: "+(a-b));
	}
	public void division(long a,long b) {
		
		System.out.println("Sum is: "+(a/b));
	}
	public void multiply(long a,long b) {
		
		System.out.println("Sum is: "+(a*b));
	}
}
