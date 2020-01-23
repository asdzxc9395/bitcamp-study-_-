package com.eomcs.lms.handler;

import java.sql.Date;
import java.util.Scanner;
import com.eomcs.lms.domain.Member;
import com.eomcs.lms.util.LinkedList;
import com.eomcs.lms.util.AbstractList;
import com.eomcs.lms.util.Prompt;


public class MemberHandler {
  // 목록을 다루는 객체를 지정할 때,
  // >>  특정 클래스(AbstraceList, LinkedList, ArrayList)를 지정하는 대신에
  // >>  사용 규칙(예: List)을 따르는 객체를 지정 함으로써.
  // 더 다양한 타입의 객체로 교체할 수 있게 만든다.
  // >> List 사용 규칙을 구현한 객체라면 어떤 클래스의 객체든지 사용할 수 있다.
  // 결국 유지보수를 더 유연하게 하기 위함이다.
  AbstractList<Member> memberList;

  Prompt prompt;
  public Scanner input;

  public MemberHandler(Prompt prompt, AbstractList<Member> list) {
    // list 파라미터는 List 인터페이스를 구현한 객체를 받는다.
    this.prompt = prompt;
    memberList = list;
  }

  public void addMember() {
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

  public void listMember() {
    // Member 객체의 목록을 저장할 배열을 넘기는데 크기가 0인 배열을 넘긴다.
    // toArray()는 내부에서 새 배열을 만들고, 값을 복사한 후 리턴한다.
    Member[] arr =this.memberList.toArray
        (new Member[this.memberList.size()]);
    for(Member m : arr) {
      System.out.printf("%d, %s, %s, %s, %s\n",
          m.getNo(), m.getName(), m.getEmail(), 
          m.getNumber(), m.getDate());
    }
  }

  public void detailMember() {

    int index = indexOfMember(prompt.inputInt("번호? "));

    if (index == -1) {
      System.out.println("게시물 번호가 유효하지 않습니다.");
      return;
    }

    Member member = this.memberList.get(index);
    
    
    System.out.printf("번호: %d\n", member.getNo());
    System.out.printf("이름: %s\n", member.getName());
    System.out.printf("등록일: %s\n", member.getDate());
  }

  public void updateMember() {

    int index = indexOfMember(prompt.inputInt("번호? "));

    if (index == -1) {
      System.out.println("게시물 번호가 유효하지 않습니다.");
      return;
    }
    
    Member oldMember = this.memberList.get(index);
    Member newMember = new Member();

    newMember.setNo(oldMember.getNo());
    
    newMember.setName(prompt.inputString
        (String.format("이름(%s)?", oldMember.getName()), oldMember.getName()));
    
    newMember.setEmail(prompt.inputString
        (String.format("이메일(%s)?", oldMember.getEmail()), oldMember.getEmail()));

    newMember.setPassword(prompt.inputString
        (String.format("암호(%s)?", oldMember.getPassword()), oldMember.getPassword()));

    newMember.setPhoto(prompt.inputString
        (String.format("사진(%s)?", oldMember.getPhoto()), oldMember.getPhoto()));
    
    newMember.setNumber(prompt.inputString
        (String.format("전화(%s)?", oldMember.getNumber()), oldMember.getNumber()));

    newMember.setDate(new Date(System.currentTimeMillis()));

    
    if (oldMember.equals(newMember)) {
      System.out.println("정보 변경을 취소하였습니다.");
    } 
    this.memberList.set(index, newMember);
    System.out.println("정보를 변경하였습니다.");
  }



  public void deleteMember() {
    System.out.println("게시물 번호? ");
    int no = input.nextInt();
    input.nextLine();//숫자뒤에 남은 공백 제거

    int index = indexOfMember(no);

    if (no == -1) {
      System.out.println("게시물 번호가 유효하지 않습니다.");
      return;
    }

    this.memberList.remove(index);
    System.out.println("게시글을 삭제하였습니다.");
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
