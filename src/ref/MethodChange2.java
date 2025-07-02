package ref;

public class MethodChange2 {
    public static void main(String[] args) {
        data dataA = new data();
        dataA.value=10;
        System.out.println(dataA.value);
        changePrimitive(dataA);
        System.out.println(dataA.value);
    }
    static void changePrimitive(data dataX) {
        dataX.value=20;
    }
}
