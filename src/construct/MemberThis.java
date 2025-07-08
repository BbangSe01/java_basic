package construct;

public class MemberThis {
    String nameField;

    void initMember(String nameParameter) {
        // 매개변수의 이름이 서로 다르므로 this 생략 가능
        nameField = nameParameter;
    }
}
