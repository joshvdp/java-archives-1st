package Bulk_Act;
import java.util.Scanner;
public class bulkActivity01 
{

	public static void main(String[] args) 
	{
		print("DELA PEÑA, JOSHUA VER S. \n1BSEMC-1\n");
		int_Num();
	}
	static void int_Num ()
	{
		print("\nEnter number: ");
		double numero = scan();
		processing(numero);
	}
	static void processing(double numero)
	{
		if ((numero>0)&&(numero<5))
		{
			if (numero%2==0)
			{
				print("AAA");
			}
			else 
			{
				print ("BBB");
			}
		}
		else if ((numero>20)&&(numero<25))
		{
			if (numero%2==0)
			{
				print ("AAA");
			}
			else 
			{
				print ("BBB");
			}
		}
		else if ((numero>40)&&(numero<45))
		{
			if (numero%2==0)
			{
				print("AAA");
			}
			else 
			{
				print("BBB");
			}
		}
		else if ((numero>10)&&(numero<15))
		{
			if (numero%2==0)
			{
				print("CCC");
			}
			else 
			{
				print("DDD");
			}
		}
		else if ((numero>30)&&(numero<35))
		{
			if (numero%2==0)
			{
				print("CCC");
			}
			else 
			{
				print("DDD");
			}
		}
		else if ((numero>50)&&(numero<55))
		{
			if(numero%2==0)
			{
				print("CCC");
			}
			else 
			{
				print("DDD");
			}
		}
		else if ((numero/5)%1==0.0)
		{
			print ("EEE");
		}
		else 
		{
			print ("FFF");
		}
	}
	static void print(String msg)
	{
		System.out.print(msg);
	}
	static int scan ()
	{
		Scanner x=new Scanner(System.in);
		return x.nextInt();
	}
}
