package com.bitcamp.myproject;

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
    
    System.out.print("일반전화:");
    String number = keyboard.nextLine();
    
    System.out.print("휴대전화:");
    String phonenumber = keyboard.nextLine();
    
    System.out.print("이메일:");
    String email = keyboard.nextLine();
    
   
   
    System.out.printf("아이디: %s\n" , id);
    System.out.printf("비밀번호: %s\n" , password);
    System.out.printf("비밀번호확인: %s\n" , repassword);
    System.out.printf("이름: %s\n" , name);
    System.out.printf("일반전화: %s\n" , number);
    System.out.printf("휴대전화: %s\n" , phonenumber);
    System.out.printf("이메일: %s\n" , email);
    
  }
    
    
}
