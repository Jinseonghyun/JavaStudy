package generic.animalHospital;

import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalHospitalMainV3 {

	public static void main(String[] args) {
		AnimalHospitalV3<Dog> dogHospital = new AnimalHospitalV3<>();
		AnimalHospitalV3<Cat> catHospital = new AnimalHospitalV3<>();
		
		Dog dog = new Dog("�۸���1", 100);
		Cat cat = new Cat("�Ŀ���1", 300);
		
		//�� ����
		dogHospital.set(dog);
		dogHospital.checkup();
		
		//����� ����
		catHospital.set(cat);
		catHospital.checkup();
		
		//����1 : �� ������ ����� ����
		//dogHospital.set(cat);// �Ű����� üũ ����: ������ ������ �߻����� ����
		
		//����2 : �� Ÿ�� ��ȯ, ĳ���� �ʿ�
		dogHospital.set(dog);
		Dog biggerDog = (Dog) dogHospital.getBigger(new Dog("�۸���2", 200));
		System.out.println("biggerDog = " + biggerDog);

	}

}
