# JDBC Overview

## 1. JDBC가 필요한 이유

내 생각: Java가 SQL을 직접 실행하기 위해


## 2. 지금까지의 흐름과 JDBC 이후의 흐름

기존 메모리 Repository:
```java
private final List<StudyLog> logs = new ArrayList<>();

public List<StudyLog> findAll() {
    return logs;
}
```

SQL 직접 실행:
```sql
SELECT *
FROM study_logs;
```

JDBC Repository:
```java
public List<StudyLog> findAll() {
    // DB에 연결
    // SELECT * FROM study_logs 실행
    // 결과 row들을 StudyLog 객체로 변환
    // List<StudyLog>로 반환
}
```

## 3. JDBC 흐름

1. DB에 연결한다.
2. SQL 문장을 준비한다.
3. SQL을 실행한다.
4. DB가 돌려준 결과를 읽는다.
5. 결과를 Java 객체로 바꾼다.

## 4. JDBC와 ORM의 차이

JDBC:
- SQL을 직접 작성한다.
- SQL 실행 결과를 Java 객체로 직접 변환한다.
- Java와 DB 사이의 가장 기본적인 연결 방식이다.

ORM:
- 객체와 테이블을 매핑한다.
- SQL 작성을 일부 자동화한다.
- 대표적으로 JPA/Hibernate가 있다.

정리:
- JDBC는 ORM이 아니다.
- MyBatis나 JPA도 내부적으로는 JDBC를 통해 DB와 통신한다.

## 5. 헷갈리는 점

-