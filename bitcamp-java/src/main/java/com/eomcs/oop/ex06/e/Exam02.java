// 다형적 변수와 오버라이딩
package com.eomcs.oop.ex06.e;

public class Exam02 {
  public static void main(String[] args) {
    A a = new A3();
    a.m(); // A2의 m() 호출
    ((A3)a).Y();
    System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
    // 왜 A2가 호출되냐면
    // a가 실제 가리키는 A3 클래스로부터 상위클래스로 따라 올라가면서
    // 첫번째로만난 m()을 호출해
    
    // A3에  m이 있으면 A3가 호출되겠지?
    


  }
}






