package exception;

public class NetworkServiceV0 {
	public void sendMessage(String data) {
		String address = "jttp://example.com";
		NetworkClientV0 client = new NetworkClientV0(address);
		
		client.connect();
		client.send(data);
		client.disconnerct();
				
	}
}

