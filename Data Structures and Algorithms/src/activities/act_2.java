package activities;
import java.util.Scanner;
public class act_2

{
	public static void main (String []Args)
	{
		Scanner sc = new Scanner (System.in);
		int x [] = {5, 2, 6, 8, 1, 9};
		int y = 0;
		print("Input: ");
		int z = sc.nextInt();
		initialize(x,y,z);
	}
		public static void initialize (int[] x,int y,int z)
		{
				int cout = 0;
				for (int i = 0; i < x.length; i++)
				{
					for (int j = i+1; j < x.length; j++)
					{	
						for (int k = j+1; k < x.length; k++)
						{
							y = x[i] + x[j] + x[k]; 
							if (y == z)
							{
								print("\n" + x[i]+" "+ x[j]
				
										+" "+ x[k]);
				
								cout++;
							}
				
						}
					}
				}
					
				if (cout == 0)
					{
						print("\nNot Found");
					}
		}
		static void print (String p)
		{
			System.out.print(p);
		}
}