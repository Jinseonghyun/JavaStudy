package generic.ex1;

public class BoxMain3 {

	public static void main(String[] args) {
		GenericBox<Integer> integerBox = new GenericBox<Integer>(); // ���� ������ T�� Ÿ�� ����
		integerBox.setValue(10); // Integer Ÿ�Ը� ���, ������ ����
		//integerBox.setValue("����100");
		Integer integer = integerBox.getValue();
		System.out.println("integer = " + integer);
		
		GenericBox<String> stringBox = new GenericBox<String>();
		stringBox.setValue("hello");
		String str = stringBox.getValue();
		System.out.println("str = " + str);
		
		//���ϴ� ��� Ÿ�� ��� ����
		GenericBox<Double> doubleBox = new GenericBox<Double>();
		doubleBox.setValue(10.5);
		Double doubleValue = doubleBox.getValue();
		System.out.println("doubleValue = " + doubleValue);
		
		//Ÿ�� �߷�: �����ϴ� ���׸� Ÿ�� ���� ����
		GenericBox<Integer> integerBox2 = new GenericBox<>();
				

	}

}
