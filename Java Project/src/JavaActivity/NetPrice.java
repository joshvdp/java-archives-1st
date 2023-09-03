package JavaActivity;
import java.util.Scanner;
import java.text.DecimalFormat;
public class NetPrice 
{
	public static void main(String[] args) 
	{
			Scanner input = new Scanner(System.in);
			DecimalFormat df = new DecimalFormat("#,###,###.00");
			String product = "";
			double unitPrice = 0.0;
			double quantity = 0.0;
			
			double totalPrice = 0.0;
			double discount = 0.0, netPrice = 0.0;
			
			System.out.println("Enter product: ");
			product = input.nextLine();
			
			System.out.println("Enter unit price: ");
			unitPrice = input.nextDouble();
			
			System.out.println("Enter quantity: ");
			quantity = input.nextDouble();
			
			totalPrice = quantity * unitPrice;
			discount = totalPrice * 0.1;
			netPrice = totalPrice - discount;
			
			System.out.println("\nThe product is " + product);
			System.out.println("Total price is " + df.format(totalPrice) + "dollars");
			System.out.println("Discount is " + df.format(discount) + " dollars");
			System.out.println("\nNet price is " + df.format(netPrice) + " dollars");
		
	}		
	
	
}
