package com.eomcs.lms;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Date;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
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

public class App2 {

  static Scanner keyboard = new Scanner(System.in);

  static Deque<String> commandStack = new ArrayDeque<>();
  static Queue<String> commandQueue = new LinkedList<>();

  static ArrayList<Lesson> lessonList = new ArrayList<>();
  static LinkedList<Board> boardList = new LinkedList<>();
  static LinkedList<Member> memberList = new LinkedList<>();

  public static void main(String[] args) {

    // 파일에서 데이터 로딩
    loadLessonData();

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
    File file = new File("./lesson.csv");

    FileReader read = null;
    Scanner scan = null;

    try {

      read = new FileReader(file);
      scan = new Scanner(read);
      while (true) {
        try {
          String line = scan.nextLine();
          String[] data = line.split(",");
          Lesson lesson = new Lesson();
          lesson.setNo1(Integer.parseInt(data[0]));
          lesson.setTitle(data[1]);
          lesson.setContents(data[2]);
          lesson.setStart(Date.valueOf(data[3]));
          lesson.setEnd(Date.valueOf(data[4]));
          lesson.setTotal(Integer.parseInt(data[5]));
          lesson.setDay(Integer.parseInt(data[6]));
          lesson.setDate1(new Date(System.currentTimeMillis()));
          lessonList.add(lesson);
        } catch (Exception e) {
          break;
        }
      }
      System.out.println("몇개의 파일 데이터를 로딩했스빈다.");
    } catch (FileNotFoundException e) {
      System.out.println(" 파일 한개도 로딩안됨 메세지나옴");

    } finally {
      try {
        scan.close();
      } catch (Exception e) {
      }
      try {
        read.close();
      } catch (Exception e) {
      }
    }
  }

  private static void saveLessonData() {
    File file = new File("./lesson.csv");
    FileWriter out = null;
    try {
      out = new FileWriter(file);
      for (Lesson lesson : lessonList) {
        String line = String.format("%d,%s,%s,%s,%s,%d,%d,%s\n", lesson.getNo1(), lesson.getTitle(),
            lesson.getContents(), lesson.getStart(), lesson.getEnd(), lesson.getTotal(),
            lesson.getDay(), lesson.getDate1());
        out.write(line);
      }
      System.out.println("몇개의 데이터를 저장하였습니다.");
    } catch (IOException e) {
      System.out.println(" 오류 발생 aptpwl");
    } finally {
      try {
        out.close();
      } catch (IOException e) {

      }
    }
  }
}


