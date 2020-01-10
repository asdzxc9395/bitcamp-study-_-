package com.eomcs.oop.ex08.test;

public class B {
  // 필드를 만들어볼게  5가지가 대표적으로 있어
  static int a; 
  String b;
  
  // 이번에는 메서드를 만들어볼게
  static void m1() {}
  int m2() {return 0;} // 인트라 리턴값이 있어야해
  
  // initializer block
  static {}
  {} // 몰라 이건나도
  
  //생성자 constructor
  B() {} 
  
  //nested class
  static class B1 {} // static nested class
  class B2 {} // non static nested class = inner class
  
//이렇게 스태틱 을 붙이고 안붙이고 필드를 2가지로 정리할수 있는데
  // static 붙은걸 클래스 필드 = 스태틱 필드라하고
  // 안붙은걸 인스턴트 필드 = 논스태틱 필드라해
  
  // 메서드도 같이 클레스 메서드, 인스턴스 메서드
  // 블록 >> 스태틱 블록, 인스턴스 블록
  
  // 스태티이 붙은건 메서드 에어리어에 위치하고
  // 인스턴트는 힙에 저장되고 new를 선언해야해 인스턴스는 래퍼런스 변수 주소가 필요하거든
}
