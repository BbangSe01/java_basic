package Poly.basic;

// 다운캐스팅을 자동으로 하지 않는 이유
public class CastingMain4 {
    public static void main(String[] args) {
        Parent p1 = new Child();
        Child child1 = (Child) p1;
        child1.childMethod(); // 문제 없음

        Parent p2 = new Parent();
        Child child2 = (Child) p2; // 런타임 오류 - ClassCastException
        child2.childMethod(); // 실행 불가
    }
}
