package JavaActivity02;
import java.util.Scanner;
public class atm_v2 
{
	static int [] id = {111,222,333};
	static int [] pin = {123,246,143};
	static String [] log = {"Login Succesful", "Login Failed"};
	static int [] savings = {1000,2000,100000};
	
	public static void main(String[] args) 
	{
		login();
	}
	static void login ()
	{
		print("ID: "); int id1=scan();
		print("PIN: "); int pin1=scan();
		if(id1==id[0])
		{
			if(pin1 == pin[0])
			{
				print (log[0]);menu(id1,pin1);
			}
			else 
			{
				print(log[1]);login();
			}
		}
		else if(id1==id[1])
		{
			if(pin1==pin[1])
			{
				print(log[0]);menu(id1,pin1);
			}
			else 
			{
				print(log[1]);login();
			}
		}
		else if(id1==id[2])
		{
			if(pin1==pin[2])
			{
				print(log[0]);menu(id1,pin1);
			}
			else 
			{
				print(log[1]);login();
			}
		}
	}
	static void menu (int id2, int pin2 ) 
	{
		print ("\n\n---MENU---");
		print ("\n1. Check Balance");
		print ("\n2. Deposit");
		print ("\n3. Withdraw");
		print ("\n4. LOGOUT");
		print ("\nPress a Key: "); int key=scan();
		switch(key)
		{
			case '1': checkBalance(id2, pin2); break;
			case '2': deposit(id2, pin2); break;
			case '3': withdraw(id2, pin2); break;
			case '4': exit(); break;
			default: print("\n==INVALID KEY=="); menu(id2, pin2); break;
				
		}
	}
	static void checkBalance (int id3, int pin3)
	{
		if (id3==id[0])
		{
			print("Current Savings: " + savings [0]);
		}
		else if (id3==id[1])
		{
			print("Current Savings: " + savings [1]); 
		}
		else if (id3==id[2])
		{
			print("Current Savings: " + savings [2]); 
		}
		menu (id3,pin3);
	}
	static void deposit (int id4, int pin4)
	{
		print("Enter Money: "); int m=scan();
		if (id4==id[0])
		{
			savings [0]+=m;print("Current Savings: " + savings [0]);
		}
		else if (id4==id[1])
		{
			savings [1]+=m;print("Current Savings: " + savings [1]);
		}
		else if (id4==id[2])
		{
			savings [2]+=m;print("Current Savings: " + savings [2]);
		}
		menu(id4,pin4);
	}
	static void withdraw (int id5, int pin5)
	{
		print("Enter Money: "); int m=scan();
		if (id5==id[0])
		{
			savings [0]+=m;print("Current Savings: " + savings [0]);
		}
		else if (id5==id[1])
		{
			savings [1]+=m;print("Current Savings: " + savings [1]);
		}
		else if (id5==id[2])
		{
			savings [2]+=m;print("Current Savings: " + savings [2]);
		}
		menu(id5,pin5);
	}
	static void exit ()
	{
		print("End of Program");
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
