package Poly.basic;

public class CastingMain5 {
    public static void main(String[] args) {
        Parent p1 = new Parent();
        System.out.println("p1 호출");
        call(p1);
        Parent p2 = new Child();
        System.out.println("p2 호출");
        call(p2);
    }

    private static void call(Parent parent) {
        if(parent instanceof Child) {
            System.out.println("Child 인스턴스 맞음");
            // Child인스턴스가 확실하면 다운캐스팅을 안전하게 할 수 있음
            ((Child) parent).childMethod();
        }

    }

}
