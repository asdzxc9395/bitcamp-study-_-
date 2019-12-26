package com.eomcs.basic.ex06.assignment;

import java.util.Scanner;

public class test1 {    
  public static void main(String[] args){

    Scanner keyboard = new Scanner(System.in);

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
    
    
    
  }
}
