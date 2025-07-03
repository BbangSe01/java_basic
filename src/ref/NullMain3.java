package ref;

public class NullMain3 {
    public static void main(String[] args) {
        BigData bigData = new BigData();
        System.out.println(bigData.count);
        System.out.println(bigData.data);
        //NullPointerException 발생
        System.out.println(bigData.data.value);
    }
}
