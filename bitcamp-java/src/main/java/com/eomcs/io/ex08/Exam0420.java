// DataInputStream으로 객체 읽기 - FileInputStream ---> BufferedInputStream ---> DataInputStream
package com.eomcs.io.ex08;

import java.io.FileInputStream;

public class Exam0420 {

  public static void main(String[] args) throws Exception {

    // 데코레이터 패턴의 장점은
    // 다음과 같이 필요한 기능을 쉽게 삽입할수 있다는 것이다.
    //
    FileInputStream fileIn = new FileInputStream("temp/test7.data");
    BufferedInputStream bufOut = new BufferedInputStream(fileIn);
    DataInputStream in = new DataInputStream(bufOut);

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


