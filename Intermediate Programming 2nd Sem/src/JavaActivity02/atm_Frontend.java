package JavaActivity02;
import java.util.Scanner;
public class atm_Frontend 
{
	static int [] id = {2002,1969};
	static int [] pin = {0007,9669};
	static String [] log = {"==Login Failed==", "\n==Login Successful== \n Welcome Joshua!", "\n==Login Succesful== \n Welcome John!"};
	public static void main(String[] args) 
	{
		print ("==ATM PROGRAM==" + "\nDELA PEÑA, JOSHUA VER S. 1BSEMC-1");
		login();
	}
	static void login ()
	{
		print("\nEnter ID Number: "); 
		int acc1=scan();
		print("Enter PIN: "); 
		int pass1=scan();
		if(acc1==id[0])
		{
			if(pass1 == pin[0])
			{
				print (log[1]); 
				atm_Backend.menu(acc1, pass1);
			}
			else 
			{
				print(log[0]);login();
			}
		}
		else if(acc1==id[1])
		{
			if(pass1==pin[1])
			{
				print(log[2]); 
				atm_Backend.menu(acc1, pass1);
			}
			else 
			{
				print(log[0]);
				login();
			}
		}
		else if(acc1==id[2])
		{
			if(pass1==pin[2])
			{
				print(log[0]);
				atm_Backend.menu(acc1, pass1);
			}
			else 
			{
				print(log[1]);
				login();
			}
		}
	}
		static void print (String msg)
		{
			System.out.println(msg);
		}
		static int scan ()
		{
			Scanner s = new Scanner(System.in);
			return s.nextInt();
		}

}
