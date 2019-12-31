package com.eomcs.lms.handler;

import java.sql.Date;
import java.util.Scanner;
import com.eomcs.lms.domain.Member;


public class MemberHandler {
    
  
  //인스턴스 필드 = 논스태틱 필드
  // >> 개별적으로 관리해야 하는 변수
  // >> new명령을 통해 생성된다.
  Member[] members;// 인스턴스를 지정된 값만큼 만드는 것이 아니다@!
  int Membercount = 0;
  
  public Scanner input;
  
  //클래스 필드 = 스태틱 필드
  // >> 공유하는 변수
  // >> 클래스의 메모리에 로딩될 떄 자동으로 생성된다.
  //
  static final int Member_Size = 100;
  
  public MemberHandler(Scanner input) {
    this.input = input;
    this.members = new Member[Member_Size];
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

    this.members[this.Membercount++] = member;
    System.out.println("저장하였습니다.");
  }
  
  public void listMember() {
    for (int i = 0; i < this.Membercount; i++ ) {
      Member m = this.members[i];
      System.out.printf("%d, %s, %s, %s, %s\n",
          m.getNo(), m.getName(), m.getEmail(), 
          m.getNumber(), m.getDate());
    }
  }

  public void detailMember() {
    System.out.println("게시물 번호? ");
    int no = input.nextInt();
    input.nextLine();//숫자뒤에 남은 공백 제거

    if (no < 0 || no >=  this.Membercount) {
      System.out.println("게시물 번호가 유효하지 않습니다.");
      return;
    }

    Member member = this.members[no];
    
    System.out.printf("번호: %d\n", member.getNo());
    System.out.printf("이름: %s\n", member.getName());
    System.out.printf("등록일: %s\n", member.getDate());
  }
  
}
