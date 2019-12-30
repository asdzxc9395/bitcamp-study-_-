package com.eomcs.oop.ex02.study;

public class GasStation {
  String name;
  int type; // 스태틱 변수는 클래스당 하나밖에 만들지 못한다.
                   // 여러종류의 타입을 바꿀경우 인스턴스로 바꾼다.
  
  
  int refuel (Car c) {
    if(c.type != this.type)
      return 0;
    int amount = 100 - c.energe;
    c.energe = 100;
    return amount;
  }

  static void clean (Car c) {
    c.cleanlevel = 0; // 인스턴스 변수를 안쓰므로 static를 땔 필요가 없다.
  }                   // 인스턴스 필드를 사용하지 않을경우 static으로 놔둔다.
// 용도, 기능을 묶은 클래스

}
