# 📘 Java 스터디 - [기본형/참조형]

---

## 🧠 학습 목표
- 기본형과 참조형의 이해
---

## 📝 개념 정리

### ✅ 기본형
사용하는 값을 변수에 직접 넣을 수 있는 기본형.

Ex) **int, long, double, boolean** 등의 데이터 타입

**❗참고로 String은 클래스이고, 참조형이다!**


### ✅ 참조형
Student student1과 같이 객체가 저장된 메모리의 위치를 가르키는 참조값을 넣을 수 있는 참조형.
Ex) 배열, 클래스, 인터페이스 등 ***사용자 정의 타입***


⭐ 기본형 변수에는 직접 사용할 수 있는 값이 들어있지만 참조형 변수에는 위치(***참조값***)가 들어가 있다.
참조형 변수를 통해서 뭔가 하려면 결국 참조값을 통해 해당 위치로 이동해야 한다.
---

### ✅ 대입
```java
public class Main {
    public static void main(String[] args) {

        // ✅ 기본형 (Primitive Type)
        int a = 10;
        int b = a; // a의 값을 b에 복사
        b = 20;    // b만 변경, a는 영향 없음

        System.out.println("=== 기본형 ===");
        System.out.println("a: " + a); // 10
        System.out.println("b: " + b); // 20


        // ✅ 참조형 (Reference Type)
        Data dataA = new Data();
        dataA.value = 10;
        
        // dataA객체의 참조값을 갖게 됨. 즉, 같은 객체 참조
        Data dataB = dataA;
        System.out.println(dataA.value); // 10
        System.out.println(dataB.value); // 10
}
```
---

### ✅ 메서드 대입
- **기본형**: 메서드로 기본형 데이터를 전달하면, 해당 값이 복사되어 전달된다. 이 경우, 메서드 내부에서 매개변수(파라미터)의 값을 변경해도, **호출자의 변수 값에는 영향이 없다.**


- **참조형**: 메서드로 참조형 데이터를 전달하면 , 참조값이 복사되어 전달된다. 이 경우, 메서드 내부에서 매개변수(파라미터)로 전달된 객체의 멤버 변수를 변경하면, **호출자의 객체도 변경된다.**


```java
// 기본형 메서드 호출 시
public class MethodChange1 {
    public static void main(String[] args) {
        int a=10;
        System.out.println("메서드 호출 전: a =" + a); //10
        changePrimitive(a);
        System.out.println("메서드 호출 후: a =" + a); //10, 호출자 변수에 영향 없음.
    }
    static void changePrimitive(int a) {
        a=20;
    }
}

// 참조형 메서드 호출 시
public class MethodChange2 {
    public static void main(String[] args) {
        data dataA = new data();
        dataA.value=10;
        System.out.println(dataA.value); // 10
        changePrimitive(dataA);
        System.out.println(dataA.value); // 20
    }
    static void changePrimitive(data dataX) {
        dataX.value=20;
    }
}
```