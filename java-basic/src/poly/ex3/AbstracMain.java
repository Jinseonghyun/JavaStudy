package poly.ex3;

import poly.ex2.Animal;

public class AbstracMain {
    public static void main(String[] args) {
        //추상클래스 생성 불가
        //AbstractAnimal animal = new AbstractAnimal();

        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw Caw = new Caw();

        cat.sound();
        cat.move();

        souundAnimal(dog);
        souundAnimal(cat);
        souundAnimal(Caw);
    }

    private static void souundAnimal(AbstractAnimal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }
}
