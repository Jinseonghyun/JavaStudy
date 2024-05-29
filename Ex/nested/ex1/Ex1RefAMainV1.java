package nested.ex1;

import java.util.Random;

public class Ex1RefAMainV1 {

	public static void hello(Process process) {
		System.out.println("���α׷� ����");
		process.run();
		System.out.println("���α׷� ����");
	}
	
	static class Dice implements Process {

		@Override
		public void run() {
			int randomValue = new Random().nextInt(6) + 1;
			System.out.println("�ֻ��� = " + randomValue);
		}
		
	}
	
	static class Sum implements Process {

		@Override
		public void run() {
			for (int i = 1; i <= 3; i++) {
				System.out.println("i = " + i);
			}
		}
		
	}
	
	public static void main(String[] args) {
		Process dice = new Dice();
		Process sum = new Sum();
		
		System.out.println("Hello ����");
		hello(dice);
		hello(sum);

	}

}
