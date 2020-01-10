// Wrapper 클래스 - wrapper 객체의 생성
package com.eomcs.corelib.ex01;

public class Exam0230 {
  public static void main(String[] args) {
    Integer obj1 = new Integer(100); // Heap에 인스턴스 생성 
    Integer obj2 = new Integer(100); // Heap에 인스턴스 생성 
    System.out.println(obj1 == obj2);
    // 설명:
    // >> new 연산자를 통해 Integer 객체를 생성하면 
    // Heap에 인스턴스를 생성한다.
    // 따라서 같은 값이더라도 다른 인스턴스가  생성된다.
    
    Integer obj3 = 100; //Integer.valueOf(100);
    Integer obj4 = 100; // Heap에 인스턴스 생성 
    System.out.println(obj3 == obj4);
    // 설명:
    // 정수 리터럴을 이용하여 오토 박싱으로 생성된 객체는 상수 constants pool에 생성된다.
    // 객체가 같으면 객체를 지정하는 변수를 지정하면 모두 같은 객체를 지정한다.
    // >> 같은 값을 가지는 Integer 객체가 여러개 존재해야할 필요가 없다.
    // >> 그래서 가능한 이 방법을 사용해야한다.
    // >> Java에서도 메모리 절약을 위해 이 방법을 사용하도록 유도하기 위해
    // >> Wrapper클래스의 생성자를 Deprecated로 선언하였다.
    
    Integer obj5 = Integer.valueOf(100); // Heap에 인스턴스 생성 
    Integer obj6 = Integer.valueOf(100); // Heap에 인스턴스 생성 
    System.out.println(obj5 == obj6);
    // Wrapper클래스의 valueOf()로객체를 생성하는 경우 constants pool에 생성된다.
    // 즉 auto boxing과 같다.
    // Integer i = 100;
    
    
    // 그래서 다음과 같이 auto-boxing으로 생성된 객체와 valueOf()로 생성된 객체를 비교해보자
    System.out.println(obj3 == obj5);
  }
}






