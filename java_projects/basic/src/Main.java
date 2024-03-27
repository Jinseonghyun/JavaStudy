public class Main {
  public static void main(String[] args) {
    // 대표적인 타입 : 문자형, 숫자형
    System.out.println('안'); // '' : 문자
    System.out.println("Hello world!"); // "" : 문장

    System.out.println("==문장 더하기 문장==");  // sout 탭 치면 자동완성해줌
    System.out.println("안" + "녕"); // 안녕

    System.out.println(123); // 숫자
    System.out.println("123"); // 문장

    System.out.println("==문장 더하기 숫자==");
    System.out.println("안" + 10);  // 안10
    System.out.println("안" + "10");  // "안10"

    System.out.println("==문장 더하기 숫자 더하기 숫자==");
    System.out.println("안" + 10 + 20);  // 안1020

    System.out.println("==문장 더하기 소괄호 안에 숫자 더하기 숫자==");
    System.out.println("안" + (10 + 20)); // 안30

    System.out.println("==문장 더하기 숫자 곱하기 숫자==");
    System.out.println("안" + 10 * 20);
  }
}