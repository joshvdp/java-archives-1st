package IntProgPractice;
import java.util.Scanner;
public class array 
{
	
	static String [] log = {"Hello", " World", "panda02"};
	
	public static void main(String[] args) 
	{
		Scanner ins = new Scanner(System.in);
		char select;
		
		print("Pick a Number \n1, 2");
		print("\nEnter Here: ");
		select=ins.next().charAt(0);
		select=Character.toUpperCase(select);
		
		switch(select)
		{
			case '1':
				print ("\nYou Picked: "  + "[" + select + "]\n");
				printData();
				break;
			case '2':
				print ("\nYou Picked: " + "[" + select + "]\n");
				printData2();
				break;
			default:
				print("Goodbye");
		}
	}
	static void printData()
	{
		print (log [2]);
	}
	static void printData2()
	{
		print(log [0]);
		print(log [1]);
	}
	static void print (String x)
	{
		System.out.print(x);
	}

}
