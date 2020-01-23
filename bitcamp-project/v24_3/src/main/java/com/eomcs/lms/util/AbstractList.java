package com.eomcs.lms.util;

//
public abstract class AbstractList<E> implements List<E>{
  
  protected int size;

  public int size() {
    return size;
  }
  
  public Iterator<E> iterator() {

    //this. = 인스턴스 주소;
    //List 객체에서 값을 꺼내주는 일을 할 Iterator 구현체를 준비하여 리턴한다.
    return this.new ListIterator<E>(); // 위에 AbstractList에서 넘어오는 제네릭 E이다.
  }
  // non - static nested class = inner class
   class ListIterator<T> implements Iterator<T> {
    
    List<T> list;
    int cursor;
    
    @SuppressWarnings("unchecked")
    public ListIterator() {  // 바깥 클래스를 지정하낟.
      this.list = (List<T>) AbstractList.this;
    }
    
    @Override
    public boolean hasNext() {
      return cursor < list.size(); // while문을 사용하여 반복을 돌린다.
      // 커서값부터 사이즈 값까지
    }
    
    @Override
    public T next() {
      return list.get(cursor++); // 다음으로 이동.
    }
}
}


