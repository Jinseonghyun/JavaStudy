package ex4444444444;

public class SendExceptionV4 extends NetworkClientExceptionV4 {
	
	private final String sendData;
	
	public SendExceptionV4(String sendData, String message) {
		super(message);
		this.sendData = sendData;
	}
	
	public String getSendData() {
		return sendData;
	}
}
