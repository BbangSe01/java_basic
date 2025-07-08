package construct;

public class MethodInitMain3 {
    public static void main(String[] args) {
        MemberInit m1 = new MemberInit();
        m1.initMember("user1",15,90);

        MemberInit m2 = new MemberInit();
        m2.initMember("user2",16,80);

        MemberInit[] members = {m1,m2};

        for(MemberInit member:members) {
            System.out.println("이름: "+member.name+" 나이: "+member.age+" 성적: "+member.grade);
        }
    }
}
