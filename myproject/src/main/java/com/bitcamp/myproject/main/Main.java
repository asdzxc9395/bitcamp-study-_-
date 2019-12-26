package com.bitcamp.myproject;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    
    
    System.out.println("9395의 전 제품을 보시려면 성인인증을 해주세요.");
    System.out.println("이 정보내용은 청소년 유해매체물로서 정보통신망 이용촉진법및"
        + "정보보호 등에 관한 법률 및 청소년 보호법의 규정에 의하여 19세 미만 청소년은 이용할수 없습니다.");
    System.out.println("19세 미만 나가기");
    System.out.println("아이디 찾기");
    System.out.println("비밀번호 찾기");
    System.out.println("회원가입");
    System.out.println("아이핀인증");
    System.out.println("휴대폰인증");
    
    
    

    String[] id = new String[1];
    String[] password = new String[1];

    for (int i = 0; i < 1; i++) {

      System.out.println("회원로그인");
      System.out.print("아이디 : ");
      id[i]= keyboard.nextLine();
      System.out.print("비밀번호 : ");
      password[i] = keyboard.nextLine();

      while (!password[i].equals(id[i])) {
        System.out.print("비밀번호가 일치하지 않습니다.다시 입력 :");
        password[i] = keyboard.nextLine();
      }
      System.out.println("로그인 완료 ");
    }

  }
}