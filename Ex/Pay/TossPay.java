package Pay;

public class TossPay implements Pay{

	@Override
	public boolean pay(int amount) {
		System.out.println("�佺���� �ý��۰� �����մϴ�.");
		System.out.println(amount + "�� ������ �õ��մϴ�.");
		return true;
	}
	
	
}
