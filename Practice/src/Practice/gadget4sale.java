package Practice;
import java.util.Scanner;
import java.text.DecimalFormat;
public class gadget4sale
{
	public static void main(String[] args)
	
	{
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("###,##0.00");
		// DELA PEÑA, JOSHUA VER S. 1BSCS-1 (LAB)
		char key=0;
		int code=0;
		double item0=0.0;
		double item1=0.0;
		double item2=0.0;
		double cashDiscount=0.0;
		double discount = 0.0;
		double price = 0.0;
		double interest0 = 0.0;
		double interest1 = 0.0;
		double interest2 = 0.0;
		double monthly = 0.0;
		
		System.out.print("Sales Input");
		
		System.out.print("\n\nEnter Price of Iphone 12 Pro Max: ");
		item0=input.nextDouble();
		
		System.out.print("\n\nEnter Price of Samsung Note 20: ");
		item1=input.nextDouble();
		
		System.out.print("\n\nEnter Price of Xiaomi Black shark: ");
		item2=input.nextDouble();
		
		System.out.print("\n\nInput Mode of Payment Terms");
		
		
		System.out.print("\n\nCash Discount:\t\t");
		cashDiscount = input.nextDouble();
		System.out.print("\n\tYou input " + df.format(cashDiscount) + "% " + "for cash discount");
		
		
		System.out.print("\n\n3 Months Installment:\t");
		interest0=input.nextDouble();
		System.out.print("\n\tYou input " + df.format(interest0) + "% " + "interest for 3 months installment");
		
		
		System.out.print("\n\n6 Months Installment:\t");
		interest1=input.nextDouble();
		System.out.print("\n\tYou input " + df.format(interest1) + "% " + "interest for 6 months installment");
		
		
		System.out.print("\n\n12 Months Installment:\t");
		interest2=input.nextDouble();
		System.out.print("\n\tYou input " + df.format(interest2) + "% " + "interest for 12 months installment");
		
		
		System.out.println("\n\nMAIN MENU");
		System.out.print("\nPress I: Iphone 12 Pro Max" + "\t$" + df.format (item0));
		System.out.print("\nPress S: Samsung Note 20" + "\t$" + df.format (item1));
		System.out.print("\nPress X: Xiaomi Black shark" + "\t$" + df.format (item2));
		System.out.print("\n\nEnter Item:\t\t");
		key=input.next().charAt(0);
		key=Character.toUpperCase(key);
		
		switch (key)
		{
				case 'I':
					System.out.println("\nYour Item:\t\tIphone 12 Pro Max\n" + "Item Price:\t\t" + "$" +df.format(item0));
					break;
				case 'S':
					System.out.println("\nYour Item:\t\tSamsung Note 20\n" + "Item Price:\t\t" + "$" +df.format(item1));
					break;
				case 'X':
					System.out.println("\nYour Item:\t\tXiaomi Black shark\n" + "Item Price:\t\t" + "$" +df.format(item2));
					break;
		}
		
		System.out.println("\nSELECT MODE OF PAYMENT\n");
		System.out.println("Press 1: Cash " + df.format(cashDiscount) + "%" + " Discount");
		System.out.println("Press 2: 3 Months Installment " + df.format(interest0) + "%" + " Interest");
		System.out.println("Press 3: 6 Months Installment " + df.format(interest1) + "%" + " Interest");
		System.out.println("Press 4: 12 Months Installment " + df.format(interest2) + "%" + " Interest");
		
		System.out.println("\nEnter Mode of Payment:\t");
		code=input.next().charAt(0);
		code=Character.toUpperCase(code);
		
		switch (code)
		{
				case'1':
					System.out.print("Mode of Payment:\tCash\n");
					if (key == 'I')
					{
						discount=item0*0.1;
						price=item0 - discount;
						
						System.out.println("Item:\t\t\tIphone 12 Pro Max");
						System.out.println("Price:\t\t\t" + "$" + df.format(item0));
						System.out.println("Discount/Interest:\t" + "$" + df.format(discount));
						System.out.println("Total Amount:\t\t" + "$" + df.format(price));
						System.out.println("Monthly Amortization:\tFully Paid");
					}
					else if (key == 'S')
					{
						discount=item1*0.1;
						price=item1 - discount;
						
						System.out.println("Item:\t\t\tSamsung Note 20");
						System.out.println("Price:\t\t\t" + "$" + df.format(item1));
						System.out.println("Discount/Interest:\t" + "$" + df.format(discount));
						System.out.println("Total Amount:\t\t" + "$" + df.format(price));
						System.out.println("Monthly Amortization:\tFully Paid");
					}
					else if (key == 'X')
					{
						discount=item2*0.1;
						price=item2 - discount;
						
						System.out.println("Item:\t\t\tXiaomi Black shark");
						System.out.println("Price:\t\t\t" + "$" + df.format(item1));
						System.out.println("Discount/Interest:\t" + "$" + df.format(discount));
						System.out.println("Total Amount:\t\t" + "$" + df.format(price));
						System.out.println("Monthly Amortization:\tFully Paid");
					}
						break;
				case '2':
					System.out.println("Mode of Payment:\t3 Months Installment");
					if (key == 'I')
					{
						interest0=item0*0.05;
						price=item0+interest0; 
						monthly=price/3;
						
						System.out.println("Item:\t\t\tIphone 12 Pro Max");
						System.out.println("Price:\t\t\t" + "$" + df.format(item0));
						System.out.println("Discount/Interest:\t" + "$" + df.format(interest0));
						System.out.println("Total Amount:\t\t" + "$" + df.format(price));
						System.out.println("Monthly Amortization:\t" + "$" + df.format(monthly));
						
					}
					else if (key == 'S')
					{
						interest1=item1*0.05;
						price=item1+interest1; 
						monthly=price/3;
						
						System.out.println("Item:\t\t\tSamsung Note 20");
						System.out.println("Price:\t\t\t" + "$" + df.format(item1));
						System.out.println("Discount/Interest:\t" + "$" + df.format(interest1));
						System.out.println("Total Amount:\t\t" + "$" + df.format(price));
						System.out.println("Monthly Amortization:\t" + "$" + df.format(monthly));
					}
					else if (key == 'X')
					{	
						interest2=item2*0.05;
						price=item2+interest2; 
						monthly=price/3;
						
						System.out.println("Item:\t\t\tXiaomi Black shark");
						System.out.println("Price:\t\t\t" + "$" + df.format(item2));
						System.out.println("Discount/Interest:\t" + "$" + df.format(interest2));
						System.out.println("Total Amount:\t\t" + "$" + df.format(price));
						System.out.println("Monthly Amortization:\t" + "$" + df.format(monthly));
					}
						break;
				case '3':
					System.out.println("Mode of Payment:\t6 Months Installment");
					if (key == 'I')
					{
						interest0=item0*0.1;
						price=item0+interest0; 
						monthly=price/6;
						
						System.out.println("Item:\t\t\tIphone 12 Pro Max");
						System.out.println("Price:\t\t\t" + "$" + df.format(item0));
						System.out.println("Discount/Interest:\t" + "$" + df.format(interest0));
						System.out.println("Total Amount:\t\t" + "$" + df.format(price));
						System.out.println("Monthly Amortization:\t" + "$" + df.format(monthly));
						
					}
					else if (key == 'S')
					{
						interest1=item1*0.1;
						price=item1+interest1; 
						monthly=price/6;
							
						System.out.println("Item:\t\t\tSamsung Note 20");
						System.out.println("Price:\t\t\t" + "$" + df.format(item1));
						System.out.println("Discount/Interest:\t" + "$" + df.format(interest1));
						System.out.println("Total Amount:\t\t" + "$" + df.format(price));
						System.out.println("Monthly Amortization:\t" + "$" + df.format(monthly));
					}
					else if (key == 'X')
					{	
						interest2=item2*0.1;
						price=item2+interest2; 
						monthly=price/6;
						
						System.out.println("Item:\t\t\tXiaomi Black shark");
						System.out.println("Price:\t\t\t" + "$" + df.format(item2));
						System.out.println("Discount/Interest:\t" + "$" + df.format(interest2));
						System.out.println("Total Amount:\t\t" + "$" + df.format(price));
						System.out.println("Monthly Amortization:\t" + "$" + df.format(monthly));
					}
						break;
				case '4':
					System.out.println("Mode of Payment:\t12 Months Installment");
					if (key == 'I')
					{
						interest0=item0*0.2;
						price=item0+interest0; 
						monthly=price/12;
						
						System.out.println("Item:\t\t\tIphone 12 Pro Max");
						System.out.println("Price:\t\t\t" + "$" + df.format(item0));
						System.out.println("Discount/Interest:\t" + "$" + df.format(interest0));
						System.out.println("Total Amount:\t\t" + "$" + df.format(price));
						System.out.println("Monthly Amortization:\t" + "$" + df.format(monthly));
					}
					else if (key == 'S')
					{
						interest1=item1*0.2;
						price=item1+interest1; 
						monthly=price/12;
						
						System.out.println("Item:\t\t\tSamsung Note 20");
						System.out.println("Price:\t\t\t" + "$" + df.format(item1));
						System.out.println("Discount/Interest:\t" + "$" + df.format(interest1));
						System.out.println("Total Amount:\t\t" + "$" + df.format(price));
						System.out.println("Monthly Amortization:\t" + "$" + df.format(monthly));
					}
					else if (key == 'X')
					{	
						interest2=item2*0.2;
						price=item2+interest2; 
						monthly=price/12;
						
						System.out.println("Item:\t\t\tXiaomi Black shark");
						System.out.println("Price:\t\t\t" + "$" + df.format(item2));
						System.out.println("Discount/Interest:\t" + "$" + df.format(interest2));
						System.out.println("Total Amount:\t\t" + "$" + df.format(price));
						System.out.println("Monthly Amortization:\t" + "$" + df.format(monthly));
					}
						break;
						
		
		}
	
	}
	
}
