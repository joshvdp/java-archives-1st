package Practice;

public class Assessment2 {
	// DELA PEÑA, JOSHUA VER S. LEC (1BSEMC-1) 
	public static void main(String[] args) 
	{
		int x=-1, y=7, c=0;
		
		c = y + x * -4; //11
		y += c; //18
		x -= 3; //-4
		
		if (x>0)
		{
			x++; 
		}
		if ((c>=20) || (y > 8))
		{
			y += x; //14
		}
		else
		{
			y %= 3;
			x *= c;
			c--;
		}
		System.out.println("Value of x is " + x);
		System.out.println("Value of y is " + y);
		System.out.println("Value of c is " + c);
	}

}
