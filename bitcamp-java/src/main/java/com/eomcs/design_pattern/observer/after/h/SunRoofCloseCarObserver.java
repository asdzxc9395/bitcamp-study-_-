package com.eomcs.design_pattern.observer.after.h;


public class SunRoofCloseCarObserver extends AbstactCarObserver {

  // 이전 버전에서는 인터페이스를 직접 구현했지만,
  // ( 그래서 관심도 없는 carStopped() 메서드 까지 정의했다.
  // 이전 버전에서는 추상 클래스를 상속받아 간접적으로 구현했다.

  @Override
  public void carStarted() {


  }



}
