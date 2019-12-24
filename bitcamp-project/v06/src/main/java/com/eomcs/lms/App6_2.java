package com.eomcs.lms;


import java.util.Scanner;


public class App6_2{

  public static void main(String[] args) {

    int[] no = new int[5];
    Scanner keyboard = new Scanner(System.in);

    System.out.println("입력? ");
    for (int i = 0; i < 5; i++) {
      no[i] = keyboard.nextInt();
    }

    int max= no[0], min= no[0];

    for (int i = 0; i < 5; i++) {
      if (no[i] < min) {
        min = no[i];}
      else if (no[i] > max) {
        max = no[i];
      }
    }

    System.out.printf("최댓값 : %d \n최소값 : %d", max , min);
    keyboard.close();
  }
}






