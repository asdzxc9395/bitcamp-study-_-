package com.eomcs.lms.handler;

import java.sql.Date;
import java.util.List;
import java.util.Scanner;
import com.eomcs.lms.domain.Lesson;
import com.eomcs.lms.util.Prompt;

public class LessonUpdateCommand implements Command {

  // 목록을 다루는 객체를 지정할 때,
  // >> 특정 클래스(AbstraceList, LinkedList, ArrayList)를 지정하는 대신에
  // >> 사용 규칙(예: List)을 따르는 객체를 지정 함으로써.
  // 더 다양한 타입의 객체로 교체할 수 있게 만든다.
  // >> List 사용 규칙을 구현한 객체라면 어떤 클래스의 객체든지 사용할 수 있다.
  // 결국 유지보수를 더 유연하게 하기 위함이다.

  List<Lesson> lessonList;

  Prompt prompt;

  public Scanner input; // 생성자

  public LessonUpdateCommand(Prompt prompt, List<Lesson> list) {
    // list 파라미터는 List 인터페이스를 구현한 객체를 받는다.
    this.prompt = prompt;
    lessonList = list;
  }


  @Override
  public void execute() {
    int index = indexOfLesson(prompt.inputInt("번호? "));


    if (index == -1) {
      System.out.println("게시물 번호가 유효하지 않습니다.");
      return;
    }

    Lesson oldLesson = this.lessonList.get(index);
    Lesson newLesson = new Lesson();

    newLesson.setNo1(oldLesson.getNo1());

    newLesson.setTitle(
        prompt.inputString(String.format("수업명(%s)?", oldLesson.getTitle()), oldLesson.getTitle()));

    newLesson.setContents(prompt.inputString("설명? ", oldLesson.getTitle()));

    newLesson.setStart(
        prompt.inputDate(String.format("시작일(%s)? ", oldLesson.getStart()), oldLesson.getStart()));

    newLesson.setEnd(
        prompt.inputDate(String.format("종료일(%s)? ", oldLesson.getEnd()), oldLesson.getEnd()));

    newLesson.setTotal(
        prompt.inputInt(String.format("총수업시간(%d)? ", oldLesson.getTotal()), oldLesson.getTotal()));

    newLesson.setDay(
        prompt.inputInt(String.format("일수업시간(%d)? ", oldLesson.getDay()), oldLesson.getDay()));
    newLesson.setDate1(new Date(System.currentTimeMillis()));

    if (oldLesson.equals(newLesson)) {
      System.out.println("수업 변경을 취소하였습니다.");
    }
    this.lessonList.set(index, newLesson);
    System.out.println("수업을 변경했습니다");
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


