// 제네릭(Generic) - 다형적 변수의 활용의 문제점
package com.eomcs.generic.ex01;

import java.util.ArrayList;
import java.util.HashSet;

public class Exam0112 {

  // 다양한 객체를 저장하는 Box를 만들기 위해
  // 인스턴스 변수타입을 Object로 선언한다.
  // 그러면 다음과 같이 한개의 Box클래스만 정의하면 된다.
  static class ObjectBox {
    Object value;

    public void set(Object value) {
      this.value = value;
    }

    public Object get() {
      return value;
    }
  }

  public static void main(String[] args) {
    
    // Member 객체를 저장하기 위해 다음과 같이 Box를 준비했다고 가정하자!
    ObjectBox box1 = new ObjectBox();
    
    // 원래는 다음과 같이 Member 객체를 넣으려고 Box1을 준비한 것이다.
    box1.set(new Member("홍", 20));

    // 그런데  원래의 목적과 다르게 다음과 같이 Member가 아닌String 객체를
    // 넣어도 막을 방법이 없다.
    box1.set(new String("홍"));
    
    // 이유?
    // >> set의 파라미터 타입은 Object이기 떄문이다.
    // >> Object 는 모든 객체의 자바를 받을수 있다.
    //
    // 이렇게 Box 클래스의 인스턴스 변수를 Object로 선언하면
    // 다양한 객체를 보관할 수는 있지만,
    // MemberBox나 String, Integer처럼 특정 타입의 객체로 제한할 수 없다.
    // 그렇다고 이전처럼 각 타입별로 Box클래스를 정의하는것은 바람직하지 않다.
    //
    // 이러한 문제점을 해결하기 위해 나온 문법이 "제네릭(generic)"이다
    // 제네릭 문법을 이용하면 한개의 클래스가 다양한 타입의 객체를 다룰수 있다.
    // 즉 각타입 별로 클래스를 정의해야 하는 것을 한개의 클래스로 만들 수 있다.
    // Exam0113 gogo
    // 
  }
}








