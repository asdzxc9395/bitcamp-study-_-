package com.eomcs.basic.ex07.test;

//gym 회원정보를 입력받아 출력한다.
public class test12 {
  public static void main(String[] args) {

    // 회원 정보를 담을 수 있는 메모리의 설계도
    class Member {
      int no;
      String name;
      int birthYear;
      char gender;
      float height;
      float weight;
      boolean personalTraning;
    }

    // 인스턴스를 3000개 만들 것이다.
    // 래퍼런스를 3000개 준비하라.

    // 다음과 같이 일반적인 방식으로 래퍼런스를 선언하면
    // 너무 길어져서 코딩할 수 없다.
    Member m0, m1, m2, m3, m4, m5, m6, m7, m8, m9, m10, m11, m12, m13, m14;//,,,,총

    // 이런 상황에서 배열을 사용하면 쉽게 해결할 수 있다.
    // 즉 배열을 이용하면  많은 래퍼런스 변수를 손십게 만들수 있다.

    //래퍼런스 배얼의 주소도 또한 래퍼런스 변수에 담아야 한다.
    Member[] arr = new Member[3000];
    //주의!
    // >>> Member 인스턴스 주소를 담을 래퍼런스 변수를 3000개 만든다.
    // >>> Member 인스턴스 3000개를  만드는 것이 아니다.!

    //arr[0].no = 100; //실행(런타임)오류>> 아직 래퍼런스 생성명령 전이다.


    int count = 0;
    while (count < 3000) {
      new Member();
      count++;
    }
    //arr[0].no = 100; //OK!
    //0번째 회원 no값에 100을 넣는다.


    // 강사님, 인스턴스를 3000개 만드는 방법은 없나요 ?
    // >> 없다!

  }
}
