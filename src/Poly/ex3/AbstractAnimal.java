package Poly.ex3;

public abstract class AbstractAnimal {
    // 추상 메서드가 하나라도 있는 클래스는 추상 클래스로 선언해야 한다.
    // 추상메서드는 자식 클래스가 반드시 오버라이딩 해서 사용해야 함.
    public abstract void sound();

    public void move() {
        System.out.println("동물이 움직입니다.");
    }
}
