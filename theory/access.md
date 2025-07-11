# 📘 Java 스터디 - [접근제어자]

---

## 🧠 학습 목표
- 접근 제어자를 이해하기

---

## 📝 개념 정리

## ✅ 접근 제어자

### ❗접근 제어자가 필요한 이유
```java
package access;

public class Speaker {
    int volume;

    Speaker(int volume) {
        this.volume = volume;
    }
    void volumeUp() {
        if(volume>=100) {
            System.out.println("음량을 증가할 수 없습니다. 최대 음량입니다.");
        } else {
            volume+=10;
            System.out.println("음량을 10 증가합니다.");
        }
    }

    void volumeDown() {
        volume-=10;
        System.out.println("volumeDown 호출");
    }

    void showVolume() {
        System.out.println("현재 음량: "+volume);
    }
}
```
volume이 100을 넘어가면 안되는 스피커가 있다고 가정한다. 스피커를 업그레이드 하는 과정에서 다른 **개발자가 필드에 직접 접근하여** 값을 변경한다면? 

=> 스피커는 고장이 날 것이다.

이러한 문제를 해결하는 방법은 volume 필드를 Speaker **클래스 외부에서 접근하지 못하게 막는 것이다.**
```java
package access;

public class Speaker {
    // private 접근자를 지정하여 외부에서의 접근을 통제
    // priavate이 붙은 경우 클래스 내부에서만 해당 변수에 접근할 수 있다.
    private int volume;

    Speaker(int volume) {
        this.volume = volume;
    }
    void volumeUp() {
        if(volume>=100) {
            System.out.println("음량을 증가할 수 없습니다. 최대 음량입니다.");
        } else {
            volume+=10;
            System.out.println("음량을 10 증가합니다.");
        }
    }

    void volumeDown() {
        volume-=10;
        System.out.println("volumeDown 호출");
    }

    void showVolume() {
        System.out.println("현재 음량: "+volume);
    }
}
```
----
### ⭐ 접근 제어자의 종류
- **private**: 모든 외부 호출을 막는다.
- **default(pakage-private)**: 같은 패키지안에서 호출은 허용한다.
- **protected**: 같은 패키지안에서 호출은 허용한다. 패키지가 달라도 상속 관계의 호출은 허용한다.
- **public**: 모든 외부 호출을 허용한다.

**접근 제어자의 핵심은 속성과 기능을 외부로부터 숨기는 것이다.**

----
## ⭐ 캡슐화
캡슐화는 데이터와 해당 데이터를 처리하는 메서드를 하나로 묶어서 외부에서의 접근을 제한하는 것을 말한다.
**쉽게 이야기해서, 속성과 기능을 하나로 묶고, 외부에 필요한 기능만 노출하고 나머지는 모두 내부로 숨기는 것이다.**

그렇다면, 어떤 것을 숨기고 어떤 것을 노출해야 할까?

**1. 데이터를 숨겨라**

**데이터를 외부에서 함부로 접근하게 두면**, 클래스 안에서 데이터를 다루는 모든 로직을 무시하고 데이터를 변경할 수 있다.
이로 인해 캡슐화가 깨지기 때문에 ***객체의 데이터는 객체가 제공하는 기능인 메서드를 통해서만 접근할 수 있도록 한다.***



**2. 기능을 숨겨라**

객체의 기능 중에서 외부에서 사용하지 않고 **내부에서만 사용하는 기능**들이 있다.

만약 사용자에게 이런 기능까지 모두 알려준다면, 사용자가 해당 클래스에 대해 너무 많은 것을 알아야 하기 때문에,
**사용자 입장에서 꼭 필요한 기능만 외부에 노출하자.** 나머지 기능은 모두 내부로 숨기자.