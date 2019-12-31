package com.eomcs.lms.domain;

import java.sql.Date;
// 게시물을 작성으로 만들때 유지보수를 편하게 하기 위해서 도메인을 따로 설정해준다.
// 용도에 따라 분리하기 위해서이다.
// 도메인 = 업무 영역에서 다루어지는 데이터. = VO(value object)
//     = 값을 저장할 매모리 객체
  public class Board {
    public int no;
    public String title;
    public Date date;
    public int viewCount;
    public String writer;
  }
