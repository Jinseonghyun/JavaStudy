package generic.animalHospital;

import generic.animal.Animal;

public class AnimalHospitalV1 {
	
	private Animal animal;


	public void setAnimal(Animal animal) {
		this.animal = animal;
	}
	
	public void checkup() {
		System.out.println("���� �̸�: " + animal.getName());
		System.out.println("���� ũ��: " + animal.getSize());
		animal.sound();
	}
	
	public Animal bigger(Animal target) {
		return animal.getSize() > target.getSize() ? animal : target;
	}
}
