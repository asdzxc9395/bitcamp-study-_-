// 메서드 래퍼런스 = 스태틱 메서드 래퍼런스
package com.eomcs.oop.ex12;


public class Exam0540 {
  static class MyCalculator {
    public static int plus(int a, int b) {return a + b;}
    public static int minus(int a, int b) {return a - b;}
    public static int multiple(int a, int b) {return a * b;}
    public static int divide(int a, int b) {return a / b;}
  }

  static interface Calculator1 {
    int compute(byte a, byte b);
  }
  static interface Calculator2 {
    int compute(short a, short b);
  }
  static interface Calculator3 {
    int compute(int a, int b);
  }
  static interface Calculator4 {
    int compute(long a, long b);
  }
  static interface Calculator5 {
    int compute(float a, float b);
  }
  static interface Calculator6 {
    int compute(Object a, Object b);
  }
  static interface Calculator7 {
    int compute(String a, String b);
  }
  static interface Calculator8 {
    int compute(Integer a, Integer b);
  }



  public static void main(String[] args) {
    // 메서드 한개짜리 인터페이스 구현체를 만들때
    // 기존 스태틱 메서드를 람다 구현체로 사용할 수 있다.
    // 기존 스태틱 메서드를 람다 구현체로 사용할 수 있다.
    // >> 단 인터페이스에 선언된 메서드의 규격이 일치해야 한다.
    // >> 규격? 파라미터 타입 및 개수 , 리턴 타입

    // 파라미터 타입이 :byte >> int 
    Calculator1 c1 = MyCalculator::plus;

    // 파라미터 타입이 :short >> int 
    Calculator2 c2 = MyCalculator::plus;

    // 파라미터 타입이 :int >> int 
    Calculator3 c3 = MyCalculator::plus;

    // 파라미터 타입이 :long >> int 
    //Calculator4 c4 = MyCalculator::plus;

    // 파라미터 타입이 :float >> int
    //Calculator5 c5 = MyCalculator::plus;

    // 파라미터 타입이 :Object >> int 
    //Calculator6 c6 = MyCalculator::plus;
    
    // 파라미터 타입이 :String >> int 
    //Calculator7 c7 = MyCalculator::plus;

    // 파라미터 타입이 :String >> int 
    Calculator8 c8 = MyCalculator::plus;
    
    // 메서드 래퍼런스를 지정할 떄 파라미터 타입 규칙:
    // >> 인터페이스 규칙에 따라 받은 값을 
    // 실제 메서드에 그대로 전달할 수 있다면 가능하다.
    // 



  }
}
