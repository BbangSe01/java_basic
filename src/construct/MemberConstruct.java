package construct;

public class MemberConstruct {
    String name;
    int age;
    int grade;

    // 생성자 오버로딩
    MemberConstruct(String name, int age) {
        // 생성자 내부에서 두번째 생성자 호출
        this(name,age,50);
//        this.name = name;
//        this.age = age;
//        this.grade=50;
    }
    MemberConstruct(String name, int age, int grade) {
        System.out.println("생성자 호출 name="+name+", age="+age+",grade="+grade);
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
