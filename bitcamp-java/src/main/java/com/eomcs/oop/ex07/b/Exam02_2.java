// 캡슐화(encapsulation) - 응용
package com.eomcs.oop.ex07.b;

import java.util.Calendar;
import com.eomcs.oop.ex07.b.sub.C;

public class Exam02_2 extends C {
    
    public static void main(String[] args) {
        //Car c1 = new Car(); // 컴파일 오류!
        // 생성자가 private이기 때문에 다른 클래스에서 호출할 수 없다.
        // 따라서 인스턴스를 생성할 수 없다.
        // 
        // 그럼 왜 생성자를 private으로 만들었는가?
        // => 개발자가 직접 인스턴스를 생성하면 너무 복잡하니,
        //    다른 메서드를 통해 인스턴스를 생성하라는 의미다!
        // >> 인스턴스 생성과정이 복잡할때 인스턴스를 생성해주는 메서드를 만든다.
        Car c2 = Car.create("소나타");
        System.out.printf("%s,%s,%d,%d\n", 
                c2.model, c2.maker, c2.cc, c2.valve);
        
        Calendar obj = Calendar.getInstance();
        // 메서드를 통해서 만든다. 그래서 직접생성하는것을 막고
        // 스태틱 메서드를 통해 만든다.
    }
}







