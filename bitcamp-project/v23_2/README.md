# 23_2 - 일반화(Generalization) 을 통해 추출한 수퍼클래스를 추상 클래스로 정의하기

## 학습 목표

-추상 클래스를 정의할 수 있다.
-추상 클래스의 문법의 용도를 이해한다.
-추상 메서드를 정의할 수 있다.
-추상 클래스의 문법의 용도를 이해한다.

## 주요 개념

 - 일반화 (Generalization)
    - 서브 클래스의 공통 분모를 추출하여 수퍼클래스로 정의하고 상속관계를 맺는 것
 - 다형적 변수 (Polymorphic Variables)
    - Handler에서 사용할 목록관리 객체를 수퍼클래스의 래퍼런스로 선언하는것
    - 이를 통해 List의 서브 객체로 교체하기 쉽도록 만드는 것
 - 의존성 주입(DI:Dependency Injection) 
    - Handler가 의존하는 객체를 내부에서 생성하지 않고 생성자를 통해 외부에서 주입 받는 것.
    - 이를 통해 의존 객체 교체가 쉽도록 만드는 것

## 실습 소스 및 결과

- src/main/java/com/eomcs/util/AbstractList.java 변경
- src/main/java/com/eomcs/util/ArrayList.java 변경
- src/main/java/com/eomcs/util/LinkedList.java 변경
- src/main/java/com/eomcs/lms/handler/LessonHandler.java 변경
- src/main/java/com/eomcs/lms/handler/MemberHandler.java 변경
- src/main/java/com/eomcs/lms/handler/BoardHandler.java 변경
- src/main/java/com/eomcs/lms/App.java 변경

## 실습

### 훈련1. List.java에 추상 클래스와 추상 메서드 문법을 적용하라.

- AbstractList.java
  - List 클래스의 이름을 AbstractList로 변경한다.
  - AbstractList 클래스를 추상 클래스로 선언한다.
  - AbstractList 메서드를 추상 메서드로 정의한다.

