package ppoly.ex1;

public abstract class PayOption {

	public static Pay findPay(String option) {
		if (option.equals("신용카드")) {
			return new CreditCard();
		} else if (option.equals("계좌이체")) {
			return new PayPal();
		} else if (option.equals("비트코인")) {
			return new Bitcoin();
		} else {
			return new DefaultPay();
		}
		
	}
}
