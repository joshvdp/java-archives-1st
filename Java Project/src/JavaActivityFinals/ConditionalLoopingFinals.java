package JavaActivityFinals;
import java.util.Scanner;
import java.text.DecimalFormat;
public class ConditionalLoopingFinals {
    
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#,###,###,#0.00");
        
        char choices, A, B, C;
        double fahrenheit_00 = 0.0;
        double fahrenheit_01 = 0.0;
        double celsius_00 = 0.0;
        double celsius_01 = 0.0;
        
        do
        {
            System.out.println("Main Menu\na. Celsius to Fahrenheit\nb. Fahrenheit to Celsius\nc. Exit");
            System.out.print("\nChoose option [a, b, or c]:");
            choices=input.next().charAt(0);
            choices=Character.toUpperCase(choices);
            
                switch(choices)
                {
                        case'A':
                        {
                            System.out.println("\nCelsius – Fahrenheit Conversion ");
                            System.out.println("\nEnter Celsius:");
                            celsius_00=input.nextDouble();
                            fahrenheit_01=(9.0 / 5.0 * celsius_00) + 32.0;
                            System.out.print("\nFahrenheit equivalent is " + df.format(fahrenheit_01));
                                break;
                        }
                        case'B':
                        {
                            System.out.println("\nFahrenheit – Celsius Conversion");
                            System.out.println("\nEnter Fahrenheit:");
                            fahrenheit_00=input.nextDouble();
                            celsius_01=(fahrenheit_00 - 32.0) * 5.0 / 9.0;
                            System.out.print("\nCelsius equivalent is " + df.format(celsius_01));
                                break;
                        }
                        case'C':
                        {
                            System.out.println("Exit");
                                break;
                        }
                    }
                } while(fahrenheit_01<0 && celsius_00<0);
        }
  }