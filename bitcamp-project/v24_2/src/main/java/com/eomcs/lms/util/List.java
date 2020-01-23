package com.eomcs.lms.util;

// 목롤 객체의 사용규칙을 따로 정의
// >> 문법
//  inter face 규칙명 { ... }

public interface List<E> {



  void add(E e);
  void add(int index, E value);
  E get(int index);
  E set(int index, E obj);
  E remove(int index);
  Object[] toArray();
  E[] toArray(E[] arr);

  int size();
  
  //내부에 보관된 값을 꺼내주는 메서드를 추가한다.
  // >> 값을 저장하는 방식에 다라 구현 방법이 다르기 떄문에
  //    서브 클래스가 구현해야만 하는 추상메서드이다.
  Iterator<E> iterator();
}
