package JavaActivity;
import java.util.*;
public class NameAndAge {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		String name;
		int age;
		
		System.out.println("Enter Name: ");
		name = input.nextLine();
		
		System.out.println("Enter Age");
		age=input.nextInt();

		System.out.println();
		System.out.println("Your name is "+ name);
		System.out.println("You are "+ age +" years old");
	}
}
