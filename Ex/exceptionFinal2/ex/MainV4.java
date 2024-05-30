package exceptionFinal2.ex;

import java.util.Scanner;

import exceptionFinal2.SendExceptionV4;

public class MainV4 {

	public static void main(String[] args) {
		
		NetworkServiceV4 networkService = new NetworkServiceV4();
		
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("������ ����: ");
			String input = scanner.nextLine();
			if (input.equals("exit")) {
				break;
			}
			
			try {
				networkService.sendMessage(input);
			} catch (Exception e) {
				exceptionHandler(e);
			}
			System.out.println();
		}
		System.out.println("���α׷��� ���� �����մϴ�.");
	}
	
	//���� ���� ó��
	private static void exceptionHandler(Exception e) {
		//����ó��
		System.out.println("����� �޽���: �˼��մϴ�. �� �� ���� ������ �߻��߽��ϴ�.");
		System.out.println("==�����ڿ� ����� �޽���==");
		e.printStackTrace(System.out); // ���� Ʈ���̽� ���
		//e.printStackTrace(); // ������ ��ȣ (Ȯ���� ����)System.err�� ���� Ʈ���̽� ���
		
		//�ʿ��ϸ� ���� ���� ������ �߰� ó�� ���
		if (e instanceof SendExceptionV4) {
			SendExceptionV4 sendEx = (SendExceptionV4) e;
			System.out.println("[���� ����] ���� ������: " + sendEx.getSendData());
		}
	}
}
