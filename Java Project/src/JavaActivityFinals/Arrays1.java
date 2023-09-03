package JavaActivityFinals;

import java.util.Scanner;
public class Arrays1 {

	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		
		int array_size01=0;
		int array_size02=0; 
		int array_size03=0;
		int value_01=0;
		int value_02=0; 
		int value_03=0;
		
		System.out.print("Enter size of the 1st array: ");
		array_size01=input.nextInt();
		
		System.out.print("Enter size of the 2nd array: ");
		array_size02=input.nextInt();
		
		System.out.print("Enter size of the 3rd array: ");
		array_size03=input.nextInt();
		
		int [] array_value01= new int [array_size01];
		int [] array_value02= new int [array_size02];
		int [] array_value03= new int [array_size03];
		
		System.out.print("\nEnter value of 1st array: ");
		for (value_01=0;value_01<array_value01.length;value_01++)
		{
			array_value01 [value_01]=input.nextInt();
		}
		
		System.out.print("Enter value of 2nd array: ");
		for (value_02=0;value_02<array_value02.length;value_02++)
		{
			array_value02 [value_02]=input.nextInt();
		}
		
		System.out.print("Enter value of 3rd array: ");
		for (value_03=0;value_03<array_value03.length;value_03++)
		{
			array_value03 [value_03]=input.nextInt();
		}
		
		System.out.println("\nValue of Arrays: ");
		System.out.print("Array1: ");
		for (value_01=0;value_01<array_value01.length;value_01++)
		{
			System.out.print(array_value01 [value_01] + " ");
		}
		
		System.out.println();
		
		System.out.print("Array2: ");
		for (value_02=0;value_02<array_value02.length;value_02++)
		{
			System.out.print(array_value02 [value_02] + " ");
		}
		
		System.out.println();
		
		System.out.print("Array3: ");
		for (value_03=0;value_03<array_value03.length;value_03++)
		{
			System.out.print(array_value03 [value_03] + " ");
		}
		
		System.out.println();
		
		System.out.print("\nCommon elements in sorted arrays: ");
		
		value_01=0;
		value_02=0;
		value_03=0;	
		while (value_01<array_value01.length && value_02<array_value02.length && value_03<array_value03.length)
		{
			if (array_value01 [value_01] == array_value02 [value_02] && array_value02 [value_02] == array_value03 [value_03])
			{
				System.out.print(array_value01 [value_01] + " ");
				value_01++;
				value_02++;
				value_03++;
			}
			else if(array_value01[value_01] < array_value02 [value_02])
			{
				value_01++;
			}
			else if(array_value02[value_02] < array_value03 [value_03])
			{
				value_02++;
			}
			else
			{
				value_03++;
			}
		}
		
	}
}