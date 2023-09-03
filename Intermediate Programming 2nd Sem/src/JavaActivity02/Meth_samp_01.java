package JavaActivity02;
import java.util.Scanner;
public class Meth_samp_01 {

		public static void main(String[] args) 
		{
			System.out.println("---START---");
			var();
			System.out.println("---END---");
	
		}
		static void var()
		{
			Scanner input = new Scanner(System.in);
			char key = 0;
			System.out.println("Pick Motor"+
					" [A: Hi, B: Hallo, C: Ciao]: ");
			key=input.next().charAt(0);
			key=Character.toUpperCase(key);
			
			switch(key)
			{
				
					case 'A': 
							k1 ();
							break;
	
					case 'B': 
							k2 ();
							break;
			
					case 'C': 
							k3();
							break;
					
				default:
					//Invalid code
							
			}
		}
		static void k1 ()
		{
			System.out.println("RB28");
		}
		static void k2 ()
		{
			System.out.println("2JZ");
		}
		static void k3 ()
		{
			System.out.println("RB26");
		}

}
