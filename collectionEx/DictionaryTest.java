package collectionEx;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DictionaryTest {
	public static void main(String[] args) { 
		Map<String, String> dictionary = new HashMap<>();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("==�ܾ� �Է� �ܰ�==");
		while (true) {
			System.out.println("���� �ܾ �Է��ϼ��� (����� 'q'): ");
			String englishWord = scanner.nextLine();
			
			if (englishWord.equals("q")) {
				break;
			}
			
			System.out.println("�ѱ� ���� �Է��ϼ���: ");
			String koreanMeaning = scanner.nextLine();
			
			dictionary.put(englishWord, koreanMeaning);
		}
		
		System.out.println("==�ܾ� �˻� �ܰ�==");
		while (true) {
			System.out.println("ã�� ���� �ܾ �Է��ϼ��� (����� 'q'): ");
			String searchWord = scanner.nextLine();
			
			if (searchWord.equals("q")) {
				break;
			}
			
			if (dictionary.containsKey(searchWord)) {
				String koreanMeaning = dictionary.get(searchWord);
				System.out.println(searchWord + "�� ��: " + koreanMeaning);
			} else {
				System.out.println(searchWord + "��(��) ������ ���� �ܾ��Դϴ�.");
			}
		}
	}
}
