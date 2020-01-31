package com.eomcs.lms.domain;

import java.io.Serializable;
import java.sql.Date;

// 객체를 serialize 하려면 이 기능을 활성화 시켜야 한다.
// - javja.io.serializable 을 구현하라!
// - serialize 데이터를 구분하기 위해 버전 번호를 명시하라
public class Board implements Serializable {

  private static final long serialVersionUID = 20200131L;
  private int no;
  private String title;
  private Date date;
  private int viewCount;

  public int getNo() {
    return no;
  }

  public void setNo(int no) {
    this.no = no;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Date getDate() {
    return date;
  }

  public void setDate(Date date) {
    this.date = date;
  }

  public int getViewCount() {
    return viewCount;
  }

  public void setViewCount(int viewCount) {
    this.viewCount = viewCount;
  }

  public String toCsvString() {
    return String.format("%d,%s,%s\n", this.getNo(), this.getTitle(), this.getDate());
  }

  public static Board valueOf(String csv) {
    String[] data = csv.split(",");

    Board board = new Board();
    board.setNo(Integer.parseInt(data[0]));
    board.setTitle(data[1]);
    board.setDate(new Date(System.currentTimeMillis()));

    return board;

  }

}
