package com.eomcs.lms.handler;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import com.eomcs.lms.domain.Board;

public class BoardListCommand implements Command {

  List<Board> boardList;


  public Scanner input;

  public BoardListCommand(List<Board> list) {
    this.boardList = list;
  }

  @Override
  public void execute() {
    Iterator<Board> iterator = boardList.iterator();

    while (iterator.hasNext()) {

      Board b = iterator.next();

      System.out.printf("%d, %s, %s, %d\n", b.getNo(), b.getTitle(), b.getDate(), b.getViewCount());
    }
  }

}
