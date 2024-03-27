public class variable {
  public static void main(String[] args) {
    // int : Integer(정수)
  // int x; // 정수를 저장할 수 있는 x라는 변수를 선언(정의)
  // x = 5; // x라는 변수의 5라는 값을 넣겠다.
    int x = 5; // 변수 초기화
    System.out.println("x : " + x);

    // 변수는 중복선언이 불가능
    // 변수에는 오직 값을 하나 밖에 넣지 못한다.
    x = 10; // 변수 재활용
    System.out.println("x : " + x);

    // 대입연산자 기준 좌측 변수, 우측 값
    x = x + 20; // 변수 재활용
    System.out.println("x : " + x);
    System.out.println("==============문제1================");
    // 문제 : a와 b가 가지고 있는 값을 서로 뒤바꿔주세요.
    // 조건 : 수정 가능 지역에서 숫자와 사칙연산을 사용할 수 없습니다.
    int a = 5;
    int b = 10;

    // 수정 가능 시작
//    a = 10;  // 변수 재선언은 불가능 재활용은 가능
//    b = 5;                    // 재활용을 통해 값을 추출할 수 있지만 위의 문제 조건에 맞지 않다.

      int c = a;  //  c라는 값에 5를 준다.   기초 알고리즘 : (변수 swap)
      a = b;      // 숫자와 사친연산 안쓰고 값 바꾸어준다.  a 에서 10을 넣어준다.
      b = c;      // c가 아닌 a를 주게 되면 위에서 a에 b가 들어가기에 b의 값이기에 10이 나온다.
    // 수정 가능 끝

    System.out.println("a : "+ a);
    // a : 10
    System.out.println("b : "+ b);
    // b : 5

  }
}
