package com.bitcamp.myproject.Memberjoin.handler;

import java.sql.Date;
import java.util.Scanner;
import com.bitcamp.myproject.Memberjoin.domain.Memberjoin;


public class MemberjoinHandler {


  static final int Size = 100;
  static int count = 0;
  
  Memberjoin[] memberjoins = new Memberjoin[Size];
  Scanner input;
  
  public MemberjoinHandler(Scanner input) {
    this.input = input;
  }

  public void listMemberjoin() {
    System.out.println();
    System.out.println("가입이 완료되었습니다.");
    for (int i = 0; i < count; i++) {
      Memberjoin m = memberjoins[i];
      System.out.printf("아이디: %s \n이름: %s \n주소: %s \n가입일시: %s \n",
          m.id, m.name, m.adress, m.date);
    }
  }

  public void addMemberjoin() {

    Memberjoin memberjoin = new Memberjoin();


    System.out.println("아이핀 인증");
    System.out.println("휴대폰 인증");

    System.out.print("아이디:");
    memberjoin.id = input.nextLine();

    System.out.print("비밀번호:");
    memberjoin.password = input.nextLine();

    while( (memberjoin.password.length() < 6) || (memberjoin.password.length() > 10) )
    {
      System.out.println("비밀번호는 6자이상 10자이하로 만들어주세요 ");
      System.out.print("비밀번호:");
      memberjoin.password = input.nextLine();
    }

    System.out.print("비밀번호확인:");
    memberjoin.repassword = input.nextLine();

    while ( !memberjoin.repassword.equals(memberjoin.password) )
    {
      System.out.print("비밀번호가 맞지 않습니다. 다시 입력해주세요: ");
      memberjoin.repassword = input.nextLine();
      if (memberjoin.repassword.equals(memberjoin.password)) {
        System.out.println("비밀번호 인증이 완료되었습니다.");
      }
    }

    System.out.print("이름:");
    memberjoin.name = input.nextLine();

    System.out.print("주소:");
    memberjoin.adress = input.nextLine();

    System.out.print("핸드폰번호:");
    memberjoin.number = input.nextInt();
    input.nextLine();


    System.out.println("이용약관동의 (Y/n)");
    String agreement1 = input.next();
    while (!agreement1.equalsIgnoreCase("y")) {
      System.out.println("이용약관에 동의해주셔야 가입이 가능합니다.(Y/n)");
      agreement1 = input.next();
    }

    memberjoin.date = new Date(System.currentTimeMillis());

    System.out.println("개인정보동의 (Y/n)");
    String agreement2 = input.next();
    input.nextLine();
    while (!agreement2.equalsIgnoreCase("y")) {
      System.out.println("개인정보에 동의해주셔야 가입이 가능합니다.(Y/n)");
      agreement2 = input.next();
    }
    while ( !memberjoin.repassword.equals(memberjoin.password) )
    {
      System.out.print("비밀번호가 맞지 않습니다. 다시 입력해주세요: ");
      memberjoin.repassword = input.nextLine();
    }

    memberjoins[count++] = memberjoin;
    System.out.println("저장하였습니다.");
  }

}
