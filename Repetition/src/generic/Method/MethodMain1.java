package generic.Method;

public class MethodMain1 {

	public static void main(String[] args) {
		Integer i = 10;
		Object object = GenericMethod.objMethod(i);
		
		//Ÿ�� ����(Type Argument) ����� ����
		System.out.println("����� Ÿ�� ���� ����");
		Integer result = GenericMethod.<Integer>genericMethod(i);
		Integer integerValue = GenericMethod.<Integer>numberMethod(10);
		Double doubleValue = GenericMethod.<Double>numberMethod(20.0);

	}

}
