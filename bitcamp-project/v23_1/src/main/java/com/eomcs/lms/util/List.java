package com.eomcs.lms.util;

import org.checkerframework.checker.units.qual.A;


// generalization의 관계
// 어레이와 링크드의 공통분모를 추출하여 수퍼클래스를 정의한다.
// 이렇게 추출한 수퍼데이터로부터 상속받는다.
public class List<E> {
  protected int size;
  
  public int size() {
    return size;
  }
  
  public void add(E e) {
    //ArrayList 나 LinkedList는 동작 방법이 다르기 때문에 
    //여기서 구현할 필요가 없다.
  }
  public void add(int index, E value) {
    //ArrayList 나 LinkedList는 동작 방법이 다르기 때문에 
    //여기서 구현할 필요가 없다.
  }
  public E get(int index) {
    //ArrayList 나 LinkedList는 동작 방법이 다르기 때문에 
    //여기서 구현할 필요가 없다.
    return null;
  }
  public E set(int index, E obj) {
   return null; 
  }
  public E remove(int index) {
    return null;
  }
  public E[] toArray(E[] arr) {
    return null;
  }
  public Object[] toArray() {
    return null;
  }
}
