package ObjectEx;

public class RectangleProceduralMain {

	public static void main(String[] args) {
		Rectang rectang = new Rectang();
		rectang.width = 5;
		rectang.height = 8;
		
		int area = rectang.calculateArea();
		System.out.println("넓이: " + area);
		
		int perimeter = rectang.calculatePerimeter();
		System.out.println("둘레 길이: " + perimeter);
		
		boolean square = rectang.isSquare();
		System.out.println("정사각형 여부: " + square);

	}
}
