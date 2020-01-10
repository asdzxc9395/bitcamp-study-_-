package com.eomcs.oop.ex08.test;

public class D extends Object {
  int a;
 // 모든 클래스는 오브젝트라는 클래스의 상속클래스고
  // 수퍼클래스야 ㅇㅋ?
}

class D2 extends D {
  int b;
}

class D3 extends D2 {
  int c;
}

// 이렇게 상속이 가능해 ㅇㅋ?
// 그럼 사용해보자

class TestD {
  public static void main(String[] args) {
    D3 obj = new D3(); // D3가 상속하고 있는 수퍼클래스의 인스턴스 변수까지 생성해 ㅇㅋ?
    // D2, D1까지 생성가능해
    obj.c = 100; //D3의 변수
    obj.b = 100; //D2의 변수
    obj.a = 100; //D의 변수
    // 즉 D3를 선언하면 상속클래스까지 모두 사용가능하다 ㄴ아ㅏ아아
  }
}


