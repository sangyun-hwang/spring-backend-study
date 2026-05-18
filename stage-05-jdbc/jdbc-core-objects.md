# JDBC Core Objects

## 1. Connection

내가 이해한 것: DB에 연결된 객체로 DB와 연결된 통로라고 볼수 있다.


## 2. PreparedStatement

내가 이해한 것: Connection의 prepareStatement(sql) 메서드로 만들어지는 객체이며, SQL을 담고 실행 준비를 한다.


## 3. ResultSet

내가 이해한 것: SQL문 실행 결과를 담는 객체


## 4. ? placeholder

내가 이해한 것: SQL문에서 나중에 값을 넣을 자리를 표시한다. PreparedStatement의 setString, setInt 같은 메서드로 ? 자리에 값을 넣는다.


## 5. 전체 흐름

1. Connection으로 DB에 연결한다.
2. SQL 문자열을 준비한다.
3. PreparedStatement에 SQL을 담는다.
4. ? 자리에 값을 넣고 SQL을 실행한다.
5. ResultSet에서 row를 읽어 Java 객체로 바꾼다.


## 6. 헷갈리는 점

-