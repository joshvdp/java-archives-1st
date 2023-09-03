package Practice;

public class Cabinet2 {

	public static void main(String[] args) 
	{
		int [][] array2x=new int [3][3];
		int r,c;
		//storing of values
		for(r=0; r<array2x.length;r++)
		{
			c=0;
			while(c<array2x[r].length)
			{
				array2x[r][c]=4*2+r+c;
				c++;
			}
		}
		//display
		for(r=0;r<array2x.length;r++)
		{
			c=0;
			while(c<array2x[r].length)
			{
				System.out.print(array2x[r][c] +"\t");
				c++;
			}
			System.out.println();
		}
		

	}

}
