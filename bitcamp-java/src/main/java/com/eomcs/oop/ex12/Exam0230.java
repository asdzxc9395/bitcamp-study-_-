// 람다(lambda) - 리턴값이 있는 메서드
package com.eomcs.oop.ex12;

public class Exam0230 {

  static interface Player {
    void play();

    default void m1() {}

    void play2();
  }

  public static void main(String[] args) {
    Player p1 = () -> System.out.println("Hello");
    p1.play(); // 디폴트 메서드가 아닌 추상메서드로 2개 이상 작성시 컴파일 오류가 실행된다.
  }
}
