package com.eomcs.lms.domain;

import java.io.Serializable;
import java.sql.Date;

public class Member implements Serializable {

  private static final long serialVersionUID = 20200131L;
  private int no;
  private String name;
  private String email;
  private String password;
  private String photo;
  private String number;
  private Date date;
  private Date date1;

  public String toCsvString() {
    return String.format("%d,%s,%s,%s,%s,%s", this.getNo(), this.getName(), this.getEmail(),
        this.getPassword(), this.getPhoto(), this.getNumber());
  }

  public static Member valueOf(String csv) {
    String[] data = csv.split(",");

    Member member = new Member();
    member.setNo(Integer.parseInt(data[0]));
    member.setName(data[1]);
    member.setEmail(data[2]);
    member.setPassword(data[3]);
    member.setPhoto(data[4]);
    member.setNumber(data[5]);
    return member;
  }



  public int getNo() {
    return no;
  }

  public void setNo(int no) {
    this.no = no;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getPhoto() {
    return photo;
  }

  public void setPhoto(String photo) {
    this.photo = photo;
  }

  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public Date getDate() {
    return date;
  }

  public void setDate(Date date) {
    this.date = date;
  }

  public Date getDate1() {
    return date1;
  }

  public void setDate1(Date date1) {
    this.date1 = date1;
  }

}