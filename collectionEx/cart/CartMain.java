package collectionEx.cart;

public class CartMain {

	public static void main(String[] args) {
		Cart cart = new Cart();
		cart.add(new Product("���", 1000), 1);
		cart.add(new Product("�ٳ���", 500), 1);
		cart.printAll();
		
		cart.add(new Product("���", 1000), 2);
		cart.printAll();
		
		cart.minus(new Product("���", 1000), 3);
		cart.printAll();
		
	}

}
