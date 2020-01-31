package com.eomcs.design_pattern.observer.after.h;


public class BreakOilCarObserver extends AbstactCarObserver {

  // 이전 버전에서는 인터페이스를 직접 구현했지만,
  // ( 그래서 관심도 없는 carStopped() 메서드 까지 정의했다.
  // 이전 버전에서는 추상 클래스를 상속받아 간접적으로 구현했다.
  @Override
  public void carStarted() {
    System.out.println("브레이크 오일 유무 검사");

  }

  // 수퍼클래스에서 구현해서
  // 빈 코드를 가진 메서드로 표현하였다.

}
