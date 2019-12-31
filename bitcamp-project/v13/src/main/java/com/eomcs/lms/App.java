package com.eomcs.lms;

import java.util.Scanner;
import com.eomcs.lms.handler.BoardHandler;
import com.eomcs.lms.handler.LessonHandler;
import com.eomcs.lms.handler.MemberHandler;

public class App {

  static Scanner keyboard = new Scanner(System.in);

  public static void main(String[] args) {

    //Handler의 메소드를 사용하기 전에
    //그 메서드가 작업할 때 사용할 키보드 객체를 설정해줘야 한다.
    LessonHandler.keyboard = keyboard;
    MemberHandler.keyboard = keyboard;
    BoardHandler.keyboard = keyboard;

    //boardHandler의 메소드가 사용할 메모리만 게시판 마다 따로 생성한다.
    BoardHandler 게시판1 = new BoardHandler();
    BoardHandler 게시판2 = new BoardHandler();
    BoardHandler 게시판3 = new BoardHandler();
    
    LessonHandler 정규수업 = new LessonHandler();
    
    MemberHandler 일반회원 = new MemberHandler();
    
    
    
    String command;

    do {
      System.out.println("\n명령");
      command = keyboard.nextLine();

      switch (command) {
        case "/lesson/add":

          정규수업.addLesson(); 

          break;

        case "/lesson/list":

          정규수업.listLesson();

          break;

        case "/lesson/detail":

          정규수업.detailLesson();

          break;


        case "/member/add":

          일반회원.addMember();

          break;

        case "/member/list":

          일반회원.listMember();

          break;

        case "/member/detail":

          일반회원.detailMember();

          break;

        case "/board/add":

          게시판1.addBoard();

          break;

        case "/board/list":

          게시판1.listBoard();

          break;

        case "/board/detail":

          게시판1.detailBoard();

          break;

        case "/board2/add":

          게시판2.addBoard();

          break;

        case "/board2/list":

          게시판2.listBoard();

          break;

        case "/board2/detail":

          게시판2.detailBoard();

          break;

        case "/board3/add":

          게시판3.addBoard();

          break;

        case "/board3/list":

          게시판3.listBoard();

          break;

        case "/board3/detail":

          게시판3.detailBoard();

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

  //private static 메서드는 다른 class로 접근이 불가하다.

}







