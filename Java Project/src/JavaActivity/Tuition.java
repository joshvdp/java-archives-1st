package JavaActivity; 
import java.text.DecimalFormat;
import java.util.*;
public class Tuition 
{
	// DELA PEÑA, JOSHUA VER S. 1BSCS-1 (LAB) DATE: OCT 27, 2020
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#,###,###.00");
		
		String name = "";
		double quantity = 0.0;
		double priceperunit = 0.0;
		double totalFee = 0.0;
		double tenPercent = 0.0;
		double fivePercent = 0.0;
		double cash = 0.0; 
		double installment2 = 0.0;
		double installment3 = 0.0;
		
		System.out.println("Enter name of student: ");
		name = input.nextLine();
		
		System.out.println("Enter number of units enrolled: ");
		quantity = input.nextDouble();
		
		System.out.println("Enter price per unit: ");
		priceperunit = input.nextDouble();
		
		totalFee = quantity * priceperunit;
		tenPercent = totalFee * 0.10;
		fivePercent = totalFee * 0.05;
		
		cash = totalFee - tenPercent;
		installment2 = totalFee + fivePercent;
		installment3 = totalFee + tenPercent;
		
		
		System.out.println("\nComputed Tuition fee: " + df.format(totalFee) + " dollars");
		System.out.println( (name) + ", you could avail the following payment mode: ");
		System.out.println("\nPayment Mode:");
		System.out.println("Cash Payment: " + df.format(cash) + " dollars");
		System.out.println("2-installment: " + df.format(installment2) + " dollars");
		System.out.println("3-installment: " + df.format(installment3) + " dollars");

	}
	    // DELA PEÑA, JOSHUA VER S. 1BSCS-1 (LAB) DATE: NOV 3 2020
}
