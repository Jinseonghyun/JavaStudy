package loop;

public class Break1 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;

        while(true) {
            sum = sum + i;
            if (sum > 10) {  // sum 이 1부터 들어가서 바로 거짓이기에 아래 구문이 출력되는게 아니라 바로 i++ 로 이동함
                System.out.println("합이 10보다 크면 종료: i=" + i + " sum=" + sum);
                break;
            }
            i++;
        }
    }
}
