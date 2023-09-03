package Bulk_Act;
import java.util.Scanner;
public class bulkActivity06 
{
	static String reg[] = {"AAA", "BBB", "CCC", "DDD", "EEE", "FFF", "GGG", "HHH", "III", "JJJ"};
    static int age[] = {9, 10, 7, 5, 3, 1, 2, 4, 6, 8};
    static String course[] = {"CS", "IT", "CS", "IT", "Law", "Med", "Engr", "Med", "Engr", "Law"};
    static int yearlevel[] = {1, 2, 3, 4, 1, 2, 3, 4, 2, 4};
   
    public static void main(String[] args) 
    {
        print("DELA PEÑA, JOSHUA VER S. \n1BSEMC-1\n");
    	initialize();
        String val = ins("\nSearch: ");
        String sort = ins("Sort Type: (AGE / YEAR): ");
        String order = ins("Sort Order (Ascending / Descending): ");
        sortSearch(val, sort, order);
    }
    static void initialize() {
        print("\nNAME" + "\t" + "AGE" + "\t" + "COURSE" + "\t" + "YEAR LEVEL");
        for (int i = 0; i < reg.length; i++) {
            print("\n" + reg[i] + "\t" + age[i] + "\t" + course[i] + "\t" + yearlevel[i]);
        }
        print("\n-----END OF RECORD-----");
    }
    static void sortSearch(String val, String sort, String order) 
    {
        if (sort.equals("AGE"))
        {
            if (order.equals("Ascending")) 
            {
                for (int x = 0; x < reg.length; x++) 
                {
                    for (int i = 0; i < reg.length - 1; i++) 
                    {
                        if (age[i] > age[i + 1]) 
                        {
                            int tempAge = age[i];
                            age[i] = age[i + 1];
                            age[i + 1] = tempAge;

                            String tempName = reg[i];
                            reg[i] = reg[i + 1];
                            reg[i + 1] = tempName;

                            String tempCourse = course[i];
                            course[i] = course[i + 1];
                            course[i + 1] = tempCourse;

                            int tempYearLevel = yearlevel[i];
                            yearlevel[i] = yearlevel[i + 1];
                            yearlevel[i + 1] = tempYearLevel;
                        }
                    }
                }
            }
            else if (order.equals("Descending")) 
            {
                for (int x = 0; x < reg.length; x++) 
                {
                    for (int i = 0; i < reg.length - 1; i++) 
                    {
                        if (age[i] < age[i + 1]) 
                        {
                            int tempAge = age[i];
                            age[i] = age[i + 1];
                            age[i + 1] = tempAge;

                            String tempName = reg[i];
                            reg[i] = reg[i + 1];
                            reg[i + 1] = tempName;

                            String tempCourse = course[i];
                            course[i] = course[i + 1];
                            course[i + 1] = tempCourse;

                            int tempYearLevel = yearlevel[i];
                            yearlevel[i] = yearlevel[i + 1];
                            yearlevel[i + 1] = tempYearLevel;
                        }
                    }
                }
            }
        } 
        else if (sort.equals("YEAR")) 
        {
            if (order.equals("Ascending")) 
            {
                for (int x = 0; x < reg.length; x++) 
                {
                    for (int i = 0; i < reg.length - 1; i++) 
                    {
                        if (yearlevel[i] > yearlevel[i + 1]) 
                        {
                            int tempYearLevel = yearlevel[i];
                            yearlevel[i] = yearlevel[i + 1];
                            yearlevel[i + 1] = tempYearLevel;

                            String tempName = reg[i];
                            reg[i] = reg[i + 1];
                            reg[i + 1] = tempName;

                            String tempCourse = course[i];
                            course[i] = course[i + 1];
                            course[i + 1] = tempCourse;

                            int tempAge = age[i];
                            age[i] = age[i + 1];
                            age[i + 1] = tempAge;
                        }
                    }
                }
            } 
            else if (order.equals("Descending")) 
            {
                for (int x = 0; x < reg.length; x++) 
                {
                    for (int i = 0; i < reg.length - 1; i++) 
                    {
                        if (yearlevel[i] < yearlevel[i + 1]) 
                        {
                            int tempYearLevel = yearlevel[i];
                            yearlevel[i] = yearlevel[i + 1];
                            yearlevel[i + 1] = tempYearLevel;

                            String tempName = reg[i];
                            reg[i] = reg[i + 1];
                            reg[i + 1] = tempName;

                            String tempCourse = course[i];
                            course[i] = course[i + 1];
                            course[i + 1] = tempCourse;

                            int tempAge = age[i];
                            age[i] = age[i + 1];
                            age[i + 1] = tempAge;
                        }
                    }
                }
            }
        }
        print("\n-----SORTED BY " + sort + ", " + order + "-----");
        print("\nNAME" + "\t" + "AGE" + "\t" + "COURSE" + "\t" + "YEAR LEVEL");
        for (int i = 0; i < reg.length; i++) 
        {
            String Records = reg[i] + age[i] + course[i] + yearlevel[i];
            if (val.equals("ALL") | Records.contains(val)) 
            {
                print("\n" + reg[i] + "\t" + age[i]
                        + "\t" + course[i]
                        + "\t" + yearlevel[i]);
            }
        }
        print("\n-----END OF RECORD-----");
    }
    static String ins(String m) 
    {
        print(m);
    	Scanner x = new Scanner(System.in);
        return x.nextLine();
    }
    static void print(String x) 
    {
        System.out.print(x);
    }
}