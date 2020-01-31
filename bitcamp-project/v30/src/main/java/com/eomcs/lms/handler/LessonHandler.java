package com.eomcs.lms.handler;

import java.sql.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import com.eomcs.lms.domain.Lesson;
import com.eomcs.lms.util.Prompt;

public class LessonHandler {

  // 목록을 다루는 객체를 지정할 때,
  // >>  특정 클래스(AbstraceList, LinkedList, ArrayList)를 지정하는 대신에
  // >>  사용 규칙(예: List)을 따르는 객체를 지정 함으로써.
  // 더 다양한 타입의 객체로 교체할 수 있게 만든다.
  // >> List 사용 규칙을 구현한 객체라면 어떤 클래스의 객체든지 사용할 수 있다.
  // 결국 유지보수를 더 유연하게 하기 위함이다.
  
  List<Lesson> lessonList;
  
  Prompt prompt;

  public Scanner input; // 생성자

  public LessonHandler(Prompt prompt, List<Lesson> list) {
    // list 파라미터는 List 인터페이스를 구현한 객체를 받는다.
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
    Iterator<Lesson> iterator = lessonList.iterator();
    while (iterator.hasNext()) {
      Lesson l = iterator.next();
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


