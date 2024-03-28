public class array_sum_mean {
  public static void main(String[] args) {
    // 정수 배열 선언 및 초기화
    int[] numbers = new int[] {5, 10, 15, 20, 25};

    int sum = 0;

    /*
    for (int i = 0; i < numbers.length; i++) {
      sum += numbers[i];
    }

    System.out.printf("sum : %d\n", sum); // 배열의 합
    */

    // 향상된 for 문
    for (int i : numbers) {
      sum += i;
    }
    System.out.printf("sum : %d\n", sum);

    // 배열의 평균
    int avg = sum / numbers.length;
    System.out.println("avg : " + avg);  // 배열의 평균


  }
}