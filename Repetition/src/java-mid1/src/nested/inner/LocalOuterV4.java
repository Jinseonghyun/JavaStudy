package nested.inner;

import java.lang.reflect.Field;

public class LocalOuterV4 {
	
	private int outInstanceVar = 3;
	
	public Printer process(int paramVar) {
		
		int localVar = 1;
		
		class LocalPrinter implements Printer {
			
			int value = 0;

			@Override
			public void print() {
				System.out.println("value=" + value);
				
				System.out.println("localVar=" + localVar);
				System.out.println("paramVar=" + paramVar);
				
				System.out.println("outInstanceVar=" + outInstanceVar);
				
			}
		}
		
		Printer printer = new LocalPrinter();
		//printer.print();
		// 만약 localVar의 값을 변경한다면? 다시 캡처해야 하나?
		//localVar = 10;
		//paramVar = 20;
		
		return printer;
	}
		
	
	public static void main(String[] args) {
		LocalOuterV4 localOuter = new LocalOuterV4();
		Printer printer = localOuter.process(2);
		printer.print();
		
		System.out.println("필드 확인");
		Field[] fields = printer.getClass().getDeclaredFields();
		for (Field field : fields) {
			System.out.println("field = " + field);
		}
	}
}
