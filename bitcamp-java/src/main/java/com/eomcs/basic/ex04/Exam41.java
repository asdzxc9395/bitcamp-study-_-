package com.eomcs.basic.ex04;

public class Exam41 {
  public static void main(String[] args) {

        // 문자 변수
    
        short s;
        char c;
    
        s = -32768;
        s = 32767;

        c = 0;
        c = 65535;

        char c1 = 65;
        char c2 = 0x41;
        char c3 = 0b0100_0001;
        char c4 = 'A'; // c 변수에 저장되는 것은 문자 'A'의 UCS-2 코드 값이다.
                        // 문자 A의UCS-2 코드값을 다시 문자로 출력해도 a가 나온다

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
    
        //문자의 UCS-2 코드 값을 확인하기
        //- 정수 변수를 사용하면 문자의 코드 값을 받아서 그래도 출력할 수 있다.
        //  println()은 int 변수의 값은 10진수로 출력한다.
        int i1 = 'A';
        i1 = i1 + 10;
        System.out.println((char)i1); // 정수로 표현하는 int를 정수값으로 표현할라면
                                      // 이렇게 출력시 (char)을 적용하는데
                                      // 이걸 형변환이라고 한다.

        for (int i = 65; i < 'A' + 26; i++) {
          System.out.println((char)i);
        }
            
      
  }
}

