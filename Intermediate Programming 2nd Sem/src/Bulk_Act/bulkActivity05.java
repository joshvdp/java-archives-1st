package Bulk_Act;
import java.util.Scanner;

public class bulkActivity05 
{
	static String [] cabinet = {"Alucard\tJan 5, 2000\t20\tMale\tPhilippines\n","Layla\tFeb 10, 2001\t19\tFemale\tJapan\n"
								,"Chou\tMar 15, 2002\t18\tMale\tEurope\n","Miya\tApr 20, 2010\t10\tFemale\tGermany\n"
								,"Clint\tMay 25, 2012\t8\tMale\tChina\n","Eudora\tJan 30, 2013\t7\tFemale\tFrance\n"
								,"Franco\tNov 11, 2003\t17\tMale\tIndia\n","Hilda\tMar 25,2011\t9\tFemale\tPhilippines\n"
								,"Gord\tDec 12, 2010\t10\tMale\tJapan\n","Kimmy\tMay 23, 2000\t20\tFemale\tSouth Korea\n"};
	public static void main(String[] args) 
	{
		print("DELA PEÑA, JOSHUA VER S.\n1BSEMC-1\n\n");
		boolean y=true;
		print("----------Start DB----------\nNAME\tBIRTH DATE\tAGE\tGENDER\tADDRESS\t\n");
		for (int x=0;x<cabinet.length;x++)
		{
			print(cabinet[x]);
		}
		print("----------End DB----------\n");
		while(y)
		{
			initialize();
		}

	}
	static void initialize ()
	{
		print("Search Parameter 1: ");
		String x0=scn();
		print("Search Parameter 2: ");
		String x1=scn();
		print("Search Parameter 3: ");
		String x2=scn();
		print("---Search Result---\nNAME\tBIRTH DATE\tAGE\tGENDER\tADDRESS\t\n");	
		for (int z=0;z<cabinet.length;z++)
		{
			if (cabinet[z].contains(x0))
			{
				if (cabinet[z].contains(x1)) 
				{
					if (cabinet[z].contains(x2)) 
					{
						print(cabinet[z]);
					}
				}
			}
		}
		print("---End Result---\n");
	}
	static String scn()
	{
		Scanner x=new Scanner(System.in);
		return x.nextLine();
	}
	static void print (String x)
	{
		System.out.print(x);
	}

}
