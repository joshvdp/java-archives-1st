package Bulk_Act;
public class bulkActivity02_2b 
{
	static int [] numero_00 = {2,20,5,1000};
	public static void main(String[] args) 
	{
		print ("DELA PEÑA, JOSHUA VER S. \n 1BSEMC-1");
		initialize (numero_00);
	}
	static void initialize (int [] numero_01)
	{
		int x=1;
		print ("\n---Result---");
		do 
		{
			print("\n" + numero_01[0] + ", " + numero_01[1] + ", " + numero_01[2] + ", " + numero_01[3]);
			numero_01[0]*=2; numero_01[1]-=2; numero_01[2]*=3; numero_01[3]/=2; 
			x=1+x;
		}
		while (x<=10);
		print ("\n---END---");
	}
	static void print (String msg)
	{
		System.out.print(msg);
	}

}
