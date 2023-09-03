package JavaActivityFinals;

public class SimulateB {

	public static void main(String[] args) 
	{
		int a, c;
		for(a = 5; a >= 1; a -= 1)
		{
			if (a<5)
			{
				c = 4;
				while (c >= a)
				{
					System.out.print(" ");
					c = c - 1;
				}
			}
			System.out.println("&");	
		}

	}

}
