// 람다(lambda) - 리턴값이 있는 메서드
package com.eomcs.oop.ex12;

public class Exam0210 {

  static interface Player {
    void play();

  }

  public static void main(String[] args) {
    Player p1 = () -> System.out.println("Hello");
    p1.play();
  }
}
