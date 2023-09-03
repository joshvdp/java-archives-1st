package Practice;
import java.util.Scanner;
public class Assessment1 {
	public static void main(String[] args) 
	{
		int i=1,n=4;
		int s=1,p=0;
		while (i <= n)
		{
			s=i*i;
			p+=s;
			i++;
		}
		System.out.println("The value of s is "+s);
		System.out.println("The value of p is "+p);

	}

}