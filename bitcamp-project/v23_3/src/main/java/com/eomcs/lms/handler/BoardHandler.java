// 게시글 번호로 찾는 객체를 찾는 코드를관리하게 쉽게 별도의 메서드로 분리한다.
// >> indexOfBoard() 추가
package com.eomcs.lms.handler;

import java.sql.Date;
import java.util.Scanner;
import com.eomcs.lms.domain.Board;
import com.eomcs.lms.util.AbstractList;
import com.eomcs.lms.util.Prompt;

public class BoardHandler {

  // 목록을 다루는 객체를 지정할 때,
  // >>  특정 클래스(AbstraceList, LinkedList, ArrayList)를 지정하는 대신에
  // >>  사용 규칙(예: List)을 따르는 객체를 지정 함으로써.
  // 더 다양한 타입의 객체로 교체할 수 있게 만든다.
  // >> List 사용 규칙을 구현한 객체라면 어떤 클래스의 객체든지 사용할 수 있다.
  // 결국 유지보수를 더 유연하게 하기 위함이다.
  AbstractList<Board> boardList;
  
  public Scanner input; 
  Prompt prompt;

  public BoardHandler(Prompt prompt,AbstractList<Board> list) {
    // list 파라미터는 List 인터페이스를 구현한 객체를 받는다.
    this.prompt = prompt;
    boardList = list;
    // 이렇게 Handler가 사용할 List 객체(의존 객체)를 생성자에서 직접 만들지 않고
    // 이렇게 생성자가 호출될 때 파라미터로 받으면,
    // 필요에 따라 List 객체를 다른 객체로 대체하기가 쉽다.
    // 예를 들어 ArrayList를 사용하다가 LinkedList로 바꾸기 쉽다.
    // LinkedList를 사용하다가 다른 객체로 바꾸기가 쉽다.
    // 즉 다형적 변수에 따라서 변수 법칙에 따라 
    // List의 하위 객체라면 어떤 객체든지 가능하다.
    // 이렇게 의존객체를 외부에서 주입받는 것을
    // Dependency Injection(의존성 주입) 이라 부른다.
    // 즉 의존 객체를 부품처럼 교체하기 쉽도록 만드는 방식이다.
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
