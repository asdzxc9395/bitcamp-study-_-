package com.eomcs.oop.ex08.test;

public class G extends Object {
  int a;
  void m1() {}


  class G2 extends G {
    int b;
    
    void m2() {}
    void m2(int a) {} // 이건 오버로딩이야
    
    // 수퍼클래스에서 상속받은 메서드를
    // 서브클래스에서 재정의할라면 오버라이딩해야해
    @Override
    void m1() {} // 오버라이딩: 상속받은 메서드를 서브클래스에 역할에 맞게 재정의
    
    // 조심!
    void m1(int a) {} // 이건 오버로딩이야! 
    // 같은 일을 하는 메서드들은 같은 이름을 지정하수 있어
    
  }

  class G3 extends G2 {
    int c;
    void m3() {}
    
    @Override
    void m1() {}
  }

  // 이렇게 상속이 가능해 ㅇㅋ?
  // 그럼 사용해보자

  class TestG {
    public void main(String[] args) {
      
      G3 obj1 = new G3();
      obj1.m1(); // G3클래스에 m1() 호출이야
      
      G obj2 = new G3();
      obj1.m1(); // obj2가 실제 가리키는 G3가 오버라이딩한 m1 호출이얌
      
      G obj3 = new G();
      obj3.m1(); // G의 m1호출
    }
  }
}
