# Progress

마지막 업데이트: 2026-05-19

## 현재 상태

- 현재 단계: Stage 05 마무리
- 현재 목표: JDBC로 MySQL CRUD를 구현한 흐름을 정리하고, 반복되는 JDBC 코드를 MyBatis 학습으로 연결하기
- 장기 목표: 프론트엔드 경험을 바탕으로 Java/Spring 풀스택, SI, 전자정부프레임워크 계열 지원이 가능한 포트폴리오 만들기
- 현재 방식: Codex는 코드 작성 대신 커리큘럼, 리뷰, 힌트, 이해도 점검을 담당

## 단계별 진행 현황

| Stage | 주제 | 상태 | 완료일 | 메모 |
| --- | --- | --- | --- | --- |
| 01 | Java 콘솔 기초 | Completed | 2026-05 | 객체, List, 비즈니스 로직 분리 |
| 02 | HTTP와 REST API 설계 | Completed | 2026-05 | REST 요청/응답 설계 |
| 03 | Spring Boot 메모리 CRUD | Completed | 2026-05 | CRUD, Validation, Exception, 계층 분리 |
| 04 | SQL과 데이터베이스 기초 | Completed | 2026-05 | SQL 작성, H2 Console 실행, MySQL 설치 |
| 05 | JDBC로 DB 직접 연결 | In Progress |  | MySQL datasource, JDBC CRUD 구현 |
| 06 | MyBatis로 CRUD 구현 | Not Started |  | SI/전자정부 대비 핵심 |
| 07 | Spring MVC와 JSP | Not Started |  | 서버 렌더링 화면 |
| 08 | 로그인과 세션 | Not Started |  | 업무형 웹 기본 |
| 09 | 검색, 페이징, 업무형 CRUD | Not Started |  | 목록 화면 실무 패턴 |
| 10 | 전자정부프레임워크 감각 익히기 | Not Started |  | Spring MVC/JSP/MyBatis 구조 이해 |
| 11 | 포트폴리오 미니 프로젝트 | Not Started |  | 지원서용 결과물 |
| 12 | JPA 선택 확장 | Not Started |  | 선택 과정 |

상태 값:

- Not Started
- In Progress
- Review Requested
- Needs Revision
- Completed

## 현재까지 Stage 05에서 한 것

- JDBC와 ORM의 차이 정리
- `Connection`, `PreparedStatement`, `ResultSet` 역할 정리
- `executeQuery()`와 `executeUpdate()` 차이 이해
- MySQL Server 설치
- Spring Boot datasource를 MySQL로 전환
- `JdbcStudyLogRepository` 구현
- JDBC 전체 조회, 카테고리 조회, 단건 조회
- JDBC 생성, 수정, 삭제
- `executeUpdate()` 반환값으로 없는 id 수정/삭제 처리

## 다음 학습 목표

- JDBC 코드 중복 확인
- row를 `StudyLog`로 바꾸는 매핑 로직 분리
- JDBC가 왜 번거로운지 정리
- MyBatis가 어떤 반복을 줄여주는지 연결

## 최근 피드백 요약

- H2 메모리 DB는 학습용으로 좋지만 서버 재시작 시 데이터가 사라진다.
- MySQL을 연결하면 데이터가 영구 저장되고 Workbench로 직접 확인할 수 있다.
- `application.properties`는 DB 연결 정보를 정의하고, Spring Boot가 이를 바탕으로 `DataSource`를 만든다.
- Repository는 `DataSource`를 주입받아 `Connection`을 얻고 SQL을 실행한다.
- `executeUpdate()`는 SQL 실행 성공 여부가 아니라 영향을 받은 row 수를 확인하는 데 중요하다.

## 다음 평가 때 Codex가 확인할 것

- JDBC CRUD 흐름을 설명할 수 있는지
- `executeQuery()`와 `executeUpdate()`를 구분할 수 있는지
- `ResultSet`을 객체로 변환하는 흐름을 이해했는지
- 반복되는 JDBC 코드가 무엇인지 말할 수 있는지
- MyBatis가 왜 필요한지 본인 말로 설명할 수 있는지
