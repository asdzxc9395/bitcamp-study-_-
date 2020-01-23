// 상수 코드를 별도의 클래스로 분리하여 다루기 - static 멤버 import
package com.eomcs.oop.ex11.b.step5.copy;

// 특정 클래스의 스태틱 멤버를 클래스 이름 없이 사용하고 싶다면
// 다음과 같이 컴파일러에게 알려줘라

import static com.eomcs.oop.ex11.b.step5.Category.*;

public class Exam0120 {
  public static void main(String[] args) {
    Product p = new Product();
    p.category = APPLIANCE_TV;
    p.name = "울트라비전 뷰";
    p.price = 2000000;

    Product p2 = new Product();
    p2.category = COMPUTER_RAM;
    p2.name = "삼성모듈램 4GB";
    p2.price = 80000;

    Product p3 = new Product();
    p3.category = BOOK_NOVEL; // << 프로그램의 이름을 잘못 입력(novel)
    p3.name = "토지";
    p3.price = 18000;
  }
}
