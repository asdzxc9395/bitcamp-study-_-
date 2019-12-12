package com.eomcs.basic.ex04;

public class Exam16 {
  public static void main(String[] args) {
    // 변수 사용
    byte b; //1
    short s;//2
    int i;//4
    long l;//8

    float f; //4, 유효자릿수 7
    double d; //8, 유효자릿수 15

    boolean bool; //jvm에서 int로 취급
    
    char c; //2 0~0 65535

    // ==> reference: 다른 메모리의 주소를 저장하는 변수
    
    String str; //스트링이 저장된 메모리의 주소
    Thread t; // 스레드가 저장된 메모리의 주소
    java.sql.Date date; // 날짜정보가 저장된 메모리의 주소
    java.net.Socket socket; // 네트워크정보가 저장된 메모리의 주소
    int [] irr;
  }
}

