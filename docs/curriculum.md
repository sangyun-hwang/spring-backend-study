# Curriculum

이 문서는 프론트엔드 경험을 가진 학습자가 Java/Spring 기반 백엔드와 풀스택/SI/전자정부프레임워크 계열 업무에 지원할 수 있도록 학습 방향을 기록하는 기준표입니다.

목표는 최신 기술만 빠르게 훑는 것이 아니라, Java 웹 개발 흐름을 직접 구현하고 설명할 수 있게 되는 것입니다.

## 최종 목표

프론트엔드 경험을 바탕으로 Java/Spring 백엔드, DB, JSP/Spring MVC, 인증/인가 흐름까지 다룰 수 있다는 것을 보여주는 `Study Tracker` 업무형 웹 애플리케이션을 만든다.

최종 결과물에 포함할 기능:

- REST API 기반 CRUD
- MySQL 기반 데이터 저장
- MyBatis 기반 SQL Mapper
- JSP 관리자 화면
- Spring Security 로그인/회원가입
- 권한별 기능 제어
- 검색/페이징/정렬
- 사용자별 데이터 소유권
- 예외 처리와 공통 에러 흐름
- README와 학습 기록

## 권장 환경

- Java 21
- Spring Boot 3.5.x
- Gradle
- MySQL
- IntelliJ IDEA Community
- MySQL Workbench
- Postman 또는 브라우저 개발자 도구
- JSP / JSTL
- MyBatis 우선, JPA는 선택 확장

## Stage 01. Java 콘솔 기초

목표: Spring에 들어가기 전 객체, 메서드, 컬렉션, 책임 분리 감각을 잡는다.

완료 기준:

- `StudyLog` 객체를 직접 만들 수 있다.
- 여러 학습 기록을 `List<StudyLog>`로 관리할 수 있다.
- 입력/출력과 비즈니스 로직을 분리할 수 있다.

## Stage 02. HTTP와 REST API 설계

목표: Spring 구현 전에 API 요청과 응답을 설계한다.

완료 기준:

- `POST`, `GET`, `PATCH`, `DELETE` API를 설계할 수 있다.
- 성공/실패 status code를 설명할 수 있다.
- Postman으로 확인할 요청/응답 예시를 작성할 수 있다.

## Stage 03. Spring Boot 메모리 CRUD

목표: DB 없이 메모리 저장소로 Spring Boot CRUD API를 만들며 계층 구조를 익힌다.

완료 기준:

- `StudyLog` CRUD API를 구현한다.
- Controller / Service / Repository 역할을 설명할 수 있다.
- validation, DTO, exception, `@RestControllerAdvice`를 경험한다.

## Stage 04. SQL과 데이터베이스 기초

목표: 메모리 저장 대신 실제 DB가 왜 필요한지 이해하고 SQL로 데이터를 직접 다룬다.

완료 기준:

- 테이블 DDL을 직접 작성할 수 있다.
- CRUD SQL을 직접 작성할 수 있다.
- 메모리 저장 방식과 DB 저장 방식의 차이를 설명할 수 있다.

## Stage 05. JDBC로 DB 직접 연결

목표: Java가 DB와 직접 대화하는 방식을 이해한다.

완료 기준:

- Java 코드에서 SQL을 실행할 수 있다.
- `ResultSet`을 Java 객체로 변환할 수 있다.
- JDBC 코드가 왜 반복적이고 불편한지 설명할 수 있다.

## Stage 06. MyBatis로 CRUD 구현

목표: SI/전자정부프레임워크 계열에서 자주 만나는 SQL Mapper 방식에 익숙해진다.

완료 기준:

- Mapper interface와 XML의 연결 관계를 설명할 수 있다.
- `#{}`와 `${}`의 차이를 설명할 수 있다.
- 동적 SQL, `resultMap`, 동적 update를 사용할 수 있다.

## Stage 07. Spring MVC와 JSP

목표: REST API뿐 아니라 서버 사이드 렌더링 방식의 Java 웹 화면을 만든다.

완료 기준:

- Controller가 JSON이 아니라 JSP 화면을 반환할 수 있다.
- Model에 담은 데이터를 JSP에서 출력할 수 있다.
- form 요청으로 등록/수정/삭제를 수행할 수 있다.
- JSP form 검증 실패 처리를 할 수 있다.

## Stage 08. 세션 로그인과 Interceptor

목표: Spring Security 전에 직접 세션 로그인 흐름을 구현해 인증의 기본 구조를 이해한다.

완료 기준:

- `HttpSession` 기반 로그인/로그아웃을 설명할 수 있다.
- Interceptor로 공통 인증 체크를 분리할 수 있다.
- 인증과 인가의 차이를 설명할 수 있다.

## Stage 09. 검색, 페이징, 정렬

목표: 업무형 목록 화면에서 자주 나오는 검색 + 페이징 + 정렬 패턴을 익힌다.

완료 기준:

- MyBatis에서 `LIMIT`, `OFFSET`, `COUNT(*)`를 사용한다.
- 검색 조건과 정렬 조건을 페이지 이동 링크에 유지한다.
- 페이지 번호 표시 범위를 계산할 수 있다.

## Stage 10. Spring Security 인증/인가

목표: 직접 만든 세션 로그인 흐름을 Spring Security 표준 흐름으로 전환한다.

완료 기준:

- `SecurityFilterChain`을 설정할 수 있다.
- `UserDetailsService`, `PasswordEncoder`, BCrypt의 역할을 설명할 수 있다.
- 로그인/로그아웃을 Spring Security 방식으로 처리한다.
- `hasRole`, CSRF, JSP security taglib를 사용할 수 있다.

## Stage 11. DB 기반 로그인과 회원가입

목표: InMemory 사용자를 DB 기반 사용자로 전환하고 회원가입 흐름을 구현한다.

완료 기준:

- `users` 테이블을 설계하고 사용자 정보를 저장한다.
- MyBatis로 사용자를 username 기준 조회/저장한다.
- DB 기반 `UserDetailsService`를 구현한다.
- 회원가입에서 BCrypt 해시, 중복 username 체크, 입력 검증을 처리한다.
- 회원가입 로직을 Service로 분리한다.

## Stage 12. 예외 처리와 사용자별 데이터 소유권

목표: 로그인한 사용자와 데이터의 소유 관계를 연결하고, 예외 흐름을 더 실무적으로 정리한다.

학습 주제:

- 현재 로그인 사용자 조회
- `study_logs`와 `users` 관계 연결
- 내 학습 기록만 조회/수정/삭제
- 중복 가입 경쟁 상황 예외 처리
- MVC/JSP 에러 페이지와 REST 에러 응답 구분
- 공통 예외 처리

완료 기준:

- 로그인 사용자별로 데이터가 분리된다.
- 다른 사용자의 데이터 수정/삭제를 막을 수 있다.
- 주요 예외를 사용자가 이해할 수 있는 화면/응답으로 처리한다.

## Stage 13. 전자정부프레임워크/SI 구조 감각

목표: 지금 만든 프로젝트를 JSP + MyBatis + Spring MVC 기반 SI 구조와 연결해서 설명할 수 있게 한다.

학습 주제:

- 전자정부프레임워크 개요
- Spring MVC 기반 계층 구조
- JSP + MyBatis 조합
- 공통 코드, 공통 메시지
- 패키지 구조와 네이밍

완료 기준:

- 전자정부프레임워크가 Spring MVC 기반 생태계라는 점을 설명할 수 있다.
- JSP/MyBatis/Spring MVC 조합의 요청 흐름을 설명할 수 있다.
- 지원서에서 SI/전자정부 관련 학습 경험을 구체적으로 말할 수 있다.

## Stage 14. 포트폴리오 미니 프로젝트 정리

목표: 지원서에 적을 수 있는 작은 업무형 풀스택 프로젝트로 정리한다.

필수 산출물:

- 실행 방법 README
- 주요 기능 설명
- 화면 흐름 설명
- DB 스키마 설명
- 인증/인가 설명
- 트러블슈팅 기록
- 스크린샷

완료 기준:

- GitHub만 보고도 프로젝트 목적과 실행 방법을 이해할 수 있다.
- Controller / Service / Mapper / JSP / Security 흐름을 설명할 수 있다.
- 프론트엔드 경험과 백엔드 학습 경험을 연결해서 자기소개서에 쓸 수 있다.

## Stage 15. JPA 선택 확장

목표: MyBatis 기반 프로젝트 이후 JPA의 기본 감각을 선택적으로 익힌다.

학습 주제:

- Entity
- JpaRepository
- transaction
- 영속성 컨텍스트 기초
- MyBatis와 JPA 비교

완료 기준:

- MyBatis와 JPA의 차이를 대략 설명할 수 있다.
- Entity와 DTO를 구분할 수 있다.
- JPA는 선택 확장 단계로 다룬다.
