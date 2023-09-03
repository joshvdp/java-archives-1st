package JavaActivity02;
import java.util.Scanner;
import java.text.DecimalFormat;
public class Methods
{
		static DecimalFormat df = new DecimalFormat("###,###.00");
		static double fare=0.0;
		static char passenger;
		static char key = 0;
		static double discRate=0.0;
		static double newFare=0.0, discount=0.0;
		static double classRate = 0.0;
		static double totalFare = 0.0;
		
		public static void main(String[] args)
		{
				input();
				trigger();
				results ();
		}		
		static void input ()
		{
			Scanner input = new Scanner(System.in);
			
			printInput("Enter fare: ");
			fare=input.nextDouble();
			
			printInput("Passenger type"+
					"[O: Ordinary, S: Student, C: Senior]: ");
			passenger=input.next().charAt(0);
			passenger=Character.toUpperCase(passenger);
			
			printInput("Travelling in business class?"+ 
					" [Y/N]: ");
			key=input.next().charAt(0);
			key=Character.toUpperCase(key);
		}
		static void trigger ()
		{
			switch(passenger)
			{
				
					case 'O': //"ordinary"
							discRate = 0.0;
							break;
	
					case 'S': //"student"
							discRate=0.05;
							break;
			
					case 'C': //"senior citizen"
							discRate=0.10;
							break;
					
				default:
					
							
			}
			
			switch(key) 
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
		}		
		static void results ()
		{
			discount=fare*discRate;
			newFare=fare-discount;
			totalFare=newFare+classRate;
			
			
			printResults("Discount: " + df.format(discount) );
			printResults("Business class charge: " + df.format(classRate) );
			printResults("New fare: " + df.format(totalFare) );
		}
		static void printInput (String msg)
		
	        {
	            System.out.println(msg);
	        }
	        
	        static void printResults (String msg)
		{
	            System.out.println(msg);
		}
        
}
