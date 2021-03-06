package com.eomcs.lms.util;

//Stack 객체에서 Iterator 규칙에 따라 값을 꺼내주는 클래스를 정의
public class StackIterator<E> implements Iterator<E> {
  
  Stack<E> stack;
  //int cursor; 커서 안쓴다.
  
  public StackIterator(Stack<E> stack) {
    this.stack = stack.clone();
  }
  
  @Override
  public boolean hasNext() {
    return !stack.empty();
  }
  
  @Override
  public E next() {
    return stack.pop();
  }
}