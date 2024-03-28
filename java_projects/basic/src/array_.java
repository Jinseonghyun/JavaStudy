public class array_ {
  public static void main(String[] args) {
    // 객체
    // class 같은 분류를 묶을 수 있다.

    // 메모리 구조
    // 램안에 stack 과 heap이 있다.
    // arr 은 stack 공간에 만들어 지고
    // new 로 만든 객체는 heap 공간에 만들어짐
    // arr은 stack에 있지만 heap 공간에 만들어진 객체(object)의 주소값을 바라보고 참조한다. (arr 은 참조변수(레퍼런스변수))
    // 변수에 객체가 들어갈 수 없다. !! 변수에 주소값이 들어간다
    // 객체가 new 로 한번 지정하면 수정 불가능 ex) 객체의 크기가 3개인데 데이터 4개이상 만들면 없다고 한다.

    // 배열 객체
    // 3이라는 3칸짜리 객체가 heap에 만들어진것, 개를 조정할 수 있는 복사본 arr
    // 리모컨 복사본 1개 = 객체 자기 자신을 조정할 수 있는 리모컨       (총 아래식은 리모컨 2개)
    // 위에는 빈 객체를 만들고 그 이후에 데이터를 집어 넣음

    int[] arr = new int[3];  //  int[] 숫자들로 생각하면 되지만 arr 은 숫자를 조정할 변수 (변수는 들이 아니다 변수에는 1개밖에 못넣음)
    arr[0] = 10;
    arr[1] = 20;
    arr[2] = 30;

    // int 는 4바이트인데 heap공간안에 4바이트 짜리 3개가 생기고 그 각 공간에 10, 20, 30 을 집어 넣었다.

    int[] arr2 = arr;
    arr[0] = 50;   // 리모컨으로 채널 바꾸기가 가능하다  아래에서 값 수정가능
    // 해당 arr 리모컨을 복사해서 arr2 에게 복사본을 준다. 객체를 준게 아님!!
    // new 로 해서 만든 티비는 1대인데 arr이라는 리모컨 말고도 arr2 라는 리모컨이 복사해서 2개가 된것
    System.out.println(arr2[0]);
    System.out.println(arr2[1]);
    System.out.println(arr2[2]);

    System.out.println(arr); // 객체의 주소값이 나온다. arr은 객체가 아닌 주소값을 참조하고 있기 때문

    // 위에서 작성한 객체의 결과와 같다.
    // 다만 이렇게 하면 객체를 만들 때 이미 10, 20, 30 값이 채워져 있는 상태에서 객체가 만들어짐
    // 위에는 빈 객체를 만들고 그 이후에 데이터를 집어 넣음
    int[] arr3 = new int[] {10, 20, 30};

    System.out.println(arr3[0]);
    System.out.println(arr3[1]);
    System.out.println(arr3[2]);

//---------------------------------------------------------다양한 버전의 배열 객체--------------------------------------------------------------
    System.out.println("========================================다양한 버전의 배열 객체=======================================");
  /*
  데이터 타입 배열
  arr4 [true, false, flase] 논리형
  arr5 ['a', 'b', 'c'] 문자형
  arr6 [3.14, 5.12, 4.0] 실수형
  arr7 [1, 2, 3, ..., 10] 정수형형
   */
    // 논리형
    boolean[] arr4 = new boolean[3];  //  객체 하나만들고 데이터 값 3개 arr1이 boolean주소값 참조
    arr4[0] = true;
    arr4[1] = false;
    arr4[2] = false;

    System.out.println(arr4[0]);
    System.out.println(arr4[1]);
    System.out.println(arr4[2]);

    arr4 = new boolean[10]; // 또 다른 boolean 폴더가 생겨 arr1 에 리모컨으로 들어감 (기존의 arr1 의 변수는 변수 재활용 법칙에 의해 날라감)
    System.out.println(arr4.length);  // 배열의 길이를 알아보는 법
    System.out.println(arr4);  // arr4 참조한 주소

    // 문자형
    // char[] arr5 = new int[] {'a', 'b', 'c'};     (아래와 같은 것   (바로 데이터 넣어서 만듬))
    char[] arr5 = new char[3]; // 문자3개를 담을 수 있는 1개가 만들어 지는거
    arr5[0] = 'a';
    arr5[1] = 'b';
    arr5[2] = 'c';

    System.out.println(arr5[0]);
    System.out.println(arr5[1]);
    System.out.println(arr5[2]);
    System.out.println(arr5);  // char 는 다른 것과 다르게 주소 값이 나오는게 아니라 문자열을 출력

    // 실수형
    double[] arr6 = new double[] {3.14, 5.12, 4.0};
    System.out.println(arr6[0]);
    System.out.println(arr6[1]);
    System.out.println(arr6[2]);

    // 위에서 하나하나 결과 보기 효율이 떨어진다. 반복문 활용하자
    for (int i = 0; i < 3; i++) {
      System.out.println(arr6[i]);
    }

    // 정수형
    // 객체를 만들 때 부터 반복문을 활용해 효율적으로
    int[] arr7 = new int[10];
    for (int i = 0; i < arr7.length; i++) {
      arr7[i] = i + 1;
    }

    for (int i = 0; i < arr7.length; i++) {
      System.out.println(arr7[i]);
    }

    // 향상 된  for 문 버전 (배열과 관련되서 편하다!!! 중괄호안에 한줄이기에 중괄호 생략도 가능)  역순출력은 안됨!!
    for (int i : arr7) {     // i 에 0 ~ 9번째 index 값까지 담아서 아래에서 출력
      System.out.println(i);
    }
    // for (int i : arr7) System.out.println(i);   위랑 같다 중괄호 생략한 버전

    // 역순 출력
    int lastIdx = arr7.length - 1; // 배열의 마지막 index
    for (int i = lastIdx; i >= 0; i--) {
      System.out.println(arr7[i]);
    }


  }
}
