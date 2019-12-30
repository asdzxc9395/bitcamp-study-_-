package com.eomcs.oop.ex02.study;

public class Car {
  
  public static final int OIL = 1;
  public static final int GAS = 2; // final로 선언한뒤 스태틱으로 바꾸는게 좋다.
  String name;              // final = static 선언후 public선언하면 외부에서 사용가능
  int type;
  String color;
  int speed;
  int energe;
  int power;
  int cleanlevel;

  // 위 인스턴스 필드에 메서드(연산자)기능을 추가 할수 있다.

  void speedUp() { // 1. 인스턴스 메모리 주소를 받는다.
    //Car this = 메서드를 호출할 때 넘겨준 인스턴스 주소
    if (this.speed >= 100) 
      return; // 리턴>> 현재상태에서 끝내고 돌아간다.
    this.speed += 10;
  }
  // 1. 클래스로 데이터 정의
  // 2. 인스턴스로 맞는 연산자 정의 
  // 클래스 필드를 사용해서 메모리 구조 설계 >> 인스턴스 메서드, 구조를 통해 연산자 정의
  int comparePower(Car c) {
    if (this.power > c.power)
      return -1;
    else if (this.power == c.power)
      return 0;
    else 
      return 1;
  }
}