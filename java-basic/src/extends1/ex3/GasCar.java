package extends1.ex3;

public class GasCar extends Car {  // 자식은 부모를 알고 있다. GasCar --> Car
    public void fillUp() {
        System.out.println("기름을 주유합니다.");
    }
}
