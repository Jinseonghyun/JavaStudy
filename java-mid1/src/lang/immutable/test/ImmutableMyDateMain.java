package lang.immutable.test;

public class ImmutableMyDateMain {

    public static void main(String[] args) {
        ImmutableMyDate date1 = new ImmutableMyDate(2024,1,1);
        ImmutableMyDate date2 = date1; // date1 = x001, date2 = x002
        System.out.println("date1 = " + date1);
        System.out.println("date2 = " + date2);

        System.out.println("2025 -> date1");
        //date1.setYear(2025);
        date1 = date1.withYear(2025); // x002  불변객체 변환은 값을 꼭 받아야 한다. 안받으면 없다,.
        System.out.println("date1 = " + date1);
        System.out.println("date2 = " + date2);
    }
}
