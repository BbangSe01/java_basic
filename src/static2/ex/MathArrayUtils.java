package static2.ex;

public class MathArrayUtils {
    private MathArrayUtils() {
        // 인스턴스 생성 막기
    }

    public static int sum(int[] array) {
        int total=0;
        for(int eachArr:array) {
            total+=eachArr;
        }
        return total;
    }

    public static double average(int[] array) {
        int avg = 0;
        for(int eachArr:array) {
            avg+=eachArr;
        }
        return avg/array.length;
    }

    public static int min(int[] array) {
        int min = array[0];
        for(int i=1;i<array.length;i++) {
            if(array[i]<min) min = array[i];
        }
        return min;
    }

    public static int max(int[] array) {
        int max = array[0];
        for(int i=1;i<array.length;i++) {
            if(array[i]>max) max = array[i];
        }
        return max;
    }
}
