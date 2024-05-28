package ppoly.ex1;

public abstract class PayOption {

	public static Pay findPay(String option) {
		if (option.equals("�ſ�ī��")) {
			return new CreditCard();
		} else if (option.equals("������ü")) {
			return new PayPal();
		} else if (option.equals("��Ʈ����")) {
			return new Bitcoin();
		} else {
			return new DefaultPay();
		}
		
	}
}
