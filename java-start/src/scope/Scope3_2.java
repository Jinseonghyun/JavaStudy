package scope;

public class Scope3_2 {
    public static void main(String[] args) {
        int m = 10;

        if (m > 0) {   //  temp 를 main이 아닌 if 문 안에 넣어서 메모리 효율과 , 코드 복잡성 낮춤
            int temp = m * 2;
            System.out.println("temp = " + temp);
        }
        //System.out.println(temp);
        System.out.println("m = " + m);
    }
}
