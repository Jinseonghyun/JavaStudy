package Access;

public class Item {
	private String name;
	private int price;
	private int quantity;
	
	public Item(String name, int proce, int quantity) {
		this.name = name;
		this.price = proce;
		this.quantity = quantity;
	}
	
	public String getName() {
		return name;
	}
	
	public int getTotalPrice() {
		return price * quantity;
	}
}
