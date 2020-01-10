package com.eomcs.lms.util;

import java.util.Arrays;

public class ArrayList100<E> {

  private static final int DEFAULT_DATA = 100;
  Object[] list;
  int size = 0;

  public ArrayList100() {
    list = new Object[DEFAULT_DATA];
  }

  public ArrayList100(int initialcapacity) {
    if (initialcapacity < DEFAULT_DATA) {
      this.list = new Object[DEFAULT_DATA];
    } else {
      this.list = new Object[initialcapacity];
    }
    list = new Object[initialcapacity];
  }
  public void add (E e) {
    if (this.size == this.list.length) {
      int oldSize = this.list.length;
      int newSize = oldSize + (oldSize >> 1);
      this.list = Arrays.copyOf(this.list, newSize);
    }
    this.list[this.size++] = e;
  }

  public E get(int index) {
    if (index < 0 || index > this.size) {
      return null;
    }
    return (E) this.list[index];
  }

  public E set(int index, E e) {
    if (index < 0 || index > this.size) {
      return null;
    }
    E oldValue = (E) this.list[index];
    this.list[index] = e;
    return (E) oldValue;
  }

  public E remove(int index) {
    if (index < 0 || index > this.size) {
      return null;
    }
    System.arraycopy(this.list, index +1,
          this.list, index, this.size -(index + 1));
    E oldValue = (E) this.list[index];
    size--;
    return (E) oldValue;
  }
  
  public Object[] toArray() {
    return Arrays.copyOf(this.list, this.size);
  }
  
  @SuppressWarnings("unchecked")
  public E[] toArray(E[] arr) {
    if (arr.length < this.size) {
   
    return (E[]) Arrays.copyOf(this.list,
        this.size, arr.getClass());
  }
    System.arraycopy(this.list, 0, arr, 0, this.size);
    return arr;
  }
  public int size() {
    return this.size;
  }


}
