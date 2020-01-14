package com.eomcs.lms.util;

import java.util.Arrays;

public class Stack<E> implements Cloneable{
  // implements Cloneable 복제 가능  표시를 나타냈다.
  // clone 메서드가 오버라이딩하였다.


  private static final int DEFUALT_CAPACITY = 10;;

  Object[] elememtData;
  int size;

  public Stack() {
    this.elememtData = new Object[DEFUALT_CAPACITY];
    this.size = 0;
  }

  public void push(E value) {
    if (this.size == this.elememtData.length) {
      // 배열 크기를 늘린다.
      grow(); // 리펙토링
    }
    this.elememtData[size++] = value; // 값을 넣을때마다
    // 사이즈 , 래퍼런스 변수 개수 증가 
  }

  private void grow() {
    this.elememtData = Arrays.copyOf(elememtData, newCapacity());
  }
  private int newCapacity() {
    int oldCapacity = elememtData.length;
    return oldCapacity + (oldCapacity >> 1);
  }

  @SuppressWarnings("unchecked")
  public E pop() {
    if (this.empty()) 
      return null;
    E value = (E)this.elememtData[--this.size];
    this.elememtData[this.size] = null; 
    //가비치 처리를 원활하게 하기 위해서이다.
    return value;
  }

  public boolean empty() {
    return this.size == 0;
  }
  // Object Clone()의 'shallow copy' 이용햐여 스택 객체 복사하
  // >> 객체의 인스턴스 변수를 그대로 복사한다.
  // >> 인스턴스 변수가 가리키는 객체는 복사하지 않는다.
  // 문제점?
  // >> 따라서 인스턴스 변수인 elementData가 가리키는 배열은 복제하지 않는다.
  // >> 그래서 배열의 값을 바꾸면 원본 스택에도 영향을 끼친다.
  /*
  @Override
  public Stack clone()  {
    try {
      return (Stack)super.clone();

    } catch (CloneNotSupportedException ex) {
      // Object의 clone메서드는
      // 복제가 허용된 객체에 대해서만 해당 인스턴스 변수를 복제한다.
      // 복제가 허용되지 않은 객체에 대해서 clone()을 호출하면
      // CloneNodSupportedException 실행 오류가 발생한다.
      // 해결책?
      // >> 즉 해당 객체를 복체할수 있다고 표시하라.
      // >> 방법 : Cloneable 인터페이스를 지정한다.
      // ex) class my implements Clonable
      //     clone()을 재정의 할 경우 반드시 cloneable 인터페이스를 지정해야한다.
      System.out.println(ex.toString());
      return null; // 시도하고 안되면 catch를 이용하라
    }
  }
   */
  
  // 'deep copy'을 이용하여 객체 복제하기
  // >> 데이터가 들어있는 배열도 그대로 복제한다.
  // >> 따라서 배열의 값을 바꾸더라도 원본 객체에 영향을 끼치지 않느다.
  // 
  @SuppressWarnings("unchecked")
  @Override
  public Stack<E> clone()  {
    try {
    // 1) 'shallow copy'를 통해 이 객체의 인스턴스 변수는 그대로 복제한다.
    Stack<E> temp = (Stack<E>) super.clone();
    
    // 2) elementData 배열을 복제한다.
    // >> 배열만 복제하고  그 배열에 저장된 객체(ex: 문자열, Member)까지는 복제하지 않는다.
    // >> 어디까지 복제(deep copy의 수준)할 것인지는 상황에 따라 결정한다.
    //
    Object[] arr = new Object[this.size];
    for (int i = 0; i < this.size; i++) {
      arr[i] = this.elememtData[i];
    }
    
    // 3) 복제한 스택 객체가 새로 만든 배열을 가르키도록 한다. 
    temp.elememtData = arr;
    
    return temp;
    }
    catch (CloneNotSupportedException ex) {
    System.out.println(ex.toString());
    return null;
    }
  }
}
