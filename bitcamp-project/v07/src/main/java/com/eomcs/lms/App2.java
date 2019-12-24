package com.eomcs.lms;

import java.util.Scanner;
import java.sql.Date;

// 입력을 카운트하기
public class App2 {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);


    class Member {
      int no;
      String name;
      String email;
      String password;
      String photo;
      String number;
      Date date;
      Date date1;
    }
    final int Size = 100;
    
    Member[] arr = new Member[Size];// 인스턴스를 지정된 값만큼 만드는 것이 아니다@!
    // 래퍼런스를 만드는 것이다 >> 주소를 담을 래퍼런스 변수 100개를 만든는  것이다. 
   
    int count = 0;

    for (int i = 0; i < Size; i++) {
      
      // 사용자가 입력한 게시물 데이터를 저장할 메모리를 Board설계도에 따라 만든다.
      Member member = new Member(); // 주소(래퍼런스)를 만든뒤 그 주소에 넣을 값(Member)을 넣는것이다. 
      count++;

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
      
      // 게시물 데이터가 보관된 arr  인스턴스주소를 래퍼런스 배열에 저장한다.
      arr[i] = member; 
      
      System.out.println("계속 입력하시겠습니까?(Y/n) ");
      String response = keyboard.next();
      if (!response.equalsIgnoreCase("y")) {
        break;
        }
    }

    keyboard.close();
    System.out.println();


    for (int i = 0; i < count; i++ ) {
      Member member = arr[i];
      System.out.printf("%d, %s, %s, %s, %s\n",
          member.no, member.name, member.email, 
          member.number, member.date);
    }
  }
}








