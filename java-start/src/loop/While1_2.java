package loop;

public class While1_2 {
    public static void main(String[] args) {
        int count = 0;

        while (count < 3) {  // 0 , 1, 2 가 다 3보다 작아서 3번 반복
            count = count + 1;
            System.out.println("현재 숫자는: " + count);
        }
    }
}
