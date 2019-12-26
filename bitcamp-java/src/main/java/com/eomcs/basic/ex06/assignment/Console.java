package com.eomcs.basic.ex06.assignment;

import java.util.Scanner;

public class Console {
  @Deprecated // 비난받는 메서드 >> 콘솔안에 여러가지 명령을 내릴때 
              // 다른 페이지에서 각각 맞는 명령에 맞게 출력하여야 하는데
              // @Deprecated로 막아서 구별한다.
  static int inputInt() {
    return inputInt("밑변길이는?");
  }

  static int inputInt(String message) {
    Scanner keyboard = new Scanner(System.in);
    System.out.println(message);
    int width = keyboard.nextInt();
    //keyboard.close(); 키보드 객체까지 close가 되버린다.
    return width;
  }
}
