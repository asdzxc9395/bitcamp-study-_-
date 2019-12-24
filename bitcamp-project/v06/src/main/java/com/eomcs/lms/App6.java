package com.eomcs.lms;


import java.util.Scanner;


public class App6 {

  public static void main(String[] args) {
    
    int[] num = new int[5];
    Scanner keyboard = new Scanner(System.in);
    int max= num[0], min= num[0];
    
    
    
    for (int i = 0; i < 1;  i++) {
      System.out.println("입력? ");
    
    num[0] = keyboard.nextInt();
    num[1] = keyboard.nextInt();
    num[2] = keyboard.nextInt();
    num[3] = keyboard.nextInt();
    num[4] = keyboard.nextInt();
    if (num[0] > num[1] && num[0] > num [2] && num[0] > num [3] && num[0] > num [4]) {
      
      max = num[0];
      
    }
    else if (num[1] > num [2] && num[1] > num [3] && num[1] > num[4]) {
      max = num[1];
    }
    else if ( num[2] > num [3] && num[2] > num [4]) {
      max = num[2];
    }
    else if (num[3] > num[4]) {
      max = num[3];
    }
    else {
      max = num[4];
    }
    
if (num[0] < num[1] && num[0] < num [2] && num[0] < num [3] && num[0] < num [4]) {
      
      min = num[0];
      
    }
    else if (num[1] < num [2] && num[1] < num [3] && num[1] < num [4]) {
      min = num[1];
    }
    else if ( num[2] < num [3] && num[2] < num [4]) {
      min = num[2];
    }
    else if (num[3] < num[4]) {
      min = num[3];
    }
    else {
      min = num[4];
    }
    }
    
    for (int i = 0; i < 1;  i++)
    
    System.out.printf("최댓값 : %d \n최소값 : %d", max , min);
    keyboard.close();
  }
}






