package generic.test.ex1;

public class ContainerTest {

	public static void main(String[] args) {
		Container<String> stringContainer = new Container<>();
		System.out.println("�� Ȯ��1: " + stringContainer.isEmpty());
		
		stringContainer.setItem("data1");
		System.out.println("���� ������: " + stringContainer.getItem());
		System.out.println("�� Ȯ��2: " + stringContainer.isEmpty());

	}

}
