package ref;

public class Method1 {
    public static void main(String[] args) {
        Student student1 = new Student();
        initStudent(student1,"학생1",15,90);

        Student student2 = new Student();
        initStudent(student2,"학생2",16,80);

        printStudent(student1);
        printStudent(student2);
    }

    // 객체의 멤버 변수들에 값을 할당해주는 메서드
    static void initStudent(Student student, String name, int age, int grade) {
        student.name = name;
        student.age=age;
        student.grade = grade;
    }
    // 객체의 멤버 변수들을 print하는 메서드
    static void printStudent(Student s) {
        System.out.println("이름:"+ s.name + "나이:"+ s.age + "성적:"+s.grade);
    }
}
