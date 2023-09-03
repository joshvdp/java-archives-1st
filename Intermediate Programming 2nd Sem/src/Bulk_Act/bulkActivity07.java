package Bulk_Act;
import java.util.Scanner;
public class bulkActivity07 
{
	static String [][] infoDraw;
	static String [] counter;
	
	public static void main(String[] args) 
	{
		print("DELA PEÑA, JOSHUA VER S. \n1BSEMC-1\n\n");
		initialize();
	}
	static void initialize()
	{
		infoDraw = new String[inputNum("Information Count")][inputNum("Record Count")];
		counter = new String[infoDraw.length];
		
		print("\n----------");
		gather();
		
		print("\n----------");
		records();
		
		print("\n----------\n");
		
	    print_data00(counter);
	    print_data01(infoDraw);
	}
	static void gather()
	{
		for (int i = 0; i<counter.length;i++)
		{
			counter[i] = scan("\nInformation #" + i +":");
		}
	}
	static void records ()
	{
		for (int g=0; g<infoDraw[1].length; g++)
		{
			for (int t = 0; t < infoDraw.length; t++)
			{
				infoDraw[t][g] = scan("\n" + counter[t] + "[" + g +"]" + ": ");
			}
			print("\n---");
		}
	}
	static void print_data00(String[] array) 
	{
		for (int x=0; x < array.length; x++)
		{
			print(array[x] + "\t");
		}
		print("\n" + "");
	}
	static void print_data01(String[][] array) 
	{
		for (int f = 0; f < array[1].length; f++) 
		{
			for (int x = 0; x < array.length; x++)
			{
				print(array[x][f]+ "\t");
			}
			print("\n" + "");
		}
	}
	static int inputNum(String d)
	{
		print(d + ": ");
		Scanner input = new Scanner(System.in);
		return input.nextInt();
	}
	static String scan (String y)
	{
		print(y + " ");
		Scanner o = new Scanner (System.in);
		return o.nextLine();
	}
	static void print (String x)
	{
		System.out.print(x);
	}

}
