package collectionEx.stack;

public class BrowserHistoryTest {

	public static void main(String[] args) {
		BrowserHistory browser = new BrowserHistory();
		
		//����ڰ� ���������� �湮�ϴ� �ó�����
		browser.visitPage("yotube.com");
		browser.visitPage("google.com");
		browser.visitPage("facebook.com");

		// �ڷ� ���� ����� ����ϴ� �ó�����
		String currentPage1 = browser.goBack();
		System.out.println("currentPage1 = " + currentPage1);
		
		String currentPage2 = browser.goBack();
		System.out.println("currentPage2 = " + currentPage2);
	}

}
