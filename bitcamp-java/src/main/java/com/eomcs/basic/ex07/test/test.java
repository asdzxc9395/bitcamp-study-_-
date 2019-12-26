package com.eomcs.basic.ex07.test;

public class test {
  public static void main(String[] args) {

    // 입력 값 : X, 리턴 값 : X
    m1();

    // 입력 값 : 0 , 리턴 값 : X
    m2("홍길동");

    // 입력 값 : X , 리턴 값 : 0
    String s;
    m3();

    // 입력값 : 0 , 리턴값  : 0
    String s2 = m4("홍길동");
    System.out.println(s2);
  }

  static void m1() { // 메소드에 function(기능)을 줄때  ()은 외부로부터 받는 값
    System.out.println("Hello!");
  }

  static void m2(String name) {
    System.out.println("Hello," + name);
  }

  static String m3() {
    String message = "Hello!";
    return message;
  }
  static String m4(String name) {
    String message = name + "님 안녕하세요";
    return message;
  }
}


