package collectionEx;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ItemPriceTest {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("���", 500);
		map.put("�ٳ���", 500);
		map.put("����", 1000);
		map.put("����", 1000);

		//�ڵ� �ۼ�
		List<String> list = new ArrayList<>();
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			if (entry.getValue().equals(1000)) {
				list.add(entry.getKey());
			}
		}
		System.out.println(list);
	}

}
