package com.eomcs.oop.ex02.study;

public class Test04 {
  public static void main(String[] args) {



    Car c1 = new Car(); // 인스턴스 필드를 선언해서 new를 선언하여 heap 영역에 저장된다.
    Car c2 = new Car(); // Car이라는 설계도를 만들었기 때문에 그 메모리를 저장할려면 메모리 주소를 만들어야 한다.(래퍼런스)
                        // 스태틱으로 선언해서 할때 클래스당 하나밖에 저장할수 없다.

    c1.name = "봉봉";
    c1.type = Car.OIL; //스태틱 변수로할시 로딩시 바로 만들어지므로 클래스 이름으로 선언가능
    c1.color = "빨강";
    c1.speed = 0;
    c1.energe = 80;
    c1.power = 200;

    c2.name = "호호";
    c2.type = Car.GAS;
    c2.color = "검정";
    c2.speed = 0;
    c2.energe = 60;
    c2.power = 300;

    System.out.printf("c1의 의 잔류량: %d\n", c1.energe);
    System.out.printf("c2의 의 잔류량: %d\n", c2.energe);

    GasStation station1 = new GasStation();
    station1.type = Car.OIL;
    station1.name = "강남주유소";

    GasStation station2 = new GasStation();
    station2.type = Car.GAS;
    station2.name = "서초주유소";

    station1.refuel(c1); // 인스턴스 주소를 주고 메서드를 호출해야 한다.
    station2.refuel(c2);

    System.out.printf("c1의 의 잔류량: %d, %s\n", c1.energe, c1.name);
    System.out.printf("c2의 의 잔류량: %d\n", c2.energe);
    GasStation.clean(c1);
    GasStation.clean(c2);

  }
}
