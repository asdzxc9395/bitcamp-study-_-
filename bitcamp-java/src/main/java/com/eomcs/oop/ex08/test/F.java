package com.eomcs.oop.ex08.test;

public class F extends Object {
  int a;
  void m1() {}


  class F2 extends F {
    int b;
    void m2() {}

  }

  class F3 extends F2 {
    int c;
    void m3() {}
  }

  // 이렇게 상속이 가능해 ㅇㅋ?
  // 그럼 사용해보자

  class TestF {
    public void main(String[] args) {
      // 다형적 변수
      // >> 래퍼런스는 인스턴스 주소를 가리킬수 있어
      F obj1 = new F();
      obj1 = new F2();
      obj1 = new F3();
      
      F2 obj2 = new F2();
      obj2 = new F3();
      //obj2 = new F(); // 수퍼클래스를 가리킬수는 없어 알지?
    }
  }
}
