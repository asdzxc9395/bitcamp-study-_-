package com.eomcs.lms.handler;

import java.sql.Date;
import java.util.Scanner;
import com.eomcs.lms.domain.Board;
import com.eomcs.lms.domain.Lesson;

public class LessonHandler {

 
    static final int Lesson_Size = 100;
    static Lesson[] lessons = new Lesson[Lesson_Size];
    static int Lessoncount = 0;
    public static Scanner keyboard;

    public static void addLesson() {
      Lesson lesson = new Lesson();

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

      lessons[Lessoncount++] = lesson;
      System.out.println("저장하였습니다.");
    }

    public static void listLesson() {
      for (int i = 0; i < Lessoncount; i++) {
        Lesson l = lessons[i];
        System.out.printf("%d, %s, %s, %s ~ %s, %d, %d\n, %s",
            l.no1, l.title,l. contents, 
            l.start, l.end, 
            l.total, l.day, l.date1);
      }
    }
    
    public static void detailLesson() {
      System.out.println("게시물 번호? ");
      int no = keyboard.nextInt();
      keyboard.nextLine();//숫자뒤에 남은 공백 제거

      if (no < 0 || no >=  Lessoncount) {
        System.out.println("게시물 번호가 유효하지 않습니다.");
        return;
      }

      Lesson lesson = lessons[no];
      
      System.out.printf("번호: %d\n", lesson.no1);
      System.out.printf("제목: %s\n", lesson.title);
      System.out.printf("등록일: %s\n", lesson.date1);
    }
    
  }
