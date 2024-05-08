package scope;

public class Scope3_1 {
    public static void main(String[] args) {
        int m = 10;
        int temp = 0;

        if (m > 0) {       //  temp 를 if 문 안에서만 사용하는데 main 에 사용해서 메모리가 비효율적
            temp = m * 2;
            System.out.println("temp = " + temp);
        }
        System.out.println("m = " + m);
    }
}
