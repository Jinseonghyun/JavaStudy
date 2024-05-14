package static2;

public class DecoMain1 {
    public static void main(String[] args) {
        String s = "hello java";
        DecoUtil1 utils = new DecoUtil1();
        String deco = utils.deco(s);// utils.deco(s)  친 상태에서 ctrl + Alt + v

        System.out.println("before: " + s);
        System.out.println("after: " + deco);
    }
}
