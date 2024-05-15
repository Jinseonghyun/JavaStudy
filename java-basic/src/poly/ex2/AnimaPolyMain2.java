 package poly.ex2;

public class AnimaPolyMain2 {
    public static void main(String[] args) {
        Dog dog = new Dog(); // 세 타입의 부모가 Animal 클래스 이름을 바꾸어도 된다.
        Cat cat = new Cat();
        Caw caw = new Caw();
        Duck duck = new Duck();
        Animal[] animalArr = {dog, cat, caw, duck};

        // 변하지 않는 부분
        for (Animal animal : animalArr) {
            System.out.println("동물 소리 테스트 시작");
            animal.sound();
            System.out.println("동물 소리 테스트 종료");
        }
    }

}
