package com.eomcs.oop.ex03.test;

import java.sql.Date;

public class Car {

   boolean on;
   //대상체의 속성(attribute), 필드를 저장한다.
   int speed;
   String name;
   String maker;
   Engine engine; // 이 자체 값은 존재하지 않아서 만들어야한다.생성자필요.
   int distance;
   
   Car() { // 유효한 값을로 적절하게 설정하는게   '생성자'이다.
     this.engine = new Engine(4, 16, 1990);
   }// 엔진 객체 설정
   //객체가 제대로 쓰일수 있도록 각각의 값을 유효한 값으로 초기화시킨다.
   
   void start() {
     this.on = true;
   }
   void stop() {
     this.on = false;
   }
   
   void check() {
     if(this.engine.oilState == 0) {
       this.engine.cleanOil();
       System.out.println("자동차의 엔진 오일을 교환했습니다.");
     }
     System.out.println("자동차를 정비했습니다.");
   }
     
   //void cleanOin() {
     //this.engine.oilState = 10; >>외부부로부터 값을 조회하는건 가능하지만
     // 값을 바꿔서는 안된다.>>cleanoil을 car에정의해서는 안된다.
   }

