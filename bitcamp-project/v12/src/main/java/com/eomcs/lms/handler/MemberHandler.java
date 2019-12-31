package com.eomcs.lms.handler;

import java.sql.Date;
import java.util.Scanner;
import com.eomcs.lms.domain.Board;
import com.eomcs.lms.domain.Member;


public class MemberHandler {
    
  static final int Member_Size = 100;
  static Member[] members = new Member[Member_Size];// 인스턴스를 지정된 값만큼 만드는 것이 아니다@!
  static int Membercount = 0;
  public static Scanner keyboard;

  public static void addMember() {
    Member member = new Member(); 

    System.out.print("번호?");
    member.no = keyboard.nextInt();
    keyboard.nextLine();

    System.out.print("이름?");
    member.name = keyboard.nextLine();

    System.out.print("이메일?");
    member.email = keyboard.nextLine();

    System.out.print("암호?");
    member.password = keyboard.nextLine();

    System.out.print("사진?");
    member.photo = keyboard.nextLine();

    System.out.print("전화?");
    member.number = keyboard.nextLine();

    member.date = new Date(System.currentTimeMillis());

    members[Membercount++] = member;
    System.out.println("저장하였습니다.");
  }
  
  public static void listMember() {
    for (int i = 0; i < Membercount; i++ ) {
      Member m = members[i];
      System.out.printf("%d, %s, %s, %s, %s\n",
          m.no, m.name, m.email, 
          m.number, m.date);
    }
  }

  public static void detailMember() {
    System.out.println("게시물 번호? ");
    int no = keyboard.nextInt();
    keyboard.nextLine();//숫자뒤에 남은 공백 제거

    if (no < 0 || no >=  Membercount) {
      System.out.println("게시물 번호가 유효하지 않습니다.");
      return;
    }

    Member member = members[no];
    
    System.out.printf("번호: %d\n", member.no);
    System.out.printf("이름: %s\n", member.name);
    System.out.printf("등록일: %s\n", member.date);
  }
  
}
