package JavaActivityFinals;

public class MultiplicationTable {

	public static void main(String[] args) 
	{
		int a,b,c=1;
		for(a=1;a<=10;a++)
		{
			b=1;
			do
			{
				c=a*b;
				System.out.print(c+ "\t");
				b++;
			}while(b<=10);
			System.out.println();
		}

	}

}
