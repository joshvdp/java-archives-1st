package JavaActivity02;
import java.text.DecimalFormat;
import java.util.*;
public class TuitionMeth
{
	
		static DecimalFormat df = new DecimalFormat("#,###,###.00");
		
		static String name = "";
		static double quantity = 0.0;
		static double priceperunit = 0.0;
		static double totalFee = 0.0;
		static double tenPercent = 0.0;
		static double fivePercent = 0.0;
		static double cash = 0.0; 
		static double installment2 = 0.0;
		static double installment3 = 0.0;
	
		public static void main(String[] args) 
		{
			userInput ();
			compute ();
			results ();
		}
		static void userInput()
		{
			Scanner input = new Scanner(System.in);
			
			printInput("Enter name of student: ");
			name = input.nextLine();
			
			printInput("Enter number of units enrolled: ");
			quantity = input.nextDouble();
			
			printInput("Enter price per unit: ");
			priceperunit = input.nextDouble();
		}
		static void compute ()
		{
			totalFee = quantity * priceperunit;
			tenPercent = totalFee * 0.10;
			fivePercent = totalFee * 0.05;
			
			cash = totalFee - tenPercent;
			installment2 = totalFee + fivePercent;
			installment3 = totalFee + tenPercent;
		}	
		static void results ()
		{
			
			printResults("\nComputed Tuition fee: " + df.format(totalFee) + " dollars");
			printResults( (name) + ", you could avail the following payment mode: ");
			printResults("\nPayment Mode:");
			printResults("Cash Payment: " + df.format(cash) + " dollars");
			printResults("2-installment: " + df.format(installment2) + " dollars");
			printResults("3-installment: " + df.format(installment3) + " dollars");
		}
		static void printResults (String a)
		{
			System.out.println(a);
		}
		static void printInput (String x)
		{
			System.out.println(x);
		}
	
	
	
	    // DELA PEÑA, JOSHUA VER S. 1BSCS-1 (LAB) DATE: NOV 3 2020
}