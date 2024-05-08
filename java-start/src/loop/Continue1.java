package loop;

public class Continue1 {
    public static void main(String[] args) {
        int i = 1;

        while(i <= 5) {
            if (i == 3) {
                i++;
                continue;  // i 가 1일 때 거짓이기에 if 문 안으로 안들어감 바로 2로 올라가는게 반복 ,
            }              // 3이 되면 if 문 참이기에 하나올라서 4가됨 근데 continue 이기에 밑에 sout 구문으로 내려가는게 아닌 바로 다시 4를 가지고 while 시작 으로 올라감
            System.out.println(i);
            i++;
        }
    }
}
