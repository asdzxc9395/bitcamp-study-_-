package com.eomcs.basic.ex03;

// 부동소수점 리터럴 (literal) - 부동소수점의 리터럴은 기본이 왜 8바이트인가?
// 
public class Exam342 {
  public static void main (String[] args){

    System.out.println(54345.66f);
    System.out.println(11.23456f);
    // 54345.66         (7자리!)
    //+   11.23456      (7자리!)
    //ㅡㅡㅡㅡㅡ
    // 54356.89456      (10자리: 계산결과가 유효자리값을 넘는다.)

    System.out.println(54345.66f + 11.23456f);
  }
}