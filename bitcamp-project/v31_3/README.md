# 31_3 - 애플리케이션을 시작하거나 종료할 때 안내 문구를 출력하기

## 학습목표

- 옵저버 디자인 패턴에 따라 기능을 추가 할 수 있다.

## 실습 소스 및 결과

- src/main/java/com/eomcs/lms/Greeting Listener.java 추가
- src/main/java/com/eomcs/lms/App.java 변경

## 실습  

### 훈련 1: 애플리케이션을 시작하거나 종료할 때 데이터를 로딩하고 저장할 옵저버를 만들라.

- GreetingListener.java 추가.
  - ApplicationContextListener를 구현한다.
  - 안내문구를 출력한다.
  

### 훈련 2: 옵저버를 App 객체에 등록하고 실행 확인하라.

- App.java 변경 (App.java.01)
  - GreetingListener 객체를 생성한 후 App 객체에 등록한다.
    



