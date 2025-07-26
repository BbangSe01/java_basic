package Poly.overriding;

public class OverridingMain {
    public static void main(String[] args) {
        Child child = new Child();
        System.out.println("Child -> Child");
        System.out.println("value = "+child.value);
        child.method();

        Parent parent = new Parent();
        System.out.println("Parent -> Parent");
        System.out.println("value = "+ parent.value);
        parent.method();

        // 부모 변수가 자식 인스턴스 참조(다형적 참조)
        Parent parent2 = new Child();
        System.out.println("Parent -> Child");
        System.out.println("value = "+ parent2.value); // 변수는 오버라이딩 x
        parent2.method(); // 메서드는 오버라이딩!

    }
}
