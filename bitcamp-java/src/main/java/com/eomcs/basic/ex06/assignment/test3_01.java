package com.eomcs.basic.ex06.assignment;

import java.util.Scanner;

public class test3_01 {    
  public static void main(String[] args) {

    int no = Console.inputInt();

    if (no %2 == 0)
      no--;//짝수값을 입력하였을때, 홀수값으로 변경하기 위해서 
    //조건문을 입력한다.

    int spacesize = no >> 1; // 2로 나눈다.
    int no1 = 0;
    while (no1++ < no) {
      if (no1 % 2 == 0) {
        continue;
      }// 짝수를 없앤다.

      Graphic.drawLine(spacesize, ' ');
      spacesize--;
      Graphic.drawLine(no1, '*');
      System.out.println();
    }
  }
}
