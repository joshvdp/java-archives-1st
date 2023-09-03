package Practice;
import java.util.Scanner;
import java.text.DecimalFormat;
public class Airfare
{
	public static void main(String[] args)
	
	{
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("###,###.00");
		// DELA PEÑA, JOSHUA VER S. 1BSCS-1 (LAB)
		char key=0;
		int code=0;
		double product00=0.0;
		double product01=0.0;
		double product02=0.0;
		double cashDisc=0.0;
		double interest2Pay00=0.0;
		double interest2Pay01=0.0;
		double interest2Pay02=0.0;
		double discount = 0.0;
		double price = 0.0;
		
		double fivePercent = 0.0;
		double tenPercent = 0.0;
		double twentyPercent = 0.0;
		double installmentPrice = 0.0;
		
		System.out.print("Sales Input");
		
		System.out.print("\n\nEnter Price of Iphone 12 Pro Max: ");
		product00=input.nextDouble();
		
		System.out.print("\n\nEnter Price of Samsung Note 20: ");
		product01=input.nextDouble();
		
		System.out.print("\n\nEnter Price of Xiaomi Black shark: ");
		product02=input.nextDouble();
		
		System.out.print("\n\nInput mode of Payment Terms");
		
		
		System.out.print("\n\nCash Discount:\t\t");
		cashDisc = input.nextDouble();
		System.out.print("\n\tYou input " + df.format(cashDisc) + "% " + "for cash discount");
		
		
		System.out.print("\n\n3 Months Installment:\t");
		interest2Pay00=input.nextDouble();
		System.out.print("\n\tYou input " + df.format(interest2Pay00) + "% " + "interest for 3 months installment");
		
		
		System.out.print("\n\n6 Months Installment:\t");
		interest2Pay01=input.nextDouble();
		System.out.print("\n\tYou input " + df.format(interest2Pay01) + "% " + "interest for 6 months installment");
		
		
		System.out.print("\n\n12 Months Installment:\t");
		interest2Pay02=input.nextDouble();
		System.out.print("\n\tYou input " + df.format(interest2Pay02) + "% " + "interest for 12 months installment");
		
		
		System.out.println("\n\nMAIN MENU");
		System.out.print("\nPress I: Iphone 12 Pro Max" + "\t$" + df.format (product00));
		System.out.print("\nPress S: Samsung Note 20" + "\t$" + df.format (product01));
		System.out.print("\nPress X: Xiaomi Black shark" + "\t$" + df.format (product02));
		System.out.print("\n\nEnter Item:\t\t");
		key=input.next().charAt(0);
		key=Character.toUpperCase(key);
		
		switch(key)
		{
			
				case 'I': //iPhone 12 PRO MAX
						System.out.print("\nYour Item:" + "\t" + "\tIphone 12 Pro Max");
						System.out.print("\nItem Price:" + "\t" + "\t$" + df.format (product00));
						break;

				case 'S': //Samsung Note 20 
						System.out.print("\nYour Item:" + "\t" + "\tSamsung Note 20");
						System.out.print("\nItem Price:" + "\t" + "\t$" + df.format (product01));
						break;
		
				case 'X': //XIAOMI BLACKSHARK
						System.out.print("\nYour Item:" + "\t" + "\tXiaomi BlackShark");
						System.out.print("\nItem Price:" + "\t" + "\t$" + df.format (product02));
						break;
				
			default:
				//Invalid code
						
		}
		
		System.out.print("\n\nSELECT MODE OF PAYMENT");
		System.out.print("\n\nPress 1: Cash " + df.format(cashDisc) + "% " + "Discount");
		System.out.print("\nPress 2: 3 Months Installment " + df.format(interest2Pay00) + "% " + "Interest");
		System.out.print("\nPress 3: 6 Months Installment " + df.format(interest2Pay01) + "% " + "Interest");
		System.out.print("\nPress 4: 12 Months Installment " + df.format(interest2Pay02) + "% " + "Interest");
		System.out.print("\n\nEnter Mode of Payment:\t");
		code=input.next().charAt(0);
		code=Character.toUpperCase(code);
		
		switch(code) 
		{
			
				case '1': 
					if (key == 'I')
					 {
						
						discount=product00*0.1;
						price=product00-discount;
						
						System.out.print("\nMode of Payment:\tCash");
						System.out.print("\nItem: " + "\t" + "\t\tIphone 12 Pro Max");
						System.out.print("\nPrice: " + "\t" + "\t\t$" + df.format (product00));
						System.out.print("\nDiscount/Interest:" + "\t" + "\t$" + df.format (price));
						System.out.print("\nTotal Amount: " + "\t" + "\t$" + df.format (price));
						System.out.print("\nMonthly Amortization:" + "\t" + "\tFully Paid");
						
					 }
					else if (key == 'S')
					{
						
						discount=product00*0.1;
						price=product01-discount;
						
						System.out.print("\nMode of Payment:\tCash");
						System.out.print("\nItem:\t\t\tSamsung Note 20");
						System.out.print("\nPrice:" + "\t\t\t$" + df.format (product01));
						System.out.print("\nDiscount/Interest:" + "\t$" + df.format (discount));
						System.out.print("\nTotal Amount:" + "\t\t$" + df.format (price));
						System.out.print("\nMonthly Amortization:" + "\tFully Paid");
						
					}
					else if (key == 'X')
					{ 
						
						discount=product00*0.1;
						price=product02-discount;
						
						System.out.print("\nMode of Payment:\tCash");
						System.out.print("\nItem:\t\t\tXiaomi blackshark");
						System.out.print("\nPrice:" + "\t\t\t$" + df.format (product01));
						System.out.print("\nDiscount/Interest:" + "\t$" + df.format (discount));
						System.out.print("\nTotal Amount:" + "\t\t$" + df.format (price));
						System.out.print("\nMonthly Amortization:" + "\tFully Paid");
					}
					break;
				
				case '2': //3 Months
					if (key == 'I')
					 {
						interest2Pay00=0.05;
						
						fivePercent = product00*interest2Pay00; 
						price = product00+fivePercent;
						installmentPrice = 3/price;
						
						System.out.print("\nMode of Payment:\tCash");
						System.out.print("\nItem: " + "\t" + "\t\tIphone 12 Pro Max");
						System.out.print("\nPrice: " + "\t" + "\t\t$" + df.format (product00));
						System.out.print("\nDiscount/Interest:" + "\t" + "\t$" + df.format (price));
						System.out.print("\nTotal Amount: " + "\t" + "\t$" + df.format (price));
						System.out.print("\nMonthly Amortization:" + "\t" + df.format (installmentPrice));
						
					 }
					else if (key == 'S')
					{
						interest2Pay00=0.05;
					}
					else if (key == 'X')
					{
						interest2Pay00=0.05;
					}
					break;
					
				case '3': //6 Months
					if (key == 'I')
					 {
						interest2Pay01=0.10;
					 }
					else if (key == 'S')
					{
						interest2Pay01=0.10;
					}
					else if (key == 'X')
					{
						interest2Pay01=0.10;
					}
					break;
				
				case '4': //12 Months
					if (key == 'I')
					 {
						interest2Pay02=0.10;
					 }
					else if (key == 'S')
					{
						interest2Pay02=0.10;
					}
					else if (key == 'X')
					{
						interest2Pay02=0.10;
					}
					break;
					
					
			default:
				
		}
		
		
	}
	
}
	
	