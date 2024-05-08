package casting;

public class Casting2 {
    public static void main(String[] args) {
        double doubleValue = 1.5;
        int intValue = 0;

        //intValue = doubleValue; // double -> int 컴파일 오류 발생 (큰 범위를 작은 타입의 범위로 바꿀려고 하면 에러)
        intValue = (int) doubleValue; // 명시적 형변환  (큰 범위에서 작은 타입 범위로 바꿀 때 명시적 형변환 직접 해주자)
        System.out.println(intValue);
        System.out.println("doubleValue = " + doubleValue); // 형변환을 해도 값이 변하는 게 아니라 intValue 에 맞게 읽는 값이 변해서 보이는거다.

        int z = (int) 10.5;
        System.out.println(z);
    }
}
