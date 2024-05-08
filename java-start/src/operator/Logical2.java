package operator;

public class Logical2 {
    public static void main(String[] args) {
        int a = 15;
        // a는 10보다 크고 20 보다 작다.
//        boolean result = a > 10 && a < 20; // (a > 10) && (a < 20)   아래 코드와 같다 하지만 읽기 좋음
        boolean result = 10 < a && a < 20; // (a > 10) && (a < 20)
        System.out.println("result = " + result);
    }
}
