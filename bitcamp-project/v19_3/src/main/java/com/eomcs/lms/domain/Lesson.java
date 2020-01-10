package com.eomcs.lms.domain;

import java.sql.Date;

public class Lesson {
  private int no1;
  private String title;
  private String contents;
  private Date start;
  private Date end;
  private int total;
  private int day;
  private Date date1;

  @Override
  public boolean equals(Object obj) {
    if (obj.getClass() != Lesson.class)
      return false;

    Lesson other = (Lesson) obj;

    if (this.no1 != other.no1)
      return false;

    if (!this.title.equals(other.title))
      return false;

    if (this.start.compareTo(other.start) != 0)
      return false;

    if (this.end.compareTo(other.end) != 0)
      return false;

    if (this.total != other.total)
      return false;

    if (this.day != other.day)
      return false;

    return true;
  }

  public int getNo1() {
    return no1;
  }
  public void setNo1(int no1) {
    this.no1 = no1;
  }
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }
  public String getContents() {
    return contents;
  }
  public void setContents(String contents) {
    this.contents = contents;
  }
  public Date getStart() {
    return start;
  }
  public void setStart(Date start) {
    this.start = start;
  }
  public Date getEnd() {
    return end;
  }
  public void setEnd(Date end) {
    this.end = end;
  }
  public int getTotal() {
    return total;
  }
  public void setTotal(int total) {
    this.total = total;
  }
  public int getDay() {
    return day;
  }
  public void setDay(int day) {
    this.day = day;
  }
  public Date getDate1() {
    return date1;
  }
  public void setDate1(Date date1) {
    this.date1 = date1;
  }
}
