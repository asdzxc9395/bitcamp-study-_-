package com.eomcs.lms;

import java.sql.Date;
import java.util.Scanner;

public class App {

  static Scanner keyboard = new Scanner(System.in);

  static class Lesson {
    int no1;
    String title;
    String contents;
    Date start;
    Date end;
    int total;
    int day;
    Date date1;
  }
  static final int Lesson_Size = 100;
  static Lesson[] lessons = new Lesson[Lesson_Size];
  static int Lessoncount = 0;

  static class Board {
    int no;
    String title;
    Date date;
    int viewCount;
  }

  static final int Board_Size = 100;
  static Board[] boards = new Board[Board_Size];
  static int Boardcount = 0;

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

  public static void main(String[] args) {

    String command;

    do {
      System.out.println("\n명령");
      command = keyboard.nextLine();

      switch (command) {
        case "/lesson/add":

          // 분리된 코드(메서드)를 실행시킨다.
          // >> 보통 "메서드를 호출한다."라고 표현한다.
          addLesson(); 

          break;
        case "/lesson/list":

          listLesson();

          break;

        case "/member/add":

          addMember();

          break;
        case "/member/list":

          listMember();

          break;
        case "/board/add":

          addBoard();

          break;

        case "/board/list":

          listBoard();

          break;
        default:
          if(!command.equalsIgnoreCase("quit")) {
            System.out.println("실행할수 없는 명령입니다.");
          }
      }
    } while (!command.equalsIgnoreCase("quit"));

    System.out.println("안녕!");
    keyboard.close();


  }
  
  static void addLesson() {
    Lesson lesson = new Lesson();

    System.out.print("번호? ");
    lesson.no1 = keyboard.nextInt();
    keyboard.nextLine();

    System.out.print("수업명? ");
    lesson.title = keyboard.nextLine();

    System.out.print("수업내용? ");
    lesson.contents = keyboard.nextLine();

    System.out.print("시작일? ");
    lesson.start = Date.valueOf(keyboard.nextLine());

    System.out.print("종료일? ");
    lesson.end = Date.valueOf(keyboard.nextLine());

    System.out.print("총수업시간? ");
    lesson.total = keyboard.nextInt();

    System.out.print("일수업시간? ");
    lesson.day = keyboard.nextInt();
    keyboard.nextLine();

    lesson.date1 = new Date(System.currentTimeMillis());

    lessons[Lessoncount++] = lesson;
    System.out.println("저장하였습니다.");
  }
  
  static void listLesson() {
    for (int i = 0; i < Lessoncount; i++) {
      Lesson l = lessons[i];
      System.out.printf("%d, %s, %s, %s ~ %s, %d, %d\n, %s",
          l.no1, l.title,l. contents, 
          l.start, l.end, 
          l.total, l.day, l.date1);
    }
  }
  
  static void addMember() {
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
  
  static void listMember() {
    for (int i = 0; i < Membercount; i++ ) {
      Member m = members[i];
      System.out.printf("%d, %s, %s, %s, %s\n",
          m.no, m.name, m.email, 
          m.number, m.date);
    }
  }

  static void addBoard() {
    Board board = new Board();

    System.out.print("번호? ");
    board.no = keyboard.nextInt();
    keyboard.nextLine(); // 줄바꿈 기호 제거용

    System.out.print("내용? ");
    board.title = keyboard.nextLine();

    board.date = new Date(System.currentTimeMillis());
    board.viewCount = 0;

    boards[Boardcount++] = board;
    System.out.println("저장하였습니다.");
  }
  
  static void listBoard() {
    for (int i = 0; i < Boardcount; i++) {
      Board b = boards[i];
      System.out.printf("%d, %s, %s, %d\n", 
          b.no, b.title, b.date, b.viewCount);
    }
  }

}







