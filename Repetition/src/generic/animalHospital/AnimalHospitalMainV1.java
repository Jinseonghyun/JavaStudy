package generic.animalHospital;

import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalHospitalMainV1 {

	public static void main(String[] args) {
		AnimalHospitalV1 dogHospital = new AnimalHospitalV1();
		AnimalHospitalV1 catHospital = new AnimalHospitalV1();
		
		Dog dog = new Dog("�۸���1", 100);
		Cat cat = new Cat("�Ŀ���1", 300);
		
		//�� ����
		dogHospital.setAnimal(dog);
		dogHospital.checkup();
		
		//����� ����
		catHospital.setAnimal(cat);
		catHospital.checkup();
		
		//����1 : �� ������ ����� ����
		dogHospital.setAnimal(cat);// �Ű����� üũ ����: ������ ������ �߻����� ����
		
		//����2 : �� Ÿ�� ��ȯ, ĳ���� �ʿ�
		dogHospital.setAnimal(dog);
		Dog biggerDog = (Dog) dogHospital.bigger(new Dog("�۸���2", 200));
		System.out.println("biggerDog = " + biggerDog);

	}

}
