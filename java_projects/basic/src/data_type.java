public class data_type {
  public static void main(String[] args) {
    // 데이터 타입  (기본형, 참조형)
    // 숫자형(정수형, 실수형), 문장형, 문자형, 논리형

    // 존재하는 이유
    // 1.메모리를 효율적으로 사용하기 위해서
    // 2. 컴푸터가 데이터 타입에 따라 값을 처리하는 방식이 다르다

    // 기본형  (바이트)
    // 정수형 : byte(1), short(2), int(4), long(8)
    // 실수형 : float(4), double(8)
    // 문자형 : char(2) -> 유니코드 문자 저장 가능 (a,b,c,d)
    // 논리형 : boolean(1)

    // 참조형
    // 문장형 : String -> 객체


    // 숫자형(정수형, 실수형)

    System.out.println("==정수형 데이터 타입==");
    // 4가지 존재한다. byte, short, int, long
    byte by = -128; // 값의 범위 : -128 ~ 127
    System.out.println("byte : " + Byte.BYTES); // 해당 데이터 타입에 메모리 크기가 얼만지 보여줌 (1 바이트 -> 8비트) (2^8 을 적절하게 음수양수로 나눈 범위가 값 범위)
    System.out.println("by :" + by);

    short s = 32767; // 값의 범위 : -32768 ~ 32767
    System.out.println("short :" + Short.BYTES); // 2바이트 -> 16비트  (2^16 을 적절하게 음수양수로 나눈 범위가 값 범위)
    System.out.println("s :" + s);

    int i = 2147483647; // 값의 범위 : -2147483648 ~ 2147483647
    System.out.println("int : " + Integer.BYTES); // 4바이트 -> 32비트 (2^32 을 적절하게 음수양수로 나눈 범위가 값 범위)
    System.out.println("i :" + i);

    int a = 'A'; // 정수를 담는 int 지만 문자인 A 도 담을 수 있다 > 컴퓨터에서는 숫자로 읽기 때문 출력해보면 65가 나온다.
    System.out.println(a); // java 가 A를 65로 변환해서 넣어준다.

    long l = 9223372036854775807L; // (마지막에 L 붙혀줘야함) 값의 범위 -9223372036854775808 ~ 9223372036854775807
    System.out.println("long : " + Long.BYTES); // 8바이트 -> 64비트 (2^64 을 적절하게 음수양수로 나눈 범위가 값 범위)
    System.out.println("l :" + l);

    System.out.println("==실수형 데이터 타입==");
    // float, double
    float f = 3.141592653589793f; // 마지막에 f 붙혀줘야함   (소수점 7자리까지 케어)
    System.out.println("float : " + Float.BYTES); // 4바이트 -> 32비트  (데이터 타입이 다르기에 위처럼 범위가 있지 않다)
    System.out.println("f :" + f);

    double d = 3.141592653589793; // (소수점 15자리까지 케어)
    System.out.println("double : " + Double.BYTES); // 8바이트 -> 64비트  (데이터 타입이 다르기에 위처럼 범위가 있지 않다)
    System.out.println("d :" + d);

    System.out.println("==논리형 데이터 타입==");
    // true, false    (메모리 크기가 존재하지 않는다.)
    boolean bool1 = true;
    boolean bool2 = false;
    System.out.println("bool1 :" + bool1);
    System.out.println("bool2 :" + bool2);

    // 문장과 문자를 처리하는 방식이 다르다.
    System.out.println("==문자형 데이터 타입==");
    char c = 'H';
    System.out.println("char : " + Character.BYTES); // 2바이트 -> 16비트
    System.out.println("c :" + c);

    char c1 = 'A'; // 문자 입력 가능 '' 작은거!!
//    char c2 = '';  (아무것도 넣지 않은 빈 문자는 에러)
    char c2 = ' '; // 띄어쓰기도 문자 1개로 인식

    System.out.println("==문장(문자열)형 데이터 타입==");
    String str = "반갑습니다."; // 문자열 : 문자들로 이루어진 배열
    System.out.println("str :" + str);

    String str1 = ""; // 빈문자열 !! 문자열 char 과 다르게 빈 공간도 허용
    System.out.println("str1 :" + str1); // 참조형이기에 빈문자열이 가능하다.
  }
}
