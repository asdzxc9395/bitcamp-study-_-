package com.eomcs.lms;


import java.util.Scanner;


public class App5_2 {

  public static void main(String[] args) {
    Scanner key = new Scanner(System.in);


    System.out.println("입력?");
    int Start = key.nextInt();
    int end = key.nextInt();
    key.nextLine();

    key.close();

    System.out.println();
    int Sum = 0;
    
    
    for (int no = Start; no <= end; no++) {
      Sum = Sum + no;
      
    }
    
    System.out.printf("%d에서 %d 까지의 합은  %d입니다.", Start, end,
        Sum
        );


  }
}






