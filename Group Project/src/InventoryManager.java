import java.util.ArrayList;

public class InventoryManager {

	private String snackName;
	private int costInCents;
	private int quantity;

	public InventoryManager(String na, int c, int q) {
		snackName = na;
		costInCents = c;
		quantity = q;
	}

	public String getSnackName() {
		return snackName;
	}

	public int getCostInCents() {
		return costInCents;
	}

	public int getQuantity() {
		return quantity;
	}

	public static void main(String[] args) {
		
	
	}
	
//	public static void averagePojo()
//	{
//		ArrayList<InventoryManager> inventory = new ArrayList<InventoryManager>();
//		
//		inventory.add(new InventoryManager("Cheetos", 75, 10));
//		inventory.add(new InventoryManager("Goldfish", 75, 10));
//		inventory.add(new InventoryManager("Pretzels", 50, 7));
//		inventory.add(new InventoryManager("Jolly Ranchers", 60, 4));
//		inventory.add(new InventoryManager("Oatmeal Cookie", 100, 12));
//		inventory.add(new InventoryManager("Snickers", 50, 8));
//		inventory.add(new InventoryManager("Stride Gum", 65, 3));
//		inventory.add(new InventoryManager("Beef Jerky", 140, 1));
//		inventory.add(new InventoryManager("Chex Mix", 70, 1));
//		inventory.add(new InventoryManager("Popcorn", 35, 6));
//		
//		System.out.println("Here are your options: ");
//		System.out.println();
//		
//		for(int i = 0; i < inventory.size(); i++)
//			{
//			System.out.println(inventory.get(i).getName() + " cost " + inventory.get(i).getCost() + " coins.");
//			}
	}

//}