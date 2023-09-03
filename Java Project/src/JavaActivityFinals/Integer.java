package JavaActivityFinals;
import java.util.Scanner;
import java.text.DecimalFormat;
public class Integer {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner (System.in);
		DecimalFormat df = new DecimalFormat("###,###,##0");
		double oneInteger = 0.0;
		double twoInteger = 0.0;
		
		System.out.print("Enter first integer: ");
		oneInteger = input.nextDouble();
		
		System.out.print("Enter second integer: ");
		twoInteger = input.nextDouble();
		
			if ((isMultiple(oneInteger,twoInteger)%1)==0) 
			{
				System.out.println(df.format(twoInteger) + " is multiple of " + df.format(oneInteger));
			}
			else 
			{
				System.out.println(df.format(twoInteger) + " is not multiple of " + df.format(oneInteger));
			}
		}
		public static double isMultiple(double first, double second)
		{
			double result;
			result=second/first;
			return result;
		}
	


}