package lang.wrapper;

public class WrapperClassMain {

    public static void main(String[] args) {
        Integer newInteger = new Integer(10); // 미래에 삭제 예정, 대신에 valueOf()를 사용
        Integer integerObj = Integer.valueOf(10); // -128 ~ 127 자주 사용하는 숫자 값 재사용, 불변

        Long longObj = Long.valueOf(100);
        Double doubleObJ = Double.valueOf(10.5);

        System.out.println("newInteger = " + newInteger); // 안에서 newInteger 에서 래퍼이기에 자체 오버라이딩 중이다.
        System.out.println("integerObj = " + integerObj);
        System.out.println("longObj = " + longObj);
        System.out.println("doubleObJ = " + doubleObJ);

        System.out.println("내부 값 읽기");
        int intValue = integerObj.intValue();
        System.out.println("intValue = " + intValue);

        long longValue = longObj.longValue();
        System.out.println("longValue = " + longValue);

        System.out.println("비교");
        System.out.println("==: " + (newInteger == integerObj));
        System.out.println("equals:" + (newInteger.equals(integerObj))); // 객체이기에 equals 해줘야 내부 값으로 비교한다.
    }
}
