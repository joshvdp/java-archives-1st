package JavaActivity02;
import java.util.Scanner;

public class Calculator 
{
	static int numero_00=0;
	static int numero_01=0;
	static String operator="";
	static int result=0;

	public static void main(String[] args) 
	{
		Input();
		Process();
		Result();
		//Joshua Ver S.J Dela Peña 1BSEMC-1
	}
	
	static void Input ()
	{
		Scanner e_00 = new Scanner (System.in);
		Scanner e_01 = new Scanner (System.in);
		
		input("Num:");
		numero_00 = e_00.nextInt();
		
		input("Num:");
		numero_01 = e_00.nextInt();
		
		input("Ope (+,-,*,/,%):");
		operator = e_01.nextLine();
	}
	
	static void Process ()
	{
		result=0;
		switch(operator)
		{
			case "+":
				result=numero_00+numero_01;
				break;
			
			case "-":
				result=numero_00-numero_01;
				break;
			
			case "*":
				result=numero_00*numero_01;
				break;
				
			case "/":
				result=numero_00/numero_01;
				break;
				
			case "%":
				result=numero_00%numero_01;
				break;			
		}
	} 	//Joshua Ver S.J Dela Peña 1BSEMC-1
	static void Result ()
	{
		result("Result:" + result);
	}
	
	static void input(String msg) 
	{	
		System.out.print(msg);
	}
	
	static void result(String msg)
	{
		System.out.print(msg);
	}
		//Joshua Ver S.J Dela Peña 1BSEMC-1
}

