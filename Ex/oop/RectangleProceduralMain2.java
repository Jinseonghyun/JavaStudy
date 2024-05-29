package oop;

import java.util.Scanner;

public class RectangleProceduralMain2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Rectangle rectangle = new Rectangle();
		
		while (true) {
			System.out.print("프로그램을 종료하려면 'exit'을 입력하세요. 계속하려면 아무 키나 누르세요: ");
			String exit = scanner.nextLine();
			if (exit.equals("exit")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			System.out.print("가로 길이를 입력하세요: ");
			int width = scanner.nextInt();
			
			System.out.print("세로 길이를 입력하세요: ");
			int height = scanner.nextInt();
			
			int area = rectangle.calculateArea(width, height);
			System.out.println("넓이: " + area);
			
			int perimeter = rectangle.calculatePerimeter(width, height);
			System.out.println("둘레 길이: " + perimeter);
			
			boolean square = rectangle.isSquare(width, height);
			System.out.println("정사각형 여부: " + square);
		}
		
		
	}

}
