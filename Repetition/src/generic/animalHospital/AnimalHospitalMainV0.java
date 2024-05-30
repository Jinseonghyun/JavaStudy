package generic.animalHospital;

import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalHospitalMainV0 {

	public static void main(String[] args) {
		DogHospital dogHospital = new DogHospital();
		CatHospital catHospital = new CatHospital();
		
		Dog dog = new Dog("�۸���1", 100);
		Cat cat = new Cat("�Ŀ���1", 300);
		
		//�� ����
		dogHospital.setAnimal(dog);
		dogHospital.checkup();
		
		//����� ����
		catHospital.setAnimal(cat);
		catHospital.checkup();
		
		//����1 : �� ������ ����� ����
		//dogHospital.setAnimal(cat);// ������ ����
		
		//����2 : �� Ÿ�� ��ȯ
		dogHospital.setAnimal(dog);
		Dog biggerDog = dogHospital.bigger(new Dog("�۸���2", 200));
		System.out.println("biggerDog = " + biggerDog);

	}

}
