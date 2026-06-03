# Understanding Map

이 문서는 학습자의 이해도를 계속 누적해서 기록하기 위한 파일입니다.

점검 기준:

- 0: 모름
- 1: 설명을 들으면 따라갈 수 있음
- 2: 예제를 보고 직접 변형할 수 있음
- 3: 혼자 구현하고 설명할 수 있음
- 4: 다른 사람 코드도 리뷰할 수 있음

## Java

| 개념 | 현재 점수 | 근거 | 다음 목표 |
| --- | ---: | --- | --- |
| class / object | 3 | StudyLog, AppUser, DTO 직접 작성 | 도메인 책임 더 명확히 나누기 |
| constructor | 3 | 필수값 검증, 기본 생성자 차이 이해 | DTO/도메인 생성 목적 구분 |
| collection | 3 | `List`, `ArrayList`, `List.of` 사용 | `Map`과 stream 기초 확장 |
| enum | 3 | StudyCategory, 정렬 enum 사용 | DB 값과 enum 매핑 안정화 |
| exception | 2 | custom exception, 404, 검증 실패 경험 | 전역 예외 처리 보강 |
| package design | 3 | controller/service/mapper/dto/domain 분리 | 기능 단위 패키지 구조 비교 |

## Web / HTTP

| 개념 | 현재 점수 | 근거 | 다음 목표 |
| --- | ---: | --- | --- |
| HTTP method | 3 | REST API와 JSP form GET/POST 차이 이해 | method override와 REST 관례 비교 |
| status code | 2 | 201, 404, 405, login redirect 경험 | MVC redirect와 REST status 구분 |
| JSON | 2 | REST API request/response DTO 경험 | API 문서화와 에러 응답 정리 |
| REST API | 3 | StudyLog CRUD API 설계/구현 | 사용자 인증 API와 비교 |
| MVC form | 3 | JSP form submit, redirect, CSRF 경험 | PRG 패턴 더 명확히 설명 |

## Spring

| 개념 | 현재 점수 | 근거 | 다음 목표 |
| --- | ---: | --- | --- |
| Controller | 3 | REST Controller, MVC Controller 모두 작성 | 요청/응답 책임만 남기기 |
| Service | 3 | StudyLog, Signup 로직 분리 | transaction 필요 지점 이해 |
| Repository / Mapper | 3 | Memory, JDBC, MyBatis Mapper 경험 | Mapper와 Repository 용어 차이 정리 |
| DI | 3 | `@Service`, `@Mapper`, `@Bean` 생성자 주입 이해 | Bean 충돌/스캔 범위 이해 |
| Validation | 3 | `@Valid`, `BindingResult`, `@NotBlank`, `@Size` 사용 | 검증 메시지와 i18n 확장 |
| Spring Security | 3 | SecurityFilterChain, 로그인, 로그아웃, 권한, CSRF | DB 권한 분리와 소유권 처리 |

## Database

| 개념 | 현재 점수 | 근거 | 다음 목표 |
| --- | ---: | --- | --- |
| SQL CRUD | 3 | study_logs/users DDL과 CRUD SQL 작성 | JOIN과 transaction 확장 |
| table design | 3 | study_logs, users 설계 | 사용자-기록 관계 설계 |
| JDBC | 3 | Connection, PreparedStatement, ResultSet 반복 경험 | DataSource와 pool 개념 정리 |
| MyBatis | 3 | XML Mapper, 동적 SQL, resultMap, binding 사용 | 복잡한 조건과 join resultMap |
| join | 1 | 아직 본격 적용 전 | users와 study_logs 연결 |
| aggregate query | 2 | count, totalPages, 카테고리 합계 경험 | 통계 화면으로 확장 |

## Security

| 개념 | 현재 점수 | 근거 | 다음 목표 |
| --- | ---: | --- | --- |
| authentication | 3 | 세션 로그인과 Spring Security 로그인 비교 | 인증 객체를 Controller에서 활용 |
| authorization | 3 | USER/ADMIN 삭제 권한 제한 | 사용자별 데이터 소유권 적용 |
| password hashing | 3 | BCrypt 저장/검증 경험 | 비밀번호 정책, 재설정 이해 |
| CSRF | 3 | login/logout/delete/signup form 토큰 적용 | REST API와 CSRF 적용 차이 |

## Review History

- 2026-06-03: Stage 11 완료. DB 기반 로그인, 회원가입, Service 분리까지 구현하고 설명 가능.
