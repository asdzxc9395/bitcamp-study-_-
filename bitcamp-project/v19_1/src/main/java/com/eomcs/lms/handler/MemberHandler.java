package com.eomcs.lms.handler;

import java.sql.Date;
import java.util.Scanner;
import com.eomcs.lms.domain.Member;
import com.eomcs.lms.util.ArrayList;


public class MemberHandler {
  
  ArrayList<Member> memberList;
  
  public Scanner input;
  
  public MemberHandler(Scanner input) {
    this.input = input;
    memberList = new ArrayList<>();
  }

  public void addMember() {
    Member member = new Member(); 

    System.out.print("번호?");
    member.setNo(input.nextInt());
    input.nextLine();

    System.out.print("이름?");
    member.setName(input.nextLine());

    System.out.print("이메일?");
    member.setEmail(input.nextLine());

    System.out.print("암호?");
    member.setPassword(input.nextLine());

    System.out.print("사진?");
    member.setPhoto(input.nextLine());

    System.out.print("전화?");
    member.setNumber(input.nextLine());

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
    System.out.println("게시물 번호? ");
    int index = input.nextInt();
    input.nextLine();//숫자뒤에 남은 공백 제거
    
    Member member = (Member)memberList.get(index);
    
    if (member == null) {
      System.out.println("게시물 번호가 유효하지 않습니다.");
      return;
    }
    
    System.out.printf("번호: %d\n", member.getNo());
    System.out.printf("이름: %s\n", member.getName());
    System.out.printf("등록일: %s\n", member.getDate());
  }
  
  public void updateMember() {
    System.out.println("게시물 번호? ");
    int index = input.nextInt();
    input.nextLine();//숫자뒤에 남은 공백 제거
    
    Member oldMember = (Member)memberList.get(index);
    
    if (oldMember == null) {
      System.out.println("게시물 번호가 유효하지 않습니다.");
      return;
    }
    String inputStr = null;
    boolean changed = false;
    Member newMember = new Member();
    
    System.out.printf("이름?(%s)", oldMember.getName());
    inputStr = input.nextLine();
    if (inputStr.length() == 0) {
      newMember.setName(oldMember.getName());
    } else {
      newMember.setName(inputStr);
      changed = true;
    }
    
    System.out.printf("이메일?(%s)", oldMember.getEmail());
    inputStr = input.nextLine();
    if (inputStr.length() == 0) {
      newMember.setEmail(oldMember.getEmail());
    } else {
      newMember.setEmail(inputStr);
      changed = true;
    }

    System.out.printf("암호?(%s)", oldMember.getPassword());
    inputStr = input.nextLine();
    if (inputStr.length() == 0) {
      newMember.setPassword(oldMember.getPassword());
    } else {
      newMember.setPassword(inputStr);
      changed = true;
    }
    
    System.out.printf("사진?(%s)", oldMember.getPhoto());
    inputStr = input.nextLine();
    if (inputStr.length() == 0) {
      newMember.setPhoto(oldMember.getPhoto());
    } else {
      newMember.setPhoto(inputStr);
      changed = true;
    }

    System.out.printf("전화?(%s)", oldMember.getNumber());
    inputStr = input.nextLine();
    if (inputStr.length() == 0) {
      newMember.setNumber(oldMember.getNumber());
    } else {
      newMember.setNumber(inputStr);
      changed = true;
    }

    newMember.setDate(new Date(System.currentTimeMillis()));
    
    if (changed) {
      this.memberList.set(index, newMember);
      System.out.println("게시글을 변경했습니다.");
    } else {
      System.out.println("수업 변경을 취소하였습니다.");
    }
  }
  
  
  
  public void deleteMember() {
    System.out.println("게시물 번호? ");
    int index = input.nextInt();
    input.nextLine();//숫자뒤에 남은 공백 제거
    
    Member member = (Member)memberList.get(index);
    
    if (member == null) {
      System.out.println("게시물 번호가 유효하지 않습니다.");
      return;
    }
    
    this.memberList.remove(index);
    System.out.println("게시글을 삭제하였습니다.");
  }
}
