package com.eomcs.lms.handler;

import java.sql.Date;
import java.util.List;
import java.util.Scanner;
import com.eomcs.lms.domain.Lesson;
import com.eomcs.lms.util.Prompt;

public class LessonAddCommand implements Command {

  // 목록을 다루는 객체를 지정할 때,
  // >> 특정 클래스(AbstraceList, LinkedList, ArrayList)를 지정하는 대신에
  // >> 사용 규칙(예: List)을 따르는 객체를 지정 함으로써.
  // 더 다양한 타입의 객체로 교체할 수 있게 만든다.
  // >> List 사용 규칙을 구현한 객체라면 어떤 클래스의 객체든지 사용할 수 있다.
  // 결국 유지보수를 더 유연하게 하기 위함이다.

  List<Lesson> lessonList;

  Prompt prompt;

  public Scanner input; // 생성자

  public LessonAddCommand(Prompt prompt, List<Lesson> list) {
    // list 파라미터는 List 인터페이스를 구현한 객체를 받는다.
    this.prompt = prompt;
    lessonList = list;
  }

  @Override
  public void execute() {
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



}


