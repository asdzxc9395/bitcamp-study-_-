// 논리 연산자 : || vs |
package com.eomcs.basic.ex05;

public class Exam03_4 {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        boolean r = a || (b = true);
        System.out.printf("a=%b, b=%b, r=%b\n", a, b, r);
        // 계산순서 
        // r = a || (b = true)
        // r = true == (b = true)
        // >> || 왼쪽값으로 이미 결과를 알 수 있기 떄문에
        //    || 오른쪽 문장은 실행하지 않는다.
        // r = true

        a = true;
        b = false;
        r = a | (b = true);
        // 계산순서
        System.out.printf("a=%b, b=%b, r=%b\n", a, b, r);
    }
}
