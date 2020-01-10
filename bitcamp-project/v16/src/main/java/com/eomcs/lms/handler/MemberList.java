package com.eomcs.lms.handler;

import com.eomcs.lms.domain.Member;

public class MemberList {

  static final int Member_Size = 100;

  Member[] members;
  int Membercount = 0;

  public MemberList() {
    this.members = new Member[Member_Size];
  }

  public void add(Member member) {
    this.members[this.Membercount++] = member;    
  }

  public Member[] toArray() {
    Member[] arr = new Member[this.Membercount];
    for (int i = 0; i < this.Membercount; i++ ) {
      arr[i] = this.members[i];
    }
    return arr;
  }

  public Member get(int no) {
    for(int i = no; i < this.Membercount; i++) {
      if(this.members[i].getNo() == no) {
        return this.members[i];
      }
    }
    return null;
  }
}
