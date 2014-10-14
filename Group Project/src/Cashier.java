import java.io.File;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Cashier

	{
	public static String name;
	public static int cost;
	private static int currentCents;
	public static int price;
	public static Scanner file;

	private Cashier(int pr)
		{
		pr = price;
		}

	public static void changeIn() throws FileNotFoundException
		{

			Scanner snacks = new Scanner(new File("snacks.txt"));
			String snack ="";
			int price = 0;
			int quantity = 0;

			//price = file.nextInt();
	
		System.out.println("Please enter amount of money in pennies. Ex. $1.00 = 100.");
		for (double i = price; i == 0; i = i - 1)
			{

			Scanner userinput = new Scanner(System.in);
			name = userinput.nextLine();

			System.out.println("You entered : \t" + name + " Coins");
			}
		}
	}