package JavaActivity02;
import java.text.DecimalFormat;
public class Meth_02 
{
	public static void main(String[] args)
	{
		bob_01(12, 1.75, true, "onyx");
		bob_02(6, 4, 8, 9, 3);
		
	}
	static void bob_01 (int x, double y, boolean b, String n)
	{	
		System.out.println("Output " + x);
		System.out.println("Output " + y);
		System.out.println("Output " + b);
		System.out.println("Output " + n);
		
	}
	static void bob_02 (int x, int y, int n, int k, int t)
	{
		int ave = (x+y+n+k+t)/5;
		System.out.println("\noutput " + x);
		System.out.println("output " + y);
		System.out.println("output " + n);
		System.out.println("output " + k);
		System.out.println("output " + t);
		System.out.println("\n\t Ave: " + ave );
	}
	 
}
