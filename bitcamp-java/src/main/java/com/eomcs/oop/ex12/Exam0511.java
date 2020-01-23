// 메서드 래퍼런스 = 스태틱 메서드 래퍼런스
package com.eomcs.oop.ex12;


public class Exam0511 {
  static class MyCalculator {
    public static int plus(int a, int b) {return a + b;}
    public static int minus(int a, int b) {return a - b;}
    public static int multiple(int a, int b) {return a * b;}
    public static int divide(int a, int b) {return a / b;}
  }

  static interface Calculator1 {
    double compute(int a, int b);
  }
  static interface Calculator2 {
    float compute(int a, int b);
  }
  static interface Calculator3 {
    short compute(int a, int b);
  }
  static interface Calculator4 {
    void compute(int a, int b);
  }
  static interface Calculator5 {
    Object compute(int a, int b);
  }
  static interface Calculator6 {
    String compute(int a, int b);
  }


  public static void main(String[] args) {
    // 메서드 한개짜리 인터페이스 구현체를 만들때
    // 기존 스태틱 메서드를 람다 구현체로 사용할 수 있다.
    // 기존 스태틱 메서드를 람다 구현체로 사용할 수 있다.
    // >> 단 인터페이스에 선언된 메서드의 규격이 일치해야 한다.
    // >> 규격? 파라미터 타입 및 개수 , 리턴 타입

    // 리턴타입이 int >> double 바꿀수 있다.
    Calculator1 c1 = MyCalculator::plus;
    System.out.println(c1.compute(100, 200));

    // 리턴타입 int >> float 바꿀수 있다.
    Calculator2 c2 = MyCalculator::plus; // 컴파일 오


    // 리턴타입 int >> short 바꿀수 없다.
    //Calculator3 c3 = MyCalculator::plus;

    // Object void 리턴타입으로 변경 가능
    Calculator4 c4 = MyCalculator::plus; // plus()메서드의 리턴값은 무시된다.
    c4.compute(100, 200);

    Calculator5 c5 = MyCalculator::plus;
    System.out.println(c5.compute(100, 200));

    // 리턴타입 int >> String 바꿀수 없다.
    //Calculator6 c6 = MyCalculator::plus;

    // 결론 !
    // >> 메서드 래퍼런스를 지정할 때 규칙
    // 1.같은 리턴타입
    // 2. void (리턴타입 가능할 때)
    // 3. 암시적 형변환 가능한 타입
    // 4. auto -boxing 가능한 타입





  }
}
