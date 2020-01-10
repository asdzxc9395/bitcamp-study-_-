package com.eomcs.lms.handler;

import java.sql.Date;
import java.util.Scanner;
import com.eomcs.lms.domain.Lesson;
import com.eomcs.lms.util.ArrayList;

public class LessonHandler {

  ArrayList<Lesson> lessonList;

  public Scanner input; // 생성자

  public LessonHandler(Scanner input) {
    this.input = input;
    lessonList = new ArrayList<>();
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
    // 수업 객체 목록을 복사 받을 배열을 준비하고,
    // toArray()를 실행한다.
    // toArray()의 리턴값은 파라미터로 넘겨준 배얼의 주소와같다.
    Lesson[] arr = this.lessonList.toArray
        (new Lesson[this.lessonList.size()]);
    for (Lesson l : arr)
    {
      System.out.printf("%d, %s, %s, %s ~ %s, %d, %d\n, %s \n",
          l.getNo1(), l.getTitle(),l. getContents(), 
          l.getStart(), l.getEnd(), 
          l.getTotal(), l.getDay(), l.getDate1() );
    }
  }

  public void detailLesson() {
    System.out.println("게시물 번호? ");
    int index = input.nextInt();
    input.nextLine();//숫자뒤에 남은 공백 제거

    Lesson lesson = lessonList.get(index);


    if (lesson == null) {
      System.out.println("게시물 번호가 유효하지 않습니다.");
      return;
    }

    System.out.printf("번호: %d\n", lesson.getNo1());
    System.out.printf("제목: %s\n", lesson.getTitle());
    System.out.printf("등록일: %s\n", lesson.getDate1());
  }

  public void updateLesson() {
    System.out.println("게시물 번호? ");
    int index = input.nextInt();
    input.nextLine();//숫자뒤에 남은 공백 제거

    Lesson oldLesson = lessonList.get(index);

    if (oldLesson == null) {
      System.out.println("게시물 번호가 유효하지 않습니다.");
      return;
    }

    boolean changed = false;
    String inputStr = null; // 빈문자열을 입력하였는지 검사
    Lesson newLesson = new Lesson();

    newLesson.setNo1(oldLesson.getNo1());

    System.out.printf("수업명(%s)? ", oldLesson.getTitle());
    inputStr = input.nextLine();
    if (inputStr.length() == 0) {
      newLesson.setTitle(oldLesson.getTitle());
    } else {
      newLesson.setTitle(inputStr);
      changed = true;
    }

    System.out.printf("수업내용(%s)? ", oldLesson.getContents());
    inputStr = input.nextLine();
    if (inputStr.length() == 0) {
      newLesson.setContents(oldLesson.getTitle());
    } else {
      newLesson.setContents(inputStr);
      changed = true;
    }


    System.out.printf("시작일(%s)? ", oldLesson.getStart());
    inputStr = input.nextLine();
    if (inputStr.length() == 0) {
      newLesson.setStart(oldLesson.getStart());
    } else {
      newLesson.setStart(Date.valueOf(inputStr));
      changed = true;
    }


    System.out.printf("종료일(%s)? ", oldLesson.getEnd());
    inputStr = input.nextLine();
    if (inputStr.length() == 0) {
      newLesson.setEnd(oldLesson.getEnd());
    } else {
      newLesson.setEnd(Date.valueOf(inputStr));
      changed = true;
    }

    System.out.printf("총수업시간(%d)? ", oldLesson.getTotal());
    inputStr = input.nextLine();
    if (inputStr.length() == 0) {
      newLesson.setTotal(oldLesson.getTotal());
    } else {
      newLesson.setTotal(Integer.parseInt(inputStr));
      changed = true;
    }

    System.out.printf("일수업시간(%d)? ", oldLesson.getDay());
    inputStr = input.nextLine();
    if (inputStr.length() == 0) {
      newLesson.setDay(oldLesson.getDay());
    } else {
      newLesson.setDay(Integer.parseInt(inputStr));
      changed = true;
    }

    newLesson.setDate1(new Date(System.currentTimeMillis()));

    if (changed) {
      this.lessonList.set(index, newLesson);
      System.out.println("게시글을 변경했습니다.");
    } else {
      System.out.println("수업변경을 취소하였습니다.");
    }
  }


  public void deleteLesson() {
    System.out.println("게시물 번호? ");
    int index = input.nextInt();
    input.nextLine();//숫자뒤에 남은 공백 제거

    Lesson lesson = (Lesson)lessonList.get(index);


    if (lesson == null) {
      System.out.println("게시물 번호가 유효하지 않습니다.");
      return;
    }

    this.lessonList.remove(index);
    System.out.println("게시글을 삭제하였습니다.");
  }



}

