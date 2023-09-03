package activities;

public class act2_fin 
{
	static int arr [] = {-10, -3, 5, 6, -2};
	static int val [] = new int [10];
	static String [] txt = {"DELA PEÑA, JOSHUA VER S.\n2BSEMC-GD-1\n", "The Maximum product of array is: " }; 
	
	public static void main(String[] args) 
	{
		int y = 0;
		int x = 0;
		print(txt [0]);
		for(int m=0; m<arr.length; m++)
		{
			for(int g = m + 1; g<arr.length; g++)
			{
				val[y] = arr[m] * arr [g]; 
				y++;
			}
		}
		for (int j = 0; j<val.length; j++)
		{
			y=0; 
			x=val[y];
			if (val[j] > x)
			{
				x = val[j];
			}
		}
		print( txt [1]+ x);
	}
	static void print (String x)
	{
		System.out.println(x);
	}
}