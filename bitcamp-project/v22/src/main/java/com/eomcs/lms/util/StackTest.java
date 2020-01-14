package com.eomcs.lms.util;

public class StackTest {
  public static void main(String[] args) {

    Stack stack = new Stack();

    stack.push("AAA");
    stack.push("BBB");
    stack.push("CCC");
    stack.push("DDD");
    
    while (!stack.empty()) {
      System.out.println(stack.pop());
    }
  }
}
