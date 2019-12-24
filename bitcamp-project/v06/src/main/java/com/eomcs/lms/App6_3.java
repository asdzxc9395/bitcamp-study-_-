package com.eomcs.lms;


import java.util.Scanner;


public class App6_3 {

  public static void main(String[] args) {

    int max = Integer.MAX_VALUE, min = Integer.MIN_VALUE;

    Scanner keyboard = new Scanner(System.in);

    System.out.println("입력? ");
    for (int i = 0; i < 5; i++) {
      int no = keyboard.nextInt();
    

    if ( i == 0 ) {
      min = no;
      max = no;
    } else {
      if (no < min) {
        min = no;
      } else if (no > max) {
        max = no;
      }
    }

    }
    System.out.printf("최댓값 : %d \n최소값 : %d", max , min);
    keyboard.close();
  }
}






