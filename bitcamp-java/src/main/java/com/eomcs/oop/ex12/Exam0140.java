// 람다(lambda) - 파라미터 받는 경우 2가지종류
package com.eomcs.oop.ex12;

public class Exam0140 {

  static interface Player {
    void play(String name, int age);
  }

  public static void main(String[] args) {

    // 메서드의 몸체에 한 문장만 있을때 중괄호 생략할 수 있다.
    Player p1 =
        (String name, int age) -> System.out.println("Hello, " + name + "!" + age + "살 입니다.");
    p1.play("홍길동", 15);

    p1 = (name, age) -> System.out.printf("Hello, %s(%d)!\n ", name, age);
    p1.play("지노", 13);
  }
}

