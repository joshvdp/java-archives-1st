package JavaActivityFinals;
public class lec2 {

	public static void main(String[] args) 
	{
		int a, ctr=5, cb;
		int t=0;
		a=1;
		cb=0;
		String text="cube";
		do
		{
			cb=a*a*a;
			System.out.println("Number is " + a + " and the " + text + " of " + a +" is " + cb);
			a++;
			t+=cb;
		}
		while(a<=ctr);
		System.out.println("\nThe total of the " + text + "d number is " + t);
		
		//DELA PE�A, JOSHUA VER S. 
		//1BSEMC-1
		
	}

}
