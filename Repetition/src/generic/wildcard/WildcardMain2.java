package generic.wildcard;

import generic.animal.Animal;
import generic.animal.Cat;
import generic.animal.Dog;

public class WildcardMain2 {

	public static void main(String[] args) {
		Box<Object> objBox = new Box<>();
		Box<Animal> animalBox = new Box<>();
		Box<Dog> dogBox = new Box<>();
		Box<Cat> catBox = new Box<>();
		
		//Animal ���� ���� Ÿ�� ���� ����
		writeBox(objBox);
		writeBox(animalBox);
		//writeBox(dogBox);  //  ������ Animal
		//writeBox(catBox);   //  ������ Animal
		
		Animal animal = animalBox.get();
		System.out.println("animal = " + animal);
	}
	
	static void writeBox(Box<? super Animal> box) {
		box.set(new Dog("�۸���", 100));
	}

}
