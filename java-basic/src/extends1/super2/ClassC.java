package extends1.super2;

public class ClassC extends ClassB {

    public ClassC() {
        super(10,20); // 상속 받는 ClassB 가 매개변수가 존재((생성자를 정의해줌)=> 자바가 기본 생성자 안만든다.) 하기에 상속받는 ClassC 에서 직접 생성자 적어줘야함
        System.out.println("ClassC 생성자");
    }

}
