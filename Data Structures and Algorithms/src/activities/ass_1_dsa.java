package activities;

public class ass_1_dsa
{
    public static void main(String[] args) 
    {
        int arr [] = {3, 4, -7, 3, 1, 3, 1, -4, -2, -2};
        print("\n\nSubarrays with zero-sum are\n\n");
        for (int x = 0; x < arr.length; x++)
        {
            int z = 0;
            for (int y = x; y < arr.length; y++)
            {
                z += arr[y];
                if (z == 0)
                {
                    print("{ ");
                    for (int j = x; j <= y; j++)
                    {
                        printNumero(arr[j]);
                        if ((j + 1) <=y)
                        {
                            print(", ");
                        }
                        
                    }
                    print(" }");
                    print("\n");
                }
            }
        }

    }
    static void print (String x)
    {
        System.out.print(x);
    }
    static void printNumero (int x)
    {
        System.out.print(x);
    }
    

}
