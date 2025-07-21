package static2.ex;

public class Car {
    private String carName;
    private static int carCount;

    public Car (String carName) {
        this.carName = carName;
        carCount++;
        System.out.println("차량 구입, 이름:" + carName);
    }

    public static void showTotalCars() {
        System.out.println("구매한 차량 수:"+carCount);
    }
}
