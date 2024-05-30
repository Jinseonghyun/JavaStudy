package generic.Method;

import generic.animal.Cat;
import generic.animal.Dog;

public class MethodMain3 {

	public static void main(String[] args) {
		Dog dog = new Dog("∏€∏€¿Ã", 100);
		Cat cat = new Cat("≥ƒøÀ¿Ã", 100);
		
		ComplexBox<Dog> hospital = new ComplexBox<Dog>();
		hospital.set(dog);

		Cat returnCat = hospital.printAndReturn(cat);
		System.out.println("returnCat = " + returnCat);
		
	}

}
