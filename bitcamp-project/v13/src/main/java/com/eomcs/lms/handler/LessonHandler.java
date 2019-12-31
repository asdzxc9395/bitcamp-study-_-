package com.eomcs.lms.handler;

import java.sql.Date;
import java.util.Scanner;
import com.eomcs.lms.domain.Lesson;

public class LessonHandler {

  //인스턴스 필드 = 논스태틱 필드
  //각 수업 목록을 개별적으로 관리할 변수
    Lesson[] lessons = new Lesson[Lesson_Size];
    int Lessoncount = 0;
    
    //클래스필드
    //>>공유할 변수
    static final int Lesson_Size = 100;
    public static Scanner keyboard;

    public void addLesson() {
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

      this.lessons[this.Lessoncount++] = lesson;
      System.out.println("저장하였습니다.");
    }

    public void listLesson() {
      for (int i = 0; i < this.Lessoncount; i++) {
        Lesson l = this.lessons[i];
        System.out.printf("%d, %s, %s, %s ~ %s, %d, %d\n, %s \n",
            l.no1, l.title,l. contents, 
            l.start, l.end, 
            l.total, l.day, l.date1 );
      }
    }
    
    public void detailLesson() {
      System.out.println("게시물 번호? ");
      int no = keyboard.nextInt();
      keyboard.nextLine();//숫자뒤에 남은 공백 제거

      Lesson lesson = null;
      for (int i = 0; i < this.Lessoncount; i++) {
        if (this.lessons[i].no1 == no) {
          lesson = this.lessons[i];
          break;
        }
      }

      if (lesson == null) {
        System.out.println("게시물 번호가 유효하지 않습니다.");
        return;
      }
      
      System.out.printf("번호: %d\n", lesson.no1);
      System.out.printf("제목: %s\n", lesson.title);
      System.out.printf("등록일: %s\n", lesson.date1);
    }
    
  }
