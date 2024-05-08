package cond;

public class CondOp2 {
    public static void main(String[] args) {
        int age = 18;
        String status = (age >= 18) ? "성인" : "미성년자"; // ? 왼쪽 조건이 참이면 첫번째  조건 "성인", 거짓이면 두번째 "미성년자"
        System.out.println("age = " + age + " status = " + status);
    }
}
