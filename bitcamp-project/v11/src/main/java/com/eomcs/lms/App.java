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
    
    
    //MemberHandler의 메소드를 사용하기 전에
    // 그 메서드가 작업할 때 사용할 키보드 객체를 설정해준다.
    
    String command;

    do {
      System.out.println("\n명령");
      command = keyboard.nextLine();

      switch (command) {
        case "/lesson/add":

          // 다른 클래스로 분리한 메소드를 호출할 때는
          // 클래스의 이름을 지정해야 한다.
          LessonHandler.addLesson(); 

          break;
        case "/lesson/list":

          LessonHandler.listLesson();

          break;

        case "/member/add":

          MemberHandler.addMember();

          break;
        case "/member/list":

          MemberHandler.listMember();

          break;
        case "/board/add":

          BoardHandler.addBoard();

          break;

        case "/board/list":

          BoardHandler.listBoard();

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







