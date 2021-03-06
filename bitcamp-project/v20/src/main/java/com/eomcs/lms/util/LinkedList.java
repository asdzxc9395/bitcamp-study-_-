package com.eomcs.lms.util;

import java.lang.reflect.Array;
import java.util.Arrays;

public class LinkedList<E> {

  Node<E> first;
  Node<E> last;
  int size;

  public void add(E value) {
    Node<E> newNode = new Node<E>();
    newNode.value = value;

    if (first == null) {
      last = first = newNode;
    } else {
      last.next = newNode;
      last = newNode;
    }
    this.size++;
  }


  public E get(int index) {
    if (index < 0 || index >= this.size) 
      return null;

    Node<E> cursor = first;
    for (int i = 0; i < index; i++) {
      cursor = cursor.next;
    }

    return cursor.value;
  }

  public void add(int index, E value) {
    if (index < 0 || index >= this.size) 
      return ;

    Node<E> newNode = new Node<>();
    newNode.value = value;

    Node<E> cursor = first;
    for (int i = 0; i < index -1 ; i++) {
      cursor = cursor.next; // 삽입 위치 전 노트를 찾는다.
    } //지정된 위치에 삽입하여야 하므로 index-1

    if (index == 0) {
      newNode.next = first;
      first = newNode;
    } else {
      newNode.next = cursor.next; // 기존노들은 새 노들이된다.
      cursor.next = newNode; // 
    }
    this.size++;
  }

  public E remove(int index) {
    if (index < 0 || index >= this.size) 
      return null;// 리턴값이 없기때문에null;

    Node<E> cursor = first;
    for (int i = 0; i < index -1 ; i++) {
      cursor = cursor.next; 
    }

    Node<E> deleteNode = null;
    if (index == 0) {
      deleteNode = first;
      first = deleteNode.next;
    } else {
      deleteNode = cursor.next; // 기존노들은 새 노들이된다.
      cursor.next = deleteNode; // 
    }

    deleteNode.next = null; // 가비지 청소
    this.size--;

    return deleteNode.value;
  }

  @SuppressWarnings("unchecked")
  public E set(int index, Object value) {
    if (index < 0 || index >= this.size) 
      return null;

    Node<E> cursor = first;
    for (int i = 0; i < index; i++) {
      cursor = cursor.next;
    }

    E oldValue = cursor.value;
    cursor.value = (E) value;

    return cursor.value;
  }

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

    if (arr.length < this.size) {
      arr = (E[]) Array.newInstance(arr.getClass().getComponentType(), size);
    }
    Node<E> cursor = first;
    for (int i = 0; i < size; i++) {
      arr[i] = cursor.value;
      cursor = cursor.next;
    }
    
    return arr;
  }
  
  public int size() {
    return this.size;
  }

  static class Node<T> {
    T value; // 어떤 값이라도 저장할수 있는 오브잭트 변수 만들고
    Node<T> next;  // 노드 클래스의 변수 만든다.
  }
}
