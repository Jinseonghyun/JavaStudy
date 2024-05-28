package ppoly.ex1;

public class CreditCard implements Pay {

	@Override
	public boolean pay(int amount) {
		System.out.println("신용카드로 결제합니다.");
		System.out.println(amount + "원 결제합니다");
		return true;
	}
	
	
}
