package JavaActivityFinals;
import java.util.Scanner;
public class Matrix2D 
{

		public static void main(String[] args) 
	    {
	        Scanner input = new Scanner(System.in);
	        
	        int rows;
	        int cols;
	        int ctr; 
	        
	        System.out.print("Enter number of rows: ");
	        	rows = input.nextInt();
	        
	        System.out.print("Enter number of columns: ");
	        	cols = input.nextInt();
	        
	        int[][] element = new int[rows][cols];
	
	        //Storing Values
	        	ctr = 1;
	        for (int row = 0; row < element.length; row++)
	        	for (int col = 0; col < element[row].length; col++) 
	            {
	                System.out.print("Enter Element " + ctr + ": ");
	                element[row][col] = input.nextInt();
	                ctr ++;
	                
	            }
	        
	        
	        System.out.println("\nMatrix Input:");
	        printMatrix(element);
	         
	        int[][] resultMatrix = transpose(element);
	        
	        
	        System.out.println("\nTransposed matrix:");
	        printMatrix(resultMatrix);
	    }
	
	    //Matrix Input
	    public static void printMatrix(int[][] matrix) 
	    {
	        for (int row = 0; row < matrix.length; row++) 
	        {
	            for (int col = 0; col < matrix[row].length; col++) 
	            {
	                System.out.print(matrix[row][col] + "  ");
	            }
	            System.out.println();
	        } 
	    }
	
	    //Transpose Matrix
	    public static int[][] transpose(int[][] matrix)
	    {
	        int m = matrix.length;
	        int n = matrix[0].length;
	
	        int[][] transposedMatrix = new int[n][m];
	
	        for(int x = 0; x < n; x++) 
	        {
	            for(int y = 0; y < m; y++) 
	            {
	                transposedMatrix[x][y] = matrix[y][x];
	            }
	        }
	
	        return transposedMatrix;
	    }
}