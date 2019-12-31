package com.eomcs.lms.handler;

import java.util.Arrays;
import com.eomcs.lms.domain.Lesson;

public class LessonList {
  
  Lesson[] list;
  int size = 0;
  static final int Lesson_Size = 100;

  public LessonList() {
    this.list = new Lesson[Lesson_Size];
  }

  public void add(Lesson lesson) {
    if(this.size == this.list.length) {
      // 현재 배열 게시글 객체가 꽉 찼으면, 배열을 늘린다.
      int oldCapacity = this.list.length;
      int newCapacity = oldCapacity + (oldCapacity >> 1);
     /* Board[] arr = new Board[newCapacity];
      for(int i = 0; i < this.list.length; i++) {
        arr[i] = this.list[i];
      }
      this.list = arr;
      */
      this.list = Arrays.copyOf(this.list, newCapacity);
      System.out.printf("새 배열을 %d 개 생성하였음!", newCapacity);
    }
    this.list[this.size++] = lesson;
  }

  public Lesson[] toArray() {
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

  public Lesson get(int no) {
    for (int i = 0; i < this.size; i++) {
      if (this.list[i].getNo1() == no) {
        return this.list[i];
      }
    }
    return null;
  }
}
