package generic.wildcard;

import generic.animal.Animal;

public class WildcardEx {

	static <T> void prinGenericV1(Box<T> box) {
		System.out.println("T = " + box.get());
	}
	
	static void printWildcardV1(Box<?> box) {
		System.out.println("? = " + box.get());
	}
	
	static <T extends Animal> void printGenericV2(Box<T> box) {
		T t = box.get();
		System.out.println("�̸� = " + t.getName());
		
	}
	
	static void printWildcardV2(Box<? extends Animal> box) {
		Animal animal = box.get();
		System.out.println("�̸� = " + animal.getName());
		
	}
	
	static <T extends Animal> T printAndReturnGeneric(Box<T> box) {
		T t = box.get();
		System.out.println("�̸� = " + t.getName());
		return t;
		
	}
	
	static Animal printAndReturnWildcard(Box<? extends Animal> box) {
		Animal animal = box.get();
		System.out.println("�̸� = " + animal.getName());
		return animal;
	}
}
