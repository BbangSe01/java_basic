package Poly.basic;

public class CastingMain3 {
    public static void main(String[] args) {
        Child child = new Child();
        Parent p1 = (Parent) child;
        Parent p2 = child; // 업캐스팅은 생략이 가능함.

        p1.parentMethod();
        p2.parentMethod();
    }
}
