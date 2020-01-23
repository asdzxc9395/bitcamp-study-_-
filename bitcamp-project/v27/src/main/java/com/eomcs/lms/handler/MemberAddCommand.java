package com.eomcs.lms.handler;

import java.sql.Date;
import java.util.List;
import java.util.Scanner;
import com.eomcs.lms.domain.Member;
import com.eomcs.lms.util.Prompt;


public class MemberAddCommand implements Command {
  // 목록을 다루는 객체를 지정할 때,
  // >> 특정 클래스(AbstraceList, LinkedList, ArrayList)를 지정하는 대신에
  // >> 사용 규칙(예: List)을 따르는 객체를 지정 함으로써.
  // 더 다양한 타입의 객체로 교체할 수 있게 만든다.
  // >> List 사용 규칙을 구현한 객체라면 어떤 클래스의 객체든지 사용할 수 있다.
  // 결국 유지보수를 더 유연하게 하기 위함이다.
  List<Member> memberList;

  Prompt prompt;
  public Scanner input;

  public MemberAddCommand(Prompt prompt, List<Member> list) {
    // list 파라미터는 List 인터페이스를 구현한 객체를 받는다.
    this.prompt = prompt;
    memberList = list;
  }

  @Override
  public void execute() {
    Member member = new Member();

    member.setNo(prompt.inputInt("번호?"));
    member.setName(prompt.inputString("이름?"));
    member.setEmail(prompt.inputString("이메일?"));
    member.setPassword(prompt.inputString("암호?"));
    member.setPhoto(prompt.inputString("사진?"));
    member.setNumber(prompt.inputString("전화?"));
    member.setDate(new Date(System.currentTimeMillis()));

    memberList.add(member);
    System.out.println("저장하였습니다.");
  }

}
