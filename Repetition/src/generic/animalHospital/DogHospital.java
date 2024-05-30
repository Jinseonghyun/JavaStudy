package generic.animalHospital;

import generic.animal.Dog;

public class DogHospital {
	
	private Dog animal;


	public void setAnimal(Dog animal) {
		this.animal = animal;
	}
	
	public void checkup() {
		System.out.println("���� �̸�: " + animal.getName());
		System.out.println("���� ũ��: " + animal.getSize());
		animal.sound();
	}
	
	public Dog bigger(Dog target) {
		return animal.getSize() > target.getSize() ? animal : target;
	}
}
