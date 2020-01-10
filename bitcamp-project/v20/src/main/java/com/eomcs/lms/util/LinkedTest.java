package com.eomcs.lms.util;

public class LinkedTest {
  public static void main(String[] args) {
    LinkedList<String> list = new LinkedList<>();
    
    list.add("aaa");
    list.add("bbb");
    list.add("ccc");
    list.add("ddd");
    list.add("eee");
    list.add("fff");
    list.add("ggg");
    list.add("hhh");

    
    
    print(list);
    //System.out.println(list.get(-1));
    //System.out.println(list.get(8)); // 유효범위 벗어나면 0으로 나온다.
  }
  static void print(LinkedList<String> list) {
   // String[] arr = list.toArray(new String[0]);
    
    String[] arr = new String[list.size];
    list.toArray(arr);
    
    for (String value : arr) {
      System.out.println(value);
    }
  }
}
