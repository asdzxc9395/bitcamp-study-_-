package com.eomcs.oop.ex08.test;

public class I extends Object {

  private int a;
  private int b;
  
  public int getA() { // 값을 입력하는 게터
    return a;
  }
  public void setA(int a) {  // 입력한 값을 조회하는 세터
    this.a = a;
  }
  public int getB() {
    return b;
  }
  public void setB(int b) {
    this.b = b;
  }
 // 게터 세터를 통칭하여 property라 부른다. 헤헤
}

  class TestI {
    public static void main(String[] args) {
      I obj = new I();
      //obj.a = 100;
      //obj.b = 100;
      obj.setA(100);
      obj.setB(100);
    }
    // 유효한 값으로 설정해주는게 캠슐화
    // 남들이 건들지 못하게 막구 유효한 값으로만 넣을수 있게 하는거야 ㅇㅋ?
  }
