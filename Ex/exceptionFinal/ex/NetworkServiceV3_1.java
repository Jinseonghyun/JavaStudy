package exceptionFinal.ex;

import exceptionFinal.ConnectExceptionV3;
import exceptionFinal.SendExceptionV3;

public class NetworkServiceV3_1 {

	public void sendMessage(String data) {
		String address = "https://example.com";
		
		NetworkClientV3 client = new NetworkClientV3(address);
		client.initError(data);
		
		try {
			client.connect();
			client.send(data);
		} catch (ConnectExceptionV3 | SendExceptionV3 e) {
			System.out.println("[연결 또는 전송 오류] 주소: , 메시지: " + e.getMessage());
		} finally {
			client.disconnect();
		}
		
	}
}
