package com.eomcs.basic.ex06.assignment;

import java.util.Scanner;

public class test1_01 {    
  public static void main(String[] args){


    int width = Console.inputInt();
    int line = 0;
    while (line++ < width) {
      Graphic.drawLine(line);
      System.out.println();
    }

  }
  

}




