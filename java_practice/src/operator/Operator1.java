package operator;

public class Operator1 {
    public static void main(String[] args) {
        // 변수 초기화
        int a = 5;
        int b = 2;
        
        // 덧셈
        int sum = a + b;
        System.out.println("a + b = " + sum); // 출력 a + b = 7

        // 뺄셈
        int diff = a - b;
        System.out.println("a - b = " + diff);

        // 곱셈
        int multi = a * b;
        System.out.println("a * b = " + multi);

        // 나눗셈
        int div = a / b;  // int 형으로 계산 헀기에 int 형인 정수만 나옴 2.5 > 2 (int 형 끼리의 계산) 몫
        System.out.println("a / b = " + div);

        // 나머지
        int mod = a % b; // 나머지를 출력
        System.out.println("a % b = " + mod);

//        int z = 10 / 0;  자바에서 0으로 나눌 수 없다.
    }
}
