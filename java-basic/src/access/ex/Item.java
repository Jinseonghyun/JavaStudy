package access.ex;

public class Item {
    private  String name;
    private  int price;
    private  int quantity;

    public Item(String name, int price, int quantity) { // 제너레이터 단축키 Alt + insert
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public  String getName() {
        return name;
    }

    public  int getTotalPrice() {
        return price * quantity;
    }
}
