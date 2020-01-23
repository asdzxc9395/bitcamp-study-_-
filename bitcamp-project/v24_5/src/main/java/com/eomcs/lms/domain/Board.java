package com.eomcs.lms.domain;

import java.sql.Date;
// 게시물을 작성으로 만들때 유지보수를 편하게 하기 위해서 도메인을 따로 설정해준다.
// 용도에 따라 분리하기 위해서이다.
// 도메인 = 업무 영역에서 다루어지는 데이터. = VO(value object)
//     = 값을 저장할 매모리 객체
public class Board {
  
  private int no;
  private String title;
  private Date date;
  private int viewCount;
  private String writer;
  

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + no;
    result = prime * result + ((title == null) ? 0 : title.hashCode());
    result = prime * result + viewCount;
    result = prime * result + ((writer == null) ? 0 : writer.hashCode());
    return result;
  }
  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Board other = (Board) obj;
    if (no != other.no)
      return false;
    if (title == null) {
      if (other.title != null)
        return false;
    } else if (!title.equals(other.title))
      return false;
    if (viewCount != other.viewCount)
      return false;
    if (writer == null) {
      if (other.writer != null)
        return false;
    } else if (!writer.equals(other.writer))
      return false;
    return true;
  }
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
  public String getWriter() {
    return writer;
  }
  public void setWriter(String writer) {
    this.writer = writer;
  }
  
  
}
