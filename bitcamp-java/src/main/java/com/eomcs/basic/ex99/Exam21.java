package com.eomcs.basic.ex99;

public class Exam21 {
  public static void main(String[] args) {
    // 키보드 정보를 가져온다.
    java.io.InputStream keyboard = System.in;
    
    // 키보드 객체의 정수, 부동소수점, 논리값, 문자열을 끊어서 읽어 주는 
    // 도우미 객체를 붙인다.
    java.util.Scanner scanner = new java.util.Scanner(keyboard);
    
    // 키보드로부터 들어온 바이트 배열을 분석하여
    // 줄바꿈 기호를 만나면 그 앞에 입력한 바이트 배열을
    // 문자열로 변환하여 리턴한다.
    // 키보드로부터 줄바꿈 값이 들어오지 않으면 영원히 리턴하지 않는다.
    String s1 = scanner.nextLine();
    String s2 = scanner.nextLine();
    String s3 = scanner.nextLine();
    
    System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");

    System.out.println(s1);
    System.out.println(s2);
    System.out.println(s3);

    //new 는 도구를 생성하는 명령어
    //Scanner 에다 키보드를 넘겨주면 키보드가 작업을 한다.
    //키보드에 들어온 데이터를 스캐너가 가공해서 넘겨준다.
    
    // 키보드가 전기적 신호를 주면 inputstream, system.in에서 바이트코드로 
    //스캐너한테 보낸다. 스캐너에서 nextline이 바이트코드를 4자리, 엔터지점
    // , ln, lr에서 끊고
    //  가공된 값을 보낸다. (문자 , 정수 , 논리등)
    /*
    1.새로운 스캐너를 만든다 new scanner ( ) ;
    2.( ) 안에 신호넣는다. 
    */
  }
}

