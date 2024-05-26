package mid1.enumeration;

public class DiscountService1 {

    public int discount (Grade grade, int price) {
        return price * grade.discount(price);
    }
}
