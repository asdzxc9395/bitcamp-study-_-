package com.eomcs.lms;

import java.sql.Date;
import java.util.Scanner;

public class App {

  public static void main(String[] args) {
    
    Scanner keyboard = new Scanner(System.in);
    
    final int Size = 100;
    int[] no = new int[Size];
    
    int[] no1 = new int[Size];
    String[] title = new String[Size];
    String[] contents = new String[Size];
    Date[] start = new Date[Size];
    Date[] end = new Date[Size];
    int[] total = new int[Size];
    int[] day = new int[Size];
    
    
    int count = 0;
    
    for (int i = 0; i < Size; i ++) {
      count++;
    System.out.print("번호? ");
    no1[i] = keyboard.nextInt();
    keyboard.nextLine();
    
    System.out.print("수업명? ");
    title[i] = keyboard.nextLine();
    
    System.out.print("수업내용? ");
    contents[i] = keyboard.nextLine();
    
    System.out.print("시작일? ");
    start[i] = Date.valueOf(keyboard.nextLine());
    
    System.out.print("종료일? ");
    end[i] = Date.valueOf(keyboard.nextLine());
    
    System.out.print("총수업시간? ");
    total[i] = keyboard.nextInt();
    
    System.out.print("일수업시간? ");
    day[i] = keyboard.nextInt();
    keyboard.nextLine();
    
    System.out.print("계속 입력하시겠습니까?(Y/n) ");
    String response = keyboard.nextLine();
    if (!response.equalsIgnoreCase("y")) 
      break;
    }
    
    
    keyboard.close();
    System.out.println();
    
    for (int i = 0; i < count; i++) {
    System.out.printf("%d, %s, %s, %s ~ %s, %d, %d\n",
        no1[i], title[i], contents[i], start[i], end[i], 
        total[i], day[i]);
    }
  }
}






