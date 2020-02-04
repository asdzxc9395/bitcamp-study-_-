package com.eomcs.lms.handler;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import com.eomcs.lms.domain.Member;
import com.eomcs.util.Prompt;

public class MemberUpdateCommand implements Command {

  ObjectOutputStream out;
  ObjectInputStream in;

  Prompt prompt;

  public MemberUpdateCommand(ObjectOutputStream out, ObjectInputStream in, Prompt prompt) {
    this.out = out;
    this.in = in;
    this.prompt = prompt;
  }

  @Override
  public void execute() {
    int no = prompt.inputInt("번호? ");

    out.writeUTF("/member/detail");
    out.writeInt(no);
    out.flush();

    String response = in.readUTF();
    if (response.equals("FAIL")) {
      System.out.println(in.readUTF());
      return;
    }

    Member oldMember = (Member) in.readObject();
    Member newMember = new Member();

    newMember.setNo(oldMember.getNo());
    newMember.setRegisteredDate(oldMember.getRegisteredDate());

    newMember.setName(
        prompt.inputString(String.format("이름(%s)? ", oldMember.getName()), oldMember.getName()));

    newMember.setEmail(
        prompt.inputString(String.format("이메일(%s)? ", oldMember.getEmail()), oldMember.getEmail()));

    newMember.setPassword(prompt.inputString(String.format("암호(%s)? ", oldMember.getPassword()),
        oldMember.getPassword()));

    newMember.setPhoto(
        prompt.inputString(String.format("사진(%s)? ", oldMember.getPhoto()), oldMember.getPhoto()));

    newMember.setTel(
        prompt.inputString(String.format("전화(%s)? ", oldMember.getTel()), oldMember.getTel()));

    if (oldMember.equals(newMember)) {
      System.out.println("회원 변경을 취소하였습니다.");
      return;
    }

    out.writeUTF("/member/update");
    out.writeObject(newMember);
    out.flush();
    response = in.readUTF();
    if (response.equals("FAIL")) {
      System.out.println(in.readUTF());
      return;
    }

  private int indexOfMember(int no) {
    for (int i = 0; i < this.memberList.size(); i++) {
      if (this.memberList.get(i).getNo() == no) {
        return i;
      }
    }
    return -1;
  }
}
