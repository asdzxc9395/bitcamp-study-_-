package com.eomcs.lms;

import java.util.Scanner;
import java.sql.Date;

// 입력을 카운트하기
public class App2 {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);

    final int Size = 100;

    int[] no = new int[Size];
    String[] name = new String[Size];
    String[] email = new String[Size];
    String[] password = new String[Size];
    String[] photo = new String[Size];
    String[] number = new String[Size];
    Date[] date = new Date[Size];


    int count = 0;

    for (int i = 0; i < Size; i++) {
      count++;

      System.out.print("번호?");
      no[i] = keyboard.nextInt();
      keyboard.nextLine();

      System.out.print("이름?");
      name[i] = keyboard.nextLine();

      System.out.print("이메일?");
      email[i] = keyboard.nextLine();

      System.out.print("암호?");
      password[i] = keyboard.nextLine();

      System.out.print("사진?");
      photo[i] = keyboard.nextLine();

      System.out.print("전화?");
      number[i] = keyboard.nextLine();

      date[i] = new Date(System.currentTimeMillis());

      System.out.println("계속 입력하시겠습니까?(Y/n) ");
      String response = keyboard.next();
      if (!response.equalsIgnoreCase("y")) {
        break;
        }
    }

    keyboard.close();
    System.out.println();


    for (int i = 0; i < count; i++ ) {
      System.out.printf("%d, %s, %s, %s, %s\n ",
          no[i], name[i], email[i], number[i], date[i]);
    }
  }
}








