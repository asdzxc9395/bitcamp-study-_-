# eomcs-java-project-28_3

파일 포맷으로 JSON 도입하기

## 학슥 목표

- 외부 라이브러리를 가져와서 프로젝트에 적용할 수 있다.
- JSON 포맷의 사용 이점을 이해한다.
- Google JSON 라이브러리를 사용할 수 있다.


##JSON 데이터 포멧 특징

- 문자열로 데이터를 표현한다.
  '{프로퍼티:값}' 방식으로 객체의 값을 저장한다.
- 바이너리 방식에 비해 데이터가 커지는 문제가 있지만
- 문자열이기 때문에 모든 프로그래밍 언어에서 다룰 수 있다.
- 그래서 이기종 플랫폼(OS, 프로그래밍 언어 등) 간에 데이터를 교환할 때 많이 사용한다.
  
## 실습 소스 및 결과
- build.gradle 변경
 src/main/java/com/eomcs/lms/App.java 변경 

### 훈련 1: Gradle 스크립트 파일(Build gradle)에 googleJSON 라이브러리를 추가하라.

- mvnrepository.com 에서 라이브러리 검색한다.
  -json.org 가서 자바 라이브러리 확인
  -gson키워드 검색
-build.gradle을 편집한다.
  -의존 라이브러리 블록에 (denpendencies {}) 에 gson 정보를 추가한다. 
  -이클립스 설정파일을 갱신한다.
  - 'gradle eclipse'를 실행
  - 이클립스에서 해당 프로젝트를 'refresh'한다.
  -Referenced Libraries 노드에서 gson라이브러리 파일이 추가 된 것을 확인
  
  ## 훈련 2: 게시물 데이터를 저장할 때 JSON 형식으로 저장하라.
  
- APP.JAVA
  - saveBoardData()를 변경한다.
  - loadBoardData()를 변경한다.
  
    ## 훈련 3: 게시물 데이터를 저장할 때 JSON 형식으로 저장하라.
  
- APP.JAVA
  - saveBoardData()를 변경한다.
  - loadBoardData()를 변경한다.
  