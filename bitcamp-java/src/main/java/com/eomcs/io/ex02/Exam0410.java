// Byte Stream - 바이트 단위로 읽기
package com.eomcs.io.ex02;

import java.io.File;
import java.io.FileInputStream;

public class Exam0410 {

  public static void main(String[] args) throws Exception {

    // 1) 파일의 데이터를 읽을 객체를 준비한다.
    File file = new File("sapmle/photo.jpg");

    // 2) 파일을 읽을 도구를 준비한다.
    FileInputStream in = new FileInputStream(file);

    in.read();
    int b2 = in.read(); // 00 00 00 d8
    int soi = b2 << 8 | b2;// 00 000 ff d8

    // 3) 읽기 도구를 닫는다.
    in.close();

    System.out.printf("SOI : %x\n", soi);

  }

}
