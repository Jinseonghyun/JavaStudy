package ppoly.ex1;

public class CreditCard implements Pay {

	@Override
	public boolean pay(int amount) {
		System.out.println("�ſ�ī��� �����մϴ�.");
		System.out.println(amount + "�� �����մϴ�");
		return true;
	}
	
	
}
