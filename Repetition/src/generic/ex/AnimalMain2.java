package generic.ex;

import generic.animal.Animal;
import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalMain2 {

	public static void main(String[] args) {
		Animal animal = new Animal("����", 0);
		Dog dog = new Dog("�۸���", 100);
		Cat cat = new Cat("�Ŀ���", 50);
		
		Box<Animal> animalBox = new Box<>();
		animalBox.setValue(animal);
		animalBox.setValue(dog); // Animal = Dog
		animalBox.setValue(cat);
		Animal findAnimal = animalBox.getValue();
		System.out.println("findAnimal = " + findAnimal);

	}

}
