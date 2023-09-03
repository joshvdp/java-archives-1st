package Practice;
import java.util.Scanner;
public class PositiveOrNegative 
{

	public static void main(String[] args) 
	{
		Scanner input=new Scanner (System.in);
		int number;
		String num;
		System.out.print("Enter Number: ");
		number=input.nextInt();
		
		if(number<0)
		{
			num="Number is Negative";
		}
		else if (number>0)
		{
			num="Number is Positive";
		}
		else 
		{
			num="Number is Origin";
		}
			
			System.out.println(num);
	}
	
}
