import java.lang.Object;

public class ProductManager
	{
	// A static string keeping track of the last itemCode used.
	private static String nextItemCode = "A1";
		{
		//check to see if the item code is correct/valid
		//check to see if item is in inventory
			//if not in inventory have it return the users money or purchase another item
			//if yes then check to see if user has put in enough money to purchase item 
						//if enought money ask what item they would like to buy
							//System.out.println("Please chose which item you would like to purchase.");
							//give product and create change
							//System.out.println("Here is your item");
						//if NOT enough money ask to put in more or return money back
		
		// The itemCode managed by each object.
		String itemCode;
		// The Product this ProductManager is managing.
		Product product;
		// The number of said Products loaded into the Vending Machine.
		int quantity;
		}
	}
