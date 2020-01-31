# eomcs-java-project-31_2

애플리케이션을 시작하거나 종료할 떄 작업할 옵저버를 추가한다.

  ## 학습목표


- 옵저버 디자인 패턴에 따라 옵저버를 정의할 수 있다.

  ## 실습 소스 및 결과

- src/main/java/com/eomcs/lms/DataLoaderListener.java 추가
- src/main/java/com/eomcs/lms/App.java 변경
  

### 훈련 1: 애플리케이션을 시작하거나 종료할 때 데이터를 로딩하고 저장할 옵저버를 만든다.

  -DataLoaderListener.java 추가 (DataLoaderListener.java.01)
    ApplicationContextListener 를 구현한다.
    - 테스트할 용도로 간단하게 구현한다.
    
### 훈련 2: DataLoaderListener 옵저버를 앱 객체에 등록하고 저장할 옵저버를 만들라.

- App.java 변경 (App.java.01)
    - DataLoaderListener 객체를 생성한 후 App 객체에 등록한다.
    - 실행하여 옵저버가 동작하는지 확인한다.
    
    
### 훈련 3: DataLoaderListener 옵저버에서 데이터를 로딩하고 저장하게 하라.

-DataLoaderListener 변경
  - App 클래스에 있는 List객체를 이 클래스로 옮긴다.
  - App 클래스에 있는 데이터 로딩, 저장 관련 메서드를 이 클래스로 옮긴다.
  
-App.java. 변경
  - List 객체를 필드에서 제거한다.
  - 데이터를 로딩, 저장 관련 메서드를 제거한다.
  - 데이터 로딩 호출 코드를 제거한다.
  - 데이터 저장 호출 코드를 제거한다.

 ### 훈련 4: App 클래스가 옵저버의 결과물을 사용할 수 있게 하라.
 
 ApplicationContextListener.java(변경)
  - contextIntialized() 에 Map 파라미터를 추가한다.
  - contextDestoryed()에 Map 파라미터를 추가한다.
 
 ### 훈련 5: DataLoaderListener의 작업결과를 Map 객체를 통해 공유하라.
 
 - DataLoaderListene.java 변경
 - 데이터 로딩 객체를 Map 객체에 보관한다.
 
 ### 훈련 6: DataLoaderListener 에서 준비한 List 객체를 Command 에게 전달하라
 
 App.java(변경)
 - 

#### 실행 결과

`App`의 실행해도 이전에 저장한 데이터가 출력되지 않는다.
```
데이터를 읽어옵니다.
명령> /board/list

명령> /board/add
번호? 100
내용? test..
저장하였습니다.

명령> /board/list
100, test..              , 2018-11-09, 0

명령> quit
안녕!
데이터를 저장합니다.
```

종료한 후에 다시 실행해도 이전에 추가한 데이터가 출력되지 않는다.
```
데이터를 읽어옵니다.
명령> /board/list

```


