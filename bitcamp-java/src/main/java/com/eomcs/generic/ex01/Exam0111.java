// 제네릭(Generic) - 다형적 변수의 활용
package com.eomcs.generic.ex01;

import java.util.ArrayList;
import java.util.HashSet;

public class Exam0111 {

  // 다양한 객체를 저장하는 Box를 만들기 위해
  // 인스턴스 변수타입을 Object로 선언한다.
  // 그러면 다음과 같이 한개의 Box클래스만 정의하면 된다.
  static class ObjectBox {
    Object value;

    public void set(Object value) {
      this.value = value;
    }

    public Object get() {
      return value;
    }
  }

  public static void main(String[] args) {

    ObjectBox box1 = new ObjectBox();
    box1.set(new Member("홍", 20));
    Member m = (Member) box1.get(); // 값을 꺼낼 때 형변환 해야 한다. (최상위 객체인 오브젝트이기때문)
    System.out.println(m);

    ObjectBox box2 = new ObjectBox();
    box2.set(new String("홍"));
    String m1 = (String) box2.get();
    System.out.println(m1);

    ObjectBox box3 = new ObjectBox();
    box3.set(100); // >> autoBoxing >> Integer.valueOf(100);
    int i = (Integer) box3.get();// 값을 꺼낼때 primitive data type으로 지정하면
    System.out.println(i);              //자동으로 다시 auto unboxing으로 바꾼다.
    
    // 객체의 타입 별로 Box 클래스를 구분해서 쓰지 않으니 코딩이 편하다.
    // 단 값을 꺼낼 때 원래의 타입으로 바꾸기 위해 형변환(type casting)해야 하는 불편함이 있다.
    // 
    // Object 래퍼런스의 치명적 단점
    // >> 의도와 다른타입의 값을 저장하는 것을 막을수 없다.
  }
}








