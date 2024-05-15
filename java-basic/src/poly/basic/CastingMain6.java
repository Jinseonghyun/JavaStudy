package poly.basic;

public class CastingMain6 {
    public static void main(String[] args) {
        Parent parent1 = new Parent();
        System.out.println("parent1 호출");
        call(parent1);

        Parent parent2 = new Child();
        System.out.println("parent2 호출");
        call(parent2);
    }

    private static void call(Parent parent) {
        parent.parentMethod();
        //Child 인스턴스인 경우 childMethod() 실행
        if (parent instanceof Child child) { // java 16 부터 는 변수선언을 한번에 할수 있다.
            //Child c = new Parent(); //  위에랑 같은 말
            System.out.println("Child 인스턴스 맞음");
            child.childMethod();
        }
    }
}
