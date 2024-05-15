package final1;

public class FinalRefMain {
    public static void main(String[] args) {
        final Data data; // 참조형
        data = new Data(); //     같은 코드  final Data data = new Data();

        //data = new Data();  // 위에서 이미 참조형 변수 data 가 final 로 초기화 되었기에 밑에서 또 참조못함

        // 참조 대상의 값은 변경 가능
        data.value = 10;              // 객체 값은 변경 가능
        System.out.println(data.value); // 참조형 변수에 들어있는 참조값만 변경이 불가능
        data.value = 20;
        System.out.println(data.value); // Data.value 는 final 이 아니기에 변경 가능
    }
}
