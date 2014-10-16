import java.lang.Object;
import java.util.ArrayList;

public class Product
	{
	public static void averagePojo()
		{
		ArrayList<InventoryManager> inventory = new ArrayList<InventoryManager>();

		inventory.add(new InventoryManager("Cheetos", 75, 10));
		inventory.add(new InventoryManager("Goldfish", 75, 10));
		inventory.add(new InventoryManager("Pretzels", 50, 7));
		inventory.add(new InventoryManager("Jolly Ranchers", 60, 4));
		inventory.add(new InventoryManager("Oatmeal Cookie", 100, 12));
		inventory.add(new InventoryManager("Snickers", 50, 8));
		inventory.add(new InventoryManager("Stride Gum", 65, 3));
		inventory.add(new InventoryManager("Beef Jerky", 140, 1));
		inventory.add(new InventoryManager("Chex Mix", 70, 1));
		inventory.add(new InventoryManager("Popcorn", 35, 6));

		System.out.println("Here are your options: ");
		System.out.println();

		for (int i = 0; i < inventory.size(); i++)
			{
			System.out.println(inventory.get(i).getSnackName() + " cost "
					+ inventory.get(i).getCostInCents() + " coins.");
			}
		}
	}
