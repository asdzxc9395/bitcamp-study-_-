// 오버라이딩(overriding) - 준비
package com.eomcs.oop.ex06.c;

public class Exam0110 {
    public static void main(String[] args) {
        A obj1 = new A();
        obj1.name = "홍길동";
        
        obj1.print();
        
        //A p = null;
        //p.print(); >> 래퍼런스를 주면안되용 유효한 인스턴스를 줘야해요
    }
}
