package static1;

public class Data3 {
    public String name;
    public static int count; //  static

     public Data3(String name) {
         this.name = name;
         count++; // Data3.count++ 과 같다. static 으로 앞에 Data3 생략 가능해서 생략한 것
    }
}
