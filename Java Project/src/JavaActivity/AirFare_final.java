package JavaActivity;
import java.util.Scanner;
import java.text.DecimalFormat;
public class AirFare_final
{
	public static void main(String[] args)
		
		{
			Scanner input = new Scanner(System.in);
			DecimalFormat df = new DecimalFormat("###,##0.00");
			double fare=0.0;
			char passenger;
			char sel = 0;
			double discRate=0.0;
			double newFare=0.0, discount=0.0;
			double classRate = 0.0;
			double totalFare = 0.0;
			
			
			System.out.println("Enter fare: ");
			fare=input.nextDouble();
			
			System.out.println("Passenger type"+
					" [O: Ordinary, S: Student, C: Senior Citizen]: ");
			passenger=input.next().charAt(0);
			passenger=Character.toUpperCase(passenger);
			
			System.out.println("Travelling in business class?"+ 
					" [Y/N]: ");
			sel=input.next().charAt(0);
			sel=Character.toUpperCase(sel);
			
			
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
			
			switch(sel	) 
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
		
		
		
		System.out.println("\nDiscount: " + df.format(discount) );
		System.out.println("Business class charge: " + df.format(classRate) );
		System.out.println("New fare: " + df.format(totalFare) );	
		
		}
}