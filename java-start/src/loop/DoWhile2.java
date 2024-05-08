package loop;

public class DoWhile2 {
    public static void main(String[] args) {
        int i = 10;
        // do while 일단 실행하고 참이면 밑에 while 조건으로 내려감, 거짓이면 빠져나감
        do {
            System.out.println("현재 숫자는:" + i);
            i++;
        } while (i < 3);

    }
}
