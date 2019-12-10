package com.eomcs.basic.ex03;

// 문자열  리터럴 (literal)
// 
public class Exam6 {
  public static void main (String[] args){
    // 큰 따옴표("") 사용하여 문자욜을 나열한다.
    System.out.println("홍길동");
    System.out.println("가"); // 문자가 아니라 문자열이다!

    // + 연산자 (operator; 특정기능을 수행하는 명령) 을 이용하여
    // 여러개의 문자열을 하나로 합쳐 새로운 문자열을 만들수 있다.
    System.out.println("홍길동" + "입니다");

    //문자열과 다른 종류의 값을 더한다?
    // >> 다른 종류의 값을 문자열로 변환한 후
    //    기준 문자열에 결합하여 새 문자열을 만든다.
    System.out.println("홍길동" + 20 + "살입니다");
    System.out.println("취업여부: " + false);
    System.out.println("키 :" + 179.6f);
    //f는 값이 아니다.


    // 문자열의 저장?
    // - 자바는 char(2byte) 배열 (여러개의메모리)에 
    //    문자열의 유니코드 (unicode; UCS-2) 저장한다.
    //ex) "AB가각"
    // [0041][0042][ac00][ac01] << 2바이트 메모리 4개에 저장됨.
    //

  }
}