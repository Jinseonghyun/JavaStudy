package ppoly.ex1;

import java.util.Scanner;

public class PayMain1 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		PayService payService = new PayService();
		
		while (true) {
			System.out.println("[�ſ�ī��, ������ü, ��Ʈ����]");
			System.out.print("���� ������ �Է��ϼ���: ");
			String PayOption = scanner.nextLine();
			if (PayOption.equals("exit")) {
				System.out.println("���α׷��� �����մϴ�.");
				return;
			}
			System.out.print("���� �ݾ��� �Է��ϼ���: ");
			int amount = scanner.nextInt();
			scanner.nextLine();
			
			payService.proocessPay(PayOption, amount);
		}
	}
}
