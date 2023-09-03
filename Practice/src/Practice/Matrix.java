package Practice;
import java.util.Scanner;
public class Matrix {

	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		int num,row=1;
		int rev;
		int num1;
		int deductor=3,adder=2;
		
		System.out.print("Enter matrix to generate (n by n):");
		num=input.nextInt();
		
		rev=num*num;
		while(row<=num)
		{
			for(num1=1;num1<=num;num1++)
			{
				if(row==1)
				{
					System.out.print(rev+"\t");
					rev--;
				}
				else if((row%2)== 0)
				{
					System.out.print(rev+"\t");
					rev++;
				}
				else 
				{
					System.out.print(rev+"\t");
					rev--;
				}
				
			}
			System.out.println(rev+" ");
			row++;
			rev-=deductor;
			deductor+=adder;
			adder++;
			}
		}

	}


