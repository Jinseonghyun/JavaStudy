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
		System.out.println("���� �Ҹ� �׽�Ʈ ����");
		animal.sound();
		System.out.println("���� �Ҹ� �׽�Ʈ ����");
	}
	
	private static void moveAnimal(Animal animal) {
		System.out.println("���� �̵� �׽�Ʈ ����");
		animal.move();
		System.out.println("���� �̵� �׽�Ʈ ����");
	}
	

}
