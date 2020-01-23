package com.eomcs.lms.domain;

import java.sql.Date;

// 게시물을 작성으로 만들때 유지보수를 편하게 하기 위해서 도메인을 따로 설정해준다.
// 용도에 따라 분리하기 위해서이다.
// 도메인 = 업무 영역에서 다루어지는 데이터. = VO(value object)
// = 값을 저장할 매모리 객체
public class Board {
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
    return String.format("%d,%s,%s", this.getNo(), this.getTitle(), this.getDate());
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
