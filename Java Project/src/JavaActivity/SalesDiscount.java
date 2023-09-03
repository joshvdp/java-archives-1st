package JavaActivity;
import java.util.Scanner;
import java.text.DecimalFormat;
public class SalesDiscount 
{
		public static void main(String[] args)
		{
			
			Scanner input = new Scanner (System.in);
			DecimalFormat decimal_00 = new DecimalFormat("###,##0.00");
			// DELA PEÑA, JOSHUA VER S. 1BSCS-1 (LAB)
			String product;
			double unitPrice = 0.0;
			double discRate = 0.0;
			double discount = 0.0;
			double netPrice = 0.0;
			
			System.out.println("Enter product: ");
			product = input.nextLine();
			
			System.out.println("Enter price: ");
			unitPrice = input.nextDouble();
			
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
			
			System.out.println("\nPrice of " + product + " is " + decimal_00.format(unitPrice));
			System.out.println("Discount is " + decimal_00.format (discount));
			System.out.println("Net Price is " + decimal_00.format (netPrice));
			
			// DELA PEÑA, JOSHUA VER S. 1BSCS-1 (LAB)
			
		}

}