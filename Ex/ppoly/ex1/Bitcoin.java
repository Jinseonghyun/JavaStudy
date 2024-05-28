package ppoly.ex1;

public class Bitcoin implements Pay {

	@Override
	public boolean pay(int amount) {
		System.out.println("비트코인으로 결제합니다.");
		System.out.println(amount + "원 결제합니다");
		return true;
	}
	
	
}
