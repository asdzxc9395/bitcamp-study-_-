package com.bitcamp.myproject.Memberjoin.domain;

import java.sql.Date;

public class Memberjoin {
private String id;
private String password;
private String repassword;
private String name;
private String adress;
private int number;
private Date date;

public String getId() {
  return id;
}
public void setId(String id) {
  this.id = id;
}
public String getPassword() {
  return password;
}
public void setPassword(String password) {
  this.password = password;
}
public String getRepassword() {
  return repassword;
}
public void setRepassword(String repassword) {
  this.repassword = repassword;
}
public String getName() {
  return name;
}
public void setName(String name) {
  this.name = name;
}
public String getAdress() {
  return adress;
}
public void setAdress(String adress) {
  this.adress = adress;
}
public int getNumber() {
  return number;
}
public void setNumber(int number) {
  this.number = number;
}
public Date getDate() {
  return date;
}
public void setDate(Date date) {
  this.date = date;
}
}