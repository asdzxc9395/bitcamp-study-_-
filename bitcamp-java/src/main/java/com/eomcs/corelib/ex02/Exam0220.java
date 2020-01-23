// Wrapper 클래스 - auto-boxing/auto-unboxing
package com.eomcs.corelib.ex02;

public class Exam0220 {
  public static void main(String[] args) {
    // int ==> Integer
    int i1 = 100;
    Integer.valueOf(i1);

    System.out.println(i1);

    // Integer ==> int
    Integer obj2 = Integer.valueOf(200);
    obj2.intValue();

  }
}


