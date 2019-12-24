package com.eomcs.lms;

import java.sql.Date;
import java.util.Scanner;

// 반복문 사용
public class App4 {

  
    public static void main(String[] args) {
      
      Scanner keyboard = new Scanner(System.in);
      //시스템을 통해서  스캐너를 담는 변수 (keyboard) 
      
      int[] no = new int [100];
      //int no1 = 0, no2 = 0, no3 = 0, no4 = 0, no5 = 0;
      String[] title = new String[100];      
      //String title1 = "", title2 = "", title3 = "", title4 = "", title5 = "";
      Date[] date = new Date[100];      
      //Date date1 = null, date2 = null, date3 = null, date4 = null, date5 = null;
      int[] count = new int[100];
      //int count1 = 0, count2 = 0, count3 = 0, count4 = 0, count5 = 0;
      String responce;
      
      
       System.out.print("번호?");
       no[0] = keyboard.nextInt();
       keyboard.nextLine(); // 줄바꿈 기호 제거용
       
       System.out.print("내용?");
       title[0] = keyboard.nextLine();
       
       date[0] = new Date(System.currentTimeMillis());
       count[0] = 0;
       
       System.out.println();
       
       System.out.print("계속 입력하시겠습니까? (Y/N)");
       responce = keyboard.nextLine();
         
         if (responce.equalsIgnoreCase("y")) {
           System.out.print("번호?");
           no[1] = keyboard.nextInt();
           keyboard.nextLine(); // 줄바꿈 기호 제거용
           
           System.out.print("내용?");
           title[1] = keyboard.nextLine();
           
           date[1] = new Date(System.currentTimeMillis());
           count[1] = 0;
           
           System.out.println();
           
           System.out.print("계속 입력하시겠습니까? (Y/N)");
           responce = keyboard.nextLine();
           
           if (responce.equalsIgnoreCase("y")) {
             System.out.print("번호?");
             no[2] = keyboard.nextInt();
             keyboard.nextLine(); // 줄바꿈 기호 제거용
             
             System.out.print("내용?");
             title[2] = keyboard.nextLine();
             
             date[2] = new Date(System.currentTimeMillis());
             count[2] = 0;
             
             System.out.println();
             
             System.out.print("계속 입력하시겠습니까? (Y/N)");
             responce = keyboard.nextLine();
             
             if (responce.equalsIgnoreCase("y")) {
               System.out.print("번호?");
               no[3] = keyboard.nextInt();
               keyboard.nextLine(); // 줄바꿈 기호 제거용
               
               System.out.print("내용?");
               title[3] = keyboard.nextLine();
               
               date[3] = new Date(System.currentTimeMillis());
               count[3] = 0;
               
               System.out.println();
               
               System.out.print("계속 입력하시겠습니까? (Y/N)");
               responce = keyboard.nextLine();
               
               if (responce.equalsIgnoreCase("y")) {
                 System.out.print("번호?");
                 no[4] = keyboard.nextInt();
                 keyboard.nextLine(); // 줄바꿈 기호 제거용
                 
                 System.out.print("내용?");
                 title[4] = keyboard.nextLine();
                 
                 date[4] = new Date(System.currentTimeMillis());
                 count[4] = 0;
                 
                 System.out.println();
                 
                 responce = keyboard.nextLine();
               }
             }
           } 
       }
         


       
     //현재 일시 
       //currentTimeMillis()
       // >> 1970년 1월 1일 0시 0분 0초부터 현재까지 경과된 시간을 
       // 밀리초로 리턴한다.
       //new Date(밀리초)
       // >> 넘겨받은 밀리초를 가지고 년, 월, 일, 시 , 분, 초를 계산한다.
       
       
       
       keyboard.close();
       
      System.out.println();

      System.out.printf("%d, %s, %s, %d\n", no[0], title[0], date[0], count[0]);
      System.out.printf("%d, %s, %s, %d\n", no[1], title[1], date[1], count[1]);
      System.out.printf("%d, %s, %s, %d\n", no[2], title[2], date[2], count[2]);
      System.out.printf("%d, %s, %s, %d\n", no[3], title[3], date[3], count[3]);
      System.out.printf("%d, %s, %s, %d\n", no[4], title[4], date[4], count[4]);
      
 } 
}
