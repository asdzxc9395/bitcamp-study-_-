// 제네릭(Generic) - 문법 정리 - 제네릭 파라미터
package com.eomcs.generic.ex01;

import java.util.ArrayList;
import java.util.HashSet;

public class Exam0224 {
  
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
    //m1(ArrayList<? extends B1>)
    // A타입 및 그 하위타입에 대해서 ArrayList 객체를 파라미터로 넘길 수있다.
    // 
    //m1(new ArrayList<Object>());
    //m1(new ArrayList<A>());
    m1(new ArrayList<B1>());
    //m1(new ArrayList<B2>());
    m1(new ArrayList<C>());
    
  }

  static void m1(ArrayList<? extends B1> arrayList) {
    //B1 및 B1의 서브클래스 쌉가능 다가능 모두가능 
// B1의 하위 클랙스 객체를 넘길수 있다.
  }
}








