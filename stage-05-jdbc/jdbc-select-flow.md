# JDBC SELECT Flow

```java
String sql = "SELECT id, title, category, minutes, memo FROM study_logs";

try (
        Connection connection = dataSource.getConnection();
        PreparedStatement statement = connection.prepareStatement(sql);
        ResultSet resultSet = statement.executeQuery()
) {
    while (resultSet.next()) {
        Long id = resultSet.getLong("id");
        String title = resultSet.getString("title");
        String category = resultSet.getString("category");
        int minutes = resultSet.getInt("minutes");
        String memo = resultSet.getString("memo");

        System.out.println(id + " / " + title + " / " + category + " / " + minutes + " / " + memo);
    }
}
```

## 1. sql 변수

내가 이해한 것: 실행 할 SQL 문장을 담은 변수


## 2. dataSource.getConnection()

내가 이해한 것: DB와 연결을 실행


## 3. connection.prepareStatement(sql)

내가 이해한 것: SQL문을 담은 `PreparedStatement`객체를 생성


## 4. statement.executeQuery()

내가 이해한 것: SELECT SQL을 실행하고, 결과를 담은 ResultSet을 반환하는 메서드


## 5. resultSet.next()

내가 이해한 것: 객체 안에 다음 row가 있는지 확인하고, 있으면 다음 row로 이동


## 6. resultSet.getLong("id")

내가 이해한 것: 현재 row의 id 컬럼 값을 Long 타입으로 꺼냄


## 7. try-with-resources

내가 이해한 것: Connection, PreparedStatement, ResultSet을 사용 후 자동으로 DB 연결을 닫아줌


## 8. 전체 흐름 요약

1. SQL 문자열을 준비한다.
2. DataSource에서 Connection을 얻어 DB에 연결한다.
3. Connection으로 PreparedStatement를 만든다.
4. PreparedStatement가 SELECT SQL을 실행하고 ResultSet을 반환한다.
5. ResultSet을 while문으로 한 row씩 읽고 Java 값으로 꺼낸다.


## 9. 헷갈리는 점

-