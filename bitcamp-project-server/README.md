# 32_4 - 게시물 관리와 관련하여 클라이언트 요청을 처리하기

## 학습목표

- 클라이언트의 요청을 받을 수 있따.
- 클라이언트의 요청에 대해 데이터를 보낼 수 있다.

## 실습 소스 및 결과

- src/main/java/com/eomcs/lms/ServerApp.java 변경

## 실습  

### 훈련 1: 서비스를 시작할 때 클라이언트의 연결을 기다리는 코드를 추가하라.

- ServerApp.java 변경
  - ServerSocket 준비한다.
  - 클라이언트 연결을 준비한다.
  - 클라이언트 연결을 요청한다.
- ServerAppTest.java
  - 서버 응답 기능 테스트를 추가한다.
- Board.java 변경
 - 통신테스트 할 때 게시물 필드 정보를 확인할 수 있도록 toString()를 오버라이딩 한다.

### 훈련 2: 클라이언트의 게시물 목록 요청(/board/list)을 처리하라.

- ServerApp.java 변경
  - processingRequest() 메서드 변경
- ServerAppTest.java
  - 서버 응답 기능 테스트를 추가한다.
- Board.java 변경
 - 통신테스트 할 때 게시물 필드 정보를 확인할 수 있도록 toString()를 오버라이딩 한다.
 
### 훈련 3: 클라이언트의 게시물 등록요청(/board/add)을 처리하라.

- ServerApp.java 변경
 - precessRequest() 메서드 변경

  
    



