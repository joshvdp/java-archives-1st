package JavaActivityFinals;
import java.util.Scanner;
public class Matrix {
//DELA PEÑA, JOSHUA VER S. 1BSCS-1 (LAB)
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int generate = 0;
		int row=1;
		int numeroCount;
		int reverse;
		
		System.out.print("Enter matrix to generate (n by n): ");
		generate = input.nextInt();
		
		reverse=generate*generate;
		while (row <= generate)
		{
			for(numeroCount = 1; numeroCount <= generate; numeroCount++)
			{
				
				System.out.print(reverse+"\t");
				reverse--;
				
				
			}
			System.out.println(" ");
			row++;
			
		}

	}

}
