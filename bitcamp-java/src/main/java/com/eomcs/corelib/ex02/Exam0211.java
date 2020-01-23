// Wrapper 클래스 - 생성자와 ValueOf
package com.eomcs.corelib.ex02;

public class Exam0211 {
  public static void main(String[] args) {

    // new 명령을 사용하여 Integer를 만들면
    // 만들때 마다 새 인스턴스를 생성한다.
    Integer i1 = new Integer(3000000);
    Integer i2 = new Integer(3000000);

    System.out.println(i1 == i2);

    // -128에서 127 범위의 수를 가지고 valueOf()를 가지고 호출하면
    // 내부 메모리(cache)에 보관한다.
    // >> 그래서 같은 값의 객체가 여러 개 생성되지 않도록 한다.
    Integer i3 = Integer.valueOf(127);
    Integer i4 = Integer.valueOf(127);
    System.out.println(i3 == i4);

    // 이유 ?
    // -128 ~ 127 범위의 수는 자주 사용되는 수이기 때문이다.
    // 그 범위 밖에 수는 새 인스턴스로 생성한다.

    Integer i5 = Integer.valueOf(128);
    Integer i6 = Integer.valueOf(128);
    System.out.println(i5 == i6);

    // 결론 !
    // >> Wrapper 객체의 값을 비교할 때 == 연산자를 사용하지 말라
    // -128 ~ 127 범위내의 값이라면 == 연산자를 사용하여 비교가능하지만
    // 매번 비교할때 마다 범위의 유효성을 생각하는 것이 번거롭다.
    // >> 그냥 equals()메서드를 사용하여 값을 비교하라!
  }
}


