package final1;

public class FieldInit {
    static final int CONST_VALUE = 10;  // static final 이 붙으면 관례상 자바에서 변수명 상수로 대문자로 사용
    final int value = 10;

//    public FieldInit(int value) {
//        this.value = value;             위에서 final 변수에 초기화를 해줬기에 밑에서 초기화 생성자로도 불가능
//    }
}
