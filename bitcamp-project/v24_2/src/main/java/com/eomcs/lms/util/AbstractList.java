package com.eomcs.lms.util;

//
public abstract class AbstractList<E> implements List<E>{
  
  protected int size;

  public int size() {
    return size;
  }
  
  public Iterator<E> iterator() {
    // List 객체에서 값을 꺼내주는 일을 할 Iterator 구현체를 준비하여 리턴한다.
    return new ListIterator<E>(this);
  }
  
  static class ListIterator<E> implements Iterator<E> {
    
    List<E> list;
    int cursor;
    
    public ListIterator(List<E> list) {
      this.list = list;
    }
    
    @Override
    public boolean hasNext() {
      return cursor < list.size(); // while문을 사용하여 반복을 돌린다.
      // 커서값부터 사이즈 값까지
    }
    
    @Override
    public E next() {
      return list.get(cursor++); // 다음으로 이동.
    }
}
}


