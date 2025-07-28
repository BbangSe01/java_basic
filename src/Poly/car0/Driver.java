package Poly.car0;

public class Driver {
    private K3Car k3Car;
    private Model3 m3;

    public void setK3Car(K3Car k3Car) {
        this.k3Car = k3Car;
    }

    public void setM3(Model3 m3) {
        this.m3 = m3;
    }

    public void drive() {
        System.out.println("자동차를 운전합니다.");
        if (k3Car != null) {
            k3Car.startEngine();
            k3Car.pressAccelerator();
            k3Car.offEngine();
        } else if (m3 != null) {
            m3.startEngine();
            m3.pressAccelerator();
            m3.offEngine();
        }
    }
}
