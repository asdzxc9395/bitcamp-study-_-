package com.eomcs.lms.handler;

import java.sql.Date;
import java.util.Scanner;


public class MemberHandler {
  static class Member {
    int no;
    String name;
    String email;
    String password;
    String photo;
    String number;
    Date date;
    Date date1;
  }
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

}
