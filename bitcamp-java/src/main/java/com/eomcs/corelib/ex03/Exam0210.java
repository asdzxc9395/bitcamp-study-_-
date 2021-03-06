// contains() 와 equals()의 관계
package com.eomcs.corelib.ex03;

public class Exam0210 {
  public static void main(String[] args) {
    String s1 = new String("aaa");
    String s2 = new String("bbb");
    String s3 = new String("ccc");
    String s4 = new String("bbb"); // s2 != s4

    ArrayList list = new ArrayList();
    list.add(s1);
    list.add(s2);
    list.add(s3);
    print(list);

    System.out.println(s2.hashCode());
    System.out.println(s4.hashCode());
    // contains()가 값을 비교할 때는
    // 또한 equals()의 결과가 true인지 비교한다.
    // 결론!
    // String 클래스의 경우 equals()을 오버라이딩 했기 때문에
    // 서로 다른 객체(s2, s4) 라도 값이 같으면 같은 객체로 간주한다.
    System.out.println(list.contains(s4));
  }

  static void print(ArrayList list) {
    for (int i = 0; i < list.size(); i++) {
      System.out.print(list.get(i) + ", ");
    }
    System.out.println();
  }
}
