# 📘 Java 스터디 - [다형성 활용]

---

## 🧠 학습 목표
- 다형성 활용
- 추상 클래스 / 메서드
- 인터페이스
---

## 📝 개념 정리

### ✅ 다형성 활용
아래의 코드를 보면 불필요한 중복이 매우 많이 발생한다.
```java
 package poly.ex1;
 public class AnimalSoundMain {
 public static void main(String[] args) {
 Dog dog = new Dog();
 Cat cat = new Cat();
 Caw caw = new Caw();
 
 System.out.println("동물 소리 테스트 시작");
        dog.sound();
 System.out.println("동물 소리 테스트 종료");
 System.out.println("동물 소리 테스트 시작");
        cat.sound();
 System.out.println("동물 소리 테스트 종료");
System.out.println("동물 소리 테스트 시작");
        caw.sound();
 System.out.println("동물 소리 테스트 종료");
    }
 }
```
이러한 중복을 메서드로 해결하려고 해도, **타입이 다르기 때문에** 공통으로 사용할 수 없어 메서드도 개별적으로 만들어야 하는 문제가 있다.
```java
 private static void soundCaw(Caw caw) {
    System.out.println("동물 소리 테스트 시작");
    caw.sound();
    System.out.println("동물 소리 테스트 종료");
}
```
⭐ 이러한 문제를 ***다형성***을 활용하여 해결할 수 있다.
```java
 package poly.ex2;
 public class AnimalPolyMain1 {
 public static void main(String[] args) {
 Dog dog = new Dog();
 Cat cat = new Cat();
 Caw caw = new Caw();
 
 soundAnimal(dog);
 soundAnimal(cat);
 soundAnimal(caw);
    }
 //동물이 추가 되어도 변하지 않는 코드
private static void soundAnimal(Animal animal) {
 System.out.println("동물 소리 테스트 시작");
        animal.sound();
 System.out.println("동물 소리 테스트 종료");
    }
 }
```
- **다형적 참조** 덕분에 ```animal``` 변수는 자식인 ```Dog```,```Cat```,```Caw```의 인스턴스를 참조할 수 있다. **즉, 다른 타입의 코드를 하나인 것처럼 해결 가능.**


- **메서드 오버라이딩** 덕분에 animal.sound()를 호출해도 각 인스턴스의 메서드를 호출할 수 있다. 

----
### ✅ 추상 클래스 / 메서드
```java
abstract class AbstractAnimal {...}
```
***추상 클래스***는 이름 그대로 추상적인 개념을 제공하는 클래스이다. 따라서 실체인 **인스턴스가 존재하지 않는다.** 

대신에 **상속**을 목적으로 사용되고, 부모 클래스 역할을 담당한다.        

```java
public abstract void sound();
```
***추상 메서드***는 부모클래스를 상속 받는 자식 클래스가 **반드시 오버라이딩 해야 하는** 메서드를 부모 클래스에서 정의하는 것이다. 실체가 존재하지 않고 메서드 바디가 없다.

**❗추상 메서드가 하나라도 있는 클래스는 추상 클래스로 선언해야 한다.**

**❗추상 메서드는 상속 받는 자식 클래스가 반드시 오버라이딩 해서 사용해야 한다.**

### ✅ 인터페이스
자바는 순수 추상 클래스를 더 편리하게 사용할 수 있는 ***인터페이스***라는 기능을 제공한다.
```java
public interface InterfaceAnimal {
    void sound();
    voud move();
}
```
**⭐ 인터페이스 특징**

**(순수 추상 클래스의 특징)**
- 인스턴스를 생성할 수 없다.
- 상속시 모든 메서드를 오버라이딩 해야 한다.
- 주로 다형성을 위해 사용된다.

**+약간의 편의 기능**
- 인터페이스의 메서드는 모두 public, abstract이고 생략 가능.
- 다중 구현(다중 상속)을 지원한다.

---
❗**상속 vs 구현**

 상속은 이름 그대로 부모의 기능을 물려 받는 것이 목적이다. 하지만 인터페이스는 모든 메서드가 추상 메서드이다. 따라서 물려받을
수 있는 기능이 없고, 오히려 **인터페이스에 정의한 모든 메서드를 자식이 오버라이딩 해서 기능을 구현해야 한다.** 따라
서 구현한다고 표현한다.

인터페이스는 메서드 이름만 있는 설계도이고, 이 설계도가 실제 어떻게 작동하는지는 하위 클래스에서 모두 구현해야
한다. 따라서 인터페이스의 경우 상속이 아니라 해당 인터페이스를 구현한다고 표현한다.
상속과 구현은 사람이 표현하는 단어만 다를 뿐이지 자바 입장에서는 똑같다. 일반 상속 구조와 동일하게 작동한다.

----
❗**인터페이스를 사용해야 하는 이유**

- **제약:** 인터페이스의 규약(제약)은 반드시 구현해야 하는 것이다. 그런데
순수 추상 클래스의 경우 미래에 누군가 그곳에 실행 가능한 메서드를 끼워 넣을 수 있다. 이렇게 되면 추가된 기
능을 자식 클래스에서 구현하지 않을 수도 있고, 또 더는 순수 추상 클래스가 아니게 된다. 인터페이스는 모든 메
서드가 추상 메서드이다. 따라서 이런 문제를 원천 차단할 수 있다.


- **다중 구현:** 클래스 상속은 부모를 하나만 지정할 수 있다. 반면에 인터페이스는 부모를 여러명 두는 다중 구현(다중 상속)이 가능하다.