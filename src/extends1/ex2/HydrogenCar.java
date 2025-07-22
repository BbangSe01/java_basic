package extends1.ex2;

public class HydrogenCar extends Car{

    @Override
    public void move() {
        System.out.println("전기차를 빠르게 이동합니다.");
    }
    public void fillHydrogen() {
        System.out.println("수소를 충전합니다.");
    }
}
