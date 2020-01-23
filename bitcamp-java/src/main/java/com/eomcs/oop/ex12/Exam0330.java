// 람다(lambda) -
package com.eomcs.oop.ex12;

public class Exam0330 {

  static interface Calculator {
    int copmpute(int a, int b);
  }

  static void test(Calculator c) {
    System.out.printf("결과: %d\n", c.copmpute(1, 10));

  }

  public static void main(String[] args) {

    test((a, b) -> {
      int sum = 0;
      for (int i = a; i <= b; i++) {
        sum += i;
      }
      return sum; // 여러개의 문장일경우 생락 불가학 리턴타입 적어야 한다.
    });
    test((a, b) -> {
      int sum = 0;
      for (int i = a; i <= b; i++) {
        sum += i;
      }
      return sum;
    });

  }

}
