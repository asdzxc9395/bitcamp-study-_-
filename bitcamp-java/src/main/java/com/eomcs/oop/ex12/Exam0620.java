// 메서드 래퍼런스 = 인스턴스 메서드 래퍼런스
package com.eomcs.oop.ex12;

public class Exam0620 {

  static class Calculator {
    double rate;

    public Calculator(double rate) {
      this.rate = rate;
    }

    public double year(int money) {
      return money * rate / 100;
    }

    public double month(int money) {
      return money * rate / 12;
    }

    public double day(int money) {
      return money * rate / 365;
    }
  }
  static interface Interest {
    double compute(int money);
  }


  public static void main(String[] args) {

    Calculator 보통예금 = new Calculator(0.5);
    // 인스턴스 메서드 레퍼런스로 Calculator 구현체를 만드는 방법
    //
    // Calaulator c1 = 보통예금::yeat;
    // 위의 코드는 내부적으로 다음과 같다.
    Interest i1 = new Interest() {
      @Override
      public double compute(int money) {
        // 인스턴스 메서드 래퍼런스는 실제
        // 인터페이스 구현체에서 다음과 같이 메서드로 호출된다.
        return 보통예금.year(money);
      }
    };

    System.out.println("[보통예금]");
    System.out.printf("년 이자 : %.1f\n", i1.compute(10_0000_0000));

    i1 = 보통예금::month;
    System.out.printf("년 이자 : %.1f\n", i1.compute(10_0000_0000));

    i1 = 보통예금::day;
    System.out.printf("년 이자 : %.1f\n", i1.compute(10_0000_0000));



  }
}
