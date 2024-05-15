package extends1.super2;

public class ClassB extends ClassA {

    public ClassB(int a) {       // 상속받는 ClassA 가 매개변수 없는 기본 생성자 이기에 여기서 생략가능하다
        this(a, 0); //기본 생성자 생략 가능                      // this 는 나의 생성자가 여러개 있을 때 다른 생성자 호출해줘 언젠가는 super 실행해야함
        System.out.println("ClassB 생성자 a=" + a);
    }

    public ClassB(int a, int b) {
        super(); // 기본 생성자 생략 가능
        System.out.println("ClassB 생성자 a=" + a + " b=" + b);
    }
}
