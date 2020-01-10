// 다형성 - 다형적 변수(polymorphic variables)
package com.eomcs.oop.ex06.a;

public class Exam0115 {

  public static void main(String[] args) {
    // 상위 클래스의 래퍼런스로 하위클래스의 인스턴스를 가리킬 때  
    Car c = new Car();


    c.model = "티코"; // Vehicle의 인스턴스변수
    c.capacity = 5;
    c.cc = 890; // Car의 인스턴스 변수
    c.valve = 16;

    // 래퍼런스가 실제 하위 인스턴스를 가리키고 있다 하더라고,
    // 래퍼런스 타입의 범위를 벗어나서 사용할 수 없다. (상위 인스턴스의 범위를 벗어나서 사용 x)

    //c.sunroof = true;
    //c.auto = true;
    // 왜 ?
    // >> 자바 컴파일러는 래퍼런스가 실제 어떤 인스턴스를 가리키는지 따지지 않고
    //    래퍼런스의 타입에 한정하여 인스턴스나 클래스 멤버 사용을 허락한다.

    // 해결책?
    // >> 래퍼런스 변수가 실제 가리키는것이 무엇인지 알려줘야한다.
    // >> ((원래 인스턴스 타입) 래퍼런스).멤버
    ((Sedan)c).sunroof = true;
    ((Sedan)c).auto = true;
    
    // >> 또는 인스턴스의 원래 클래스 래퍼런스에 저장한 다음에 사용.
    Sedan s = (Sedan)c;
    s.sunroof = true;
    s.auto = true;


  }
}
