package com.eomcs.basic.ex99;

public class Exam231 {
  public static void main(String[] args) {
    java.util.Scanner scanner = new java.util.Scanner(System.in);
    
    // nextInt() 다음에 nextLine() 을 호출할때
    // 공백 문자가 읽히는 문자해결

    System.out.print("입력>");

    int i1 = scanner.nextInt();
    int i2 = scanner.nextInt();

    //공백만 그냥 읽는다.
    //next()
    // >> 한개의 token(단어)을 읽는다.
    // >> 공백을 만날 때 까지 읽는다.
    // >> 앞 공백은 제거한다.
  
    // >> 물론 nextInt() 와 달리 값을 읽은후 뒤에 공백은 제거한다.
  
    

    String s = scanner.next();
    String s2 = scanner.next();
    int i3 = scanner.nextInt();
    String s3 = scanner.next();
    
    System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");

    System.out.println(i1);
    System.out.println(i2);
    System.out.println(i3);
    System.out.println(s);
    System.out.println(s2);
    System.out.println(s3);


    
    
  }
}

