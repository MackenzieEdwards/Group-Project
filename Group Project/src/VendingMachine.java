import java.io.FileNotFoundException;
import java.util.Scanner;


public class VendingMachine
	{
	// A Cashier object for the Vending Machine.
	private Cashier cashier;
	// An InventoryManager object for the Vending Machine.
	private InventoryManager im;
	// A Scanner object to get keyboard input.
	private Scanner keypad;
	
	public static void main(String[] args) throws FileNotFoundException
		{
		Cashier.changeIn();
		InventoryManager.averagePojo();
		
		}

	}
