package casting;

public class Casting1 {
    public static void main(String[] args) {
        int intValue = 10;
        long longValue;
        double doubleValue;

        //타입은 작은 범위에서 큰 범위에는 담을 수 있다.  (보통 같은 타입에 담는다 )
        // 자바가 작은 것에서 큰 걸로 바꿀 때 형변환을 자동으로 해준다.
        longValue = intValue; // int -> long
        System.out.println("longValue = " + longValue);

        doubleValue = intValue; // int -> doubleValue
        System.out.println("doubleValue = " + doubleValue);

        doubleValue = 20L; // long -> double
        System.out.println("doubleValue = " + doubleValue);
    }
}
