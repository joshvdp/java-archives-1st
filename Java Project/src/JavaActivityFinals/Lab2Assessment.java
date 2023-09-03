package JavaActivityFinals;
import java.util.Scanner;
public class Lab2Assessment {
// DELA PEÑA, JOSHUA VER S. 1BSCS-1 (LAB)
	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		
		int numero_00;
		int numero_01=1;
		int overall = 0;
		
		System.out.print("Enter number: ");
		numero_00=input.nextInt();
		System.out.print("Odd numbers are: ");
		
		do
		{
			System.out.print(numero_01 + " ");
			overall+=numero_01;
			numero_01++;
			numero_01++;
		}while(numero_01<=numero_00*2); //t
		
		System.out.println("\nThe sum of odd numbers upto "+ numero_00 + " term is " + overall);
		
		 
	}
	// DELA PEÑA, JOSHUA VER S. 1BSCS-1 (LAB)
}
