// 인터페이스의 스태틱 메서드 호출
package com.eomcs.oop.ex09.g;

public class Exam0120 implements A {

  @Override
  public void m1() {}

  @Override
  public void m2() {
    // default 메서드는 인터페이스에서 구현했기 떄문에
    // 클래스에서는 구현하지 않아도 오류가 발생하지 않느다.
  }
  @SuppressWarnings("unused")
  void m3() {
    // TODO Auto-generated method stub

  }
}
