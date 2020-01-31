package com.eomcs.lms.domain;

import java.io.Serializable;
import java.sql.Date;

public class Lesson implements Serializable {

  private static final long serialVersionUID = 20200131L;
  private int no1;
  private String title;
  private String contents;
  private Date start;
  private Date end;
  private int total;
  private int day;
  private Date date1;

  public String toCsvString() {
    return String.format("%d,%s,%s,%s,%s,%d,%d,%s", this.getNo1(), this.getTitle(),
        this.getContents(), this.getStart(), this.getEnd(), this.getTotal(), this.getDay(),
        this.getDate1());
  }

  public static Lesson valueOf(String csv) {
    String[] data = csv.split(",");

    Lesson lesson = new Lesson();
    lesson.setNo1(Integer.parseInt(data[0]));
    lesson.setTitle(data[1]);
    lesson.setContents(data[2]);
    lesson.setStart(Date.valueOf(data[3]));
    lesson.setEnd(Date.valueOf(data[4]));
    lesson.setTotal(Integer.parseInt(data[5]));
    lesson.setDay(Integer.parseInt(data[6]));
    lesson.setDate1(new Date(System.currentTimeMillis()));

    return lesson;
  }


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
