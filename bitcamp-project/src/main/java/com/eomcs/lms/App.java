
package com.eomcs.lms;

import java.util.Scanner;

public class App {

  
  
    public static void main(String[] args) {
      // 스캐너:키보드에서 사용자가 입력한 값을 읽어 문자열이나 정수, 부동소수점 등으로 리턴하는 역할
      Scanner keyboard = new Scanner(System.in);
      
       System.out.print("번호?");
       String no = keyboard.nextLine();
       
       System.out.print("수업?");
       String title = keyboard.nextLine();
       
       System.out.print("설명?");
       String description = keyboard.nextLine();
       
       System.out.print("시작일?");
       String start = keyboard.nextLine();
       
       System.out.print("종료일?");
       String end = keyboard.nextLine();
       
       System.out.print("총 수업시간?");
       String fullstudytime = keyboard.nextLine();
       
       System.out.print("일 수업시간?");
       String daystudytime = keyboard.nextLine();
       
      System.out.printf("번호: %s\n", no);
      System.out.printf("수업: %s \n", title);
      System.out.printf("설명:%s\n", description);
      System.out.printf("기간:%s ~ %s\n" , start, end);
      System.out.printf("총수업시간: %s 시간\n" , fullstudytime);
      System.out.printf("일수업시간:%s\n" ,daystudytime);
      
      keyboard.close();
      
      
                              
    }
}
