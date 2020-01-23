// 람다(lambda) -
package com.eomcs.oop.ex12;

public class Exam0321 {

  static interface Calculator {
    int copmpute(int a, int b);
  }

  static void test(Calculator c) {
    System.out.printf("결과: %d\n", c.copmpute(200, 100));

  }

  public static void main(String[] args) {

    test(new Calculator() {
      @Override
      public int copmpute(int a, int b) {
        // TODO Auto-generated method stub
        return 0;
      }
    });


  }

}
