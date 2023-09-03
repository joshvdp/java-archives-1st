package activities;
import java.util.Scanner;
public class act_1 
{
	public static void main(String[] args) 
	{    
		Scanner p = new Scanner(System.in);
		int[] arr = {8, 7, 2, 5, 3, 1};
		int targ;
		print("DELA PENA, JOSHUA VER S." + "\n2BSEMC-DA-1");
		print("\n\nTarget = ");
		targ=p.nextInt();
		        
		     boolean k = false;
		        
		   for (int y = 0; y < arr.length; y++)
		   {
		       for (int x = y + 1; x < arr.length; x++)
		          {
		              if (arr[y] + arr[x] == targ) 
		              {
		                  if (k) 
		                  print("\nOr");
		                    
		                  print("\nPair found (" + arr[y] + ", " + arr[x]+ ")");
		                    
		                  k = true;
		              }
		          }
		   }
		        
	}
		static void print (String x)
		{
		   System.out.print(x);
		}
		

}

