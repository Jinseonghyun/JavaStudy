package cond.ex;

public class EvenOddEX {
    public static void main(String[] args) {
        int x = 2;
        String result = (x % 2 == 0) ? "짝수" : "홀수";   // 2로 나눌 때 나머지가 없다.
        System.out.println("x = " + x + ", " + result);

    }
}
