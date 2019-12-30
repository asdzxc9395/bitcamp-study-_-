package com.eomcs.oop.ex03.test;

import com.eomcs.oop.ex03.test.sub.A;

/*
public class A {

}// 패키지 멤버 클래스 (패키지에 소속된 클래스) */

class Score {
  static int count; // 각각 개별적으로 관리해야할 데이터라면 static말구 인스턴스로 만들라
  String name;
  int kor;
  int eng;
  int math;
  int sum;
  float aver;
  
  Score() { // 파라미터가 없는 생성자를 default 생성자라 한다.
    //인스턴스가 자동으로 사용될수 있도록 초기화한다.
    //인스턴스를 생성한 후 유효한 값으로 사용하기 위해 초기화한다.
    //실행시 무조건 1개이상의 생성자가 실행된다.
    System.out.println("Score()"); 
    Score.increase();
    
  }
  Score(String name, int kor, int eng, int math) {
    System.out.println("Score() - 2");
    this.name = name;
    this.kor = kor;
    this.eng = eng;
    this.math = math;
    this.compute();
    Score.increase();
  }
  
  
  static void increase() {
    Score.count++;
  }
  
  void compute() {
    this.sum = this.kor + this.eng + this.math;
    this.aver = this.sum / 3f;
  }
}//패키지 멤버클래스 but, public가 될수 없다 >> 따로 파일을 두어야 한다.

class Score2 {
  static int count; // 각각 개별적으로 관리해야할 데이터라면 static말구 인스턴스로 만들라
  static String name;
  static int kor;
  static int eng;
  static int math;
  static int sum;
  static float aver;
}//패키지 멤버클래스 but, public가 될수 없다 >> 따로 파일을 두어야 한다.

public class Test01 {
  public static void main (String[] args) {
      Score s1 = new Score(); 
      System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
      Score.count = 1;
      s1.name = "홍길동";
      s1.kor = 100;
      s1.eng = 90;
      s1.math = 80;
      s1.sum = s1.kor + s1.eng + s1.math;
      s1.aver = s1.sum / 3f;
      s1.compute();
      Score.increase();
      
      Score s2 = new Score("임꺽정", 90, 80, 70);
      System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
  }
}
