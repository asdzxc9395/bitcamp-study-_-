package com.eomcs.lms;

import java.sql.Date;
import java.util.Scanner;

public class App3 {

  
    public static void main(String[] args) {
      
      Scanner keyboard = new Scanner(System.in);
      
       System.out.print("번호?");
       String no = keyboard.nextLine();
       
       System.out.print("내용?");
       String title = keyboard.nextLine();
       
       System.out.print("번호:");
       String no2 = keyboard.nextLine();
       
       System.out.print("내용:");
       String start = keyboard.nextLine();
       
       System.out.print("작성일:");
       String day = keyboard.nextLine();
       
       System.out.print("조회수:");
       String fullstudytime = keyboard.nextLine();

      System.out.printf("번호? %s\n", no);
      System.out.printf("내용? %s \n\n", title);
      System.out.printf("번호: 1%s\n", no2 );
      System.out.printf("내용: %s\n" , start );
      System.out.printf("작성일: %s\n" , day);
      System.out.printf("조회수: %s\n" , fullstudytime);

      
      keyboard.close();
  }

}
