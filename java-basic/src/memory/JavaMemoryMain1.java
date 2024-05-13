package memory;

public class JavaMemoryMain1 {
    public static void main(String[] args) {
        // 스택 구조  main 이 먼저 들어가지만 젤 나중에 나옴
        System.out.println("main start");
        method1(10);
        System.out.println("main end"); // ctrl + w 커서 전체영역 선택
    }

    static void method1(int m1) {
        System.out.println("method1 start");
        int cal = m1 * 2;
        method2(cal);
        System.out.println("method1 end"); // ctrl + w 커서 전체영역 선택
    }

    static void method2(int m2) {
        System.out.println("method2 start");
        System.out.println("method2 end"); // ctrl + w 커서 전체영역 선택
    }
}
