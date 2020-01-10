package com.eomcs.lms.util;

public class ArrayListTest {
  public static void main(String[] args) {

    ArrayList2<String> a1 = new ArrayList2<>(); // 기본 선언 갯수만큼 만들어진다.
    ArrayList2<String> a2 = new ArrayList2<>(); // 기본 선언 갯수만큼 만들어진다.
    ArrayList2<String> a3 = new ArrayList2<>(); // 기본 선언 갯수만큼 만들어진다.
    ArrayList2<String> a4 = new ArrayList2<>(100); // 100개만큼의 오브젝트 배열이 만드렁진다.

    a1.add("100");
    a1.add("200");
    a2.add("aaa");
    a2.add("bbb");
    //a2.add(new Member()); // 컴파일오류!

    String value = (String) a1.get(0);// 0번쨰 인스턴스를 꺼낸다.
    //Integer value1 = (Integer) a1.get(1);
    // 오브젝체 객체하 라더라도 인트값을 스트링이나 다른 형식으로 바꾸진 못한다.
    // 오브젝트는 오브젝트 객체만 리턴한다.
    System.out.println(value);

    System.out.println(a2.get(0));
    //get이란 메서드는 하나지만 넘기는 값에 따라서 사용하는 객체가 다르다


    String oldvalue = a1.get(0);
    a1.set(0, "xxx");
    // >> 합치면 String oldvalue = (String)a1.set(0, "xxx");
    System.out.printf("%s >> %s\n", oldvalue, a1.get(0));
    System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");

    a3.add("100");
    a3.add("200");
    a3.add("300");
    a3.add("400");
    a3.add("500");
    a3.add("600");
    a4.add("aaa");
    a4.add("bbb");

    System.out.println(a3.get(0));
    System.out.println(a4.get(-1)); // 범위 밖의 값 호출

    a3.set(0, "xxx"); // 주소, 변경할 값

    System.out.println(a3.get(2));
    a3.remove(0); // 0번쨰 주소 삭제

    // String oldvalue = (String)a1.remove(0, "xxx");
    // System.out.println("%s에서 %s로 변경", oldvalue, a1.get(1));


    System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
    System.out.println(a3.get(2));

    //print(a1);
  }
  /* 1.
   * static void print(ArrayList2 arr) {
    for (int i = 0; i < arr.size(); i++) {
      System.out.println(arr.get(i));
    }
  }
 
  2.static void print (ArrayList2 arr) {
    Object[] list = arr.toArray();
    for (Object e : list) {
      System.out.println(e);
    }
  }
  */
  
  static void print (ArrayList100<String> arr) {
    String[] list = arr.toArray(new String[] {});
    for (String e : list) {
      System.out.println(e);
    }
  }
}
