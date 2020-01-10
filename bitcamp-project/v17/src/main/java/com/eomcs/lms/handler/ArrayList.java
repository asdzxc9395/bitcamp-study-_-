package com.eomcs.lms.handler;

import java.util.Arrays;
import com.eomcs.lms.domain.Board;

public class ArrayList {
  // 객체를 사람이나 물건으로 봐라봤을때
  // BoardList라는 클래스를 만들어 일을 시키기 위해
  // 새로히 만들었다.
  static final int DEFAULT_CAPACITY = 3; 

  Object[] list; //변수만 만들었다.보드를 포함한 하위분류 객체를 저장할수 있다.
  int size = 0;

  public ArrayList() {
    this.list = new Object[DEFAULT_CAPACITY];
  }// 생성자란 데이터가 제대로 사용가능하도록 값설정하는것이다.

  public ArrayList(int capacity) {
    if (capacity < DEFAULT_CAPACITY || capacity > 10000)
      this.list = new Object[DEFAULT_CAPACITY];
    else
      this.list = new Object[capacity];
  }

  public Object[] toArray() {// 객체 주소만 뽑아 리턴한다.
    return Arrays.copyOf(this.list, this.size);
  }

  public void add(Object obj) {
    if(this.size == this.list.length) {
      // 현재 배열 게시글 객체가 꽉 찼으면, 배열을 늘린다.
      int oldCapacity = this.list.length;
      int newCapacity = oldCapacity + (oldCapacity >> 1);// 기존배열에서 그데이터에 배열갯수를 추가한 
                                                        //새 데이터가 나오므로 기존데이터는 가비지가된다.
    
      this.list = Arrays.copyOf(this.list, newCapacity);
      System.out.printf("새 배열을 %d 개 생성하였음!", newCapacity);
    }
    this.list[this.size++] = obj;
  }

  public Object get(int idx) {
    if (idx >= 0 && idx < this.size) {
      return this.list[idx];
    } else {
      return null;
    }
  }
}

