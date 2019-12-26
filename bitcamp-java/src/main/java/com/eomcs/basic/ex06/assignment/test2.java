package com.eomcs.basic.ex06.assignment;

import java.util.Scanner;
// 현재 과제와 유사한 결과를 내는 기존 소스를 가져온다.

public class test2 {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner (System.in);


    System.out.println("밑변길이? ");
    int no2 = keyboard.nextInt();

    int no1 = 0;
 
    while (no1++ < no2) {
      int no3 = 0;
      while (no3++ < no1) {
        System.out.printf("*");
      } 
      System.out.println();
    }
   
    //반대로 실행하는데 no1의 값이 no2인 값에서 실행한다.
    no1--;
    while (--no1 > 0) {
      int no3 = 0;
      while (no3++ < no1 ) {
        System.out.print("*");
      }
      System.out.println();
    }
    
    
    keyboard.close();
  }
}
