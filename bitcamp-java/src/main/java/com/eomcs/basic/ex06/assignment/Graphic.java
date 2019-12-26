package com.eomcs.basic.ex06.assignment;

public class Graphic {

  static void drawLine(int length) {
    int x = 0;
    while (x++ < length) {
      System.out.print("*");
    }
}
  //같은 이름을 사용하는 언어에서 같은 문자를사용하라 
  //같은 메소드를 만들어서 선언한 후에 다른곳에 사용 가능하다. = 오버로딩
  static void drawLine(int length, char ch) {
    int x = 0;
    while (x++ < length) {
      System.out.print(ch);
    }
  }
  
}