package static1;

public class Data3 {
    public String name;
    public static int count; //static_정적 변수 또는 클래스 변수라고 함

    public Data3(String name) {
        this.name = name;
        count++;
    }
}
