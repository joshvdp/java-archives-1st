package activities;
public class act3_finals 
{
	public static void main (String[] args)
    {
        int[] in = { -10, -3, 5, 6, -2 };
        print("DELA PEÑA, JOSHUA VER S. 2BSEMC-GD/DA-1");
        initialize(in);
    }
	public static void initialize(int[] in)
    {
        if (in.length < 2) 
        {
            return;
        }
        int o = Integer.MIN_VALUE;
        int e = -1, g = -1;

        for (int i = 0; i < in.length - 1; i++)
        {
            for (int j = i + 1; j < in.length; j++)
            {
                if (o < in[i] * in[j])
                {
                    o = in[i] * in[j];
                    e = i;
                    g = j;
                }
            }
        }
 
        print("\nPair is (" + in[e] + ", " + in[g] + ")");
    }
	 static void print (String x)
	    {
	    	System.out.println(x);
	    }
}
