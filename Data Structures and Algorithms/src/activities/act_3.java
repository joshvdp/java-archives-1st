package activities;

public class act_3 
{
	static String [] txt = {"DELA PEÑA, JOSHUA VER S.\n2BSEMC-DA-1\n", "\nSubarrays with zero-sum are:\n\n" };
	static int [] arr = {4, 2, -3, -1, 0, 4};
	public static void main(String[] args) 
	{
		print(txt [0]);
		print(txt [1]);
		int y;
		int r;
		int t;
		int x;
		int ctr = 0;
		
		for (y = 0; y<arr.length;y++)
		{
			r = 0; ctr = 0;
			for(x=y; x<arr.length; x++)
			{
				r += arr[x]; ctr++;
			
				if(r==0 && ctr>1)
				{
					print("{ ");
					for(t=y; t<=x; t++)
					{
						print(arr[t] + "");
						if((t+1)<=x)
						{
							print(", ");
						}
					}
					
					print(" }\n");
				}
			}
		}

	}
	static void print (String x)
	{
		System.out.print(x);
	}

}
