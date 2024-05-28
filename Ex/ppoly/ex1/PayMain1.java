package ppoly.ex1;

import java.util.Scanner;

public class PayMain1 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		PayService payService = new PayService();
		
		while (true) {
			System.out.println("[신용카드, 계좌이체, 비트코인]");
			System.out.print("결제 수단을 입력하세요: ");
			String PayOption = scanner.nextLine();
			if (PayOption.equals("exit")) {
				System.out.println("프로그램을 종료합니다.");
				return;
			}
			System.out.print("결제 금액을 입력하세요: ");
			int amount = scanner.nextInt();
			scanner.nextLine();
			
			payService.proocessPay(PayOption, amount);
		}
	}
}
