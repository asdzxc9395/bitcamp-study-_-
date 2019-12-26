package com.eomcs.basic.ex07.assignment;

public class Test01 {
  public static void main(String[] args) throws Exception{
    // 배열의 값중에서 최대 값을 출력하라
    int[] values = {34, 4, -3, 78, 12, 22, 45, 0, -22};
    // 배열의 들어 있는 값을 오름차순으로 정렬하라.

    sort(values);

    System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
  
    printValues(values);

    //출력결과 :
    //-22, -3, 0, 4, 12, 22, 34, 45, 78
  }

  static void sort(int[] values)  throws Exception{
    // 다음 반복문을 돌면 가장 큰 수가 맨 오른쪽에 놓인다.
    //이 반복문을 여러번 반복하면 된다.
    for (int j = (values.length - 1); j > 0; j--) {
      
      int temp = 0;
      
      for (int i = 0; i < j; i++) {
        Thread.currentThread().sleep(1000);
        printValues(values, i);
        //교체전
        if(values[i] > values[i + 1]) {
          temp = values[i];
          values[i] = values[i + 1];
          values[i + 1] = temp;
          //교체후
          Thread.currentThread().sleep(1000);
          printValues(values, i);
        }
      }
    }
  }

  static void printValues(int[] values) {
    for (int i = 0; i < values.length; i++) {
      System.out.printf("%3d", values[i]);
    }
    System.out.println();
  }

  static void printValues(int[] values, int currPos) {
    for (int i = 0; i < values.length; i++) {
      if (i == currPos) {
        System.out.printf("%3d<< ", values[i]);
      } else {
        System.out.printf("%3d   ", values[i]);
      }
    }
    System.out.println();
  }
  
  
}