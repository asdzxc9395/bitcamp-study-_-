package com.eomcs.lms;


import java.util.Scanner;


public class App6_4{

  public static void main(String[] args) {

    int max = Integer.MAX_VALUE;
    int min = Integer.MIN_VALUE;

    Scanner keyboard = new Scanner(System.in);

    System.out.println("입력? ");
    for (int i = 0; i < 5; i++) {
      int no = keyboard.nextInt();
      
      min = no < min ? no : min;
      max = no > max ? no : max;
    }
    keyboard.close();
    System.out.printf("최댓값 : %d \n최소값 : %d", max , min);
  }
}







