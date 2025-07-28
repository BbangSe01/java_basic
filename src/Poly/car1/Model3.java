package Poly.car1;

public class Model3 implements Car{
    @Override
    public void startEngine() {
        System.out.println("model3.startEngine");
    }

    @Override
    public void offEngine() {
        System.out.println("model3.offEngine");
    }

    @Override
    public void pressAccelerator() {
        System.out.println("model3.pressAccelerator");
    }
}
