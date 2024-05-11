package method;

public class Overloading3 {
    public static void main(String[] args) {
        System.out.println("1: " + add(1, 2));
        System.out.println("2: " + add(1.2, 1.5));
    }

//    public static int add(int a, int b) {        int 형 메서드를 주석처리해도 위에서 int 형 함수호출 부분에 작동이 된다 double에 int를 담을 수 있기 때문
//        System.out.println("1번 호출");
//        return a + b;
//    }

    public static double add(double a, double b) {
        System.out.println("2번 호출");
        return a + b;
    }
}
