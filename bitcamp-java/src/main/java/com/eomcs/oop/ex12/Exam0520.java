// 메서드 래퍼런스 = 스태틱 메서드 래퍼런스 구현 원리 
package com.eomcs.oop.ex12;


public class Exam0520 {

  static class MyCalculator {
    public static int plus(int a, int b) {return a + b;}
    public static int minus(int a, int b) {return a - b;}
    public static int multiple(int a, int b) {return a * b;}
    public static int divide(int a, int b) {return a / b;}
  }
  static interface Calculator {
    int compute(int a, int b);
  }


  public static void main(String[] args) {
    // 메서드 레퍼런스로 Calculator 구현체를 만드는 방법
    // 
    // Calculator c1 = My Calculator::plus;
    // 위의 코드는 다음과 같다.
    Calculator c1 = new Calculator() {
      @Override
      public int compute(int a, int b) {
        // 기존 메서드가 메서드 래퍼런스로 전달 가능한지 여부는
        // 다음 코드를 참고하라
        // 인터페이스에 정의된 메서드(compute)가 호출되었을 때,
        // 그 파라미터 값은 메서드 레퍼런스로 지정된 
        // 스테틱 메서드(예: Plus)로 전달될 것이다.
        // >>  그래서 스테틱 메서드의 파라미터는 
        // 항사 인터페이스 메서드에 정의된 파라미터 값을 받을수 있어야 한다.
        //
        // 스테틱 메서드의 리턴 값은
        // 인터페이스 메서드에 정의된 대로 리턴할 수 있어야 한다.
        // >> 그래서 스태틱 메서드의 리턴 타입은
        // 인터페이스 메서드의 리턴타입과 일치하거나
        // 그 타입으로 바꿀수 있어야 한다.(암시적 형변환)
        
        return MyCalculator.plus(a, b);
      }
    };
   
    System.out.println(c1.compute(100, 200)); // compute(a, b) == >> plus()
  }
}
