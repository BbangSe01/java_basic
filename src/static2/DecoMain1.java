package static2;

public class DecoMain1 {
    public static void main(String[] args) {
        String s = "hello java";

        // 정적 메서드를 활용하면 이렇게 인스턴스를 번거롭게 생성하지 않아도 됨.
//        DecoUtil1 utils = new DecoUtil1();
//        String deco = utils.deco(s);

        System.out.println("before: "+s);
        System.out.println("after: "+DecoUtil2.deco(s));
    }
}
