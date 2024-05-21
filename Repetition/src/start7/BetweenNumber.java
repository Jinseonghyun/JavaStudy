package start7;

import java.util.Scanner;

public class BetweenNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("첫 번째 숫자를 입력하세요: ");
        int num1 = scanner.nextInt();

        System.out.print("두 번째 숫자를 입력하세요: ");
        int num2 = scanner.nextInt();

        if (num1 > num2) {
            System.out.println(" 첫 번째 입력한 숫자가 큼으로 두번째 수와 교환합니다.");
            int temp;
            temp = num1;
            num1 = num2;
            num2 = temp;
        }

        System.out.print("두 숫자 사이의 모든 정수: ");
        for (int i = num1; i<= num2; i++) {
            System.out.print(i);
            if (i != num2 ) {
                System.out.print(",");
            }
        }

    }
}
