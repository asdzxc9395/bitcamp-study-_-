package com.eomcs.lms.util;

public class QueueTest {
  public static void main(String[] args) {
    
    Queue q = new Queue();
    
    q.offer("aaa");
    q.offer("bbb");
    q.offer("ccc");
    
    while (q.size() > 0) {
      System.out.println(q.poll());
    } // >>poll할때마다 값이 줄어들므로 반복문을 사용하면 안된다.
  }
}
