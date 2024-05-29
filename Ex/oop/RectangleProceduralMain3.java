package oop;

import java.util.Scanner;

public class RectangleProceduralMain3 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
        Rectangle rectangle = new Rectangle();
        
        while (true) {
            System.out.print("프로그램을 종료하려면 'exit'을 입력하세요. 계속하려면 아무 키나 누르세요: ");
            String exit = scanner.nextLine();
            if (exit.equalsIgnoreCase("exit")) {
                System.out.println("프로그램을 종료합니다.");
                break; // return 대신 break를 사용하여 루프를 종료합니다.
            }

            System.out.print("가로 길이를 입력하세요: ");
            int width = Integer.parseInt(scanner.nextLine());
            
            System.out.print("세로 길이를 입력하세요: ");
            int height = Integer.parseInt(scanner.nextLine());
            
            int area = rectangle.calculateArea(width, height);
            System.out.println("넓이: " + area);
            
            int perimeter = rectangle.calculatePerimeter(width, height);
            System.out.println("둘레 길이: " + perimeter);
            
            boolean square = rectangle.isSquare(width, height);
            System.out.println("정사각형 여부: " + square);
        }

        scanner.close(); // Scanner를 닫습니다.
    }
}