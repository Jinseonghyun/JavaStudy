public class switch_ {
  public static void main(String[] args) {
    // switch , break 세트
    int month = 3;
    String season = "";  // 변수 초기화가 필요하다.

    switch (month) {
      case 1:
        season = "겨울";
        break;
      case 2:
        season = "겨울";
        break;
      case 3:
        season = "봄";
        break;
      case 4:
        season = "봄";
        break;
      case 5:
        season = "봄";
        break;
      case 6:
        season = "여름";
        break;
      case 7:
        season = "여름";
        break;
      case 8:
        season = "여름";
        break;
      case 9:
        season = "가을";
        break;
      case 10:
        season = "가을";
        break;
      case 11:
        season = "가을";
        break;
      case 12:
        season = "겨울";
        break;
    }
    System.out.println(season);
// ========================switch case 활용===============================
    int month1 = 7;
    String season1 = "";  // 변수 초기화가 필요하다.

    switch (month1) {
      case 1:
      case 2:
        season1 = "겨울";
        break;
      case 3:
      case 4:
      case 5:
        season1 = "봄";
        break;
      case 6:
      case 7:
      case 8:
        season1 = "여름";
        break;
      case 9:
      case 10:
      case 11:
        season1 = "가을";
        break;
      default:
        season1 = "겨울";
        break;
    }
    System.out.println(season1);
// ========================switch case 활용 위에 줄을 줄여보기===============================
    // 자바 14버전 이후에 등장한 switch
    int month2 = 11;
    String season2 = switch ( month2 ) {
      case 3, 4, 5 -> "봄";
      case 6, 7, 8 -> "여름";
      case 9, 10, 11 -> "가을";
      default -> "겨울";
    };
    System.out.println(season2);
// ========================switch case 활용 위에 줄을 바로 println===============================
    // 자바 14버전 이후에 등장한 switch
    // System.out.println 으로 묶어서 바로 사용
    int month3 = 3;
    System.out.println(switch ( month3 ) {
      case 3, 4, 5 -> "봄";
      case 6, 7, 8 -> "여름";
      case 9, 10, 11 -> "가을";
      default -> "겨울";
    });
// ========================switch case 활용 위에 줄을 상세하게 case===============================
    int month4 = 7;
    String season3 = switch ( month4 ) {
      case 3, 4, 5 -> "봄";
      case 6, 7, 8 -> {
        String a = "여름";
        String rs = month4 + "월";
        yield  rs; // yield 는 break 효과 빠져나온다.
      }
      case 9, 10, 11 -> "가을";
      default -> "겨울";
    };

    System.out.println(season3);
  }
}
