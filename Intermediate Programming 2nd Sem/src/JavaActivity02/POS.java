package JavaActivity02;
import java.util.Scanner;

public class POS
{
	//Dela Peña, Joshua Ver S. 1BSEMC-1
	
	static String [] goods = {"INTEL CPU", "AMD CPU", "AMD APU's"};
	static String [] variantIntel = {"CORE i3", "CORE i5", "CORE i7"};
	static String [] variantAmd_00 = {"RYZEN 3", "RYZEN 5", "RYZEN 7"};
	static String [] variantAmd_01 = {"A6", "A8", "A10"};
	static String [] goodsPrice = {"150-400", "150-380", "100-200"};
	static int [] variantIntelPrice = {150,250,400};
	static int [] variantAmd_00Price = {150,240,380};
	static int [] variantAmd_01Price = {100,150,200};
				
		public static void main(String[] args) 
		{
			print("Dela Peña, Joshua Ver S. \n1BSEMC-1");
				
			menu ();
			int barcode = inputs("\nSelect Product: ");
			int choices = variation(barcode);
			int qty = inputs("Enter Quantity: ");
			int estimated = maths(choices-1, qty,barcode); 
			print("Total:" + estimated);
			int payMeth = inputs("\nEnter Cash: ");
			int change = invoice (payMeth, estimated); 
			print ("\nChange: " + change + " $" + "\n\nThank you for Purchase Happy Gaming!!!");
		
		}
			 	static void menu()
				{
					print ("------MAIN MENU------");
					for (int w=0;w<goods.length;w++)
					{
						print((w+0) + ". " + goods[w] + ", " + goodsPrice [w] + " $");
					}
				}
				static int variation(int prodID)
				{
					print("\n------VARIATION------");
					if (prodID == 1)
					{
						for (int o=0;o<variantIntel.length;o++)
						{
							print((o+1) + ". " + variantIntel[o] + ", " + variantIntelPrice[o] + " $");
						}
					}
					else if (prodID == 2)
					{
						for (int k=0; k<variantAmd_00.length;k++)
						{
							print((k+1) + ". " + variantAmd_00[k] + ", " + variantAmd_00Price[k] + " $");
			
						}
					}
					else if (prodID == 3)
					{
						for (int g=0;g<variantAmd_01.length;g++)
						{
							print((g+1) + ". " + variantAmd_01[g] + ", " + variantAmd_01Price[g] + " $");
						}
					}
					print("\nSelect Variant: ");
					int v= scan (); return v;
				}
				static int inputs(String msg)
				{
					print(msg);
					int x = scan();
					return x;
				}
				static int maths(int variation, int qty, int stock)
				{
					int total=0;
					if (stock == 1)
					{
						total = variantIntelPrice[variation]*qty;
					}
					else if(stock == 2)
					{
						total = variantAmd_00Price[variation]*qty;
					}
					else if (stock == 3)
					{
						total = variantAmd_01Price[variation]*qty;
					}
					return total;
				}
				static int invoice (int cash, int price)
				{
					int change = cash-price;
					return change;
				}
				static int scan ()
				{
					Scanner r32=new Scanner (System.in);
					return r32.nextInt();
				}
				static void print(String msg)
				{
					System.out.println(msg);
				}

}
