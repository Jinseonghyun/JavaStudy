public class for_ {
  public static void main(String[] args) {
    // while, for
    // for 문

    for (int i = 1; i <= 10; i++) {    // 초기값 ; 조건 ; 증감
      System.out.println(i);
    }
    // 위의 코드와 동일 중괄호 안에 코드가 한줄인 경우에 중괄호 생략 가능
    // for (int i = 1; i <= 10; i++) System.out.println(i);

//---------------------------------------------단 만들어보기-----------------------------------------------------
    int dan = 9;
    for (int w = 1; w <= 9; w++) { // 초기값 ; 조건 ; 증감
      System.out.printf("%d * %d = %d\n", dan, w, dan * w);

      String gugudan = String.format("%d * %d = %d", dan, w, dan * w);
      System.out.printf("[%s]", gugudan);
    }

  }
}
