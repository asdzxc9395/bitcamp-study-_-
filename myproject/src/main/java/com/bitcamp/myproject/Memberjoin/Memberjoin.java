package com.bitcamp.myproject.Memberjoin;

import java.util.Scanner;
import com.bitcamp.myproject.Memberjoin.handler.MemberJoinHandler;

public class Memberjoin {
  
  static Scanner keyboard = new Scanner(System.in);
  
  
  
  public static void main(String[] args) {
        
    MemberJoinHandler 회원가입 = new MemberJoinHandler(keyboard);
    
    String command;
    
    do{
      System.out.print("\n명령>> ");
      command = keyboard.nextLine();
     
      switch(command) {
        case"/add":

          회원가입.addMemberjoin();
          
          break;

        case "/list": 
          
         회원가입.listMemberjoin(); 
          break;

        default:
          if (!command.equalsIgnoreCase("quit")) {
            System.out.println("실행할수 없는 명령입니다.");
          }
      }

    }while (!command.equalsIgnoreCase("quit"));

    System.out.println("ㅂㅂ");

    keyboard.close();
  }

  
}
