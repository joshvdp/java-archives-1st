package JavaActivity02;
import java.util.Scanner;
public class atm_Backend 
{
	static int [] savings = {1000,2000,3000};
	static String [] accName = {"Joshua", "John"};
		static void menu (int acc2, int pass2)
		{	
			print ("\n\n---MENU---");
			print ("\n1. Check Balance");
			print ("\n2. Deposit");
			print ("\n3. Withdraw");
			print ("\n4. LOGOUT");
			print ("\nPress a Key: "); 
			int key = scan();
			switch(key)
			{
				case 1:
					checkBalance(acc2, pass2);
					break;	
				case 2:
					deposit(acc2, pass2);
					break;	
				case 3:
					withdraw(acc2, pass2);
					break;
				case 4:
					exit(acc2, pass2);
					break;
				default: 
					print("\n==INVALID KEY==");
					menu(acc2, pass2);		
			}
			
		}
		static void checkBalance (int acc3, int pass3)
		{
			if (acc3==atm_Frontend.id[0])
			{
				print("\nHello "+ accName[0] + " your balance is: " + savings [0]);
				print("\n\nPress 'B' and Hit Enter to go back to Menu: ");
				char key = scankey();
				switch(key)
				{
					case 'B':
						menu(acc3, pass3);
						break;
					default: 
						print("\n==INVALID KEY==");
						checkBalance (acc3, pass3);
				}
			}
			else if (acc3==atm_Frontend.id[1])
			{
				print("\nHello "+ accName[1] + " your balance is: " + savings [1]);
				print("\n\nPress 'B' and Hit Enter to go back to Menu: ");
				char key = scankey();
				switch(key)
				{
					case 'B':
						menu(acc3, pass3);
						break;
					default: 
						print("\n==INVALID KEY==");
						checkBalance (acc3, pass3);
				} 
			}
		}
		static void deposit (int acc4, int pass4)
		{
			print ("\n\n---DEPOSIT---");
			print ("\nEnter amount: "); int m=scan();
			if (acc4==atm_Frontend.id[0])
			{
				savings [0]+=m;
				print("\n" + accName[0] +" your New Balance is: " + savings [0]);
				print("\n\nPress 'B' and Hit Enter to go back to Menu: ");
				char key = scankey();
				switch(key)
				{
					case 'B':
						menu(acc4, pass4);
						break;
					default: 
						print("\n==INVALID KEY==");
						checkBalance (acc4, pass4);
				} 
			}
			else if (acc4==atm_Frontend.id[1])
			{
				savings [1]+=m;
				print("\n" + accName[1] +" your New Balance is: " + savings [1]);
				print("\n\nPress 'B' and Hit Enter to go back to Menu: ");
				char key = scankey();
				switch(key)
				{
					case 'B':
						menu(acc4, pass4);
						break;
					default: 
						print("\n==INVALID KEY==");
						checkBalance (acc4, pass4);
				} 
			}
		}
		static void withdraw (int acc5, int pass5)
		{
			print ("\n\n---WITHDRAW---");
			print ("\nEnter amount: "); int m=scan();
			if (acc5==atm_Frontend.id[0])
			{
				savings [0]-=m;
				print("\n" + accName[0] +" your New Balance is: " + savings [0]);
				print("\n\nPress 'B' and Hit Enter to go back to Menu: ");
				char key = scankey();
				switch(key)
				{
					case 'B':
						menu(acc5, pass5);
						break;
					default: 
						print("\n==INVALID KEY==");
						checkBalance (acc5, pass5);
				} 
			}
			else if (acc5==atm_Frontend.id[1])
			{
				savings [1]-=m;
				print("\n" + accName[1] +" your New Balance is: " + savings [1]);
				print("\n\nPress 'B' and Hit Enter to go back to Menu: ");
				char key = scankey();
				switch(key)
				{
					case 'B':
						menu(acc5, pass5);
						break;
					default: 
						print("\n==INVALID KEY==");
						checkBalance (acc5, pass5);
				} 
			}
		}
		static void exit (int acc6, int pass6)
		{
			
			print ("\n\nAre you sure you want to Logout?");
			print ("\nY = YES N = NO");
			print("\n\nPress a key: ");
			char key = scankey();
			switch(key)
			{
				case 'N':
					menu(acc6, pass6);
					break;
				case 'Y':
					print("\n==User Logged Out=="
							+ "\n==Session Ended==");
					atm_Frontend.login();
					break;
			}
		}
		static void print (String msg)
		{
			System.out.print(msg);
		}
		static int scan ()
		{
			Scanner s = new Scanner(System.in);
			return s.nextInt();
		}
		static char scankey ()
		{
			Scanner ins = new Scanner(System.in);
			char key = 0;
			key=ins.next().charAt(0);
			key=Character.toUpperCase(key);
			return key;
		}

}
