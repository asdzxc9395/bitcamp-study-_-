// 제네릭(Generic) - 문법 정리 
package com.eomcs.generic.ex01;

import java.util.ArrayList;
import java.util.HashSet;

public class Exam0211 {
    public static void main(String[] args) {

        // 만약 <타입명> 을 생략한다면 , 
        ArrayList list5; // >> ArrayList<?> list5;
        list5 = new ArrayList();
        list5 = new ArrayList<>();
        list5 = new ArrayList<Object>();
        list5 = new ArrayList<String>();
        list5 = new ArrayList<Member>();
        
        //다양한 타입의어레이리스트가다루는 타입에 상관없이 ArrayList의 래퍼런스를 선언하고 싶다면
        // List5처럼 선언하지 말고 다음과 같이 <?>을 명시하라!
        ArrayList<?> list2; 
        list2 = new ArrayList(); // 이렇게 사용하지 말고, 명확하게 제네릭의 타입을 지정하라!
        list2 = new ArrayList<>();
        list2 = new ArrayList<Object>();
        list2 = new ArrayList<String>();
        list2 = new ArrayList<Member>();
        
        //
    }
}








