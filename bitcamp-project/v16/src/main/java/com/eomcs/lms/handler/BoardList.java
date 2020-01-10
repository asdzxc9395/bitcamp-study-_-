package com.eomcs.lms.handler;

import java.util.Arrays;
import com.eomcs.lms.domain.Board;

public class BoardList {
  // 객체를 사람이나 물건으로 봐라봤을때
  // BoardList라는 클래스를 만들어 일을 시키기 위해
  // 새로히 만들었다.
  static final int DEFAULT_CAPACITY = 3; 

  Board[] list; //변수만 만들었다.
  int size = 0;

  public BoardList() {
    this.list = new Board[DEFAULT_CAPACITY];
  }// 생성자란 데이터가 제대로 사용가능하도록 값설정하는것이다.

  public BoardList(int capacity) {
    if (capacity < DEFAULT_CAPACITY || capacity > 10000)
      this.list = new Board[DEFAULT_CAPACITY];
    else
      this.list = new Board[capacity];
  }

  public Board[] toArray() {// 객체 주소만 뽑아 리턴한다.
    /*
     * Board[] arr = new Board[this.size];
     
    for (int i = 0; i < this.size; i++) {
      arr[i] = this.list[i];
    }
    */
    /* Board[] arr = Arrays.copyOf(this.list, this.size);
    return arr;*/
    return Arrays.copyOf(this.list, this.size);
  }

  public void add(Board board) {
    if(this.size == this.list.length) {
      // 현재 배열 게시글 객체가 꽉 찼으면, 배열을 늘린다.
      int oldCapacity = this.list.length;
      int newCapacity = oldCapacity + (oldCapacity >> 1);// 기존배열에서 그데이터에 배열갯수를 추가한 
                                                        //새 데이터가 나오므로 기존데이터는 가비지가된다.
     /* Board[] arr = new Board[newCapacity];
      for(int i = 0; i < this.list.length; i++) {
        arr[i] = this.list[i];
      }
      this.list = arr;
      */
      this.list = Arrays.copyOf(this.list, newCapacity);
      System.out.printf("새 배열을 %d 개 생성하였음!", newCapacity);
    }
    this.list[this.size++] = board;
  }

  public Board get(int no) {
    for (int i = 0; i < this.size; i++) {
      if (this.list[i].getNo() == no) {
        return this.list[i];
      }
    }
    return null;
  }
}

