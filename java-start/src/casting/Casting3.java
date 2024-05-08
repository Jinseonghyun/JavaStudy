package casting;

public class Casting3 {
    public static void main(String[] args) {
        long maxIntValue = 2147483647; // int 최고값  (long 에 들어있지만 int 가 표현할 수 있는 최고의 값)
        long maxIntOver = 2147483648L; // int 최고값 + 1(초과) long 에 담기
        int intValue = 0;

        intValue = (int) maxIntValue; // 형 변환
        System.out.println("maxIntValue casting = " + intValue);

        intValue = (int) maxIntOver; // 형 변환
        System.out.println("maxIntOver casting = " + intValue);  // int 가 담을 수 있는 값보다 1초과 한 값 결과를 보면 - 가 붙는다.
    }                                                            // (int 의 제일 작은 범위 수 많이 커질수록 -숫자가 점점 커짐)
}
