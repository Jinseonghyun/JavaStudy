package method9;

public class MethodEx1 {

    public static void main(String[] args) {
        averge(1,2,3);
        averge(15,25,35);
    }

    public static double averge(int a, int b, int c) {
        int sum = a + b + c;
        double average = (double) sum / 3;
        System.out.println("평균값: " + average);
        return average;
    }
}
