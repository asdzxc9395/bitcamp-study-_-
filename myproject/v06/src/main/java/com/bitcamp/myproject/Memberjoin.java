package com.bitcamp.myproject;

import java.util.Scanner;

public class Memberjoin {
  
  static Scanner keyboard = new Scanner(System.in);
  
  
  public static void main(String[] args) {
    MemberjoinHandler.keyboard = keyboard;
    
    String command;
    
    do{
      System.out.print("\n명령>> ");
      command = keyboard.nextLine();
     
      switch(command) {
        case"/add":

          MemberjoinHandler.addMemberjoin();
          
          break;

        case "/list": 
          
          MemberjoinHandler.listMemberjoin(); 
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
