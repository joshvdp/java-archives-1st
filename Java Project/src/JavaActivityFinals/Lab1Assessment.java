package JavaActivityFinals;
import java.util.Scanner;
public class Lab1Assessment {

	public static void main(String[] args) 
	{
		Scanner input_numero00 = new Scanner (System.in);
		
		int numero;
		int reverse=1;
		
		System.out.print("Enter number: ");
		numero=input_numero00.nextInt();
		
		while(numero>0)
		{
			System.out.print(numero + " ");
			numero--;
			
			System.out.print(reverse + " ");
			reverse++;
		}
		
	}

}