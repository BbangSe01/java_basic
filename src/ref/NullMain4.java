package ref;

public class NullMain4 {
    public static void main(String[] args) {
        BigData bigData = new BigData();
        bigData.data = new Data();
        System.out.println(bigData.count);
        System.out.println(bigData.data);
        //bigData 멤버 변수인 data 클래스에 참조값을 넘겨주어 NullPointerException 미발생!
        System.out.println(bigData.data.value);
    }
}
