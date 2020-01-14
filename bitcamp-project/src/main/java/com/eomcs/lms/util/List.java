package com.eomcs.lms.util;

// 목롤 객체의 사용규칙을 따로 정의
// >> 문법
//  inter face 규칙명 { ... }

public interface List<E> {
  // 사용 규칙(호출할 메서드 시그니처) 이기 때문에 모든 메서드는 추상 메서드이다.
  // 또한 규칙은 공개되어야 하기 때문에 모든 메서드는 public이다.
  // 문법
  // public abstract 리턴타입 메서드명 (파라미터,...)
  // >> public 생략 가능하다.
  // (public) abstract 리턴타입 메서드명 (파라미터, ..)
  // abstract를 생략 가능하다.
  // (public) (abstract) 리턴타입 메서드명 (파라미터,...)
  

  public  abstract void add(E e);
  //서브 클래스에서 정의할 메서드라면 수퍼클래스에서 정의하지 않는다.
  // 대신 서브 클래스가 반드시 구현하도록 강제한다.
  public /*abstract*/ void add(int index, E value);
  /*public*/ abstract E get(int index);
  /*public abstract*/ E set(int index, E obj);
  E remove(int index);
  Object[] toArray();
  E[] toArray(E[] arr);

  int size();
}
