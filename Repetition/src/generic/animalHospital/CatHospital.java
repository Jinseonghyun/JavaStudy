package generic.animalHospital;

import generic.animal.Cat;

public class CatHospital {
	
	private Cat animal;


	public void setAnimal(Cat animal) {
		this.animal = animal;
	}
	
	public void checkup() {
		System.out.println("���� �̸�: " + animal.getName());
		System.out.println("���� ũ��: " + animal.getSize());
		animal.sound();
	}
	
	public Cat bigger(Cat target) {
		return animal.getSize() > target.getSize() ? animal : target;
	}
}
