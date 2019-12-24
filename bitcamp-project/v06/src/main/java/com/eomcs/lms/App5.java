package com.eomcs.lms;


import java.util.Scanner;


public class App5 {

  public static void main(String[] args) {
    Scanner key = new Scanner(System.in);

    int RangeSum = 0;

    System.out.println("입력?");
    int no1 = key.nextInt();
    int no2 = key.nextInt();
    key.nextLine();

    key.close();

    System.out.println();
    for (int i = no1; i < (no2 + 1); i++) {
      RangeSum = RangeSum+i;
    }
    System.out.printf("%d에서 %d 까지의 합은  %d입니다.", no1, no2,
        RangeSum
        );
    // 결과 피드백을 바탕으로 코드 수정
    // => 초기 입력값이 수정되는 대로저장

  }
}






