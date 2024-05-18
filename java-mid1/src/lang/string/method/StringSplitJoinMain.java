package lang.string.method;

public class StringSplitJoinMain {

    public static void main(String[] args) {
        String str = "Apple,Banana,Orange";

        // split();
        String[] splitSter = str.split(",");

        for (String s : splitSter) {
            System.out.println(s);
        }


        String joinStr = "";
        for (int i = 0; i < splitSter.length; i++) {
            String string = splitSter[i];
            joinStr += string;
            if (i != splitSter.length-1) {
                joinStr += "-";
            }
        }

        System.out.println("joinStr = " + joinStr);

        // join()
        String joinedStr = String.join("-", "A", "B", "C");
        System.out.println("연결된 문자열 = " + joinedStr);

        //문자열 배열 연결
        String result = String.join("-", splitSter);
        System.out.println("result = " + result);
    }
}
