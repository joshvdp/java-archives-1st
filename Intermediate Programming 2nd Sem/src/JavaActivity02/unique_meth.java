package JavaActivity02;
import java.text.DecimalFormat;
import java.util.Scanner;
public class unique_meth {

	public static void main(String[] args) 
	{
		print("Developer: DELA PEÑA, JOSHUA VER S. 1BSEMC-1");
		menu ();
	}
	static void menu ()
	{
		print("\n\n---MENU---");
		print("\n\nSelect a Program to Run: " +
				" [S = NAME AND AGE, I = PRICETAG SONG CHORUS , R = SIZE OF THE HASH," 
				+ "\n\t\t\t L = MULTIPLICATION TABLE, E = SCHOOL TUITION AUTOMATE, X = AIR FARE AUTOMATE," 
				+ "\n\t\t\t C = PRODUCT SALES AUTOMATE, P = MATRIX, U = NEGATIVE OR POSITIVE, Z = STUDENT'S INFORMATION]" );
		char key = scankey();
		switch(key)
		{
				case 'S': prog_00 (); break;
				case 'I': prog_01 (); break;
				case 'R': prog_02 (); break;
				case 'L': prog_03 (); break;
				case 'E': prog_04 (); break;
				case 'X': prog_05 (); break;
				case 'C': prog_06 (); break;
				case 'P': prog_07 (); break;
				case 'U': prog_08 (); break;
				case 'Z': prog_09 (); break;	
				default: print("---END OF PROGRAM---");			
		}
	}
	static void prog_00 ()
	{
		print("\n\n---NAME AND AGE---");
		print("\n\nEnter Name: ");
		String name = scanString();
		print("\nEnter Age: ");
		int age = scanInt();
		print ("\nYour name is "+ name);
		print ("\nYou are "+ age +" years old");
		print("\n\nRETURN TO MENU? \n Type Y = YES \n Type N = NO");
		print("\nInput Here:");
		char key = scankey();
		switch(key)
		{
				case 'Y': 
						menu ();
						break;	
			default: print ("\n ---END OF PROGRAM---");			
		}
	}
	static void prog_01 ()
	{
		print("\n---PriceTag Chorus---");
		print("\nIts not about the money, " + "\n" +
				 "\tmoney"
				 + "\n\t\tmoney"
				 + " \nWe don't need your money, money, money");
				 print("We just wanna make the world dance,"
				 + "\nForget \t     about \t the"
				 +"\n\t     Price Tag");
		print("\n\nRETURN TO MENU? \n Type Y = YES \n Type N = NO");
		print("\nInput Here:");
		char key = scankey();	
		switch(key)
		{			
			case 'Y': menu (); break;			
			default: print ("\n ---END OF PROGRAM---");			
		}
	}
	static void prog_02()
	{
		print("\n---SIZE OF THE HASH---");
		int row, numHash;
		System.out.print("\n\nEnter size of the hash: ");
		int hashSize = scanInt();
		row = 1;
		while (row <= hashSize)
		{
			for(numHash = 1; numHash <= hashSize; numHash++)
			{
				print("#");
			}
			print("\n" + "");
			row++;
		}
		print("\nRETURN TO MENU? \n Type Y = YES \n Type N = NO");
		print("\nInput Here:");
		char key = scankey();		
		switch(key)
		{			
			case 'Y': menu (); break;				
			default: print ("\n ---END OF PROGRAM---");						
		}
	}
	static void prog_03()
	{
		print("\n---MULTIPLICATION TABLE---");
		int a,b,c=1;
		for(a=1;a<=10;a++)
		{
			b=1;
			do
			{
				c=a*b;
				print(c+ "\t");
				b++;
			}while(b<=10);
			print("\n");
		}
		print("\n\nRETURN TO MENU? \n Type Y = YES \n Type N = NO");
		print("\nInput Here:");
		char key = scankey();		
		switch(key)
		{			
			case 'Y': menu (); break;				
			default: print ("\n ---END OF PROGRAM---");
									
		}	
	}
	static void prog_04 ()
	{
		print("\n---SCHOOL TUITION AUTOMATE---");
		DecimalFormat df = new DecimalFormat("#,###,###.00");
		double totalFee = 0.0;
		double tenPercent = 0.0;
		double fivePercent = 0.0;
		double cash = 0.0; 
		double installment2 = 0.0;
		double installment3 = 0.0;
		print("\nEnter name of student: ");
		String name = scanString ();
		print("\nEnter number of units enrolled: ");
		double quantity = scanDouble ();
		print("\nEnter price per unit: ");
		double priceperunit = scanDouble();
		
		totalFee = quantity * priceperunit;
		tenPercent = totalFee * 0.10;
		fivePercent = totalFee * 0.05;
		
		cash = totalFee - tenPercent;
		installment2 = totalFee + fivePercent;
		installment3 = totalFee + tenPercent;
		
		print("\n\nComputed Tuition fee: " + df.format(totalFee) + " dollars");
		print("\n" + (name) + ", you could avail the following payment mode: ");
		print("\nPayment Mode:");
		print("\nCash Payment: " + df.format(cash) + " dollars");
		print("\n2-installment: " + df.format(installment2) + " dollars");
		print("\n3-installment: " + df.format(installment3) + " dollars");
		
		print("\n\nRETURN TO MENU? \n Type Y = YES \n Type N = NO");
		print("\nInput Here:");
		char key = scankey();	
		switch(key)
		{
						
			case 'Y': menu (); break;
			default: print ("\n ---END OF PROGRAM---");
									
		}	
	}
	static void prog_05()
	{
		print("\n---AIR FARE AUTOMATE---");
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("###,##0.00");
		
		double discRate=0.0;
		double newFare=0.0, discount=0.0;
		double classRate = 0.0;
		double totalFare = 0.0;
		
		print("\n\nEnter fare: ");
		double fare = scanDouble();
		
		print("\nPassenger type"+
				" [O: Ordinary, S: Student, C: Senior Citizen]: ");
		char passenger = scankey ();
		
		print("\nTravelling in business class?"+ 
				" [Y/N]: ");
		char sel = scankey ();
		
		switch(passenger)
		{
			
				case 'O': //ordinary
						discRate = 0.0;
						break;

				case 'S': //student
						discRate=0.05;
						break;
		
				case 'C': //senior citizen
						discRate=0.10;
						break;
				
			default:
				//Invalid code
						
		}
		switch(sel) 
		{
			
				case 'Y': 
					 if (passenger == 'O')
					 {
						 classRate=1000.00;
					 }
					 
					 else if (passenger == 'S')
					 {
						classRate=700.00; 
					 }
					 
					 else if (passenger == 'C') 
					 {
						 classRate=500.00;
					 }
						 break;
						
			default:
			
				case 'N': classRate=0.0;
						break;
		}
	discount=fare*discRate;
	newFare=fare-discount;
	totalFare=newFare+classRate;
		print("\n\nDiscount: " + df.format(discount) );
		print("\nBusiness class charge: " + df.format(classRate) );
		print("\nNew fare: " + df.format(totalFare) );	
		print("\n\nRETURN TO MENU? \n Type Y = YES \n Type N = NO");
		print("\nInput Here:");
		char key = scankey();	
		switch(key)
		{			
			case 'Y': menu (); break;	
			default: print ("\n ---END OF PROGRAM---");						
		}	
	}
	static void prog_06 ()
	{
		print("\n---PRODUCT SALES AUTOMATE---");
		DecimalFormat decimal_00 = new DecimalFormat("###,##0.00");
		double discRate = 0.0;
		double discount = 0.0;
		double netPrice = 0.0;
		
		print("\n\nEnter product: ");
		String product = scanString ();
		
		print("\nEnter price: ");
		double unitPrice = scanDouble();
		
		if ((unitPrice>0) && (unitPrice<10000)) 
		{
			discRate=0.0;
		}
		
		else if ((unitPrice>10001) && (unitPrice<20000))	
		{
			discRate=0.05;
		}	
		
		else if ((unitPrice>20001) && (unitPrice<50000))	
		{
			discRate=0.10;
		}
		
		else if ((unitPrice>50001) && (unitPrice<100000))
		{
			discRate=0.15;
		}
		
		else if ((unitPrice>100001.00))
		{
			discRate=0.20;
		}
		
		discount=unitPrice*discRate;
		netPrice=unitPrice-discount;

		print("\n\nPrice of " + product + " is " + decimal_00.format(unitPrice));
		print("\nDiscount is " + decimal_00.format (discount));
		print("\nNet Price is " + decimal_00.format (netPrice));
		print("\n\nRETURN TO MENU? \n Type Y = YES \n Type N = NO");
		print("\nInput Here:");
		char key = scankey();					
		switch(key)
		{			
			case 'Y': menu (); break;				
			default: print ("\n ---END OF PROGRAM---");				
		}	
	}
	static void prog_07 ()
	{
		print("\n---MATRIX---");
		int row=1;
		int rev;
		int num1;
		int deductor=3,adder=2;
		
		print("\n\nEnter matrix to generate (n by n):");
		int num = scanInt();
		
		rev=num*num;
		while(row<=num)
		{
			for(num1=1;num1<=num;num1++)
			{
				if(row==1)
				{
					print(rev+"\t");
					rev--;
				}
				else if((row%2)== 0)
				{
					print(rev+"\t");
					rev++;
				}
				else 
				{
					print(rev+"\t");
					rev--;
				}
				
			}
			print("\n"+rev+" ");
			row++;
			rev-=deductor;
			deductor+=adder;
			adder++;
			}
		
		print("\n\nRETURN TO MENU? \n Type Y = YES \n Type N = NO");
		print("\nInput Here:");
		char key = scankey();	
		switch(key)
		{			
			case 'Y': menu (); break;				
			default: print ("\n ---END OF PROGRAM---");				
		}	
	}
	static void prog_08 ()
	{
		print("\n---POSITIVE OR NEGATIVE---");
		String num;
		print("\n\nEnter Number: ");
		int number = scanInt();
		
		if(number<0)
		{
			num="Number is Negative";
		}
		else if (number>0)
		{
			num="Number is Positive";
		}
		else 
		{
			num="Number is Origin";
		}
		print("\n" + num);
		print("\n\nRETURN TO MENU? \n Type Y = YES \n Type N = NO");
		print("\nInput Here:");
		char key = scankey();		
		switch(key)
		{				
			case 'Y': menu (); break;					
			default: print ("\n ---END OF PROGRAM---");							
		}	
	}
	static void prog_09 ()
	{
		print("\nDEVELOPER'S INFORMATION: ");
		print("\n\nNAME: DELA PEÑA, JOSHUA VER, SAN JOSE");
		print("\nSECTION: 1BSEMC-1");
		print("\nPROGRAM: Bachelor of Science in Entertainment and Multimedia Computing");
		print("\n\nRETURN TO MENU? \n Type Y = YES \n Type N = NO");
		print("\nInput Here:");
		char key = scankey();		
		switch(key)
		{				
			case 'Y': menu (); break;
			default: print ("\n ---END OF PROGRAM---");
										
		}	
	}
	static void print (String msg)
	{
		System.out.print(msg);
	}
	static char scankey ()
	{
		Scanner ins = new Scanner(System.in);
		char key = 0;
		key=ins.next().charAt(0);
		key=Character.toUpperCase(key);
		return key;
	}
	static int scanInt ()
	{
		Scanner s = new Scanner(System.in);
		return s.nextInt();
	}
	static String scanString()
	{
		Scanner x = new Scanner(System.in);
		return x.nextLine();
	}
	static double scanDouble ()
	{
		Scanner z = new Scanner(System.in);
		return z.nextDouble();
	}

}
