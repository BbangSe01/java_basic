package class1;

public class ClassStart2 {

    public static void main(String[] args) {
        // 한 학생의 데이터가 3개의 배열에 나누어져 있기 때문에 한 학생의 데이터를 관리하기 위해 3개의 배열을 각각 변경해야 하고,
        // 3개 배열의 인덱스 순서를 항상 정확하게 맞추어야 한다. 이렇게 되면 관리하기 좋은 코드라고 할 수 없다.
        // 이 때문에 클래스가 필요하다. => 학생이라는 개념을 하나로 묶어 관리
        String[] studentNames = {"학생1", "학생2","학생3","학생4"};
        int[] studentAges = {15,16,17,20};
        int[] studentGrade = {90,80,70,60};

        for(int i=0;i<studentNames.length;i++) {
            System.out.println("이름:" + studentNames[i] + "나이:" + studentAges[i] + "성적:" + studentGrade[i]);
        }
    }
}
