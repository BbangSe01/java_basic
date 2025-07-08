package construct;

public class ConstructMain1 {
    public static void main(String[] args) {
        MemberConstruct m1 = new MemberConstruct("user1",15,90);
        MemberConstruct m2 = new MemberConstruct("user2",16,80);

        MemberConstruct[] members = {m1,m2};
        for(MemberConstruct member:members) {
            System.out.println("이름: "+member.name+" 나이: "+member.age+" 성적: "+member.grade);
        }
    }
}
