// 게시글 번호로 찾는 객체를 찾는 코드를관리하게 쉽게 별도의 메서드로 분리한다.
// >> indexOfBoard() 추가
package com.eomcs.lms.handler;

import java.sql.Date;
import java.util.Scanner;
import com.eomcs.lms.domain.Board;
import com.eomcs.lms.util.ArrayList;
import com.eomcs.lms.util.LinkedList;
import com.eomcs.lms.util.Prompt;

public class BoardHandler {

  LinkedList<Board> boardList;
// 제네릭 무었을 사용할지 지정하는 문법
  public Scanner input; 
  Prompt prompt;

  public BoardHandler(Prompt prompt) {
    this.prompt = prompt;
    boardList = new LinkedList<>();// 생략가능
  }



  public void addBoard() {
    Board board = new Board();

    board.setNo(prompt.inputInt("번호? "));
    board.setTitle(prompt.inputString("내용? "));

    board.setDate(new Date(System.currentTimeMillis()));
    board.setViewCount(0);

    boardList.add(board);

    System.out.println("저장하였습니다.");
  }

  public void listBoard() {
    Board[] arr = new Board[this.boardList.size()];
    
    this.boardList.toArray(arr);
    
    for (Board b : arr) {
      System.out.printf("%d, %s, %s, %d\n", 
          b.getNo(), b.getTitle(), b.getDate(), b.getViewCount());
    }
  }

  public void detailBoard() {
    int index = indexOfBoard(prompt.inputInt("번호? "));
    // 게시글 번호로 객체를 찾느다.
  
    if (index == -1) {
      System.out.println("해당 번호의 게시글이 없습니다..");
      return;
    }
    Board board = this.boardList.get(index);
    System.out.printf("번호: %d\n", board.getNo());
    System.out.printf("제목: %s\n", board.getTitle());
    System.out.printf("등록일: %s\n", board.getDate());
    System.out.printf("조회수: %d\n", board.getViewCount());
  }
  
  public void updateBoard() {
    int index = indexOfBoard(prompt.inputInt("번호? "));

    if (index == -1) {
      System.out.println("해당 번호의 게시글이 없습니다.");
      return;
    }
    Board newBoard = new Board();
    Board oldBoard = this.boardList.get(index);
    
    newBoard.setNo(oldBoard.getNo());
    newBoard.setTitle
    (prompt.inputString(String.format
        ("내용(%s)?" , oldBoard.getTitle()), oldBoard.getTitle()));
    newBoard.setNo(oldBoard.getNo());
    newBoard.setViewCount(oldBoard.getViewCount());
    newBoard.setDate(new Date(System.currentTimeMillis()));
    
    if (oldBoard.equals(newBoard)) {
      System.out.println("게시글 변경을 취소하였습니다.");
    }
    this.boardList.set(index, newBoard);
    System.out.println("게시글을 변경했습니다.");
    
  }
  
  public void deleteBoard() {
    System.out.println("번호? ");
    int no = input.nextInt();
    input.nextLine();//숫자뒤에 남은 공백 제거
    
    int index = indexOfBoard(no);

    if (index == -1) {
      System.out.println("게시글 인덱스가 유효하지 않습니다.");
      return;
    }

   this.boardList.remove(index);
   
   System.out.println("게시글을 삭제했습니다.");
  }
  
  private int indexOfBoard(int no) {
    for (int i = 0; i < this.boardList.size(); i++) {
      Board temp = this.boardList.get(i);
      if (temp.getNo() == no) {
        return i;
      }
    }
    return -1;
  }
  
}
