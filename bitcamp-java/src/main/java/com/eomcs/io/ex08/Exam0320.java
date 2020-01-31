// DataInputStream으로 객체 읽기 - DataOutputStream --- > FileOutputStream
package com.eomcs.io.ex08;

import java.io.FileInputStream;

public class Exam0320 {

  public static void main(String[] args) throws Exception {

    FileInputStream fileIn = new FileInputStream("temp/test6.data");
    DataInputStream in = new DataInputStream(fileIn);

    Member member = new Member();

    long start = System.currentTimeMillis();
    for (int i = 0; i < 10000; i++) {
      member.name = in.readUTF();
      member.age = in.readInt();
      member.gender = in.readBoolean();
    }
    long end = System.currentTimeMillis();
    System.out.println(end - start);
    in.close();

    System.out.printf("%s\n", member);
  }
}


