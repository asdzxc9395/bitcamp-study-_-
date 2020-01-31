package com.eomcs.lms.handler;

import java.util.Scanner;
import com.eomcs.lms.util.Prompt;

// /board/detail 명령처리
public class ComputeCommand implements Command {

  Prompt prompt;

  public Scanner input;

  public ComputeCommand(Prompt prompt) {
    this.prompt = prompt;
  }

  @Override
  public void execute() {
    int a = prompt.inputInt("수1? ");
    int b = prompt.inputInt("수2? ");


    System.out.printf("게산결과는 %d입니다.\n", a + b);
  }

}
