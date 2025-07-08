# 📘 Java 스터디 - [생성자]

---

## 🧠 학습 목표
- **생성자**의 이해

---

## 📝 개념 정리

## ✅ 생성자
생성자는 객체 생성 직후 객체를 초기화 하기 위한 특별한 메서드로 생각할 수 있다.
```java
public class MemberInit {
    String name;
    int age;
    int grade;
    
    // 생성자
    MemberInit(String name, int age, int grade) {
        this.name = name;
        this.age= age;
        this.grade = grade;
    }
    
}
```
생성자는 메서드와 비슷하지만 다음과 같은 차이가 있다.
- **생성자의 이름은 클래스 이름과 같아야 한다.** 따라서 첫 글자도 대문자로 시작한다.
- 생성자는 **반환 타입이 없다.** 비워두어야 한다.

---
### ⭐ 생성자의 장점
**중복 호출 제거**
객체를 생성하면서 동시에 생성 직후에 필요한 작업을 한번에 처리할 수 있게 되었다.
```java
// 생성자 등장 전
MemberInit member = new MemberInit();
member.initMember("user1",15,90);


// 생성자 등장 후
MemberInit member = new MemberInit("user1",15,90);
```
### ❗ 제약- 생성자 호출 필수
생성자의 진짜 장점은 객체를 생성할 때 직접 정의한 생성자가 있다면 **직접 정의한 생성자를 반드시 호출**해야 한다는 점이다.
직접 정의한 생성자를 호출하지 않으면 컴파일 오류가 발생한다.

***이 덕분에 필수값 입력을 보장할 수 있다.***

----
### ✅ 기본 생성자
- 매개변수가 없는 생성자를 기본 생성자라 한다.
- 클래스에 생성자가 하나도 없으면 자바 컴파일러는 매개변수가 없고, 작동하는 코드가 없는 기본 생성자를 자동으로 만들어준다.
- **생성자가 하나라도 있으면 자바는 기본 생성자를 만들지 않는다.**

----
### ✅ 오버로딩
생성자도 메서드 오버로딩처럼 매게변수만 다르게 해서 여러 생성자를 제공할 수 있다.
```java
public class MemberConstruct {
    String name;
    int age;
    int grade;

    // 생성자 추가
    MemberConstruct(String name, int age) {
        this.name = name;
        this.age = age;
        this.grade=50;
    }
    MemberConstruct(String name, int age, int grade) {
        System.out.println("생성자 호출 name="+name+", age="+age+",grade="+grade);
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}

```

### ✅ this
this를 호출하면 생성자간의 코드 중복을 막을 수 있다.
```java
public class Book {
    String title;
    String author;
    int page;

    Book() {
        // this() 기능을 사용하여 생성자 내부에서 자신의 다른 생성자를 호출할 수 있다.
        // 이 경우 매개변수를 3개 받는 생성자 호출
        this("","",0);
    }
    // 마찬가지로 매개변수를 3개 받는 생성자 호출
    Book(String title, String author) {
        this(title,author,0);
    }
    Book(String title, String author, int page) {
        this.title = title;
        this.author = author;
        this.page = page;
    }
}
```

❗**this()는 생성자 코드의 첫줄에만 작성할 수 있다!**