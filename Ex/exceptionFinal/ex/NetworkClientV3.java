package exceptionFinal.ex;

import exceptionFinal.ConnectExceptionV3;
import exceptionFinal.SendExceptionV3;
import exceptionFinal2.ConnectExceptionV4;

public class NetworkClientV3 {

	private final String address;
	public boolean connectError;
	public boolean sendError;
	
	public NetworkClientV3(String address) {
		this.address = address;
	}
	
	public void connect() throws ConnectExceptionV3 {
		if (connectError) {
			throw new ConnectExceptionV3(address, address + " ���� ���� ����");
		}
		
		System.out.println(address + " ���� ���� ����");
	}
	
	public void send(String data) throws SendExceptionV3 {
		if (sendError) {
			throw new SendExceptionV3(data, address + " ������ ������ ���� ����: " + data);
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

