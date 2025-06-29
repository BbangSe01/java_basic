# 📘 Java 스터디 - [배열]

---

## 🧠 학습 목표
- 배열 정리
---

## 📝 개념 정리

### ✅ 생성
배열도 new를 이용하여 생성. 참조값을 반환한다.
```java
Student[] students = new Student[2];
// Student[] students = x005;
students[0] = student1;
student[1] = student2;
// students[0] = x001;
// students[1] = x002;
```

⭐ ***자바에서 대입은 항상 변수에 들어있는 값을 복사해서 전달한다!***

배열 요소에 실제 인스턴스가 들어가는 게 아니라, **참조값(주소)가** 들어가는 것.

참조값을 통해 **메모리**에 위치한 배열에 접근!!



