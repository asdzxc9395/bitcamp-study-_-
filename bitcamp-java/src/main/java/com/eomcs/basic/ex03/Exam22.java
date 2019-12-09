package com.eomcs.basic.ex03;

// 리터럴 (literal)
// - 자바 언어에서 값을 표기하는 문법

//_(언더바) 사용법
public class Exam22 {
  public static void main (String[] args){

    //10진수 리터럴
    
    System.out.println(2_3500_0000); // 언더바 위치는 자리에 상관이 없다.
    // 맨앞, 맨뒷자리 는 못넣는다
    //System.out.println(_23500_0000);
    
    //8진수 리터럴
    System.out.println(01_44);
    System.out.println(0_144);
    //System.out.println(0144_);
    //System.out.println(_0144);

    // 2진수
    System.out.println(0b0110_0100);
    //System.out.println(0B01100100_);
    //System.out.println(0B_01100100);
    //System.out.println(_0B01100100);

    //16진수
    System.out.println(0x64);
    //System.out.println(0x64_);
    //System.out.println(_0x64);
    //System.out.println(0x_64);
    System.out.println(0x000000000064);

  }
}