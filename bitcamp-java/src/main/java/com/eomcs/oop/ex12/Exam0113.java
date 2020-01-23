// 람다(lambda) - 익명 클래스
package com.eomcs.oop.ex12;

import com.eomcs.oop.ex12.Exam0112.Player;

public class Exam0113 {

  static interface Player {
    void play();
  }

  public static void main(String[] args) {

    // 파라미터가 없는경우 실행 불가하다.
    Player p1 =  -> System.out.println("실행 !"); // 컴파일 오류 !
    p1.play();
  }
}


