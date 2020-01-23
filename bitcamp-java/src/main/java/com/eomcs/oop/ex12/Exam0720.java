// 메서드 래퍼런스 = 생성자 래퍼런스 구현 원리
package com.eomcs.oop.ex12;

import java.util.ArrayList;
import java.util.List;

public class Exam0720 {

  static interface ListFactory {
    List create();
  }

  public static void main(String[] args) {

    // 생성자 래퍼런스를 지정하는 것은
    // 다음과 같이 익명 클래스를 만드는 것과 같다.
    // >> ListFactory f1 = new ListFactory();

    ListFactory f1 = new ListFactory() {
      @Override
      public List create() {
        return new ArrayList();
      }
    };
    List list = f1.create();
    // 인터페이스의 메서드를 호출하면
    // 지정된 클래스의 인스턴스를 만든 후 생성자를 호출한다.

    System.out.println(list instanceof ArrayList);
    System.out.println(list.getClass().getName());
  }
}
