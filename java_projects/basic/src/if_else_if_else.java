public class if_else_if_else {
  public static void main(String[] args) {
    // 코드는 순차적으로 위에서 부터 아래로 실행된다.

    // 제어문 (코드를 특정위치에서 제어하고 싶다.) [조건문, 반복문]
    // 조건문
    // 1. 조건문은 조건이 true인 경우에만 실행된다.
    // 2.
    int age = 30;
    if (age >= 10 && age < 20) { // 조건문은 조건식 true인 경우에 실행된다.
      System.out.println("10대 입니다.");
    } else if (age >= 20 && age < 30) {
      System.out.println("20대 입니다.");
    } else {
      System.out.println("정답 결과가 없습니다.");
    }
    System.out.println("===============문제================");
    // 문제 : 실행되는 출력문에는 참 그렇지 않으면 거짓 이라고 적어주세요.
    int a = 10;

    if (a == 10) {
      System.out.println("참1");
    }

    if (a != 10) {
      System.out.println("거짓1");
    }

    if (a > 10) {
      System.out.println("거짓2");
    }

    if (a >= 10) {
      System.out.println("참2");
    }

    int b = 10;

    if (a == b) {
      System.out.println("참3");
    }

    // boolean c => c 에는 오직 true/false 만 담을 수 있다.
    boolean c = a != b; // a 와 b 가 10 으로 같은데 같지 않다고 했기에 false 를 c에 대입

    if (c) {
      System.out.println("거짓3");
    }

    if (c == false) {
      System.out.println("참4");
    }

    if (!c) { // false 를 반전
      System.out.println("참5");
    }

    if (!(!c)) { // false 를 반전
      System.out.println("거짓4");
    }

    boolean d = true;

    if (c != d) { // c 는 false , d 는 true
      System.out.println("참6");
    }

    if (20 > 2 && 10 > 3 && true != false && 10 != 10) { // 앞에서부터 산술연산자 계산하고, 비교연산자 , 논리연산자 순서로 계산하면 된다.
      System.out.println("거짓5");
    }

    if (10 != 10 || 10 < 2) { // || 기준으로 양쪽이 모두 false
      System.out.println("거짓6");
    }

    System.out.println("===================문제====================");
    // 두 정수의 크기를 비교하여 왼쪽 수가 크면 left를 출력
    // 오른쪽 수가 크면 right 를 출력, 같으면 equal 을 출력해주세요.
    int left = 30;
    int right = 30;

    if (left > right) {
      System.out.println("left");
    }

    else if (left < right) {
      System.out.println("right");
    }

    else {
      System.out.println("equal");
    }

    System.out.println("===================문제2====================");
    // 문제 : 할인 대상인지 아닌지 출력해주세요.
    // 조건 : 나이가 19세 이하이거나 60세 이상이면 할인 대상입니다.
    // 조건 : 출력예시 처럼 출력되어야 합니다.
    // 조건 : `구현시작` 부분만 수정 할 수 있습니다.
    // 조건 : 4가지 이상의 방법으로 풀어야 합니다.
    // 조건 : 그 중 2가지 방법은 `&&, ||`없이 풀어야 합니다.
    /* 출력 예시
    int you_age = 20;

    System.out.println("당신의 나이는 " + you_age + "살 입니다.");*/
    // 구현시작
    int you_age = 40;
    if ( you_age <= 19 || you_age >= 60 ) {
      System.out.println("할인 대상입니다.");
    }
    if( you_age >= 20 ) {
      if ( you_age < 60 ) {
        System.out.println("할인 대상이 아닙니다.");
      }
    }
// =======================다른풀이==================================
    int you_age1 = 40;
    if ( you_age1 <= 19 || you_age1 >= 60 ) {
      System.out.println("할인 대상입니다.");
    }
    if( you_age1 >= 20 && you_age1 < 60 ) {
        System.out.println("할인 대상이 아닙니다.");
    }
// =======================다른풀이2==================================
    int you_age2 = 40;
    if ( you_age2 <= 19 || you_age2 >= 60 ) {
      System.out.println("할인 대상입니다.");
    }
    else {
      System.out.println("할인 대상이 아닙니다.");
    }
// =======================다른풀이3==================================
    // 양립할 수 없게 코드를 작성해줘야함!! > 마지막 줄 you_age3 < 60 를 if 문으로 따로 빼면 결과가 2개나옴 방지하기 위해 중첩 조건문
    int you_age3 = 10;
    if (you_age3 <= 19) {
      System.out.println("할인 대상입니다.");
    }
    if (you_age3 >= 60) {
      System.out.println("할인 대상이입니다.");
    }
    if (you_age3 >= 20) {
      if (you_age3 < 60) {
        System.out.println("할인 대상이 아닙니다.");
      }
    }
// =======================다른풀이4==================================
    int you_age4 = 10;
    if (you_age4 <= 19) {
      System.out.println("할인 대상입니다.");
    }
    else if (you_age4 >= 60) {
      System.out.println("할인 대상이입니다.");
    }
    else {
        System.out.println("할인 대상이 아닙니다.");
    }


  }
}
