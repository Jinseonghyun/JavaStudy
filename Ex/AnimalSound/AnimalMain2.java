package AnimalSound;

public class AnimalMain2 {

	public static void main(String[] args) {
		
		Animal[] animals = {new Dog(), new Cat(), new Cow()};
		
		for (Animal animal : animals) {
			animal.sound();
			animal.move();
		}
	}
}
