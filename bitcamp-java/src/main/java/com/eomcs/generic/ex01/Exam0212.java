// 제네릭(Generic) - 문법 정리 
package com.eomcs.generic.ex01;

import java.util.ArrayList;
import java.util.HashSet;

public class Exam0212 {
    public static void main(String[] args) {

        ArrayList<Object> list2; 
        // 제네릭 타입을 Object로 지정하면
        // 그렇게 지정된 ArrayList 객체만  List2에 저장할수 있다.
        
        list2 = new ArrayList(); // 이렇게 사용하지 말고, 명확하게 제네릭의 타입을 지정하라!
        list2 = new ArrayList<>();
        list2 = new ArrayList<Object>();
        //list2 = new ArrayList<String>(); 컴파일 오류 !
        //list2 = new ArrayList<Member>(); 컴파일 오류!
        
        //
    }
}








