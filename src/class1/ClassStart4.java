package class1;

public class ClassStart4 {

    public static void main(String[] args) {
        // 클래스를 기반으로 실제 메모리에 만들어진 실체를 객체 또는 인스턴스라고 한다.
        Student student1;
        // new를 통해 객체가 생성되고 나면 참조값을 student1 변수에 보관하여 자바에서 이 참조값을 가지고 메모리 어딘가에 있는 객체에 접근
        student1 = new Student();
        student1.name = "학생1";
        student1.age = 15;
        student1.grade = 90;

        Student student2 = new Student();
        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 80;

        // 배열에 student의 참조값 보관
        Student[] students = new Student[] {student1,student2};

//        for(int i=0; i<students.length;i++) {
//            Student s = students[i];
//            System.out.println("이름:" + s.name + "나이:" + s.age + "성적:" + s.grade);
//        }

        // 확장 for
        for(Student s: students) {
            System.out.println("이름:" + s.name + "나이:" + s.age + "성적:" + s.grade);
        }

    }

}
