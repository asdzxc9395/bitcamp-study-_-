package com.eomcs.basic.ex04;

// 변수의 종류
public class Exam71 {
  
  //인스턴스 필드(변수)
  //=>new 명령을 실행할 때 준비되느 변수
  int instanceVar; // 인스턴스 필드
  static int classVar; // 클래스 필드(변수) = 스태틱 필드(변수)
  
  public static void main(String[] args/* 로컬변수 (파라미터)*/) {
    
    // 로컬 변수
    // => 메소드 블록안에 선언된 변수
    // => 메서드 블록을 벗어나서 사용할 수 없다.
    // =>메서드를 실행할 때 준비되는 변수;
    int local; // 로컬 변수
    int local2;
    
    classVar = 200; //OK!
    
    //static 이 안 붙은 인스턴스 변수를 사용할 수 없다.
    //instaceVar = 300; // 컴파일 오류
  }
  
  
  static void m1() {
    // 메서드 블록이 다르면 변수도 다르다.
    // 그래서 같은 이름의 변수를 선언할 수 있다.
    int local; 
    
    //다른 메서드 블록에 있는 변수를 사용할 수 없다.
    //local2 = 100; // 컴파일오류 
    
    // 같은 스테틱 멤버는 사용할 수 있다.
    classVar = 100; //OK!
    
    //인스턴스 메서드
   void m2() {
     int local; // OK!
     
     classVar = 200; // static 멤버 사용 가능
     // instanceVar = 200; //OK! static이 안붙은 변수 사용가능
   }
  } 
  }


