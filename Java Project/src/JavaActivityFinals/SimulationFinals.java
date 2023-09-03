package JavaActivityFinals;
import java.util.Scanner;
public class SimulationFinals {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int array_size;
		int a=0;
		
		System.out.print("Enter Array Size: ");
		array_size = input.nextInt();
		
		int[] array_elem = new int [array_size];
		
		System.out.print("Enter Array Elements: ");
		for (a = 0; a < array_size; a++)
		{
			array_elem[a] = input.nextInt();
		}
			solve(array_elem,array_size);
				
	}
	
	public static void solve(int arrays_Elems[], int n)
	{
		System.out.print("Unique Array Elements: ");
		
		int g;
		for(g = 0; g < n; g++)
		{
			int v;
			for (v = 0; v < g; v++)
			{
				if (arrays_Elems[g] == arrays_Elems[v])
					break;
			}
			
			if (g == v)
			{
				System.out.print(arrays_Elems[g] + "\t");
			}
		}
	}
}
