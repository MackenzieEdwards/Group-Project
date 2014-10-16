import java.io.File;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Cashier

	{
	public static int paid;
	public static int cost;
	private static int currentCents;
	public static int price;
	public static Scanner file;

	public static void Cashier() throws FileNotFoundException
		{

//			Scanner snacks = new Scanner(new File("snacks.txt"));
//			int quantity = 0;

	
		System.out.println("Please enter amount of money in pennies. Ex. $1.00 = 100.");
			Scanner userinput = new Scanner(System.in);
			paid = userinput.nextInt();

			System.out.println("You entered : " + paid + " Coins");
			System.out.println("Please select your snack. ");
			System.out.println("Ex. If you would like Cheetos please enter A1 ect.");
			
			// Items are in A1 - A10

			
							
//		if(paid > cost)
//		{
//			int change = 0;
//			change = paid - cost;
//			System.out.println("You over paid. You recieve : " + change + " back" );
//			System.out.println();
//		}
		}

	}