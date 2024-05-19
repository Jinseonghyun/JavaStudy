package enumeration.ref;

public class DiscountService {

    public int discount(ClassGrade classGrade, int price) {
        return  price * classGrade.getDiscountPercent() / 100; // ctrl + alt + n  인라인 변수선언 자동으로 해줌
    }
}
