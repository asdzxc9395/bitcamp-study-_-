package com.eomcs.lms;

import java.util.Scanner;

public class App2 {
  
    public static void main(String[] args) {
      
      Scanner keyboard = new Scanner(System.in);
          
         
          
          System.out.print("번호:");
          int no2 = keyboard.nextInt();
          
          keyboard.nextLine(); //줄바꿈 기호 제거용
          
          System.out.print("이름:");
          String name2 = keyboard.nextLine();
          
          System.out.print("이메일:");
          String email2 = keyboard.nextLine();
          
          System.out.print("암호:");
          String password2 = keyboard.nextLine();
          
          System.out.print("사진:");
          String picture2 = keyboard.nextLine();
          
          System.out.print("전화:");
          String callnumber2 = keyboard.nextLine();
          
          System.out.print("가입일:");
          String regsiteredDate = keyboard.nextLine();
          
          keyboard.close();
          
          System.out.println();
           
          
         
          
          System.out.printf("번호: %d\n", no2);
          System.out.printf("이름: %s\n" , name2);
          System.out.printf("이메일: %s\n" , email2);
          System.out.printf("암호: %s\n" , password2 );
          System.out.printf("사진: %s\n" , picture2 );
          System.out.printf("전화: %s\n" , callnumber2 );
          System.out.printf("가입일: %s\n" , regsiteredDate );
          
          
        
    }
}
