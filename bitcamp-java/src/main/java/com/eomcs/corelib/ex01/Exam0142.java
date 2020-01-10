// String - 다형적 변수와 형변환, toString()
package com.eomcs.corelib.ex01;

public class Exam0142 {
    public static void main(String[] args) {
        
        Object obj = new String("Hello"); // 인스턴스 주소가 100이라 가정하자;
        
        // obj를 통해 원래 인스턴스를 호출하고 싶다면
        // 다음과 같이 형변환하라.
        String str = ((String)obj).toLowerCase();
        System.out.println(str);

        // 또는 다음과 같이 원래 타입의 래퍼런스에 저장한 다음 사용하라!
        String x1 = (String) obj; // x1 = 100
        str =x1.toLowerCase();
        System.out.println(str);
        
    }
}





