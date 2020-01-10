// 메서드 오버로딩(overloading) - 응용 II
package com.eomcs.oop.ex06.b;

public class Exam0310 {
    public static void main(String[] args) {
        // 다양한 파라미터 값을 받는 println()
        System.out.println(100); // ctrl + space로 일관되게 메서드를 지정할수 있다. 
        System.out.println(true);
        System.out.println("hello");
        
        // 외부에서 값을 받아 Integer 객체를 생성하는 메서드들
        Integer obj1 = Integer.valueOf(100);
        Integer obj2 = Integer.valueOf("100");
        Integer obj3 = Integer.valueOf("64", 16); // 16진수인식 >> 100
        
        System.out.printf("%d, %d, %d\n", obj1, obj2, obj3);
        
    }

}
