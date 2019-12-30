package com.eomcs.oop.ex02.study;

public class Test03 {
  public static void main(String[] args) {
    Car c1 = new Car(); // 인스턴스 필드를 선언해서 new를 선언하여 heap 영역에 저장된다.
    Car c2 = new Car(); // Car이라는 설계도를 만들었기 때문에 그 메모리를 저장할려면 메모리 주소를 만들어야 한다.(래퍼런스)
                        // 스태틱으로 선언해서 할때 클래스당 하나밖에 저장할수 없다.

    c1.name = "봉봉";
    c1.type = 1;
    c1.color = "빨강";
    c1.speed = 0;
    c1.energe = 100;
    c1.power = 200;

    c2.name = "호호";
    c2.type = 2;
    c2.color = "검정";
    c2.speed = 0;
    c2.energe = 100;
    c2.power = 300;
    
    c1.speedUp();
    c1.speedUp();
    c2.speedUp();
    
    
    System.out.printf("c1의 속도: %d\n", c1.speed);
    System.out.printf("c2의 속도: %d\n", c2.speed);
    
    System.out.printf("c1 vs c2 의 힘: %d\n",
      c1.comparePower(c2));
    //인스턴스의 값을 다루는 것 : 연산자
    //현업에 가면 인스턴스 클레스는 인스턴스 메서드로 처리한다.
    //

  }
}
