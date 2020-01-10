// 제네릭(Generic) - 문법 정리 - 제네릭 파라미터
package com.eomcs.generic.ex01;

import java.util.ArrayList;
import java.util.HashSet;

public class Exam0220 {
  
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
    //m1(ArrayList)
    // >> 제네릭의 타입을 지정하지 않으면 오브젝트 타입과 같기 때문에
    // 다음과 같이 어떤 다양한 종류의 어레이 리스트를 파라미터로 넘길 수 있다.
    m1(new ArrayList());
    m1(new ArrayList<String>());
    m1(new ArrayList<A>());
    m1(new ArrayList<B1>());
    m1(new ArrayList<B2>());
    m1(new ArrayList<C>());
    
  }

  static void m1(ArrayList List) {

  }
}








