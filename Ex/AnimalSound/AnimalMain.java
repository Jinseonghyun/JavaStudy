package AnimalSound;

public class AnimalMain {

	public static void main(String[] args) {
		
		Cat cat = new Cat();
		Dog dog = new Dog();
		Cow cow = new Cow();
		
		soundAnimal(cat);
		soundAnimal(dog);
		soundAnimal(cow);
		
		moveAnimal(cat);
		moveAnimal(dog);
		moveAnimal(cow);
	}

	private static void soundAnimal(Animal animal) {
		System.out.println("동물 소리 테스트 시작");
		animal.sound();
		System.out.println("동물 소리 테스트 종료");
	}
	
	private static void moveAnimal(Animal animal) {
		System.out.println("동물 이동 테스트 시작");
		animal.move();
		System.out.println("동물 이동 테스트 종료");
	}
	

}
