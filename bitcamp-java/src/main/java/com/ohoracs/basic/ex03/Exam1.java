package com.ohoracs.basic.ex03;

// 리터럴 (literal)
// - 자바 언어에서 값을 표기하는 문법
public class Exam1 {
  public static void main (String[] args){

    //정수 리터럴
    System.out.println(78); // 10진수 표기점
    //78이 정수 리터럴 이다.

    System.out.println(+78); // 10진수 표기점
    System.out.println(-78); // 10진수 표기점
    
    
    System.out.println(0116); // 8진수 표기점
    System.out.println(-0116); // 8진수 표기점

    System.out.println(0x4e); // 16진수 표기점
    System.out.println(-0x4e); // 16진수 표기점

    System.out.println(0b01001110); // 2진수 표기점



    //부동소수점 리터럴
    System.out.println(3.14); //고정 소수점
    System.out.println(0.314e1); // e1 = 10의 1승 ,부동소수점
    System.out.println(31.4e-1); // e-1= 10의 -1승 , 부동소수점

    //논리 리터럴
    System.out.println(true);
    System.out.println(false);

    //문자 리터럴
    System.out.println('가'); //문자 하나만 가능하다. 두개이상은 에러
    System.out.println('A');

    //문자열 리터럴
    System.out.println("안녕하세요! 비트캠프");
    

  }
}