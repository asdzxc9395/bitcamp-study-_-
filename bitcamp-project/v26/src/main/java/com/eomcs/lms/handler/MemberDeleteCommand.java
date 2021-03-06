package com.eomcs.lms.handler;

import java.util.List;
import java.util.Scanner;
import com.eomcs.lms.domain.Member;
import com.eomcs.lms.util.Prompt;


public class MemberDeleteCommand implements Command {
  // 목록을 다루는 객체를 지정할 때,
  // >> 특정 클래스(AbstraceList, LinkedList, ArrayList)를 지정하는 대신에
  // >> 사용 규칙(예: List)을 따르는 객체를 지정 함으로써.
  // 더 다양한 타입의 객체로 교체할 수 있게 만든다.
  // >> List 사용 규칙을 구현한 객체라면 어떤 클래스의 객체든지 사용할 수 있다.
  // 결국 유지보수를 더 유연하게 하기 위함이다.
  List<Member> memberList;

  Prompt prompt;
  public Scanner input;

  public MemberDeleteCommand(Prompt prompt, List<Member> list) {
    // list 파라미터는 List 인터페이스를 구현한 객체를 받는다.
    this.prompt = prompt;
    memberList = list;
  }


  @Override
  public void execute() {
    int index = indexOfMember(prompt.inputInt("번호? "));

    if (index == -1) {
      System.out.println("해당 번호의 게시글이 없습니다.");
      return;
    }

    this.memberList.remove(index);

    System.out.println("게시글을 삭제했습니다.");
  }

  private int indexOfMember(int no) {
    for (int i = 0; i < this.memberList.size(); i++) {
      Member temp = this.memberList.get(i);
      if (temp.getNo() == no) {
        return i;
      }
    }
    return -1;
  }
}
