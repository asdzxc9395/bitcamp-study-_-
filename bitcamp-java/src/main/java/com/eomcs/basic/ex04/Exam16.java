package com.eomcs.basic.ex04;

public class Exam16 {
  public static void main(String[] args) {
    // 변수 사용
    byte b; //1
    short s;//2
    int i;//4
    long l;//8

    float f; //4
    double d; //8

    boolean bool; //jvm에서 int로 취급
    
    char c; //2

    // ==> reference: 다른 메모리의 주소를 저장하는 변수
    
    String str; //문자열이 저장된 메모리의 주소를 저장한다.
    Thread t; // 스레드가 저장된 메모리의 주소를 저장한다.
    java.sql.Date date; // 날짜
    java.net.Socket socket; // 네트워크가 저장된 메모리를 저장한다.


  }
}

