package com.bitcamp.myproject.Memberjoin.util;

import java.util.Arrays;

public class MemberJoinList<E> {

  static final int DEFAULT_CAPACITY = 100;
  
  Object[] list;
  int size = 0;

  public MemberJoinList() {
    this.list = new Object[DEFAULT_CAPACITY];
  }
  
  public MemberJoinList(int capacity) {
    if (capacity < DEFAULT_CAPACITY || capacity > 10000)
      this.list = new Object[DEFAULT_CAPACITY];
    else
      this.list = new Object[capacity];
  }

  public void add(E obj) {
    if(this.size == this.list.length) {
      int oldCapacity = this.list.length;
      int newCapacity = oldCapacity + (oldCapacity >> 1);// 기존배열에서 그데이터에 배열갯수를 추가한 
      //새 데이터가 나오므로 기존데이터는 가비지가된다.

      this.list = Arrays.copyOf(this.list, newCapacity);
      System.out.printf("새 배열을 %d 개 생성하였음!", newCapacity);
    }
    this.list[this.size++] = obj;
  }

  @SuppressWarnings("unchecked")
  public E[] toArray(E[] arr) {
    if (arr.length < this.size) {
      return (E[]) Arrays.copyOf(this.list, this.size, arr.getClass());
    }
    System.arraycopy(this.list, 0, arr, 0, this.size);
    return arr;
  }

  public int size() {
    return this.size;
  }
}