package com.eomcs.design_pattern.observer.after.f;


public class Test01 {

  public static void main(String[] args) {
    Car car = new Car();

    car.addCarObserver(new SafeBeltCarObserver());
    car.addCarObserver(new EngineOilCarObserver());
    // 브래이크 오일을 검사할 옵저버를 추가한다.
    // - 기존 구조에서는 Car 클래스에 코드를 추가하였다.
    // - 옵저버 패턴으로 구조를 바꾼후에는 이후에 새 클래스만 추가하면 된다.
    car.addCarObserver(new BreakOilCarObserver());
    car.addCarObserver(new LightOffCarObserver());
    car.addCarObserver(new LightOffCarObserver());
    car.addCarObserver(new SunRoofCloseCarObserver());
    car.start();

    car.run();

    car.stop();

    // 4) 시동 끌 때 자동차 전조등을 자동으로 끄는 기능을 추가한다.
    // => car의 stop()에 해당 메서드 추가
    // => 전조등을 자동으로 끄는 옵저버(LightOffCarObserver)를 정의한다.
    // => Car 객체에 등록한다.

  }

}


