package lang.string.immutable;

public class StringImumutable2 {

    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = str1.concat(" java"); // 불변객체 항상 반환값있다.
        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);
    }
}
