package Practice;
import java.util.Scanner;
public class NameAndAge {
	public static void main(String []args) 
	
	{
	   
	   Scanner input = new Scanner(System.in);
	   
	   int age;
	   double average = 0.0;
	   System.out.println("Enter your age");
	   age = input.nextInt();
	   
	   System.out.println("Ok your age is " + age);
	   System.out.println("Enter your average");
	   average = input.nextDouble();
	   System.out.println("Ok your average is "+ average);
	   
	   input.close(); 
	}

}
