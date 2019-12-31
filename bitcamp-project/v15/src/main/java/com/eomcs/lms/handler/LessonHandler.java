package com.eomcs.lms.handler;

import java.sql.Date;
import java.util.Scanner;
import com.eomcs.lms.domain.Lesson;

public class LessonHandler {

  //인스턴스 필드 = 논스태틱 필드
  //각 수업 목록을 개별적으로 관리할 변수
    Lesson[] lessons;
    int Lessoncount = 0;
    
    public Scanner input; // 생성자
    
    //클래스필드
    //>>공유할 변수
    static final int Lesson_Size = 100;
    
    public LessonHandler(Scanner input) {
      this.input = input;
      this.lessons = new Lesson[Lesson_Size];
    }

    public void addLesson() {
      Lesson lesson = new Lesson();

      System.out.print("번호? ");
      lesson.setNo1(input.nextInt());
      input.nextLine();

      System.out.print("수업명? ");
      lesson.setTitle(input.nextLine());

      System.out.print("수업내용? ");
      lesson.setContents(input.nextLine());

      System.out.print("시작일? ");
      lesson.setStart(Date.valueOf(input.nextLine()));

      System.out.print("종료일? ");
      lesson.setEnd(Date.valueOf(input.nextLine()));

      System.out.print("총수업시간? ");
      lesson.setTotal(input.nextInt());

      System.out.print("일수업시간? ");
      lesson.setDay(input.nextInt());
      input.nextLine();

      lesson.setDate1(new Date(System.currentTimeMillis()));

      this.lessons[this.Lessoncount++] = lesson;
      System.out.println("저장하였습니다.");
    }

    public void listLesson() {
      for (int i = 0; i < this.Lessoncount; i++) {
        Lesson l = this.lessons[i];
        System.out.printf("%d, %s, %s, %s ~ %s, %d, %d\n, %s \n",
            l.getNo1(), l.getTitle(),l. getContents(), 
            l.getStart(), l.getEnd(), 
            l.getTotal(), l.getDay(), l.getDate1() );
      }
    }
    
    public void detailLesson() {
      System.out.println("게시물 번호? ");
      int no = input.nextInt();
      input.nextLine();//숫자뒤에 남은 공백 제거

      Lesson lesson = null;
      for (int i = 0; i < this.Lessoncount; i++) {
        if (this.lessons[i].getNo1() == no) {
          lesson = this.lessons[i];
          break;
        }
      }

      if (lesson == null) {
        System.out.println("게시물 번호가 유효하지 않습니다.");
        return;
      }
      
      System.out.printf("번호: %d\n", lesson.getNo1());
      System.out.printf("제목: %s\n", lesson.getTitle());
      System.out.printf("등록일: %s\n", lesson.getDate1());
    }
    
  }
