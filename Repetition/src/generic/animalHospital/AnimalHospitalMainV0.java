package generic.animalHospital;

import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalHospitalMainV0 {

	public static void main(String[] args) {
		DogHospital dogHospital = new DogHospital();
		CatHospital catHospital = new CatHospital();
		
		Dog dog = new Dog("멍멍이1", 100);
		Cat cat = new Cat("냐옹이1", 300);
		
		//개 병원
		dogHospital.setAnimal(dog);
		dogHospital.checkup();
		
		//고양이 병원
		catHospital.setAnimal(cat);
		catHospital.checkup();
		
		//문제1 : 개 병원에 고양이 전달
		//dogHospital.setAnimal(cat);// 컴파일 에러
		
		//문제2 : 개 타입 반환
		dogHospital.setAnimal(dog);
		Dog biggerDog = dogHospital.bigger(new Dog("멍멍이2", 200));
		System.out.println("biggerDog = " + biggerDog);

	}

}
