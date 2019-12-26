package com.eomcs.basic.ex07.test02;

import java.util.Scanner;

//과제: 재귀호출을 이용하여 n! 을 계산하라.
//실행)
//입력? 5
//5! = 1 * 2 * 3 * 4 * 5 = 120
//
public class Test01 {
 public static void main(String[] args) {
   
   Scanner keyboard = new Scanner(System.in);
   
   System.out.println("입력?");
   int n = keyboard.nextInt();
   keyboard.nextLine();
   
   // n! 을 계산한다.
   int result = factorial(n);
   for (int i = 1; i < n; i++) {
     if (i < n ) {
       System.out.printf("%d" + " * ", i);
     }
   }
   
   System.out.printf("%d =  %d", n , result);
   // 결과 값
 }
 
 static int factorial(int n) {
   if(n == 1)
   return 1;
     
   return n * factorial(n - 1);
 }
}
