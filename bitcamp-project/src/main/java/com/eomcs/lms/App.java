package com.eomcs.lms;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
import com.eomcs.lms.domain.Board;
import com.eomcs.lms.domain.Lesson;
import com.eomcs.lms.domain.Member;
import com.eomcs.lms.handler.BoardAddCommand;
import com.eomcs.lms.handler.BoardDeleteCommand;
import com.eomcs.lms.handler.BoardDetailCommand;
import com.eomcs.lms.handler.BoardListCommand;
import com.eomcs.lms.handler.BoardUpdateCommand;
import com.eomcs.lms.handler.Command;
import com.eomcs.lms.handler.ComputeCommand;
import com.eomcs.lms.handler.HelloCommand;
import com.eomcs.lms.handler.LessonAddCommand;
import com.eomcs.lms.handler.LessonDeleteCommand;
import com.eomcs.lms.handler.LessonDetailCommand;
import com.eomcs.lms.handler.LessonListCommand;
import com.eomcs.lms.handler.LessonUpdateCommand;
import com.eomcs.lms.handler.MemberAddCommand;
import com.eomcs.lms.handler.MemberDeleteCommand;
import com.eomcs.lms.handler.MemberDetailCommand;
import com.eomcs.lms.handler.MemberListCommand;
import com.eomcs.lms.handler.MemberUpdateCommand;
import com.eomcs.lms.util.Prompt;
import com.google.gson.Gson;

public class App {

  static Scanner keyboard = new Scanner(System.in);

  static Deque<String> commandStack = new ArrayDeque<>();
  static Queue<String> commandQueue = new LinkedList<>();

  static List<Lesson> lessonList;
  static List<Board> boardList;
  static List<Member> memberList;

  public static void main(String[] args) {

    // 파일에서 데이터 로딩
    loadLessonData();
    loadBoardData();
    loadMemberData();

    Prompt prompt = new Prompt(keyboard);
    HashMap<String, Command> commandMap = new HashMap<>();

    commandMap.put("/board/add", new BoardAddCommand(prompt, boardList));
    commandMap.put("/board/list", new BoardListCommand(boardList));
    commandMap.put("/board/detail", new BoardDetailCommand(prompt, boardList));
    commandMap.put("/board/command", new BoardUpdateCommand(prompt, boardList));
    commandMap.put("/board/delete", new BoardDeleteCommand(prompt, boardList));

    commandMap.put("/lesson/add", new LessonAddCommand(prompt, lessonList));
    commandMap.put("/lesson/list", new LessonListCommand(lessonList));
    commandMap.put("/lesson/detail", new LessonDetailCommand(prompt, lessonList));
    commandMap.put("/lesson/update", new LessonUpdateCommand(prompt, lessonList));
    commandMap.put("/lesson/delete", new LessonDeleteCommand(prompt, lessonList));

    commandMap.put("/member/add", new MemberAddCommand(prompt, memberList));
    commandMap.put("/member/list", new MemberListCommand(memberList));
    commandMap.put("/member/detail", new MemberDetailCommand(prompt, memberList));
    commandMap.put("/member/update", new MemberUpdateCommand(prompt, memberList));
    commandMap.put("/member/command", new MemberDeleteCommand(prompt, memberList));

    commandMap.put("/Hello", new HelloCommand(prompt));
    commandMap.put("/compute/plus", new ComputeCommand(prompt));

    String command;

    while (true) {
      System.out.println("\n명령>");
      command = keyboard.nextLine();

      if (command.length() == 0)
        continue;

      if (command.equals("quit")) {
        System.out.println("안녕");
        break;
      } else if (command.equals("history")) {
        printCommandHistory(commandStack.iterator());
        continue;
      } else if (command.equals("history2")) {
        printCommandHistory(commandQueue.iterator());
        continue;
      }

      commandStack.push(command);

      commandQueue.offer(command);

      Command commandHandler = commandMap.get(command);


      if (commandHandler != null) {
        try { // 실행중 오류를 발생했을때 실행하는 명령어이다.
          // 허나 예외의 상황의 경우 이 메서드를 실행하며 안된다. 예외가 발생할수 있는 코드
          commandHandler.execute();
        } catch (Exception e) {
          System.out.printf("명령어 실행중 오류 발생 :%s\n", e.getMessage());
        }
      } else {
        System.out.println("실행할수 없는 명령입니다.");
      }
    }
    keyboard.close();

    // 데이터를 파일에 저장
    saveLessonData();
    saveMemberData();
    saveBoardData();

  } // main()

  private static void printCommandHistory(Iterator<String> iterator) {
    int count = 0;
    while (iterator.hasNext()) {
      System.out.println(iterator.next());
      count++;

      if ((count % 5) == 0) {
        System.out.println(":");
        String str = keyboard.nextLine();
        if (str.equalsIgnoreCase("q")) {
          break;
        }
      }
    }
  }

  private static void loadLessonData() {
    // 데이터가 보관된 파일을 정보를 준비한다.
    File file = new File("./lesson.json");

    try (FileReader in = new FileReader(file)) {
      /*
       * 방법1) JSON --> List Gson json도구= new Gson();
       *
       * Lesson[] lessons = json도구.gson.from(in, Lesson[].glass); List<Lesson> 읽기전용LIST구현체 =
       * Arrays.asList(배열); lessonList = new ArrayList<>(읽기전용 List구현체);
       * 
       */
      lessonList = new ArrayList<>(Arrays.asList(new Gson().fromJson(in, Lesson[].class)));
      System.out.printf("총 %d 개의 수업 데이터를 로딩했습니다.\n", lessonList.size());

    } catch (IOException e) {
      System.out.println("파일 읽기 중 오류 발생! - " + e.getMessage());
      // 파일에서 데이터를 읽다가 오류가 발생하더라도
      // 시스템을 멈추지 않고 계속 실행하게 한다.
      // 이것이 예외처리를 하는 이유이다!!!
    }
  }


  private static void saveLessonData() {
    // 데이터가 보관된 파일을 정보를 준비한다
    File file = new File("./lesson.json");

    try (FileWriter out = new FileWriter(file)) {
      out.write(new Gson().toJson(lessonList));
      System.out.printf("총 %d 개의 수업 데이터를 저장했습니다.\n", lessonList.size());

    } catch (IOException e) {
      System.out.println("파일 쓰기 중 오류 발생! - " + e.getMessage());

    }
  }


  private static void loadBoardData() {
    File file = new File("./board.json");


    try (FileReader in = new FileReader(file)) {

      boardList = new ArrayList<>(Arrays.asList(new Gson().fromJson(in, Board[].class)));

      System.out.printf("총 %d 개의 게시물 데이터를 로딩했습니다.\n", boardList.size());

    } catch (IOException e) {
      System.out.println("파일 읽기 중 오류 발생! - " + e.getMessage());

    }
  }

  private static void saveBoardData() {
    File file = new File("./board.json");


    try (FileWriter out = new FileWriter(file)) {
      out.write(new Gson().toJson(boardList));
      System.out.printf("총 %d 개의 게시물 데이터를 저장했습니다.\n", boardList.size());

    } catch (IOException e) {
      System.out.println("파일 쓰기 중 오류 발생! - " + e.getMessage());

    }
  }



  private static void loadMemberData() {
    File file = new File("./Member.json");


    try (FileReader in = new FileReader(file)) {
      memberList = new ArrayList<>(Arrays.asList(new Gson().fromJson(in, Member[].class)));
      System.out.printf("총 %d개의 멤버 데이터를 로딩했습니다\n", memberList.size());

    } catch (IOException e) {
      System.out.println("파일 읽기 중 오류 발생 ! - " + e.getMessage());

    }
  }

  private static void saveMemberData() {
    File file = new File("./Member.json");


    try (FileWriter out = new FileWriter(file)) {
      out.write(new Gson().toJson(memberList));
      System.out.printf("총 %d 개의 멤버 데이터를 저장했습니다.\n", memberList.size());

    } catch (IOException e) {
      System.out.println("파일 쓰기 중 오류 발생! - " + e.getMessage());

    }
  }



}


