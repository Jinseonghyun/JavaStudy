package poly.overriding;

public class Child extends Parent {
    public String value = "child";

    @Override  // ctrl + o 오버라이딩 단축키
    public void method() {
        System.out.println("Child.method");
    }
}
