// 객체 출력 - 인스턴스의 값을 출력
package com.eomcs.io.ex05;

import java.io.FileOutputStream;

public class Exam0110 {

  public static void main(String[] args) throws Exception {
    FileOutputStream out = new FileOutputStream("temp/test4.data");

    Member member = new Member();
    member.name = "AB가각간";
    member.age = 27;
    member.gender = true;

    // 인스턴스의 값을 출력하라!
    // 1) 이름 출력
    byte[] bytes = member.name.getBytes("UTF-8");
    out.write(bytes.length); // 1 바이트
    out.write(bytes); // 문자열 바이트

    // 2) 나이 출력 (4바이트)
    out.write(member.age >> 24);
    out.write(member.age >> 16);
    out.write(member.age >> 8);
    out.write(member.age);

    // 3) 성별 출력 (1바이트)
    if (member.gender)
      out.write(1);
    else
      out.write(0);
    // 바이너리 형식은 출력한 형태로 읽어야 한다.
    // 문자열의 통일을 위해 속도가느려도 JSON이나 Xml을 쓴다.
    out.close();

    System.out.println("데이터 출력 완료!");

  }

}
