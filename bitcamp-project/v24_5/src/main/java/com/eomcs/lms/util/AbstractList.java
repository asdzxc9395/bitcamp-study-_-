package com.eomcs.lms.util;

//
public abstract class AbstractList<E> implements List<E>{

  protected int size;

  public int size() {
    return size;
  }

  @Override
  public Iterator<E> iterator() {
    //this = 인스턴스 주소;
    // anonymous class : 인스턴스를 한 개만 생성할 거면 익명 클래스로 정의하라.
    //로컬 클래스는 인스턴스 멤버가 아니기 때문에 
    // 앞쪽에 인스턴스 주소를 전달해서는 안된다.
    // 즉 this.를 붙여서는 안된다.
    return  new Iterator<E> (){

      List<E> list;
      int cursor;

      // 익명 클래스는 생성자를 만들수 없기 때문에 
      // 인스턴스 필드를 초기화 시키기 위해서는
      // 다음과 같이 인스턴스 블록을 사용해야 한다.
      // 물론 단순히 값을 할당하는 경우에는 인스턴스 블록에 넣지 않고
      // 필드 선언에 바로 할당 연산자를 사용할 수 있다.
      { 
        // 로컬 클래스는 인스턴스 멤버가 아니기 떄문에
        this.list = (List<E>) AbstractList.this;
      }

      @Override
      public boolean hasNext() {
        return cursor < list.size(); // while문을 사용하여 반복을 돌린다.
        // 커서값부터 사이즈 값까지
      }

      @Override
      public E next() {
        return list.get(cursor++); // 다음으로 이동.
      }
    }; // 위에 AbstractList에서 넘어오는 제네릭 E이다.
  }

}


/* 다음은 로컬클래스에 대한 의미 전달을 위해서 간략하게 작성한 코드(pseudo;의사코드 = 가짜코드)이다.
 *  class 클래스 {
   필드
   블록
   생성자
   메서드 {
     this 사용
     로컬 변수
     로컬(중첩) 클래스{
     바깥클래스.this 사용!
     로컬 변수 접근 가능
     }
   }
   중첩 클래스{
   바깥클래스.this 사용
   }
 }
 */
