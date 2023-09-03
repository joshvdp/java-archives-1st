package Beta;
import java.util.Scanner;
public class login 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		String user, pass;
		
		System.out.println("ID: ");
		user = input.nextLine ();
		
		System.out.println("PIN: ");
		pass = input.nextLine();
		
		if(user.equals("1111") && (pass.equals("1234")))
		{
			System.out.println("Welcome");
			 System.out.println("\n+---+");
			 System.out.println("    |");
			 System.out.println("    |");
			 System.out.println("    |");
			 System.out.println("   ===");
		}
		else 
		{
			System.out.println("Fuckoff");
			System.out.println("\n+---+");
			System.out.println("  0  |");
			System.out.println(" /|\\   |");
			System.out.println(" / \\ |");
			System.out.println("   ===");
		}
		
	}

}
