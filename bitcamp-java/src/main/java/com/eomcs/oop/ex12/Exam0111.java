// 람다(lambda) - 익명 클래스
package com.eomcs.oop.ex12;

public class Exam0111 {

  public interface Player {
    void play();
  }

  public static void main(String[] args) {
    // 익명 클래스
    Player p1 = new Player() {
      @Override
      public void play() {
        System.out.println("실행");
      }
    };

    p1.play();
  }
}


