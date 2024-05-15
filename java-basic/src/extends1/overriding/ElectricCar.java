package extends1.overriding;

public class ElectricCar extends Car {

    @Override // 애노테이션   (오버라이드 했다는 표식 (정확히 변수이름이 같지 않거나 그런 상황에서 알려주기 위해))
    public void move() {
        System.out.println("전기차를 빠르게 이동합니다.");
    }

    public void charge() {
        System.out.println("충전합니다.");
    }
}
