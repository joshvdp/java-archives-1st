package JavaActivityFinals;
import java.text.DecimalFormat;
public class lec3 {

	public static void main(String[] args) 
	{
		DecimalFormat df = new DecimalFormat("##,###.00");
			int year = 0;
			
			double $my_investment = 1000.0, interest = 0.0, $money = 0.0;
			
			System.out.print("Year\t");
			System.out.print("Amount\t\t");
			System.out.print("Interest\t");
			System.out.print("Year-end Money");
			
			System.out.println();
			
			for (year = 1; year <= 5; year++)
			{
				interest = $my_investment * 0.1;
				$money = $my_investment + interest;
				
				System.out.print(year + "\t");
				System.out.print(df.format($my_investment) + "\t");
				System.out.print(df.format(interest) + "\t\t" + df.format($money));
				
				System.out.println();
				$my_investment=$money;
			}

	}

}
