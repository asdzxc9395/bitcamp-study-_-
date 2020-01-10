package com.eomcs.oop.ex08.test;

public class J2 {
  
  //두 클래스의 공통 분모를 뽑아 새로운 수퍼클래스를 정의하는거야
  // 이거를 제너레이션 일반화라 구해
  class Member {
    String email;
    String pwd;
    String name;
    String tel;
    
    void print() {
      System.out.println("회원 정보");
    }
  }
  
// 수퍼클래스를 만들었으니 서브클래스를 상속해야지?
  class Student extends Member {

    int grade;
    boolean working;

    @Override
    void print() {
      System.out.println("학생 정보");
    }
  }

  class Teacher extends Member {

    int pay;
    String major;

    @Override
    void print() {
      System.out.println("강사 정보");
    }
  }
}