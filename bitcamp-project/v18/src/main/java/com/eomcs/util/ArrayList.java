package com.eomcs.util;

import java.util.Arrays;

public class ArrayList<E> { // 클래스 이름이라는 인스턴스를 공유할것이다.
  // 데이터 종류에 대한 타입을 받는 변수 
  // 특정 클래스를 사용한다면  그 클래스로 이름을 바꿔야 한다.
  // 저 자리가 Board, Member, Lesson이 된다.
  // 한개의 ArrayList 클래스를 놓고 여러가지를 저장하는 용도로 쓰인다.
  // 

  static final int DEFAULT_CAPACITY = 3; 

  Object[] list; 
  int size = 0;

  public ArrayList() {
    this.list = new Object[DEFAULT_CAPACITY];
  }

  public ArrayList(int capacity) {
    if (capacity < DEFAULT_CAPACITY || capacity > 10000)
      this.list = new Object[DEFAULT_CAPACITY];
    else
      this.list = new Object[capacity];
  }

  // 오브젝트 배열을 만든다.
  @SuppressWarnings({"unchecked"})
  
  public E[] toArray(E[] arr) {
    if (arr.length < this.size) {
      return (E[]) Arrays.copyOf(this.list, this.size, arr.getClass());
    }
    System.arraycopy(this.list, 0, arr, 0, this.size);
    /*
     * 위에 arraycopy()는 다음과 같다.
    for (int i = 0; i < arr.length; i++) {
      arr[i] = (E) this.list[i];
    }
     */
    // copyOf() 메서드야,
    // arrayType 에 지정된 배열을 size 만큼 만들어라
    // 그리고 list 배열에 저장된 주소를 새로만든 배열에 복사하라.
    // 마지막으로 새로 만든 배열의 주소를 리턴하라
    // 따라 어떤 종류의 배열을 넘길껀지 type를 보내야 한다.
    return arr;
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
  public E get(int idx) {
    if (idx >= 0 && idx < this.size) {
      return (E)this.list[idx];
    } else {
      return null;
    }
  }
  public int size() {
    return this.size;
  }
}

