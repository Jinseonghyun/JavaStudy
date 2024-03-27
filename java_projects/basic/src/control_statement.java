public class control_statement {
  public static void main(String[] args) {
    // 제어문 (코드를 특정위치에서 제어하고 싶다.) [조건문, 반복문]

    // 증감연산자
    // i = i + 1; > i의 값을 1씩 증가시킨다.
    // i += 1;
    // i++;       (1만 가능 2이상 부터는 안된다.)
    // i = i + 2; > i의 값을 2씩 증가시킨다.
    // i += 2;

    // i = i -1; > i의 값을 1씩 감소시킨다.
    // i -= 1;
    // i--;       (1만 가능 2이상 부터는 안된다.)
    // i = i - 2; > i의 값을 2씩 감소시킨다.
    // i -= 2;

    // 후위, 전위 큰 의미는 동일하나 차이가 있다.
    //후위 증감연산
    // i++;  , i--;

    //전위 증감연산
    // ++i;  , --i;

    // 아래처럼 일일이 반복하면 효율이 떨어진다.
    System.out.println(1);
    System.out.println(2);
    System.out.println(3);
    System.out.println(4);
    System.out.println(5);
    System.out.println(6);
    System.out.println(7);
// -----------------------------반복문-------------------------------------
    int i = 1;
    System.out.println(i);
    i = i + 1;

    System.out.println(i);
    i = i + 1;

    System.out.println(i);
    i = i + 1;

    System.out.println(i);
    i = i + 1;

    System.out.println(i);
// --------------------------------증감연산자----------------------------------------------
    i += 1;  // i = i + 1 //  i++;  모두 같은 것이지만 i++;가 최종 진화본 (증감연산자)

    System.out.println(i);
    i = i -1;  // i -= 1; // i--;

    System.out.println(i);
    i--;

    System.out.println(i);
    i--;

    System.out.println(i);

    // 후위, 전위 큰 의미는 동일하나 차이가 있다.
    // 후위 증감연산 a 를 변수로써 먼저 사용하고 값이 증가하는데 사용
    int a = 5;
    System.out.println("a : " + a); // 5  먼저 a 변수로써 사용
    int b = a++;
    System.out.println("a : " + a); // 6    a값이 1 증가
    System.out.println("b : " + b); // 5    증감을 하기 전 a값 5를 b에 넣어준다.

    // 전위 증감연산
    int x = 5;
    System.out.println("x : " + x); // 5 먼저 a 변수로써 사용
    int y = ++x;  //
    System.out.println("x : " + x); // 6    a값이 1 증가
    System.out.println("y : " + y); // 6    증감을 마친 a 값을 b에 넣어줌

  }
}
