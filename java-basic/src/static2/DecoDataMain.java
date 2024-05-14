package static2;

//import static static2.DecoData.staticCall; // staticCall 에서 alt + enter 를 누르고 add 하면 아래에 staticCall 앞에 클래스이름 안적어도 된다.
import static static2.DecoData.*; // 클래스 안에 모든 여러 메서드 클래스 이름 앞에 생략하고 쓸 수 있게 해줌


public class DecoDataMain {
    public static void main(String[] args) {
        System.out.println("1. 정적 호출");
        DecoData.staticCall();

        System.out.println("2. 인스턴스 호출1");
        DecoData data1 = new DecoData();
        data1.instanceCall();

        System.out.println("3. 인스턴스 호출2");
        DecoData data2 = new DecoData();
        data2.instanceCall();

        //추가
        // 인스턴스를 톤한 접근 (권장하지 않음)
        DecoData data3 = new DecoData();
        data3.staticCall();

        // 클래스를 통한 접근
        DecoData.staticCall();

    }
}
