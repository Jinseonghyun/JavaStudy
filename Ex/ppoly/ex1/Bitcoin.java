package ppoly.ex1;

public class Bitcoin implements Pay {

	@Override
	public boolean pay(int amount) {
		System.out.println("��Ʈ�������� �����մϴ�.");
		System.out.println(amount + "�� �����մϴ�");
		return true;
	}
	
	
}
