package com.bitcamp.myproject;

import java.sql.Date;
import java.util.Scanner;

public class Memberjoin {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);

    class MemberJoin {
      String id;
      String password;
      String repassword;
      String name;
      String adress;
      int number;
      Date date;
    }

    final int Size = 100;

    MemberJoin[] memberjoins = new MemberJoin[Size];

    int count = 0;

    for (int i = 0; i < Size; i++) {
      MemberJoin memberjoin = new MemberJoin();
      count++;

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

      System.out.println("개인정보동의 (Y/n)");
      String agreement2 = keyboard.next();

      while (!agreement2.equalsIgnoreCase("y")) {
        System.out.println("개인정보에 동의해주셔야 가입이 가능합니다.(Y/n)");
        agreement2 = keyboard.next();
      }

      memberjoin.date = new Date(System.currentTimeMillis());

      while ( !memberjoin.repassword.equals(memberjoin.password) )
      {
        System.out.print("비밀번호가 맞지 않습니다. 다시 입력해주세요: ");
        memberjoin.repassword = keyboard.nextLine();
      }
      memberjoins[i] = memberjoin;
      break;
    }


    System.out.println();
    System.out.println("가입이 완료되었습니다.");
    
    for (int i = 0; i < 1; i++) {
      MemberJoin memberjoin = memberjoins[i];
      System.out.printf("아이디: %s \n이름: %s \n주소: %s \n가입일시: %s",
          memberjoin.id, memberjoin.name, memberjoin.adress, memberjoin.date);
    }

  }
        
}
