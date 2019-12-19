package com.bitcamp.myproject;

import java.sql.Date;
import java.util.Scanner;

public class Memberjoin2 {
  public static void main(String[] args) {

    Scanner keyboard = new Scanner(System.in);


    String[] id = new String[1];
    String[] password = new String[1];
    String[] repassword = new String[1];
    String[] name = new String[1];
    String[] adress = new String[1];
    int[] phonenumber = new int[1];
    Date[] date = new Date[1];


    for (int i = 0; i < 1; i++) {
      
      System.out.println("아이핀 인증");
      System.out.println("휴대폰 인증");
      
      System.out.print("아이디:");
      id[i] = keyboard.nextLine();

      System.out.print("비밀번호:");
      password[i] = keyboard.nextLine();

      while( (password[i].length() < 6) || (password[i].length() > 10) )
      {
         System.out.println("비밀번호는 6자이상 10자이하로 만들어주세요 ");
         System.out.print("비밀번호:");
         password[i] = keyboard.nextLine();
      }

      System.out.print("비밀번호확인:");
      repassword[i] = keyboard.nextLine();

      while ( !repassword[i].equals(password[i]) )
      {
        System.out.print("비밀번호가 맞지 않습니다. 다시 입력해주세요: ");
        repassword[i] = keyboard.nextLine();
        if (repassword[i].equals(password[i])) {
          System.out.println("비밀번호 인증이 완료되었습니다.");
        }
      }
      
      System.out.print("이름:");
      name[i] = keyboard.nextLine();

      System.out.print("주소:");
      adress[i] = keyboard.nextLine();

      System.out.print("핸드폰번호:");
      phonenumber[i] = keyboard.nextInt();

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
        
      
      
        date[i] = new Date(System.currentTimeMillis());
        
        while ( !repassword[i].equals(password[i]) )
        {
          System.out.print("비밀번호가 맞지 않습니다. 다시 입력해주세요: ");
          repassword[i] = keyboard.nextLine();
        }
    
    }

    
    System.out.println();

    System.out.println("가입이 완료되었습니다.");
    for (int i = 0; i < 1; i++) {
      System.out.printf("아이디: %s \n이름: %s \n주소: %s \n가입일시 :%s",
          id[i], name[i], adress[i], date[i]);
    }

  }

  private static void passCheck(String[] password) {
    // TODO Auto-generated method stub

  }        
}
