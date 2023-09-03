package activities;
import java.util.Arrays;
public class act2_finals 
{
	public static void main (String[] args)
    {
        print("DELA PEÑA, JOSHUA VER S. 2BSEMC-GD/DA-1");
		int[] x = { 1, 4, 7, 8, 10 };
        int[] y = { 2, 3, 9 };
 
        proceed_merge(x, y);
    }
	static void proceed_merge(int[] x, int[] y)
    {
        int m = x.length;
        int n = y.length;
        
        for (int e = 0; e < m; e++)
        {
            if (x[e] > y[0])
            {
                
                int num = x[e];
                x[e] = y[0];
                y[0] = num;
 
                int first = y[0];
                
                int g;
                for (g = 1; g < n && y[g] < first; g++) {
                    y[g - 1] = y[g];
                }
 
                y[g - 1] = first;
            }
        }
        print ("\nOutput: ");
        print ("\nX: " + Arrays.toString(x));
        print ("Y: " + Arrays.toString(y));
    }
    static void print (String x)
    {
    	System.out.println(x);
    }
}
