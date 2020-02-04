// LMS 클라이언트
package com.eomcs.lms;

import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class ClientApp {
  public static void main(String[] args) throws Exception {
    System.out.println("수업관리 시스템입니다.");
    try ( // try문 안에는 autocloseable 구문만 와야한다.

        // 서버와 연결
        Socket socket = new Socket("localhost", 9999); // 연결할 서버의 이름을 준다.

        // 소켓을 통해 데이터를 읽고 쓰는 도구를 준비한다.
        PrintStream out = new PrintStream(socket.getOutputStream());
        Scanner in = new Scanner(socket.getInputStream());) {

      System.out.println("서버와 연결 되었음!");
      // 서버에 메세지를 전송한다.
      // => 서버가 메세지를 받을 때 까지 리턴하지 않는다.
      // => blocking 방식으로 동작한다.
      out.println("Hello");
      System.out.println("서버에 메세지를 전송하였음!");

      // 서버가 응답한 메세지를 수신한다.
      // 서버로부터 한 줄의 메세지를 받을 떄까지 리턴하지 않는다.
      // => blocking 방식으로 동작한다.
      String message = in.nextLine();
      System.out.println("서버로부터 메세지를 수신하였음!");

      // 서버가 받은 메세지를 출력한다.
      System.out.println("서버: " + message);

      System.out.println("서버와 연결을 끊었음!");

    } catch (Exception e) {
      System.out.println("예외발생:");
      e.printStackTrace();
    }
  }
}
