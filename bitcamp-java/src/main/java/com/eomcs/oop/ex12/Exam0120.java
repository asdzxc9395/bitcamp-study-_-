// 람다(lambda) - 익명 클래스
package com.eomcs.oop.ex12;

public class Exam0120 {

  static interface Player {
    void play();
  }

  public static void main(String[] args) {

    // 메서드의 모멫에 한 문장만 있을때 중괄호 생략할 수 있다.
    Player p1 = () -> System.out.println();
    p1.play();

    // 중괄호 묶어도 상관 없다.
    Player p2 = () -> {
      System.out.println("Hello");
    };
    p2.play();
  }
}


