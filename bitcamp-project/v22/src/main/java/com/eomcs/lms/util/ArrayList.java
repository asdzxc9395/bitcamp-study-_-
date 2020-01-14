package com.eomcs.lms.util;

import java.util.Arrays;

public class ArrayList<E> { // 클래스 이름이라는 인스턴스를 공유할것이다.
  // 데이터 종류에 대한 타입을 받는 변수 
  // 특정 클래스를 사용한다면  그 클래스로 이름을 바꿔야 한다.
  // 저 자리가 Board, Member, Lesson이 된다.
  // 한개의 ArrayList 클래스를 놓고 여러가지를 저장하는 용도로 쓰인다.
  // 

  static final int DEFAULT_CAPACITY = 3; 

  Object[] list; 
  int size = 0;

  public ArrayList() {
    this.list = new Object[DEFAULT_CAPACITY];
  }

  public ArrayList(int capacity) {
    if (capacity < DEFAULT_CAPACITY || capacity > 10000)
      this.list = new Object[DEFAULT_CAPACITY];
    else
      this.list = new Object[capacity];
  }

  // 오브젝트 배열을 만든다.
  @SuppressWarnings({"unchecked"})
  
  public E[] toArray(E[] arr) {
    if (arr.length < this.size) {
      return (E[]) Arrays.copyOf(this.list, this.size, arr.getClass());
    }
    System.arraycopy(this.list, 0, arr, 0, this.size);
    /*
     * 위에 arraycopy()는 다음과 같다.
    for (int i = 0; i < arr.length; i++) {
      arr[i] = (E) this.list[i];
    }
     */
    // copyOf() 메서드야,
    // arrayType 에 지정된 배열을 size 만큼 만들어라
    // 그리고 list 배열에 저장된 주소를 새로만든 배열에 복사하라.
    // 마지막으로 새로 만든 배열의 주소를 리턴하라
    // 따라 어떤 종류의 배열을 넘길껀지 type를 보내야 한다.
    return arr;
  }

  public void add(E obj) {
    if(this.size == this.list.length) {
      int oldCapacity = this.list.length;
      int newCapacity = oldCapacity + (oldCapacity >> 1);// 기존배열에서 그데이터에 배열갯수를 추가한 
      //새 데이터가 나오므로 기존데이터는 가비지가된다.

      this.list = Arrays.copyOf(this.list, newCapacity);
      System.out.printf("새 배열을 %d 개 생성하였음!", newCapacity);
    }
    this.list[this.size++] = obj;
  }

  @SuppressWarnings("unchecked")
  public E get(int idx) {
    if (idx >= 0 && idx < this.size) { // 게시물 범위가 유효하면
      return (E) this.list[idx]; // 유효한 범위 게시물 번호를 넘긴다.
    } else { // 그 외 이상한 번호면
      return null; // null로 넘긴다.
    }
  }
  @SuppressWarnings("unchecked")
  public E set(int index, E obj) { // newBoard를 선언한거를 가져온다.
    if (index < 0 || index >= this.size)//범위를 넘어가면
      return null; //null로 리턴한다 그러면 오류 선언!
      
    
    E old = (E) this.list[index]; // 번호를 받은거는 새로운 래퍼런스 old로 선언
      this.list[index] = obj; //  선언하면 인덱스 번호는 newBoard로 바뀐다.
      return old; // 그리고 새로운 래퍼런스 old = index(주소) = obj(newboard)로 리턴
  }
  
  @SuppressWarnings("unchecked")
  public E remove(int index) {
    if (index < 0 || index >= this.size)
      return null;
    
    // 삭제할 항목을 따로 보관해 둔다.
    E old =(E) this.list[index];
    
    for (int i = index + 1; i < this.size; i++) {
      this.list[i - 1] = this.list[i];
    }
    // 예를들어 2로 실행한다 하면 index = 2; (배열은 5개)
    // for (int i = 2 + 1; 3 < this size; i++)
    // 사이즈의 유효값은 3,4이므로  3에서 4로 넘어가는 반복을 1번만 실행한다.
    // 그러면 3번 배열은 2가 된다. // 4번배열은 3이된다.

    this.size--;
    // 실행이 끝나면 배열의 전체갯수가 1개가 줄어든다.
    // 나머지는 가비지로 떨어진다.
    
    this.list[this.size] = null;
    //삭제한 항목을 리턴한다.
    return old;
  }
  
  public int size() {
    return this.size;
  }
  

}

