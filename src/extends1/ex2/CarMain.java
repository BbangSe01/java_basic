package extends1.ex2;

public class CarMain {
    public static void main(String[] args) {
        ElectricCar ec = new ElectricCar();
        ec.move();


        GasCar gc = new GasCar();
        gc.move();


        HydrogenCar hc = new HydrogenCar();
        hc.move();

    }
}
