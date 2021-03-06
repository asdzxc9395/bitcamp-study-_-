// 논리 연산자 : && vs &
package com.eomcs.basic.ex05;

public class Exam03_3 {
  public static void main(String[] args) {
    boolean a = false;
    boolean b = false;
    boolean r = a && (b = true); 
    // 계산 순서
    // r = a && (b =true)
    // r = a && (괄호를 먼저 계산 : b는 true 로 변경)
    // >> && 연산에서 왼쪽값이 이미 false 이기 때문에 결과는 확정되었다.
    // >> && 연산에 오른쪽을 실행하기 전에 결과를 알 수 있다면
    //       JVM은 실행의 효율을 위해 굳이 && 연산의 오른쪽을 실행하지 않는다.
    // >> 그래서 (b = true) 문장은 실행되지 않는다.
    // r = false

    // r = a && (괄호의 계산 결과를 이 자리에 놓는다. 즉 b변수의 값을 놓는다.)
    // r = a && true
    // r = false && true
    // r = false
    System.out.printf("a=%b, b=%b, r=%b\n", a, b, r);

    a = false;
    b = false;
    r = a & (b = true);
    System.out.printf("a=%b, b=%b, r=%b\n", a, b, r);
    //계산 순서
    //r = a & (b = true)
    // r = false & (b = true)
    // >> & 연산자의 경우 왼쪽값으로 결과를 예측할 수 있다 하더라도,
    //    결과에 상관없이 & 오른쪽 문장을 무조건 실행한다.
    // r = false & ( b변수의 값을 true로 바꾸고, b 변수의 값을 이 자리에 놓는다.)
    // r = false & true

  }
}
// &&, ||
// - 앞의 피연산자의 값으로 결과를 알 수 있다면 뒤의 명령은 실행하지 않는다.
// 
// &, |
// - 앞의 피연산자로 결과를 알 수 있을 지라도, 
//   뒤에 놓은 명령까지 모두 실행한다.