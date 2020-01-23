package com.eomcs.lms.handler;

import java.util.List;
import java.util.Scanner;
import com.eomcs.lms.domain.Lesson;
import com.eomcs.lms.util.Prompt;

public class LessonDetailCommand implements Command {

  // 목록을 다루는 객체를 지정할 때,
  // >> 특정 클래스(AbstraceList, LinkedList, ArrayList)를 지정하는 대신에
  // >> 사용 규칙(예: List)을 따르는 객체를 지정 함으로써.
  // 더 다양한 타입의 객체로 교체할 수 있게 만든다.
  // >> List 사용 규칙을 구현한 객체라면 어떤 클래스의 객체든지 사용할 수 있다.
  // 결국 유지보수를 더 유연하게 하기 위함이다.

  List<Lesson> lessonList;

  Prompt prompt;

  public Scanner input; // 생성자

  public LessonDetailCommand(Prompt prompt, List<Lesson> list) {
    // list 파라미터는 List 인터페이스를 구현한 객체를 받는다.
    this.prompt = prompt;
    lessonList = list;
  }

  @Override
  public void execute() {
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


