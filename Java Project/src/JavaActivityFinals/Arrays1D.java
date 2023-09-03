package JavaActivityFinals;
import java.util.Scanner;

public class Arrays1D {

	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		
		int i=0;
		int i1=0;
		int i2=0;
		int array0=0;
		int array1=0;
		int array2=0;
		
		System.out.print("Enter size of the 1st array: ");
		array0=input.nextInt();
		System.out.print("Enter size of the 2nd array: ");
		array1=input.nextInt();
		System.out.print("Enter size of the 3rd array: ");
		array2=input.nextInt();
		
		int [] array_value1= new int [array0];
		int [] array_value2= new int [array1];
		int [] array_value3= new int [array2];
		
		System.out.print("\nEnter value of 1st array: ");
		for (i=0;i<array_value1.length;i++)
		{
			array_value1 [i]=input.nextInt();
		}
		
		System.out.print("Enter value of 2nd array: ");
		for (i1=0;i1<array_value2.length;i1++)
		{
			array_value2 [i1]=input.nextInt();
		}
		
		System.out.print("Enter value of 3rd array: ");
		for (i2=0;i2<array_value3.length;i2++)
		{
			array_value3 [i2]=input.nextInt();
		}
		
		System.out.println("\nValue of Arrays: ");
		System.out.print("Array1: ");
		for (i=0;i<array_value1.length;i++)
		{
			System.out.print(array_value1 [i] + " ");
		}
		
		System.out.println();
		System.out.print("Array2: ");
		for (i1=0;i1<array_value2.length;i1++)
		{
			System.out.print(array_value2 [i1] + " ");
		}
		
		System.out.println();
		System.out.print("Array3: ");
		for (i2=0;i<array_value3.length;i2++)
		{
			System.out.print(array_value3 [i2] + " ");
		}
		
		System.out.println();
		System.out.print("\nCommon elements in sorted arrays: ");
		i=0;
		i1=0;
		i2=0;
		while (i<array_value1.length && i1<array_value2.length && i2<array_value3.length)
		{
			if (array_value1[i1] == array_value2[i2] && array_value2[i2] == array_value3[i2])
			{
				System.out.print(array_value1 [i1] + " ");
				i++;
				i1++;
				i2++;
			}
			else if (array_value1[i1] < array_value2[i1])
			{
				i1++;
			}
			else if (array_value2[i1] < array_value3[i2])
			{
				i1++;
			}
			else
			{
				i2++;
			}
		
	}
}
}