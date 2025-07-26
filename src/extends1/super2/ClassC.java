package extends1.super2;

public class ClassC extends ClassB {

    public ClassC() {
        // ClassB에 기본생성자가 없어서 super로 직접 호출해줘야 함.
        super(10,20);
        System.out.println("ClassC 생성자");
    }
}
