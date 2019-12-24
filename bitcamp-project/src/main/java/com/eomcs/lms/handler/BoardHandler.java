package com.eomcs.lms.handler;

import java.sql.Date;
import java.util.Scanner;


public class BoardHandler {
  static class Board {
    int no;
    String title;
    Date date;
    int viewCount;
  }

  static final int Board_Size = 100;
  static Board[] boards = new Board[Board_Size];
  static int Boardcount = 0;
  public static Scanner keyboard;
  
  
  public static void addBoard() {
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
  
  public static void listBoard() {
    for (int i = 0; i < Boardcount; i++) {
      Board b = boards[i];
      System.out.printf("%d, %s, %s, %d\n", 
          b.no, b.title, b.date, b.viewCount);
    }
  }

}
