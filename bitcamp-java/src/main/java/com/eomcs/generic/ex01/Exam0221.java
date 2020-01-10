// 제네릭(Generic) - 문법 정리 - 제네릭 파라미터
package com.eomcs.generic.ex01;

import java.util.ArrayList;
import java.util.HashSet;

public class Exam0221 {
  
  class A {}
  class B1 extends A {}
  class B2 extends A {}
  class C extends B1 {}
  /*
   * 
   *  Object
   *    | 
   *    A
   *    /\
   *   /  \
   *  B1  B2
   *  |
   *  |
   *  C
   */
  
  public static void main(String[] args) {
    //m1(ArrayList<Object>)
    // Object로 지정된 ArraList만 파라미터로 넘길 수 있다.
    // Object의 하위클래스들은 안된다.
    m1(new ArrayList());
    m1(new ArrayList<Object>());
    //m1(new ArrayList<A>());
    //m1(new ArrayList<B1>());
    //m1(new ArrayList<B2>());
    //m1(new ArrayList<C>());
    
  }

  static void m1(ArrayList<Object> List) {

  }
}








