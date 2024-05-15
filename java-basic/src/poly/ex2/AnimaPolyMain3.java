 package poly.ex2;

public class AnimaPolyMain3 {
    public static void main(String[] args) {
        // 세 타입의 부모가 Animal 클래스 이름을 바꾸어도 된다.
        Animal[] animalArr = {new Dog(), new Cat(), new Caw(), new Duck()};  // dog, cat, caw 각 변수 이름에 마우스 포인터 클릭하고 ctrl + alt + n 누르면 위에 선언 초기화랑 합쳐줌

        // 변하지 않는 부분
        for (Animal animal : animalArr) {
            souundAnimal(animal);
        }
    }
    // 변하지 않는 부분
    private static void souundAnimal(Animal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }

}
