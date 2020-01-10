package com.eomcs.oop.ex05.Test;

public class A {

  int v1;


  A() {
  this(100); // 생성자에서 다른생성자를 호출하는 문법이다.
  System.out.println("A()");
  }

  A(int v1) {
    this.v1 = v1;
    System.out.println("A(int)");
  }
  
}
