package poly;

public class EmailSender implements Sender {

	@Override
	public void sendMessage(String message) {
		System.out.println("������ �߼��մϴ�: " + message);

	}

}
