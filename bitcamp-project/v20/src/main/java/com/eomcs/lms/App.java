package com.eomcs.lms;

import java.util.Scanner;
import com.eomcs.lms.handler.BoardHandler;
import com.eomcs.lms.handler.LessonHandler;
import com.eomcs.lms.handler.MemberHandler;
import com.eomcs.lms.util.Prompt;

public class App {

  static Scanner keyboard = new Scanner(System.in);

  public static void main(String[] args) {

    Prompt prompt = new Prompt(keyboard);
    
    //boardHandler의 메소드가 사용할 메모리만 게시판 마다 따로 생성한다.
    BoardHandler boardHandler = new BoardHandler(prompt);
    
    LessonHandler lessonHandler = new LessonHandler(prompt);
    
    MemberHandler memberHandler = new MemberHandler(prompt);

    
    
    String command;

    do {
      System.out.println("\n명령");
      command = keyboard.nextLine();

      switch (command) {
        case "/lesson/add":

          lessonHandler.addLesson(); 

          break;

        case "/lesson/list":

          lessonHandler.listLesson();

          break;

        case "/lesson/detail":

          lessonHandler.detailLesson();

          break;
          
        case "/lesson/update":

          lessonHandler.updateLesson();

          break;
          
        case "/lesson/delete":

          lessonHandler.deleteLesson();

          break;


        case "/member/add":

          memberHandler.addMember();

          break;

        case "/member/list":

          memberHandler.listMember();

          break;

        case "/member/detail":

          memberHandler.detailMember();

          break;
          
        case "/member/update":

          memberHandler.updateMember();

          break;
          
        case "/member/delete":

          memberHandler.deleteMember();

          break;

        case "/board/add":

          boardHandler.addBoard();

          break;

        case "/board/list":


          boardHandler.listBoard();
          break;

        case "/board/detail":

          boardHandler.detailBoard();

          break;
          
        case "/board/update":

          boardHandler.updateBoard();

          break;
          
        case "/board/delete":

          boardHandler.deleteBoard();

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







