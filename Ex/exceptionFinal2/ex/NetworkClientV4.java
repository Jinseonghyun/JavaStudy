package exceptionFinal2.ex;

import exceptionFinal2.ConnectExceptionV4;
import exceptionFinal2.SendExceptionV4;

public class NetworkClientV4 {
	
	private final String address;
	public boolean connectError;
	public boolean sendError;
	
	public NetworkClientV4(String address) {
		this.address = address;
	}
	
	public void connect() {
		if (connectError) {
			throw new ConnectExceptionV4(address, address + " ���� ���� ����");
		}
		
		System.out.println(address + " ���� ���� ����");
	}
	
	public void send(String data) {
		if (sendError) {
			throw new SendExceptionV4(data, address + " ������ ������ ���� ����: " + data);
		}
		
		System.out.println(address + " ������ ������ ����: " + data);
	}
	
	public void disconnect() {
		System.out.println(address + " ���� ���� ����");
	}
	
	public void initError(String data) {
		if (data.contains("error1")) {
			connectError = true;
		}
		
		if (data.contains("error2")) {
			sendError = true;
		}
	}
}
