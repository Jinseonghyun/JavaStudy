package start7;

import java.util.Scanner;

public class oddEven {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("하나의 정수를 입력해주세요 : ");
            int num = scanner.nextInt();

            if (num % 2 == 0) {
                System.out.println("입력한 숫자 " + num + "은 짝수입니다.");
            } else if (num % 2 == 1) {
                System.out.println("입력한 숫자 " + num + "은 홀수입니다.");
            } else {
                System.out.println("잘못된 입력방식입니다. 다시 입력해주세요.");
            }
        }
    }
}
