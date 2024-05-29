package oop;

import java.util.Scanner;

public class RectangleProceduralMain2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Rectangle rectangle = new Rectangle();
		
		while (true) {
			System.out.print("���α׷��� �����Ϸ��� 'exit'�� �Է��ϼ���. ����Ϸ��� �ƹ� Ű�� ��������: ");
			String exit = scanner.nextLine();
			if (exit.equals("exit")) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}
			System.out.print("���� ���̸� �Է��ϼ���: ");
			int width = scanner.nextInt();
			
			System.out.print("���� ���̸� �Է��ϼ���: ");
			int height = scanner.nextInt();
			
			int area = rectangle.calculateArea(width, height);
			System.out.println("����: " + area);
			
			int perimeter = rectangle.calculatePerimeter(width, height);
			System.out.println("�ѷ� ����: " + perimeter);
			
			boolean square = rectangle.isSquare(width, height);
			System.out.println("���簢�� ����: " + square);
		}
		
		
	}

}
