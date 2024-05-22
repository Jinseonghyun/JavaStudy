package method9;

public class MethodEx2 {

    public static void main(String[] args) {

        printMessage("Hello, world", 3);
        printMessage("Hello, world", 5);
        printMessage("Hello, world", 7);
    }


    public static void printMessage(String str, int num) {
        for (int i = 0; i < num; i++) {
            System.out.println(str);
        }
    }
}
