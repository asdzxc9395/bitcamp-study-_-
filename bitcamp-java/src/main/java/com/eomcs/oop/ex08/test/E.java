package com.eomcs.oop.ex08.test;

public class E extends Object {

  E () { // 파라미터가 없는 생성자를 default constructor  = 디폴트 생성자를 생성자라해
    super(); // 모든 생성자는 첫 문장으로 수퍼클래스의 생성자를 호출해야 한다.
  }
  
  E(int i) {
    this(); // 수퍼 클래스의 생성자 대신 자기 자신의 다른 생성자를 호출할 수 있어
  }
  
  E(String s) {
    // 수퍼클래스의 생성자나 다른 생성자는 모두 문장의 첫 문장으로 와야해
    // 그렇단 말은 둘다 올수 없단 말이겠지?
    this();
    //super();
    // 하나만 호출하자 이말이야 !
  }
  
  E(int a, int b) {
    // 수퍼클래스 생성자 호출을 생략하잔아?
    // 그럼 자동으로 수퍼클래스의 안보이는 (default)생성자를 생성해
    // super(); 이렇게 ㅎㅎ
  }
}

class E2 extends E {
 E2(int a) {
   // 생성자가 한개 이상 있으면 컴파일러는 default 생성자를 만들지 안아
 }
}

class E3 extends E2 {
  E3() {
    // 이렇게 수퍼클래스에 기본 생성자가 없을때 (E2) 
    // 내가 직접 어떤 수퍼클래스의 생성자를 호출할지 지정해야해
    super(100); // >>> E2(int a)의 생성자를 호출해
  }
}

// 이렇게 상속이 가능해 ㅇㅋ?
// 그럼 사용해보자

class TestE {
  public static void main(String[] args) {
    
    E3 obj = new E3(); 
    // 생성자 호출은 E3 생성자로부터 상위클래스로 올라가면서 호출해
    // 실행은 위에서부터 내려오면서 실행해
  }
}


