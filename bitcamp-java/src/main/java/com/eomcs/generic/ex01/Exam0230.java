// 제네릭(Generic) - 제네릭 객체의 메서드 
package com.eomcs.generic.ex01;

import java.util.ArrayList;
import java.util.HashSet;

public class Exam0230 {
    public static void main(String[] args) {

        ArrayList<Object> list2; 
        list2 = new ArrayList<Object>();
        
        // ArrayList가 Object 타입의 데이터를 다루기로 지정되었으면
        // ArrayList의 메서드 파라미터나 리턴 타입이 Object로 선언된다.
        
        // add(Object) >> 파라미터 값이 오브젝트라 모든형식을 다 넣을수 있다.
        list2.add(new Object());
        list2.add(new String());
        list2.add(new Integer(100));
        list2.add(new Member("gg", 2));
        
        // Object get(int)
        Object obj = list2.get(0); 
        String str =  (String) list2.get(1); // 형변환
        Integer i = (Integer) list2.get(2);  // 형변환
        Member m = (Member) list2.get(3);    // 형변환
        // 
        
        
        
    }
}








