import java.lang.Object;
public class ProductManager
{
//A static string keeping track of the last itemCode used.
private static String nextItemCode = "A1";	
{
	// The itemCode managed by each object.
	String itemCode;
	// The Product this ProductManager is managing.
	Product product;
	// The number of said Products loaded into the Vending Machine.
	int quantity;
	}
}
