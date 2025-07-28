package Poly.car1;


public class CarMain1 {
    public static void main(String[] args) {
        Driver driver = new Driver();

        // 차량 선택 k3
        K3Car k3 = new K3Car();
        driver.setCar(k3);
        driver.drive();

        // 차량 선택 m3
        Model3 m3 = new Model3();
        driver.setCar(m3);
        driver.drive();

        NewCar nc = new NewCar();
        driver.setCar(nc);
        driver.drive();
    }
}
