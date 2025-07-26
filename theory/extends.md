# 📘 Java 스터디 - [상속]

---

## 🧠 학습 목표
- 상속의 이해

---

## 📝 개념 정리

## ⭐ 클래스와 메서드에 사용되는 final
1. **클래스에 ```final```**
- **final로 선언된 클래스는 확장될 수 없다.** 다른 클래스가 final로 선언된 클래스를 상속받을 수 없다.

2. **메서드에 ```final```**
- **final로 선언된 메서드는 오버라이드 될 수 없다.** 상속받은 서브 클래스에서 이 메서드를 변경할 수 없다.


- ex) public final void myFinalMethod() {...}
---
## ✅ 상속 관계
상속은 객체 지향 프로그래밍의 핵심 요소 중 하나로, **기존 클래스의 필드와 메서드를 새로운 클래스에서 재사용하게 해준다.**

상속은 **extends** 키워드를 사용하면 된다. 그리고 extends **대상은 하나만 선택**할 수 있다. **(단일 상속만 지원)**

```Car```는 부모 클래스가 된다. 여기에는 자동차의 공통 기능인 move()가 포함되어 있다.
```java
package extends1.ex2;

public class Car {

    public void move() {
        System.out.println("차를 이동합니다.");
    }

}
```
전기차는 **extends Car**를 사용해서 부모 클래스인 Car를 상속 받는다. **상속 덕분에** ElectricCar에서도 move()를 사용할 수 있다.

```java
package extends1.ex2;

public class ElectricCar extends Car {
    public void charge() {
        System.out.println("충전합니다.");
    }
}

```
----
## ✅ 상속과 메모리 구조
- 상속 관계의 객체를 생성하면 그 내부에는 부모와 자식이 모두 생성된다.


- 상속 관계의 객체를 호출할 때, 대상 타입을 정해야 한다. 이때 **호출자의 타입**을 통해 대상 타입을 찾는다.


- 현재 타입에서 기능을 찾지 못하면 상위 부모 타입으로 기능을 찾아서 실행한다. 기능을 찾지 못하면 컴파일 오류가 발생한다.

----
## ✅ 상속과 메서드 오버라이딩
**메서드 오버라이딩**이란, 상속받은 메서드의 내용을 재정의하여 사용하는 것이다.

아래 코드를 통해, **기존 부모 클래스의 move()메서드를 자식 클래스의 성격에 맞게 재정의하는 것을 확인할 수 있다.**
```java
package extends1.ex2;

public class HydrogenCar extends Car{

    @Override
    public void move() {
        System.out.println("전기차를 빠르게 이동합니다.");
    }
}
```


----
## ✅ super - 부모 참조
부모와 자식의 필드명이 같거나 메서드가 오버라이딩 되어 있으면, 자식에서 부모의 필드나 메서드를 호출할 수 없다.
**super**키워드를 사용하면 부모를 참조할 수 있다.

### super 생성자
❗**상속 관계를 사용하면 자식 클래스의 생성자에서 부모 클래스의 생성자를 반드시 호출해야 한다.(규칙)**

```java
package extends1.super2;

public class ClassB extends ClassA{

    public ClassB(int a) {
        super(); // 기본 생성자 생략 가능
        System.out.println("ClassB 생성자 a="+a);
    }

    public ClassB(int a, int b) {
        super();
        System.out.println("ClassB 생성자 a=" + a + "b=" + b);
    }
}```