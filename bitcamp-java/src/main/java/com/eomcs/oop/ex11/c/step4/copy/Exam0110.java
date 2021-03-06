// 상수 변수를 활용한 후 : 상수 변수를 활용하여 분류 코드를 다루기
package com.eomcs.oop.ex11.b.step4.copy;


public class Exam0110 {
  public static void main(String[] args) {
    // 카테고리 값을 정수로 정의하면
    // 메모리를 절약하고, 대문자로 정의해야 상수임을 직관적으로 알수 있다.
    // 카테ㅗ리 값을 상수로 정의하면 주석을 달 필요가 없다.
    Product p = new Product();
    p.category = Product.APPLIANCE_TV;
    p.name = "울트라비전 뷰";
    p.price = 2000000;

    Product p2 = new Product();
    p2.category = Product.COMPUTER_RAM;
    p2.name = "삼성모듈램 4GB";
    p2.price = 80000;

    Product p3 = new Product();
    p3.category = Product.BOOK_NOVEL; // << 프로그램의 이름을 잘못 입력(novel)
    p3.name = "토지";
    p3.price = 18000;
  }
}
