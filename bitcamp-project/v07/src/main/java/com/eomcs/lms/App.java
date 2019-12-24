package com.eomcs.lms;

import java.sql.Date;
import java.util.Scanner;

public class App {

  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);

    class Lesson {
      int no1;
      String title;
      String contents;
      Date start;
      Date end;
      int total;
      int day;
      Date date1;
    }
    final int Size = 100;
    
    Lesson[] lessons = new Lesson[Size];


    int count = 0;

    for (int i = 0; i < Size; i ++) {
      
      Lesson lesson = new Lesson();//회원 정보를 저장할 메모리를 설계도에 따라 만든다.
      count++;
      
      System.out.print("번호? ");
      lesson.no1 = keyboard.nextInt();
      keyboard.nextLine();

      System.out.print("수업명? ");
      lesson.title = keyboard.nextLine();

      System.out.print("수업내용? ");
      lesson.contents = keyboard.nextLine();

      System.out.print("시작일? ");
      lesson.start = Date.valueOf(keyboard.nextLine());

      System.out.print("종료일? ");
      lesson.end = Date.valueOf(keyboard.nextLine());

      System.out.print("총수업시간? ");
      lesson.total = keyboard.nextInt();

      System.out.print("일수업시간? ");
      lesson.day = keyboard.nextInt();
      keyboard.nextLine();
      
      lesson.date1 = new Date(System.currentTimeMillis());

      //회원 정보가 담겨있는 인스턴스의 주소를 래퍼런스 배열에 보관한다.
      lessons[i] = lesson;
      
      System.out.print("계속 입력하시겠습니까?(Y/n) ");
      String response = keyboard.nextLine();
      if (!response.equalsIgnoreCase("y")) 
        break;
    }


    keyboard.close();
    System.out.println();

    for (int i = 0; i < count; i++) {
      Lesson lesson = lessons[i];
      System.out.printf("%d, %s, %s, %s ~ %s, %d, %d\n, %s",
          lesson.no1, lesson.title,lesson. contents, 
          lesson.start, lesson.end, 
          lesson.total, lesson.day, lesson.date1);
    }
  }
}






