package Bulk_Act;
import java.util.Scanner;
public class bulkActivity04 
{
	public static void main(String[] args) 
	{
		print("DELA PEÑA, JOSHUA VER S. \n1BSEMC-1");
		print("\n----INPUT----");
		print("\nEnter max record: ");
		int rec = scanI();
		int number = rec;
		for (int x = 0; x < number; x++)
		{
			print("\n---REC"+"["+x+"]"+"---");
			initialize();
		}
	}
	static void initialize ()
	{
		String name = "";
		String month = "";
		String sex = "";
		int day;
		int year;
		int age;
		print("\nEnter name: ");
		name = scanD();
		print("Enter gender: ");
		sex = scanD();
		print("Enter month of birth: ");
		month = scanD();
		print("Enter day of birth: ");
		day = scanI();
		print("Enter year of birth: ");
		year = scanI();
		age = compute (year);	
		print("---Result---");
		print ("\nNAME \t GENDER \t BIRTH DATE \t AGE");
		print ("\n"+ name + "\t " + sex + "\t\t "+ month+ " " + day+ ", " + year + " \t "+ age +" years old");
	}
	static int compute (int year)
	{
		int age = 2021 - year;
		return age;
	}
	static void print (String msg)
	{
		System.out.print(msg);
	}
	static int scanI ()
	{
		Scanner s = new Scanner(System.in);
		return s.nextInt();
	}
	static String scanD ()
	{
		Scanner i = new Scanner(System.in);
		return i.nextLine();
	}
}
