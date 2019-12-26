package com.eomcs.basic.ex06.assignment;

//import java.util.Scanner;
// 현재 과제와 유사한 결과를 내는 기존 소스를 가져온다.

public class test2_01 {
  public static void main(String[] args) {
    
    int width = Console.inputInt();
    
    int no1 = 0;
    while (no1++ < width) {
      Graphic.drawLine(no1);
      System.out.println();
    }

    //반대로 실행하는데 no1의 값이 no2인 값에서 실행한다.
    no1--;
    while (--no1 > 0) {
      Graphic.drawLine(no1);
      System.out.println();
    }
  }
}


