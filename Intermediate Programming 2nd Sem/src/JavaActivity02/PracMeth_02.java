package JavaActivity02;
import java.util.Scanner;
public class PracMeth_02 {
	//Joshua Ver S.J Dela Peña 1BSEMC-1
	public static void main(String[] args) 
	{
		menu();
	}
	static void menu()
	{
		Scanner input = new Scanner(System.in);
		char key = 0;
		
		System.out.println("\t\t-----|SELECTION MENU|----- "+
				"\n\t   	    | |SELECT A KEY| |" +
				" \n\t[0] DAYS TO SECONDS, [1] AREA, [2] VOLUME [3] YARDS TO FEET, [4] DAYS TO HOURS, [5] METER TO CENTIMETER "
				+ "\n\t[6] KILOMETRE TO METER, [7] CENTIMETER TO MILIMETER, [8] MILE TO KILOMETRE" 
				+ "\n\t[9] CENTIMETER TO MICROMETER ");
		System.out.print("\nPress a Key: ");
		key=input.next().charAt(0);
		key=Character.toUpperCase(key);
		
		switch (key)
		{
			
			case'0':
				System.out.println("\nSELECTED: Days to Seconds");
				int a = inputNum("Enter Days: ");
				day2sec (a);
				break;
				
			case'1':
				System.out.println("\nSELECTED: Area");
				int c = inputNum("Enter Length");
				int d = inputNum("Enter Width");
				area (c,d);
				break;
				
			case'2':
				System.out.println("\nSELECTED: Volume");
				int e = inputNum("Enter Length");
				int f = inputNum("Enter Width");
				int g = inputNum("Enter Height");
				volume (e,f,g);
				break;
				
			case'3':
				System.out.println("\nSELECTED: Yards to Feet");
				int h = inputNum("Enter Yards");
				yartofeet (h);
				break;
				
			case'4':
				System.out.println("\nSELECTED: Days to Hours");
				int j = inputNum("Enter Days");
				day2hour (j);
				break;
			case'5':
				System.out.println("\nSELECTED: Meter to Centimeter");
				int l = inputNum("Enter Meter");
				cm2m (l);
				break;
			case'6':
				System.out.println("\nSELECTED: Kilometre to Meter");
				int y = inputNum("Enter Kilometre");
				k2m (y);
				break;
			case'7':
				System.out.println("\nSELECTED: Centimeter to Milimeter");
				int x = inputNum("Enter Centimeter");
				cm2mm (x);
				break;
			case'8':
				System.out.println("\nSELECTED: Mile to Kilometre");
				int z = inputNum("Enter Mile");
				mile2km (z);
				break;
			case'9':
				System.out.println("\nSELECTED: Centimeter to Micrometer");
				int xx = inputNum("Enter Centimeter");
				cm2mcm (xx);
				break;
		}
		
		//Joshua Ver S.J Dela Peña 1BSEMC-1
	}
				static int inputNum(String msg)
				{
					Scanner s = new Scanner (System.in);
					System.out.print(msg+": ");
					int n = s.nextInt();
					
					return n;
					
				}
				static void day2sec (int day)
				{
					double sec = 86400;
					double ansec = 0;
					ansec = sec*day;
					System.out.println("\nBMI: " + ansec);
				}
				static void area (int length, int width)
				{
					int area = 0;
					area = length*width;
					System.out.println("\nArea: " + area);
				}
				static void volume (int length, int width, int height)
				{
					int pvol = 0;
					pvol = length*width*height;
					System.out.println("\nVolume: " + pvol);
				}
				static void yartofeet (int yards)
				{
					int feet = 3;
					int ansfeet = 0;
					ansfeet = feet*yards;
					System.out.println("\nFeet: " + ansfeet);
				}
				static void day2hour (int days)
				{
					int hour = 24;
					int anshr = 0;
					anshr = hour*days;
					System.out.println("\nHours: " + anshr);
				}
				static void cm2m (int meter)
				{	 
					int cm = 100;
					int ansm = 0;
					ansm = cm*meter;
					System.out.println("\nCentimeter: " + ansm );
				} 
				static void k2m (int km)
				{
					int m = 1000;
					int ansm = 0;
					ansm = m*km;
					System.out.println("\nMeter: " + ansm);
				}
				static void cm2mm (int cm)
				{
					int mm = 10;
					int ansmm = 0;
					ansmm = mm*cm;
					System.out.println("\nMeter: " + ansmm);
				}
				static void mile2km (int mile)
				{
					double km = 1.609;
					double anskm = 0;
					anskm = km*mile;
					System.out.println("\nKilometer: " + anskm);
				}
				static void cm2mcm (double cm)
				{
					double mcm = 10000;
					double ansmcm = 0;
					ansmcm = mcm*cm;
					System.out.println("\nMicrometer: " + ansmcm);
				}
				
				//Joshua Ver S.J Dela Peña 1BSEMC-1
}
