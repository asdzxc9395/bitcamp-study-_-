package com.bitcamp.myproject.Memberjoin.handler;

import java.sql.Date;
import java.util.Scanner;
import com.bitcamp.myproject.Memberjoin.domain.Memberjoin;
import com.bitcamp.myproject.Memberjoin.util.MemberJoinList;


public class MemberJoinHandler {

  MemberJoinList<Memberjoin> memberjoinList;
  Scanner input;

  public MemberJoinHandler(Scanner input) {
    this.input = input;
    memberjoinList = new MemberJoinList<>();
  }

  public void listMemberjoin() {
    System.out.println("/d가입이 완료되었습니다.");
    Memberjoin[] arr = memberjoinList.toArray
        (new Memberjoin[this.memberjoinList.size()]);
    for (Memberjoin m : arr) {
      System.out.printf("아이디: %s \n이름: %s \n주소: %s \n가입일시: %s \n",
          m.getId(), m.getName(), m.getAdress(), m.getDate());
    }
  }

  public void addMemberjoin() {

    Memberjoin memberjoin = new Memberjoin();

    System.out.println("아이핀 인증");
    System.out.println("휴대폰 인증");

    System.out.print("아이디:");
    memberjoin.setId(input.nextLine());

    System.out.print("비밀번호:");
    memberjoin.setPassword(input.nextLine());

    while( (memberjoin.getPassword().length() < 6) || (memberjoin.getPassword().length() > 10) )
    {
      System.out.println("비밀번호는 6자이상 10자이하로 만들어주세요 ");
      System.out.print("비밀번호:");
      memberjoin.setPassword(input.nextLine());
    }

    System.out.print("비밀번호확인:");
    memberjoin.setRepassword(input.nextLine());

    while ( !memberjoin.getRepassword().equals(memberjoin.getPassword()) )
    {
      System.out.print("비밀번호가 맞지 않습니다. 다시 입력해주세요: ");
      memberjoin.setRepassword(input.nextLine());
      if (memberjoin.getRepassword().equals(memberjoin.getPassword())) {
        System.out.println("비밀번호 인증이 완료되었습니다.");
      }
    }

    System.out.print("이름:");
    memberjoin.setName(input.nextLine());

    System.out.print("주소:");
    memberjoin.setAdress(input.nextLine());

    System.out.print("핸드폰번호:");
    memberjoin.setNumber(input.nextInt());
    input.nextLine();


    System.out.println("이용약관동의 (Y/n)");
    String agreement1 = input.next();
    while (!agreement1.equalsIgnoreCase("y")) {
      System.out.println("이용약관에 동의해주셔야 가입이 가능합니다.(Y/n)");
      agreement1 = input.next();
    }

    memberjoin.setDate(new Date(System.currentTimeMillis()));

    System.out.println("개인정보동의 (Y/n)");
    String agreement2 = input.next();
    input.nextLine();
    while (!agreement2.equalsIgnoreCase("y")) {
      System.out.println("개인정보에 동의해주셔야 가입이 가능합니다.(Y/n)");
      agreement2 = input.next();
    }
    while ( !memberjoin.getRepassword().equals(memberjoin.getPassword()) )
    {
      System.out.print("비밀번호가 맞지 않습니다. 다시 입력해주세요: ");
      memberjoin.setRepassword(input.nextLine());
    }

    memberjoinList.add(memberjoin);
    System.out.println("저장하였습니다.");
  }
  
}
