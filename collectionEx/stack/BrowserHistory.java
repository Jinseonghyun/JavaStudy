package collectionEx.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class BrowserHistory {
	private Deque<String> history = new ArrayDeque<>();
	private String currentPage = null;
	
	public void visitPage(String url) {
		if (currentPage != null) {
			history.push(currentPage);
		}
		currentPage = url;
		System.out.println("�湮: " + url);
	}
		
		
		
	public String goBack() {
		if (!history.isEmpty()) {
			currentPage = history.pop();
			System.out.println("�ڷ� ����: " + currentPage);
			return currentPage;
		}
		return null;
	}
}
