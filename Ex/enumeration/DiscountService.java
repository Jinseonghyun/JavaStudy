package enumeration;

public class DiscountService {

//	public int discount(Grade grade, int price) {
//		int discountPercent = 0;
//		
//		if (grade == Grade.BASIC) {
//			discountPercent = 10;
//		} else if (grade == Grade.GOLD) {
//			discountPercent = 20;
//		} else if (grade == Grade.DIAMOND) {
//			discountPercent = 30;
//		} else {
//			System.out.println("«“¿ŒX");
//		}
//		
//		return price * discountPercent / 100;
//	}
	
	public int discount(ClassGrade classGrade, int price) {
		return price * classGrade.getDiscountPercent() / 100;
	}
}
