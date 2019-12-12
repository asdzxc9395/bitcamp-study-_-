package com.eomcs.basic.ex99;

public class Exam11 {
  public static void main(String[] args) {
    //값 출력하기
    // println() 사용법
    // >> 출력 + 줄바꿈
    System.out.println(100);
    System.out.println(3.14);
    System.out.println(true);
    System.out.println('가');
    System.out.println("안녕!");
    
    System.out.println();
    //print() 사용법
    // >> 출력
    System.out.print(100);
    System.out.print(3.14);
    System.out.print(true);
    System.out.print('가');
    System.out.print("안녕!");

    System.out.print('\n');

    System.out.print("OK!\n");
    System.out.print("NO!");

    //printf() 사용법
    // >> printf ("형식", 값1, 값2 ...) 여러개 지정 가능하다.
    //문자에 %s, 숫자에 %d 사용(%s)가능
    System.out.printf("\n이름: %s", "채진호");
    System.out.printf("\n나이: %d", 26);
    System.out.printf("\n이름: %s", "홍길동");
    System.out.printf("\n이름(나이): %s(%d)", "홍길동", 20);
    
    //정수 삽입
    // %d : decimal
    // %x : hexadecimal
    // %c : charater
    System.out.printf("\n %d, %x, %c", 65, 65, 65);

    // 삽입될 값 지정하기
    // %값위치$d
    System.out.printf("\n %1$d, %1$x, %1$c", 65);

    // 논리값 삽입
    // %s 사용
    System.out.printf("\n재직자: %s", true);
    System.out.printf("\n나이: %s, %d", 20, 20);

    //출력할 공간확보
    // %s 사이에 숫자를 넣으면 그만큼의 공간 확보
    System.out.printf("\n이름: [%s]", "홍길동");
    System.out.printf("\n이름: [%20s]", "홍길동"); // 오른쪽정렬
    System.out.printf("\n이름: [%-20s]", "홍길동"); // 왼쪽정렬

    System.out.printf("\n숫자: [%d]", 12345);
    System.out.printf("\n숫자: [%10d]", 12345);
    System.out.printf("\n숫자: [%-10d]", 12345);
    System.out.printf("\n숫자: [%010d]", 12345); // 앞에 빈자리가 0으로 채워진다.
    System.out.printf("\n숫자: [%+010d], [%010d]", 12345, -12345);

    // 일시 다루기
    java.util.Date today = new java.util.Date();
    today.setDate(9);

    System.out.printf("\n%s ", today);

    //날짜 객체에서 년, 월, 일, 시, 분, 요일 추출하기
    // %t + Y : 년도 
    System.out.printf("\n%tY, %ty ", today, today); // %t + Y : 년도 
    //대문자 4글자, 소문자 2글자
    System.out.printf("\n%tB, %tb ", today, today); // %t + B : 월도
    System.out.printf("\n%tm ", today); // 숫자만 출력
    //대소문자 구별 x
    System.out.printf("\n%td, %te ", today, today); // %t + d, e : 일 출력
    // d : 2자리 e : 1자리 ex) 09, 9
    System.out.printf("\n%tA, %ta ", today, today); // %t + A, a : 요일출력
    // A : 월요일, a : 월
    System.out.printf("\n%tH, %tI ", today, today); // %t + H, I : 시각 추출
    // H :24시간 기준, I : 12시간 기준
    System.out.printf("\n%tM,", today); // %t + M : 분 추출
    System.out.printf("\n%tS, %tL, %tN", today, today, today);
    // %t + S, L, N : 초추출
    // S 초, L 밀리초, N 나노초
    System.out.printf("\n%tp, %Tp", today, today); // 오전 오후
    //tp 소문자 , Tp 대문자 

    // 2019 - 12 - 12 - 12 : 37 : 45
    System.out.printf("\n%1$tY-%1$tm-%1$td-%1$tH-%1$tM,%1$tS", today); 

    String str;
    str = String.format("\n%1$tY-%1$tm-%1$td-%1$tH-%1$tM,%1$tS", today);
    System.out.println(str);
    
    


    
  }
}

