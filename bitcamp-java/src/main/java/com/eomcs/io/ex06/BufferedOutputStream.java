package com.eomcs.io.ex06;

import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStream extends FileOutputStream {
  byte[] buf = new byte[8196];
  int cursor;

  public BufferedOutputStream(String filename) throws Exception {
    super(filename);
  }

  @Override
  public void write(int b) throws IOException {
    if (cursor == buf.length) { // 버퍼가 다차면
      super.write(buf); // 버퍼에 들어있는 수퍼클래스 데이터를 한 번에 출력한다.
      cursor = 0; // 다시 커서를 초기화시킨다.
    }

    // 1바이트 출력하라고 하면 일단 버퍼에 저장할 것이다.
    buf[cursor++] = (byte) b;
  }

  @Override
  public void write(byte[] buf) throws IOException {
    for (byte b : buf) {
      this.write(b & 0x000000ff); // write 메서드가 서로를 가리키면 안되기 때문에
      // 하나를 수퍼 클래스에 있는 메서드에서 찾아야한다.
    }
  }

  @Override
  public void close() throws IOException {
    this.flush(); // 방출하다.
    super.close();
  }


  @Override
  public void flush() throws IOException {
    if (cursor > 0) { // 0부터 cursor 개수만큼 방출하라.
      this.write(buf, 0, cursor);
      cursor = 0;
    }
  }

}


