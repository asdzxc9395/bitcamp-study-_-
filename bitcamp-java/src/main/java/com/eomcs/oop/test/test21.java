package com.eomcs.basic.ex07.test;

//gym 회원정보를 입력받아 출력한다.
public class test21 {
    // 회원 정보를 담을 수 있는 메모리의 설계도
    static class Member {
      int no;
      String name;
      int birthYear;
      char gender;
      float height;
      float weight;
      boolean personalTraning;
    }
  public static void main(String[] args) {
    //1)인스턴스 주소 받기
    Member m1;
    m1 = createMember();
    
    //2) 인스턴스 주소 넘기기(저장)
    setMemberValues(m1);
    
    printMember(m1);
  }

  static Member createMember() {
    Member m = new Member();
    return m;//리턴을 할라면 리턴할 주소를 정확하게 적어야 한다.
  }

  static void setMemberValues(Member m) {
    m.no = 100;
    m.name = "홍길동";
    m.birthYear = 2000;
    

  }

  static void printMember(Member m) {
    System.out.println(m.no);
    System.out.println(m.name);
    System.out.println(m.birthYear);

  }

}
