package com.eomcs.basic.ex04;


//형변환 : 형변환 규칙
public class Exam93 {

  public static void main(String []args) {
    
    byte b = 127;
    short s = 32767;
    int i = 21_0000_0000;
    long l = 922_0000_0000_0000_0000L;
    float f =3.14f; 
    double d = 3.14;
    
    //1) 정수 메모리끼리 형변환 가능
    //=> 작은 메모리의 값을 큰 메모리에 넣을 때는 따로 형본환 할 힐요가 없다.
    l = i; //ok!
    i = s; //ok!
    s = b; //ok!
    
    //=> 큰 메모리의 값을 작은 메모리에 넣을 때는 "명시적 형변환"을 수행해야 한다.
    i = (int) l; // 단 , 값이 짤린다.
    s = (short) i; // 단 , 값이 짤린다.
    b = (byte) s; // 단 , 값이 짤린다.
    
    //2) 부동소수점 정수 메모리에 저장가능
    //=> 앞의 예제 참조
    
    //3) 정수의 부동소수점 메모리에 저장가능, 명시적 형변환 필요없다.
    //=> 앞의 예제 참조
    
    //4) 숫자를 문자 변수에 저장 가능
    i = 65;
    char c = (char) i;
    System.out.println(c);
    
    // 그 외 형변환 불가!
    boolean bool;
    //bool = (boolean)b; // 컴파일 오류 !
    //bool = b; // 컴파일 오류!
    //bool = s; // 컴파일 오류!
    //bool = i; // 컴파일 오류!
    //bool = l; // 컴파일 오류!
    //bool = f; // 컴파일 오류!
    //bool = d; // 컴파일 오류!
    //bool = c; // 컴파일 오류!
    
    //bool = "true"; // 컴파일 오류
    // i = (int) "10";
    //c = (char) "가";
    //f = (float) "3.14f";
    //i = "10";
    //c = "가";
    //f = "3.14f";
    
    //i = bool;
    //f = bool;
    //c = bool;
    //f = bool;
  }
}
