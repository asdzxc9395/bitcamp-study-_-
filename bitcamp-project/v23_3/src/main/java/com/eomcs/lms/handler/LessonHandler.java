package com.eomcs.lms.handler;

import java.sql.Date;
import java.util.Scanner;
import com.eomcs.lms.domain.Lesson;
import com.eomcs.lms.util.AbstractList;
import com.eomcs.lms.util.Prompt;

public class LessonHandler {

  // ArrayList Linked 리스트를 마음대로 사용할수 있도록
  // 게시물 목록을 관리하는 필드에 대해 필드를 선언할 때 
  // 이들 클래스의 수퍼클래스로 선언한다.
  // >> 대신 이 필드에 들어갈 객체는 생성자에서 파라미터로 받는다.
  // >> 이렇게 하면 ArrayList와 LinkedList도 사용할수 있어.
  // 유지 보수에 좋다.선택의 폭이 넓어진다.
  
  AbstractList<Lesson> lessonList;
  
  Prompt prompt;

  public Scanner input; // 생성자

  public LessonHandler(Prompt prompt, AbstractList<Lesson> list) {
    this.prompt = prompt;
    lessonList = list;
  }

  public void addLesson() {
    Lesson lesson = new Lesson();

    lesson.setNo1(prompt.inputInt("번호? "));
    lesson.setTitle(prompt.inputString("수업명? "));
    lesson.setContents(prompt.inputString("설명? "));
    lesson.setStart(prompt.inputDate("시작일? "));
    lesson.setEnd(prompt.inputDate("종료일? "));
    lesson.setTotal(prompt.inputInt("총수업시간? "));
    lesson.setDay(prompt.inputInt("일수업시간? "));
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
    int index = indexOfLesson(prompt.inputInt("번호? "));
    
    if (index == -1) {
      System.out.println("해당 번호의 수업이 없습니다.");
      return;
    }
    
    Lesson lesson = this.lessonList.get(index);
    
    System.out.printf("번호: %d\n", lesson.getNo1());
    System.out.printf("수업명: %s\n", lesson.getTitle());
    System.out.printf("설명: %s\n", lesson.getContents());
    System.out.printf("시작일: %s\n", lesson.getStart());
    System.out.printf("종료일: %s\n", lesson.getEnd());
    System.out.printf("총수업시간: %d\n", lesson.getTotal());
    System.out.printf("일수업시간: %d\n", lesson.getDay());
  }

  public void updateLesson() {
    int index = indexOfLesson(prompt.inputInt("번호? "));


    if (index == -1) {
      System.out.println("게시물 번호가 유효하지 않습니다.");
      return;
    }

    Lesson oldLesson = this.lessonList.get(index);
    Lesson newLesson = new Lesson();

    newLesson.setNo1(oldLesson.getNo1());
    
    newLesson.setTitle
    (prompt.inputString(String.format
        ("수업명(%s)?" , oldLesson.getTitle()), oldLesson.getTitle()));

    newLesson.setContents(prompt.inputString("설명? ", oldLesson.getTitle()));
    
    newLesson.setStart(prompt.inputDate(
        String.format("시작일(%s)? ", oldLesson.getStart()), 
        oldLesson.getStart()));
    
    newLesson.setEnd(prompt.inputDate(
        String.format("종료일(%s)? ", oldLesson.getEnd()), 
        oldLesson.getEnd()));
    
    newLesson.setTotal(prompt.inputInt(
        String.format("총수업시간(%d)? ", oldLesson.getTotal()), 
        oldLesson.getTotal()));
    
    newLesson.setDay(prompt.inputInt(
        String.format("일수업시간(%d)? ", oldLesson.getDay()), 
        oldLesson.getDay()));
    newLesson.setDate1(new Date(System.currentTimeMillis()));

    if (oldLesson.equals(newLesson)) {
      System.out.println("수업 변경을 취소하였습니다.");
    }
    this.lessonList.set(index, newLesson);
    System.out.println("수업을 변경했습니다");
  }


  public void deleteLesson() {
    System.out.println("게시물 번호? ");
    int no = input.nextInt();
    input.nextLine();//숫자뒤에 남은 공백 제거

    int index = indexOfLesson(no);

    if (index == -1) {
      System.out.println("게시물 번호가 유효하지 않습니다.");
      return;
    }

    this.lessonList.remove(index);
    System.out.println("게시글을 삭제하였습니다.");
  }

  private int indexOfLesson(int no) {
    for (int i = 0; i < this.lessonList.size(); i++) {
      Lesson temp = this.lessonList.get(i);
      if (temp.getNo1() == no) {
        return i;
      }
    }
    return -1;
  }



}


