package generic.ex1;

public class BoxMain2 {

	public static void main(String[] args) {
		ObjectBox integerBox = new ObjectBox();
		integerBox.setValue(10);
		Integer integer = (Integer) integerBox.getValue();
		System.out.println("integer = " + integer);
		
		ObjectBox stringBoX = new ObjectBox();
		stringBoX.setValue("hello");
		String str = (String) stringBoX.getValue();
		System.out.println("str = " + str);
		
		//�߸��� Ÿ���� �μ� ���޽�
		integerBox.setValue("����100");
		Integer result = (Integer) integerBox.getValue(); // String -> Integer ĳ���� ����
		System.out.println("result = " + result);

	}

}
