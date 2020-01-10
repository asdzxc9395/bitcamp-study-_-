package com.eomcs.lms.util;

import java.awt.Cursor;

public class LinkedList2 {
  
  Node first;
  Node last;
  int size;
  
  public void add(Object value) {
    Node newNode = new Node();
    newNode.value = value;
    
    if (first == null) {// 위에 first는 무조건 0으로 시작하기 때문에 
                        // 처음에 만드는 뉴 노드는 무조건 처음값이자 마지막 값이 된다.
      last = first = newNode;
    }
    else {
      last.next = newNode; // 위에 처음이자 마지막이 노드였던 뉴 노드의 링크가 새로만든 노드의 값으로 바뀐다.
      last = newNode;
    }
    this.size++;
  }
  
  public Object get (int index) {
    if (index  < 0 || index >= this.size) {
      return null;
    }
    Node cursor = first;
    for (int i = 0; i < index; i++) {
      cursor = cursor.next;
    }
    return cursor.next;
  }
  
  public Object add (int index, Object value) {
    if (index  < 0 || index >= this.size) {
      return null;
    }
    Node newNode = new Node();
    newNode.value = value;
    
    Node cursor = first;
    for (int i = 0; i < index; i++) {
      cursor = cursor.next;
    }
    
    newNode.next = cursor;
    cursor.next = newNode;
    return newNode;
  }
public Object remove(int index) {
  if (index < 0 || index >= this.size) {
    return null;
  }
  Node cursor = first;
  for (int i = 0; i < index - 1; i++) {
    cursor = cursor.next;
  }
  Node deleteNode = null;
  if ( index == 0) {
    deleteNode = first;
    first.next = deleteNode.next;
  } else {
    deleteNode = cursor.next;
    cursor.next = deleteNode.next;
  }
  return deleteNode.value;
}
  public Object set ( int index, Object value) {
    if (index < 0 || index >= this.size) {
      return null;
    }
    Node cursor = first;
    for (int i = 0; i < index ; i++) {
      cursor = cursor.next;
    }
    Node oldValue = (Node) cursor.value;
    cursor.value = value;
    return oldValue.value;
  }
  
  static class Node {
    Object value;// 입력된 값 = data field = value
    Node next; // 값의 주소 = link field = next
  }
}
