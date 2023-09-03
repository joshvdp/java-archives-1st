package Practice;
import java.util.*;
public class statements_practice {

	public static void main(String[] args) 
	{
		Scanner input=new Scanner (System.in);
		int test1score=0, test2score=0;
		System.out.println("Enter test 1 Score: ");
		test1score =input.nextInt();
		System.out.println("Enter test 2 score: ");
		test2score =input.nextInt();
		
		if((test1score>85)&&(test2score>86))
		{
			System.out.println("Make employee manager");
		}
		else if((test1score>70)||(test2score>70)) 
		{
			System.out.println("Make employee supervisor");
		}
		else if(!(test1score>60)) 
		{
			System.out.println("Make employee agent ");
		}
	}

}
