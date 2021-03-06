package com.eomcs.io.ex09.d;


public class Member implements java.io.Serializable {

  // java.io.Serializable 인터페이스를 구현하는 클래스는
  // 항상 serialVersionUID 라는 스태틱 상수를 가져야한다.
  // 이 변수는 데이터를 저장하고 읽을 때
  // 데이터 형식에 대한 구분자로 사용된다.
  // 이 값을 가지고 데이터를 읽을수 있을지 가능여부를 판단한다.
  //
  // 다음과 같이 개발자가 버전 번호를 명시할 수 있다.
  // 필드를 추가하거나 변경하더라도 버전 번호가 같다면
  // JVM은 같은 형식으로 판단한다.
  //
  private static final long serialVersionUID = 1280L;

  // serialVersionUID의 사용법
  // => 클래스를 변경하더라도 기존 데이터를 읽는데 문제가 없다면
  // 변경한 클래스의 버전을 이전 버전과 같게 하라!
  // => 그러나 클래스의 변경 사항이 너무 많아 이전 데이터를 읽기가 부적합하다면
  // 변경한 클래스의 버전을 바꿔 읽을 때 오류가 나게 하라!
  // => Member3의 경우 클래스를 변경할 때 tel 변수를 추가하였다.
  // 따라서 이전 데이터를 읽는데는 문제가 없다.
  // 그래서 버전 번호를 바꾸지 않은 것이다.

  String name;
  int age;
  boolean gender; // true(여자), false(남자)
  String tel;

  // Exam0320 두번째 테스트 실행시 주석을 풀라!
  // Exam02_4.java 를 실행하기 전에 다음 변수를 추가하고, toString()을 개정하라!

  @Override
  public String toString() {
    return "Member2 [name=" + name + ", " + "age=" + age + "" + ", gender=" + gender + ", tel ="
        + tel + "]";
    // Exam0420 두번째 테스트 실행시 주석을 풀라!
    // + ", tel = + tel +

  }
}
