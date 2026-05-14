# Curriculum

이 문서는 프론트엔드 경험을 가진 학습자가 Java/Spring 기반 백엔드와 풀스택 업무에 지원할 수 있도록 학습 방향을 기록하는 기준표입니다.

목표는 최신 기술만 빠르게 훑는 것이 아니라, 풀스택/SI/전자정부프레임워크 계열 업무에서 자주 만나는 Java 웹 개발 흐름을 직접 구현하고 설명할 수 있게 되는 것입니다.

## 최종 목표

프론트엔드 경험을 바탕으로 Java/Spring 백엔드, DB, JSP/Spring MVC 흐름까지 다룰 수 있다는 것을 보여주는 포트폴리오를 만든다.

최종 결과물은 `Study Tracker` 업무형 웹 애플리케이션으로 잡는다.

- REST API 기반 CRUD
- DB 기반 데이터 저장
- JSP 관리자 화면
- 로그인/세션
- 검색/페이징
- 게시판형 CRUD
- 간단한 통계
- README와 학습 기록

## 권장 환경

- Java 21
- Spring Boot 3.5.x
- Gradle
- H2, MySQL 또는 MariaDB
- IntelliJ IDEA
- Postman 또는 HTTP Client
- JSP / Thymeleaf 중 JSP 우선
- MyBatis 우선, JPA는 선택 확장

## Stage 01. Java 콘솔 기초

목표: Spring에 들어가기 전 객체, 메서드, 컬렉션, 책임 분리 감각을 잡는다.

학습 주제:

- class, object, constructor
- field, method
- `List`, `ArrayList`
- enum
- exception
- package 분리
- 책임을 가진 객체 설계

완료 기준:

- `StudyLog` 객체를 직접 만들 수 있다.
- 여러 학습 기록을 `List<StudyLog>`로 관리할 수 있다.
- 입력/출력과 비즈니스 로직을 분리할 수 있다.

## Stage 02. HTTP와 REST API 설계

목표: Spring 구현 전에 API가 어떤 요청과 응답을 가져야 하는지 설계한다.

학습 주제:

- HTTP method
- status code
- URL과 query parameter
- request body / response body
- JSON
- REST API 설계

완료 기준:

- `POST`, `GET`, `PATCH`, `DELETE` API를 설계할 수 있다.
- 성공/실패 status code를 설명할 수 있다.
- Postman으로 확인할 요청/응답 예시를 작성할 수 있다.

## Stage 03. Spring Boot 메모리 CRUD

목표: DB 없이 메모리 저장소로 Spring Boot CRUD API를 만들며 계층 구조를 익힌다.

학습 주제:

- Spring Boot 프로젝트 구조
- `@RestController`
- `@GetMapping`, `@PostMapping`, `@PatchMapping`, `@DeleteMapping`
- DTO
- validation
- custom exception
- `@RestControllerAdvice`
- Controller / Service / Repository 분리
- dependency injection

완료 기준:

- `StudyLog` CRUD API를 구현했다.
- Controller는 HTTP 요청/응답만 담당한다.
- Service는 기능 흐름과 비즈니스 로직을 담당한다.
- Repository는 데이터 저장과 조회를 담당한다.
- 없는 id 조회/수정/삭제 시 404 응답을 반환한다.
- 부분 수정 PATCH에서 기존 값을 유지할 수 있다.

## Stage 04. SQL과 데이터베이스 기초

목표: 메모리 `List` 대신 실제 DB가 왜 필요한지 이해하고 SQL로 데이터를 직접 다룬다.

학습 주제:

- DB, table, row, column
- primary key
- column type
- `CREATE TABLE`
- `INSERT`, `SELECT`, `UPDATE`, `DELETE`
- `WHERE`, `ORDER BY`
- `COUNT`, `GROUP BY`

튜토리얼 목표:

- `study_logs` 테이블 설계
- SQL로 CRUD 직접 실행
- 카테고리별 학습 시간 합계 쿼리 작성

완료 기준:

- 테이블 DDL을 직접 작성할 수 있다.
- CRUD SQL을 직접 작성할 수 있다.
- 메모리 Repository와 DB 저장 방식의 차이를 설명할 수 있다.

## Stage 05. JDBC로 DB 직접 연결

목표: Spring이 도와주기 전에 Java가 DB와 어떻게 대화하는지 이해한다.

학습 주제:

- JDBC
- connection
- prepared statement
- result set
- SQL injection 기초
- DB 연결 설정

튜토리얼 목표:

- `StudyLogRepository`의 메모리 `List`를 JDBC 기반 DB 조회로 교체
- `save`, `findAll`, `findById`, `update`, `delete`를 SQL로 구현

완료 기준:

- Java 코드에서 SQL을 실행할 수 있다.
- `ResultSet`을 `StudyLog` 객체로 변환할 수 있다.
- JDBC 코드가 왜 반복적이고 불편한지 설명할 수 있다.

## Stage 06. MyBatis로 CRUD 구현

목표: SI/전자정부프레임워크 계열에서 자주 만나는 SQL Mapper 방식에 익숙해진다.

학습 주제:

- MyBatis
- mapper interface
- mapper XML
- parameter binding
- result mapping
- 동적 SQL 기초

튜토리얼 목표:

- JDBC Repository를 MyBatis Mapper로 교체
- StudyLog CRUD SQL을 mapper XML에 작성
- 카테고리 검색과 정렬 조건 추가

완료 기준:

- Mapper interface와 XML의 연결 관계를 설명할 수 있다.
- SQL이 어디에 있고 Java 코드는 어떤 역할을 하는지 설명할 수 있다.
- MyBatis가 JDBC의 어떤 반복을 줄여주는지 설명할 수 있다.

## Stage 07. Spring MVC와 JSP

목표: REST API뿐 아니라 서버 사이드 렌더링 방식의 Java 웹 화면을 만든다.

학습 주제:

- Spring MVC
- Controller에서 view 이름 반환
- Model
- JSP
- JSTL
- form submit
- redirect

튜토리얼 목표:

- StudyLog 목록 JSP 화면
- 등록 form
- 상세 화면
- 수정 form
- 삭제 버튼

완료 기준:

- Controller가 JSON이 아니라 JSP 화면을 반환할 수 있다.
- Model에 담은 데이터를 JSP에서 출력할 수 있다.
- form 요청으로 등록/수정/삭제를 수행할 수 있다.

## Stage 08. 로그인과 세션

목표: 업무형 웹 애플리케이션에서 자주 쓰는 로그인/세션 흐름을 구현한다.

학습 주제:

- 회원가입
- 로그인
- session
- password hashing
- interceptor 기초
- 인증과 인가 차이

튜토리얼 목표:

- 사용자 가입
- 로그인/로그아웃
- 로그인한 사용자만 StudyLog 관리
- 비로그인 접근 차단

완료 기준:

- 세션 기반 로그인 흐름을 설명할 수 있다.
- 인증과 인가의 차이를 설명할 수 있다.
- 사용자별 데이터 분리가 동작한다.

## Stage 09. 검색, 페이징, 업무형 CRUD

목표: SI/전자정부프레임워크 계열에서 자주 나오는 목록 화면 패턴을 익힌다.

학습 주제:

- 검색 조건
- pagination
- sorting
- query parameter 유지
- 목록/상세/등록/수정/삭제 화면 흐름

튜토리얼 목표:

- 카테고리 검색
- 제목 검색
- 페이지네이션
- 정렬
- 검색 조건 유지

완료 기준:

- 목록 화면에서 검색과 페이징이 함께 동작한다.
- URL query parameter와 화면 상태의 관계를 설명할 수 있다.
- 업무형 CRUD 화면 흐름을 구현할 수 있다.

## Stage 10. 전자정부프레임워크 감각 익히기

목표: 전자정부프레임워크/SI 프로젝트에서 낯설지 않게 구조와 용어를 익힌다.

학습 주제:

- 전자정부프레임워크 개요
- Spring MVC 기반 구조
- JSP + MyBatis 조합
- 공통 코드
- 공통 응답/예외
- 계층형 패키지 구조

튜토리얼 목표:

- 지금 만든 프로젝트를 전자정부/SI 스타일 구조와 비교
- Controller/Service/Mapper/JSP 흐름 정리
- 공통 코드 예시 추가

완료 기준:

- 전자정부프레임워크가 완전히 별개의 기술이 아니라 Spring MVC 기반 생태계라는 점을 설명할 수 있다.
- JSP/MyBatis/Spring MVC 조합의 요청 흐름을 설명할 수 있다.
- 지원서에서 SI/전자정부 관련 학습 경험을 구체적으로 말할 수 있다.

## Stage 11. 포트폴리오 미니 프로젝트

목표: 지원서에 적을 수 있는 작은 업무형 풀스택 프로젝트를 완성한다.

프로젝트 후보:

- 학습 기록 관리 시스템
- 업무 일지 관리 시스템
- 간단한 게시판 + 관리자 화면

필수 기능:

- 로그인/로그아웃
- 목록/상세/등록/수정/삭제
- 검색/페이징
- DB CRUD
- JSP 화면
- REST API 일부
- README

완료 기준:

- GitHub에 실행 방법이 정리되어 있다.
- 주요 기능을 스크린샷과 함께 설명할 수 있다.
- Controller / Service / Repository 또는 Mapper 구조를 설명할 수 있다.
- 프론트엔드 경험과 백엔드 학습 경험을 연결해서 자기소개서에 쓸 수 있다.

## Stage 12. JPA 선택 확장

목표: 신입 백엔드/스타트업 계열에서도 자주 보는 JPA의 기본 감각을 익힌다.

학습 주제:

- Entity
- JpaRepository
- transaction
- 영속성 컨텍스트 기초
- 연관관계 기초

완료 기준:

- MyBatis와 JPA의 차이를 대략 설명할 수 있다.
- Entity와 DTO를 구분할 수 있다.
- JPA는 선택 확장 단계로 다룬다.
