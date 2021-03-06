package com.eomcs.lms.util;


public class Queue<E> extends LinkedList<E> implements Cloneable{
  // 상속을 먼저 한 후에 설정을 하여야 한다.
  public void offer(E value) {
    this.add(value);
  }
  
  @SuppressWarnings("unchecked")
  public E poll() {
    return this.remove(0); // 값을 꺼내면서 삭제하기 때문에
    // remove를 사용한다 값을 조회하면서 "삭제"하는것이다.
    // 값을 리턴하는 동시에 삭제된다.
    // null 리턴
  }
  /*
  @Override
  public Object clone() {
   try {
     // 단순히 객체의 인스턴스 변수를 복제하는 'shallow copy' 수행
     // Object의 clone()은 'shallow copy'를 수행한다.
     // >> Queue에서 poll()을 수행하면 first 노드를 삭제하게 되고,
     //    이때 원본 객체의 노드의 링크정보를 변경하게 된다.
     // >> 따라서 다음에 다시 복제를 수행하면
     //    원본 노드의 링크 정보가 제거되었기 때문에 제대로 작업을 수행할수 없다.
     // 
     // 해결책?
     // 뭐긴뭐야 원본 객체가 사용하는 노드도 함께 복제해야 한다.
     // 즉 'deep copy'를 수행해야 한다.
     return (Queue) super.clone();
   } catch (CloneNotSupportedException ex) {
     System.out.println(ex);
     return null;
   }
  }
   */
  
  @Override
  public Queue<E> clone() {
    // 'deep copy' 수행
    // >> 스택의 경우, 배열을 복사하면 되기 때문에 간단하다.
    // 기존의 Shallow copy를 수행한 후 배열을 따로 복사하였다.
    // >> LinkedList의 경우 노드와 노드사이를 연결해야 하기 떄문에
    //    단순히 'shallow copy'를 수행해서는 안된다.
    // >> 그냥 다음과 같이 새 Queue를 만들고,
    //    기존 Queue에 저장된 값을 꺼내서 새 Queue 에 저장해야 한다.
    Queue<E> temp = new Queue<E>();
    
    for (int i = 0; i < this.size(); i++) {
      temp.offer( this.get(i));
    }// 배열 개수만큼 반복문을 실행후 리턴
    return temp;
  }
  
}
