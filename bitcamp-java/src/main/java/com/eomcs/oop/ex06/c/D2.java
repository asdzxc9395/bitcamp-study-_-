package com.eomcs.oop.ex06.c;

public class D2 extends D {
    @Override
    void m() {
        System.out.println("D2의 m()");
    }
    
    void test() {
      // this 래퍼런스로 메서드를 호출하면
      // >> 현재 클래스부터 메서드를 찾아 호출한다.
      // >> 현재클래스에 메서드가 없으면 수퍼클래스에서 메서드를 찾는다.
      // >> 메서드를 찾을 때까지 최상위 클래스오 롤라간다.
        this.m();
        
        // super 래퍼런스로 메서드를 호출하면
        // >> 수퍼 클래스부터 메서드를 찾아 호출한다.
        // >> 수퍼 클래스에 없으면 그 상위 클래스로 따라 올라간다.
        // >> 오버라이딩하기전에 메서드를 호출하고 싶을 때 유용하다.
        // 만약 오버라이딩 하기 전에 메서드를 호출하고 싶다면?
        super.m();
    }
}






