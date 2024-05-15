package extends1.ex3;

public class Car {  // 부모에는 자식에 대한 정보가 없기에 누가 상속받는지 자식정보 모른다  , 자식이 누군지도 몰느다

    public void move() {
        System.out.println("차를 이동합니다.");
    }

    //추가
    public void openDoor() {
            System.out.println("문을 엽니다.");
    }
}
