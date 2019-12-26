package com.eomcs.oop.ex01.assignment;

import java.util.Scanner;


public class Test01 {
  public static void main(String[] args) {

    Scanner keyboard = new Scanner(System.in);

    class Score {
      String name;
      int kor;
      int eng;
      int math;
      int sum;
      int ave;
    }

    Score[] scores = new Score[3];

    for (int i = 0; i < scores.length; i++) {
      System.out.print("입력:");
      Score s = new Score();

      s.name = keyboard.next();
      s.kor = keyboard.nextInt();
      s.eng = keyboard.nextInt();
      s.math = keyboard.nextInt();
      s.sum = s.kor + s.eng + s.math;
      s.ave = s.sum/3;

      scores[i] = s;
    }
    
    keyboard.close();
    System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
    
    for (int i = 0; i < scores.length; i++) {
      Score s = scores[i];
      System.out.printf("%s %d %d %d %d %.1f\n", s.name, s.kor, s.eng,
          s.math, s.sum, s.ave);//.1f\n은 퍼센테이지 1자리까지 나타내는것이다.
    }
  }
}
