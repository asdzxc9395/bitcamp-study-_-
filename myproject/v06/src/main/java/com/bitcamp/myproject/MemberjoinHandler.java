package com.bitcamp.myproject;

import java.sql.Date;
import java.util.Scanner;

public class MemberjoinHandler {
  static class MemberJoin {
    String id;
    String password;
    String repassword;
    String name;
    String adress;
    int number;
    Date date;
  }
  
  static final int Size = 100;
  static MemberJoin[] memberjoins = new MemberJoin[Size];
  static int count = 0;
  static Scanner keyboard;
  
  static void listMemberjoin() {
    System.out.println();
    System.out.println("가입이 완료되었습니다.");
    for (int i = 0; i < count; i++) {
      MemberJoin m = memberjoins[i];
      System.out.printf("아이디: %s \n이름: %s \n주소: %s \n가입일시: %s \n",
          m.id, m.name, m.adress, m.date);
    }
  }

  static void addMemberjoin() {
    MemberJoin memberjoin = new MemberJoin();


    System.out.println("아이핀 인증");
    System.out.println("휴대폰 인증");

    System.out.print("아이디:");
    memberjoin.id = keyboard.nextLine();

    System.out.print("비밀번호:");
    memberjoin.password = keyboard.nextLine();

    while( (memberjoin.password.length() < 6) || (memberjoin.password.length() > 10) )
    {
      System.out.println("비밀번호는 6자이상 10자이하로 만들어주세요 ");
      System.out.print("비밀번호:");
      memberjoin.password = keyboard.nextLine();
    }

    System.out.print("비밀번호확인:");
    memberjoin.repassword = keyboard.nextLine();

    while ( !memberjoin.repassword.equals(memberjoin.password) )
    {
      System.out.print("비밀번호가 맞지 않습니다. 다시 입력해주세요: ");
      memberjoin.repassword = keyboard.nextLine();
      if (memberjoin.repassword.equals(memberjoin.password)) {
        System.out.println("비밀번호 인증이 완료되었습니다.");
      }
    }

    System.out.print("이름:");
    memberjoin.name = keyboard.nextLine();

    System.out.print("주소:");
    memberjoin.adress = keyboard.nextLine();

    System.out.print("핸드폰번호:");
    memberjoin.number = keyboard.nextInt();
    keyboard.nextLine();


    System.out.println("이용약관동의 (Y/n)");
    String agreement1 = keyboard.next();
    while (!agreement1.equalsIgnoreCase("y")) {
      System.out.println("이용약관에 동의해주셔야 가입이 가능합니다.(Y/n)");
      agreement1 = keyboard.next();
    }

    memberjoin.date = new Date(System.currentTimeMillis());

    System.out.println("개인정보동의 (Y/n)");
    String agreement2 = keyboard.next();
    keyboard.nextLine();
    while (!agreement2.equalsIgnoreCase("y")) {
      System.out.println("개인정보에 동의해주셔야 가입이 가능합니다.(Y/n)");
      agreement2 = keyboard.next();
    }
    while ( !memberjoin.repassword.equals(memberjoin.password) )
    {
      System.out.print("비밀번호가 맞지 않습니다. 다시 입력해주세요: ");
      memberjoin.repassword = keyboard.nextLine();
    }

    memberjoins[count++] = memberjoin;
    System.out.println("저장하였습니다.");
  }

}
