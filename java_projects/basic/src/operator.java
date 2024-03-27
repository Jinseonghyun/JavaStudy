public class operator {
  public static void main(String[] args) {
    // 연산자 : 사칙(산술)연산자, 비교연산자, 논리연산자
    // 사칙연산자 : +, -, *, /(나눈 몫), %(나눈 나머지)
    // 정수와 정수 연산은 그 결과가 정수다.
    // 정수와 실수 연산은 그 결과가 실수다.

    // 비교연산자 : true, false ==> 결과값
    // >=(이상), >(초과), <=(이하), <(미만), ==(같다), !=(같지 않다.)   (무조건 꺽세(<,>) 가 앞)

    // 논리연산자 : &&(and 연산자), ||(or 연산자), !(not 연산자)
    // && : 양쪽의 비교한 결과 값이 둘다 true인 경우에 결과 값이 true이다.
    // && : 양쪽의 비교한 결과 값 중 하나라도 false인 경우에 결과 값이 false이다.
    // || : 양쪽의 비교한 결과 값이 둘다 false인 경우에 결과 값이 false이다.
    // || : 양쪽의 비교한 결과 값 중 하나라도 true인 경우에 결과 값이 true이다.
    // ! :  부정을 의미한다.

    // 연산자 우선순위
    // 사칙연산자 > 비교연산자 > 논리연산자

    System.out.println(10 + 20);
    System.out.println(30 - 15);
    System.out.println(3 * 3);
    System.out.println(10 / 3); // 출력 : 3 (정수와 정수 연산은 그 결과가 정수다.)
    System.out.println(10 / 3.0); // 출력 : 3.333333 (정수와 실수 연산은 그 결과가 실수다.)
    System.out.println(10 % 3); // 출력 : 1

    System.out.println("===========비교연산자===========");
    System.out.println(10 >= 5);
    System.out.println(10 > 5);
    System.out.println(7 <= 5);
    System.out.println(7 < 5);
    System.out.println(10 == 5);
    System.out.println(10 != 10);

    System.out.println("===========비교연산자===========");
    System.out.println(10 > 5 && 1 == 1);  // 양쪽다 참
    System.out.println(10 < 5 && 1 == 1);  // 한쪽이 거짓
    System.out.println(5 != 5 || 3 < 1);  // 양쪽다 거짓
    System.out.println(5 == 5 || 3 < 1);  // 한쪽이라도 참이 존재

    System.out.println(true);
    System.out.println(!true);  // ! 로 true 부정
    System.out.println(!false); // ! 로 false 부정
    System.out.println(!(!true));  // !로 true 를 부정하여 false 가 되고 다시 false를 부정해서 true

    System.out.println(10 + 20 * 5 > 10 && 10 <= 5 + 3); // 사칙연산 계산 110 > 10 (true) && 10 <= 8 (false)  => false
  }
}
