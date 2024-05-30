package exceptionFinal.ex;

import exceptionFinal.ConnectExceptionV3;
import exceptionFinal.NetworkClientExceptionV3;

public class NetworkServiceV3_2 {

	public void sendMessage(String data) {
		String address = "https://example.com";
		
		NetworkClientV3 client = new NetworkClientV3(address);
		client.initError(data);
		
		try {
			client.connect();
			client.send(data);
		} catch (ConnectExceptionV3 e) {
			System.out.println("[���� ����] �ּ�: " + e.getAddress() + ", �޽���: " + e.getMessage());
		} catch (NetworkClientExceptionV3 e) {
			System.out.println("[��Ʈ��ũ ����] �޽���: " + e.getMessage());
		} catch (Exception e) {
			System.out.println("[�� �� ���� ����] �޽���: " + e.getMessage());
		} finally {
			client.disconnect();
		}
		
	}
}
