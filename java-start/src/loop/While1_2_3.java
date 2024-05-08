package loop;

public class While1_2_3 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;
        int endNum = 3;

        // i=1, endNum = 3
        while (i <= endNum) { // i가 4가 될 때 거짓이기에 빠져나옴
            sum = sum + i;
            System.out.println("i=" + i + " sum=" + sum);
            i++;
        }
    }
}
