package JavaActivity02;
import java.util.Scanner;
public class PracMeth_01 {

	public static void main(String[] args) 
	{
		
		forInput();
		
	}
	static void forInput()
	{
		Scanner sS = new Scanner (System.in);
		Scanner sI = new Scanner (System.in);
		
		System.out.println("Num: ");
		int n1 = sI.nextInt();
		System.out.println("Num: ");
		int n2 = sI.nextInt();
		System.out.println("Ope: ");
		String ope = sS.nextLine();
		
		forOperation(n1, n2, ope);
	}
	static void forOperation (int n1, int n2, String ope)
	{
		int res=0;
		switch (ope)
		{
			case "+":
				res = n1+n2;
				break;
				
			case "/":
				res = n1/n2;
				break;
		}
		
		forOutput(res);	
	}

	static void forOutput(int res)
	{
		System.out.println("Result: " + res);
	}


}
