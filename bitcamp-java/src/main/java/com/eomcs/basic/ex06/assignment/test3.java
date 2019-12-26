package com.eomcs.basic.ex06.assignment;

import java.util.Scanner;

public class test3 {    
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);

    System.out.println("밑변의 길이? ");
    int no = keyboard.nextInt();
    
    if (no %2 == 0)
      no--;//짝수값을 입력하였을때, 홀수값으로 변경하기 위해서 
           //조건문을 입력한다.
    
    int spacesize = no >> 1;
    int no1 = 0;
    while (no1++ < no) {
      if (no1 % 2 == 0) {
        continue;
      }// 짝수를 없앤다.
      
      int count = 0;
      while (count++ < spacesize) {
        System.out.print(" ");
      }
      spacesize--;
      
      int no3 = 0;
      while (no3++ < no1) {
        System.out.printf("*");
      } 
      System.out.println();
    }
      
      
  }
  }
