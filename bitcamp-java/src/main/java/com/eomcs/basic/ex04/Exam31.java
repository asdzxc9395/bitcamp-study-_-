package com.eomcs.basic.ex04;

public class Exam31 {
  public static void main(String[] args) {
    // 부동소수점 변수 - 메모리크기

    float f;

    f = 3.141592f;
    System.out.println(f);

    f = 3.1415927f; //7자리를 초과하여 값이 짤린다.
    System.out.println(f);

    f = 0.0000003141592f; //
    System.out.println(f);

    f = 0.00000031415929f; //소수점 이하인경우 앞의 0은 유효자릿수에 포함 안함
    System.out.println(f);

    f = 314159200000.0f; //소수점 이상인 경우  0을 포함해서 유효자릿수 계산
    System.out.println(f);

    double d;

    d = 98765432123456.7;
    System.out.println(d);

    d = 98765432123456.74; // 값이 왜곡된다.
    System.out.println(d);

    //변수와 리터럴
    f = 99999.99f;
    System.out.println(f);
    
    f = 99999.888888f; // 이미 리터럴이 4바이트 유효자릿수를 넘어갔다.
    System.out.println(f);

    d = 99999.88f; //4바이트 부동소수점을 2바이트에 넣을때 문제가 발생한다.
    System.out.println(d);

    d = 99999.88;  // 각자 바이트에 맞는 리터럴을 사용하여야 한다.
    System.out.println(d);

    //4바이트에는 4바이트  리터럴, 8바이트는 8바이트 리터럴을 사용하여야 한다.

    float f1 = 99988.88f;
    float f2 = 11.11111f;
    System.out.println(f1);
    System.out.println(f2);
    
    float f3 = f1 + f2;
    System.out.println(f3);
    // 99988.88
    //    11.11111
    //ㅡㅡㅡㅡㅡㅡㅡㅡㅡ
    // 99999.99111  >> 7자리 초과

    double r = f1 + f2;//float + float = float 이미 결과에서 값이 왜곡된다.
    System.out.println(r);

    double d1 = 99988.88;
    double d2 = 11.11111;
    System.out.println(d1);
    System.out.println(d2);
    
    double d3 = d1 + d2;
    System.out.println(d3);

    f1 = 3.141592f;
    d1 = f1; //컴파일 ok 단, 값은 왜곡
    System.out.println(d1);

    //f1 = d1; // 컴파일 오류!

    


    




  }
}

