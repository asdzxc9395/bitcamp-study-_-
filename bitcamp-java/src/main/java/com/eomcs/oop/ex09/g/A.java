package com.eomcs.oop.ex09.g;

public interface A {
  /* public abstract */ void m1();

  // default void m2() {}
  default void m2() {} // 추상 메서드가 아니다.

  static void m3() {
    System.out.println(" 오호라 인터페이스도 스테틱 메서드를 가질수 있네");
  }
}
