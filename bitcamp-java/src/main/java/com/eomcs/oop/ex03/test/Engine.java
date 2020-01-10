package com.eomcs.oop.ex03.test;

public class Engine {
  int valve;
  int sylinder;
  int cc;
  int oilState;
  
  Engine(int sylinder, int valve, int cc) {
    this.sylinder = sylinder;
    this.valve = valve;
    this.cc = cc;
    this.oilState = 0;
  }
  void cleanOil() {//인스턴스 메서드
    this.oilState = 10;
  }
}
