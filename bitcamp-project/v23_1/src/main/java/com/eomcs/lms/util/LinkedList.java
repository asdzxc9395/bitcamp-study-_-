package com.eomcs.lms.util;

import java.lang.reflect.Array;

public class LinkedList<E> extends List<E>{
  // 타입 파라미터라 한다. 타입을 받는 변수라 부른다.
  // Linked사용시 <String>으로 바꿀시 모두 String로 인식사용한다.
  
  Node<E> first;
  
  Node<E> last;
  
  @Override
  public void add(E value) {
    Node<E> newNode = new Node<>();
    newNode.value = value;
    
    if (first == null) {
      last = first = newNode;
    } else {
      last.next = newNode;
      last = newNode;
    }
    
    this.size++;
  }
  
  @Override 
  public E get(int index) {
    if (index < 0 || index >= size)
      return null;
    
    Node<E> cursor = first;
    for (int i = 0; i < index; i++) {
      cursor = cursor.next;
    }
    
    return cursor.value;
  }
  
  @Override
  public void add(int index, E value) {
    if (index < 0 || index >= size)
      return;
    
    Node<E> newNode = new Node<>();
    newNode.value = value;
    
    Node<E> cursor = first;
    for (int i = 0; i < index - 1; i++) {
      cursor = cursor.next;
    }
    
    if (index == 0) {
      newNode.next = first;
      first = newNode;
    } else {
      newNode.next = cursor.next;
      cursor.next = newNode;
    }
    
    this.size++;
  }
  
  @Override
  public E remove(int index) {
    if (index < 0 || index >= size)
      return null;
    
    Node<E> cursor = first;
    for (int i = 0; i < index - 1; i++) {
      cursor = cursor.next;
    }
    
    Node<E> deletedNode = null;
    if (index == 0) {
      deletedNode = first;
      first = deletedNode.next;
    } else {
      deletedNode = cursor.next; // index 값이 1일때 deleteNode값은  first.next값이 된다.
      cursor.next = deletedNode.next; // 200.next값은 cursor.next값이 된다. cursor = 200;주소
    }

    deletedNode.next = null;
    size--;
    
    return deletedNode.value;
  }
  
  @Override
  public E set(int index, E value) {
    if (index < 0 || index >= size)
      return null;
    
    Node<E> cursor = first;
    for (int i = 0; i < index; i++) {
      cursor = cursor.next;
    }
    
    E oldValue = cursor.value;
    cursor.value = value;
    
    return oldValue;
  }
  @Override
  public Object[] toArray() {
    Object[] arr = new Object[size];
    
    Node<E> cursor = first;
    for (int i = 0; i < size; i++) {
      arr[i] = cursor.value;
      cursor = cursor.next;
    }
    
    return arr;
  }
  
  @SuppressWarnings("unchecked")
  public E[] toArray(E[] arr) {
    
    if (arr.length < size) {
      arr = (E[]) Array.newInstance(arr.getClass().getComponentType(), size);
    }
    
    Node<E> cursor = first;
    for (int i = 0; i < size; i++) {
      arr[i] = cursor.value;
      cursor = cursor.next;
    }
    
    return arr;
  }

  
  static class Node<T> {
    T value;
    Node<T> next;
  }
}