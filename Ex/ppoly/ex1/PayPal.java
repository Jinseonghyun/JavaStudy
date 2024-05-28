package ppoly.ex1;

public class PayPal implements Pay {

	@Override
	public boolean pay(int amount) {
		System.out.println("계좌이체로 결제합니다.");
		System.out.println(amount + "원 결제합니다");
		return true;
	}
	
	
}
