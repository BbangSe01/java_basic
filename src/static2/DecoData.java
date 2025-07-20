package static2;

public class DecoData {
    private int instanceValue;
    private static int staticValue;

    // static 메서드
    public static void staticCall() {
//        instanceValue++; // 인스턴스 변수에 접근 불가, compile error
//        instanceMethod(); // 인스턴스 메서드에 접근 불가, compile error

        staticValue++; // 정적 변수 접근
        staticMethod(); // 정적 메서드 접근
    }

    // 매개변수로 인스턴스의 참조값을 받으면 인스턴스 변수/메서드에 접근 가능
    public static void staticCall(DecoData data) {
        data.instanceValue++;
        data.instanceMethod();
    }

    // 인스턴스 메서드_인스턴스 / static 모두 접근 가능
    public void instanceCall() {
        instanceValue++; // 인스턴스 변수 접근 가능
        instanceMethod(); // 인스턴스 메서드 접근 가능

        staticValue++; // 정적 변수 접근
        staticMethod(); // 정적 메서드 접근
    }
    private void instanceMethod() {
        System.out.println("instanceValue="+instanceValue);
    }

    private static void staticMethod() {
        System.out.println("staticValue="+staticValue);
    }
}
