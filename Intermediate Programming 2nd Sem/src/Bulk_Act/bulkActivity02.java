package Bulk_Act;
import java.util.Scanner;
public class bulkActivity02 
{
    public static void main(String[] args) 
    {
    	print("DELA PEÑA, JOSHUA VER S. \n1BSEMC-1");
    	inputNum ();
    }
    static void inputNum ()
    {
    	Scanner input = new Scanner(System.in);
    	int numero_0;
    	int numero_1;
    	int numeroloop;
    	double average = 0.0;
    	print ("\n\nEnter starting number: ");
    	numero_0 = scan ();
    	print ("\nEnter increment number: ");
    	numero_1 = scan ();
    	print ("\nEnter loop times: ");
    	numeroloop = scan ();
    	initialize(numero_0, numero_1, numeroloop);  	
    }
    static void initialize (int num0, int num2, int numLoop)
    {
    	int x=1, y=1;
    	print("---Result---");
    	while (x!=numLoop+1)
    	{
    		print("\nLoop " + y + ": " + num0 );
    		num0+=num2; 
    		y++; x++;
    	}
    }
    static void print (String msg)
    {
    	System.out.print(msg);
    }
    static int scan ()
	{
		Scanner x = new Scanner(System.in);
		return x.nextInt();
	}
}
