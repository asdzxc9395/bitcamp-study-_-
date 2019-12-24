package com.eomcs.lms;


import java.util.Scanner;


public class App6_5 {

  public static void main(String[] args) {

    int max = Integer.MAX_VALUE;
    int min = Integer.MIN_VALUE;

    Scanner keyboard = new Scanner(System.in);

    System.out.println("입력? ");

    while (true) {
      int no = keyboard.nextInt();
      if (no == 0)
        break;
      min = no < min ? no : min;
      max = no > max ? no : max;
      
    }
    keyboard.close();
    System.out.printf("최댓값 : %d \n최소값 : %d", max , min);
  }
}







