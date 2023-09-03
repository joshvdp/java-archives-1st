package JavaActivityFinals;

public class array1d_03 {

	public static void main(String[] args) 
	{
		int x;
		int [] one = new int[5];
		int [] two = new int[10];
		for(x=0;x<one.length;x++)
		{
			one[x]=5*x+3;
		}
		System.out.print("One Contains:  ");
		for(x=0;x<5;x++)
		{
			System.out.print(one[x]+" ");
		}
		System.out.println();
		
		for(x=0;x<one.length;x++)
		{
			two[x]=2*one[x]-1;
			two[x + 5]=one[4 - x]+ two[x];
		}
		System.out.print("One Contains:  ");
		for(x=0;x<two.length;x++)
		{
			System.out.print(two[x]+ " ");
		}
		System.out.println();
		

	}

}
