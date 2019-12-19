// 산술 연산자 : 기본 연산 단위 
package com.eomcs.basic.ex05;

public class Exam01_3 {
    public static void main(String[] args) {
        // 설명:
        // - 리터럴 5,6 은 4바이트 정수값이다.
        // - 그러나 변수에 넣을 수 있는 값이면 허락한다.
        // 리터럴끼리 산술 연산한 결과도 리터럴로 간주한다.
        // -그 결과 값이 변수의 범위 내의 값이면 허락한다.
        // - 이유? 리터럴 값은 컴파일 단계에서 그 값이 얼마인지 확인할 수 있기 때문이다.
        // - 변수의 경우는 컴파일 단계에서 값을 확인할수없다.
        byte b;
        b = 5; //ok!
        b = 6; //ok!
        //byte b = 5 + 6;
        System.out.println(b);
        
        // 리터럴 5, 6은 4바이트 정수 값이다.
        // 리터럴끼리 산술 연산한 결과도 리터럴로 간주한다.
        // 즉 컴파일 단계에서 그 값이 얼마인지 확인할 수 있기 때문이다.
        // 변수의 경우는 컴파일 단계에서 값을 확인할 수 없다.
        // 정수 리터럴은 기본이 4바이트 크기이지만,
        // byte 변수에 저장할 수 있다면 허락한다!
      
      
        

        
        
        
        byte x = 5, y = 6, z;
        //z = x + y; // 컴파일 오류!
        //   "자바는 정수 연산의 최소 단위가 4바이트 이다."
        //   "그래서 byte나 short의 연산 단위가 기본으로 4바이트 이다."
        //
        // - 자바가 정수 변수에 대해 산술 연산을 수행할 때,
        //   그 변수의 값이 4바이트 보다 작다면,(byte, short)
        //   4바이트로 만들어 연산을 수행한다.
        //   임시 4바이트 정수 메모리를 만든 다음에 
        //   그 메모리에 값을 담은 후에 연산을 수행한다.
        //   따라서 x + y는 바로 실행하지 않고
        //   임의의 4바이트 정수 메모리를 만든 다음에 
        //   그 메모리에 x와 y 값을 넣고 연산을 수행한다.
        
        //   이유?
        //   연산 결과도 당연히 4바이트이다.
        //   그래서 4바이트 값을 1바이트 메모리에 넣지 못하기 때문에
        //   컴파일 오류가 발생하는 것이다!

        
        // short도 마찬가지이다.
        short s1 = 5;
        short s2 = 6;
        //short s3 = s1 + s2; // 컴파일 오류!
        int s3 = s1 + s2;
        System.out.println(s3);
        // 이유?
        // - byte 경우와 마찬가지고 short 메모리의 값을 직접 연산할 수 없다.
        // - 임시 4바이트 메모리를 만든 다음에 그 메모리에 값을 저장한 후 
        //   연산을 수행한다.
        // - 당연히 그 연산 결과를 담은 메모리도 4바이트이기 때문에
        //   short(2byte) 메모리에 저장할 수 없는 것이다.

    }
}

// 결론!
// - 숫자의 크기에 상관없이 작은 숫자를 다루더라도 
//   정수를 다룰 때는 그냥 int를 사용하라!
// - byte는 보통 파일의 데이터를 읽어 들일 때 사용한다.