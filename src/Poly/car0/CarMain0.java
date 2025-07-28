package Poly.car0;

public class CarMain0 {
    public static void main(String[] args) {
        Driver driver = new Driver();
        K3Car k3Car = new K3Car();

        driver.setK3Car(k3Car);
        driver.drive();

        // 추가
        Model3 m3 = new Model3();
        driver.setK3Car(null);
        driver.setM3(m3);
        driver.drive();
    }
}
