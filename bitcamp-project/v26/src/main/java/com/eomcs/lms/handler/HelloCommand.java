package com.eomcs.lms.handler;

import java.util.List;
import com.eomcs.lms.domain.Board;
import com.eomcs.lms.util.Prompt;

// "/Hello" 명령처리
public class HelloCommand implements Command {

  List<Board> boardList;

  Prompt prompt;

  public HelloCommand(Prompt prompt) {
    this.prompt = prompt;
  }

  @Override
  public void execute() {
    String name = prompt.inputString("이름? ");

    System.out.printf("%s님 반갑습니다.\n.", name);
  }

}
