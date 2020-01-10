package com.eomcs.oop.ex08.test;

public class A {
 // public 가 안붙으면 패키지 안에서만 사용알지?
 // public 안붙으면 클래스이름 달라도 뭐 괜찬아
  // 클래스가 다른데서도 쓰고싶으면 공개해야지 ?
  // 하지만 공개하는 클래스는 클래스명과 소스파일 명이 같아야해
  // 이런 패키지에 소속된 클래스를 "패키지 멤버 클래스"라해
  
  //여기서 안에 소속된 클래스
  class X{}
  //이거를 네스티드 클래스라그래
  //네스티드 클래스는 스테틱이 붙고 안붙고 2가지 종류로 나뉘어
  // 스테틱이 안붙은 클래스는 non static class = inner class(중첩클래스)라 그래
  // 위에 퍼블릭 클래스랑 소속된 클래스를 이너클래스라 불러

  //  또한 메서드 안에서도 클래스를 지정할수 있어
  void m() {
    class Y {} 
    // 이렇게 메서드 안에 지정된 클래스를 "로컬 클래스" 라그래
    // 메서드 안에서만 한정된 클래스야
    
    // 이번엔 이름이 없는 클래스도 지정할수 있어
    // 이름이 없는 클래스는 최소한 수퍼클래스라도 이름을 지정을 해야해
    // 나중에 인스턴스를 만들수 없어서 즉시만들어야하고
    // 어떤 생성자를 호출할지 지정해야해
    // 그러면 이렇게 만들어보까
    Object obj = new Object() {
      @Override
      public String toString() {
        return "익명클래스";
      }
      // 이러면 이 익명클래스에 대해서 즉시 인스턴스를 만들어
      // 다형적 변수를 사용하면 하위 객체를 가리킬수 있어
      // 이걸 어나니머스 클래스라 그래
    };
    

  }

}

// 이번엔 다른 클래스를 만들어볼게
class A1 { }
class A2 { }
// 이렇게 패키지 멤버 클래스를 여러개 만들수 있는데
// 메인패키지 만들고 그 안에서 만들어야 관리가 편해 알겠지?
// 
