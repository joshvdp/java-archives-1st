package activities;

public class act_4 
{
	
	static String [] txt = {"DELA PEÑA, JOSHUA VER S.\n2BSEMC-DA-1\n\n", "Not Found" };
	static int [] arr = {6, 5, -8, 4, 2, 4, 2, -6, -4, -4};
	static int sum = 0;
	static int c = 0;
	public static void main(String[] args) 
	{
		print(txt[0]);
		p_03();
		p_02();
		p_01();
	}
	static void p_03 ()
	{
		for(int i = 0;i<arr.length;i++)
		{
			for(int j=i+1; j<arr.length;j++)
			{
				for(int x=j+1;x<arr.length; x++)
				{
					for(int y=x+1;y<arr.length; y++)
					{
						sum=arr[i]+arr[j]+arr[x]+arr[y];
						if (sum==0)
						{
							print("{ ");
							print (arr [i] + ", "+ arr [j] +", "+ arr [x] + ", "+ arr [y] + ", ");
							print("}\n");
						}
						
					}
				}
			}
			
		}
		
	}
	static void p_02()
	{
		for(int z = 0; z<arr.length; z++)
		{
			for(int g=z+1; g<arr.length; g++)
			{
				for(int x=g+1; x<arr.length;x++)
				{
					sum=arr[z]+arr[g]+arr[x];
					if(sum==0)
					{
						print("{ ");
						print(arr[z]+", "+arr[g]+", "+arr[x]+", ");
						print("}\n");
						c++;
					}
				}
			}
		}
	}
	static void p_01()
	{
		for (int x = 0; x<arr.length;x++)
		{
			for(int y=x + 1; y<arr.length; y++)
			{
				sum=arr[x]+arr[y];
				if(sum==0)
				{
					print("{ ");
					print (arr[x] + ", " + arr [y] + ", ");
					print("}\n");
					c++;
				}
			}
		}
		print("\n" + txt[1]);
	}
	static void print(String x)
	{
		System.out.print(x);
	}

}
