package exceptionP;

public class NetworkServiceV2_5 {

	public void sendMessage(String data) {
		String address = "http://example.com";
		
		NetworkClientV2 client = new NetworkClientV2(address);
		client.initError(data);
		
		try {
			client.connect();
			client.send(data);
			
		} catch (NetworkClientExceptionV2 e) {
			System.out.println("[����] �ڵ�: " + e.getErrorCode() + ",�޽���: " + e.getMessage());
		} finally {
			client.disconnect();
		}
		
		
	}
}
