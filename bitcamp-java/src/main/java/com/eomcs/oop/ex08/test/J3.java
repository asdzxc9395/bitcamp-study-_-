package com.eomcs.oop.ex08.test;

public class J3 {
  
  public void main(String[] args) {
    
    Teacher t = new Teacher();
    Student s = new Student();
    // Member m = new Member(); //추상 클래스는 인스턴스를 생성할수 없어.
    // 추상클래스는 서브클래스에게 공통분모를 내려주는 일을 할뿐이지
    // 직접 메서드를 선언하거나 이런게 안돼
  }
  // 보통 일반화를 한 수퍼클래스는 사용할 일이 없어
  // 그래서 추상 클래스로 정의해서 사용을 못하게 해야해
  // abstract로 설정해야해 알지?
  abstract class Member {
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