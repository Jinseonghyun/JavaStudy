package Pay;

public class PayService {
	
	public void processPay(String option, int amount) {
		System.out.println("������ �����մϴ�: option=" + option + ", amount=" + amount);
		
		Pay pay = PayOption.findPay(option);
		boolean result = pay.pay(amount);
		
		if (result) { 
			System.out.println("������ �����߽��ϴ�.");
		} else {
			System.out.println("������ �����߽��ϴ�.");
		}
	}
}
