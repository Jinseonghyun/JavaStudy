package scanner.ex;

    import java.util.Scanner;

public class ScannerWhileEx1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("이름을 입력하세요 (종료를 입력하면 종료): ");
            String name = input.nextLine(); // 진성현\n   라인통으로 가져감

            if (name.equals("종료")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            System.out.print("나이를 입력하세요: ");
            int age = input.nextInt(); // 10\n    10만 가져간다. 그래서 \n 만 남는다. 출력하고 나서 사용자입력에 남아있다. 그래서 다시 돌때 첫 name 빈 문자에 들어가게 됨
            input.nextLine(); // 위에서 \n 엔터만 남는 상황을 읽어서 버려주기 위해 밑에서 한번 찍어줌

            System.out.println("입력한 이름: " + name + ", 나이: " + age);
        }
    }
}
