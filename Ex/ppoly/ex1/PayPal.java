package ppoly.ex1;

public class PayPal implements Pay {

	@Override
	public boolean pay(int amount) {
		System.out.println("������ü�� �����մϴ�.");
		System.out.println(amount + "�� �����մϴ�");
		return true;
	}
	
	
}
