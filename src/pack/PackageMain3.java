package pack;

import pack.a.User;

public class PackageMain3 {
    public static void main(String[] args) {
        Data data1 = new Data();
        User user1 = new User();
        // 다른 package에 있는 같은 이름의 class를 import시, 한 개만 import 가능
        pack.b.User user2 = new pack.b.User();
    }
}
