package Practice;
import java.util.Scanner;
public class Hello 
{
	
	public static void main (String [] args)
	{
		/*String [] cars = { "Volvo", "Miata", "Toyota Engine"};
		System.out.print(cars [2]);*/
		
		Scanner input = new Scanner(System.in);
		String firstName = "";
		String lastName = "";
		String middleI = "";
		
		System.out.print("Enter First Name: ");
		firstName = input.nextLine();
		System.out.print("\nEnter Last Name: ");
		lastName = input.nextLine();
		System.out.print("\nEnter Middle Initial: ");
		middleI = input.nextLine();
		
		System.out.println("Welcome! " + lastName + " " + firstName + " " + middleI);
		
		
	}
}
