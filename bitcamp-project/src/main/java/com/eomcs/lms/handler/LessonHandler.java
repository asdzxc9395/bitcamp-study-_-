package com.eomcs.lms.handler;

import java.sql.Date;
import java.util.Scanner;
import com.eomcs.lms.domain.Lesson;

public class LessonHandler {

  LessonList lessonList = new LessonList();

  public Scanner input; // 생성자

  public LessonHandler(Scanner input) {
    this.input = input;
    lessonList = new LessonList();
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


    lessonList.add(lesson);

    System.out.println("저장하였습니다.");
  }

  public void listLesson() {
    Lesson[] lessons = lessonList.toArray();
for (Lesson l : lessons)
    {
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

    Lesson lesson = lessonList.get(no);


    if (lesson == null) {
      System.out.println("게시물 번호가 유효하지 않습니다.");
      return;
    }

    System.out.printf("번호: %d\n", lesson.getNo1());
    System.out.printf("제목: %s\n", lesson.getTitle());
    System.out.printf("등록일: %s\n", lesson.getDate1());
  }

}

