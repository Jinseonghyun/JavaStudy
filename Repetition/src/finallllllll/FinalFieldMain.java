package finallllllll;

public class FinalFieldMain {

	public static void main(String[] args) {
		System.out.println("생성자 초기화");
		ConstructInit conConstructInit1 = new ConstructInit(10);
		ConstructInit conConstructInit2 = new ConstructInit(20);
		System.out.println(conConstructInit1.value);
		System.out.println(conConstructInit2.value);

		System.out.println("필드 초기화");
		FieldInit fieldInit1 = new FieldInit();
		FieldInit fieldInit2 = new FieldInit();
		FieldInit fieldInit3 = new FieldInit();
		System.out.println(FieldInit.value);
		System.out.println(FieldInit.value);
		System.out.println(FieldInit.value);
		
		System.out.println("상수");
		System.out.println(FieldInit.CONST_VALUE);
	}

}
