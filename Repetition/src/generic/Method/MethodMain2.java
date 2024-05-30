package generic.Method;

import generic.animal.Cat;
import generic.animal.Dog;

public class MethodMain2 {

	public static void main(String[] args) {
		Dog dog = new Dog("港港捞", 100);
		Cat cat = new Cat("衬克捞", 100);

		AnimalMethod.checkup(dog);
		AnimalMethod.checkup(cat);
		
		Dog targetDog = new Dog("奴 港港捞", 200);
		Dog bigger = AnimalMethod.getBigger(dog, targetDog);
		System.out.println("bigger = " + bigger);
	}

}
