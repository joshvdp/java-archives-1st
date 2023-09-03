package Practice;
import java.util.Scanner;
import java.text.DecimalFormat;
public class aeroplane
{
		public static void main(String[] args)
		{
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("###,###.00");
		
		//Declare input variables
		double fare=0.0;
		char custCode;
		String customer="";
		double discRate=0.0;
		double netFare=0.0, discount=0.0;
		
		// Accepts the inputs of the program
		System.out.print("Enter fare amount: ");
		fare=input.nextDouble();
		System.out.print("Enter customer"+
		 "code [O=Ordinary, S=Student, R=Senior]: ");
		custCode=input.next().charAt(0);
		custCode=Character.toUpperCase(custCode);
		
		switch(custCode)
			{
				case 'O': customer= "ordinary";
				discRate=0.0;
				break;
		
				case 'S': customer="student";
				discRate=0.1;
				break;
		
				case 'R': customer="senior citizen";
				discRate=0.2;
				break;
				
			default:
				customer="Invalid code";
		}
		//Compute discount and net fare
		discount=fare*discRate;
		netFare=fare-discount;
		System.out.println("\nCustomer is " + customer);
		System.out.println("Discount is " + df.format(discount) + " dollars");
		System.out.println("\nNet fare is " + df.format(netFare) + " dollars");
		}
		}