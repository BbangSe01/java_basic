# 📌 다형성 정리

### ✅ 1. 다형성 (Polymorphism)

- **정의**: 하나의 타입(부모 클래스)으로 여러 타입(자식 클래스)을 처리할 수 있는 성질.
- **장점**:
    - 코드의 **유연성**, **확장성** 증가
    - 공통 인터페이스/부모 타입으로 다양한 객체를 처리 가능

**⭐ 부모 타입으로 자식 인스턴스를 참조할 수 있는 게 다형성의 핵심이다!**

```java
Item item = new Book("자바", 20000, "홍길동", "1234");
// 부모 타입으로 자식 인스턴스를 참조 (업캐스팅)
```
### ✅ 2. 다형성과 메서드 오버라이딩
**오버라이딩**: 부모 클래스의 메서드를 자식 클래스에서 재정의

다형성과 오버라이딩 관계: **다형성 상태(부모 타입 참조)에선 오버라이딩된 메서드가 우선 실행됨**
```java
class Item {
    public void print() {
        System.out.println("부모 출력");
    }
}

class Book extends Item {
    @Override
    public void print() {
        System.out.println("자식 출력");
    }
}

Item item = new Book();
item.print(); // 출력: 자식 출력
```
### ✅ 3. 캐스팅 (Casting)
🔹 **업캐스팅 (Upcasting)** : 자식 → 부모 타입으로 형 변환

자동 변환, 명시적 캐스팅 필요 없음

다형성의 기본

```java

Book book = new Book(...);
Item item = book; // 업캐스팅
```

**🔹 다운캐스팅 (Downcasting)** : 
부모 → 자식 타입으로 형 변환

**명시적 캐스팅 필요**

```java
Item item = new Book(...);
Book book = (Book) item; // 다운캐스팅
```
### ⚠️ 4. 다운캐스팅의 주의점

❌ **잘못된 다운캐스팅은 ClassCastException 발생 위험**

업캐스팅된 객체만 다운캐스팅 가능

부모 타입이 실제로 어떤 자식 타입의 인스턴스인지 확신이 없으면 위험

```java
Item item = new Item(...);
Book book = (Book) item; // ❌ 오류: 실제로 Book 인스턴스가 아님
```

### ✅ 5. instanceof 연산자
객체의 실제 타입을 검사할 때 사용

**⭐ instanceof를 통해 다운캐스팅하려는 타입이 실제 상속 계층 안에 존재하는지 확인이 가능하다.**

즉 instanceof를 통해 안전한 다운캐스팅 가능!

```java
if (item instanceof Book) {
Book book = (Book) item;
book.print();
}
// 쉽게 판단하는 방법은 instanceof 우측 타입에 instanceof 좌측 인스턴스를 넣을 수 있는지 확인한다
// 예를 들어 Parent instanceof Child의 경우, 자식 타입으로 부모 인스턴스를 받을 수 없기 때문에
// Child c = new Parent()는 불가능하다. 따라서 false
```

