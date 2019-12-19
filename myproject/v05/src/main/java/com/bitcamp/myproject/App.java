package com.bitcamp.myproject;

import java.sql.Date;
import java.util.Scanner;

public class App {
  public static void main(String[] args) {
    
    Scanner keyboard = new Scanner(System.in);
    
    
    
    System.out.print("아이디:");
    String id = keyboard.nextLine();
    
    System.out.print("비밀번호:");
    String password = keyboard.nextLine();
    
    System.out.print("비밀번호확인:");
    String repassword = keyboard.nextLine();

    System.out.print("이름:");
    String name = keyboard.nextLine();
    
    System.out.print("주소:");
    String adress = keyboard.nextLine();
    
    System.out.print("핸드폰번호:");
    int phonenumber = keyboard.nextInt();
    
    Date today = new Date(System.currentTimeMillis());
    
    keyboard.nextLine();
    
    System.out.print("이용약관동의:");
    String checkregister = keyboard.nextLine();
    
    keyboard.close();
    System.out.println();
   
    System.out.printf("아이디: %s\n" , id);
    System.out.printf("비밀번호: %s\n" , password);
    System.out.printf("비밀번호확인: %s\n" , repassword);
    System.out.printf("이름: %s\n" , name);
    System.out.printf("주소: %s\n" , adress);
    System.out.printf("휴대폰번호: %d\n" , phonenumber);
    System.out.printf("이용약관동의: %s\n" , checkregister);
    System.out.printf("가입일: %s\n" , today);
    
    
  }        
}
