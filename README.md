# Spring Backend Study

Java 기반 백엔드와 풀스택 준비를 위한 개인 학습 레포입니다.

이 레포의 목적은 결과물을 빠르게 만드는 것이 아니라, 직접 구현하고 설명할 수 있는 힘을 쌓는 것입니다. Codex는 코드를 대신 작성하지 않고, 커리큘럼 설계, 단계별 점검, 코드 리뷰, 막혔을 때 힌트 제공 역할만 합니다.

## 학습 원칙

- 모르는 부분을 바로 복사해서 해결하지 않는다.
- 각 단계는 직접 구현한 뒤 기록한다.
- 단계 완료 시 Codex에게 코드 리뷰와 이해도 점검을 요청한다.
- 막혔을 때는 "정답 코드"보다 "힌트"를 먼저 요청한다.
- 기능이 돌아가는 것보다 왜 그렇게 만들었는지 설명할 수 있는지를 더 중요하게 본다.

## 커밋 메시지 규칙

개인 학습 레포이므로 커밋 기록을 나중에 읽기 쉽게 한국어로 작성한다.

형식:

```text
[태그] 변경 내용
```

자주 쓰는 태그:

- `[init]`: 레포 초기 설정, 프로젝트 시작점
- `[docs]`: 문서, 커리큘럼, 기록 양식 변경
- `[study]`: 학습 진행 기록 추가
- `[stage-01]`: 1단계 Java 콘솔 프로젝트 작업
- `[stage-02]`: 2단계 HTTP/REST API 설계 작업
- `[fix]`: 오타, 실수, 작은 수정

예시:

```text
[init] 백엔드 학습 로드맵 초기화
[study] 1단계 학습 로그 작성
[stage-01] StudyLog 기본 모델 구현
```

## 최종 목표

Study Tracker API를 만든다.

사용자가 로그인해서 공부 기록을 남기고, 카테고리/태그/날짜별로 조회하며, 공부 시간 통계를 확인할 수 있는 REST API를 구현한다.

최종적으로 포함할 개념:

- Java 객체지향 설계
- HTTP와 REST API
- Spring Boot
- Controller / Service / Repository 계층 분리
- SQL과 관계형 데이터베이스
- Spring Data JPA
- Validation과 예외 처리
- 인증/인가
- 테스트
- Swagger/OpenAPI
- 프론트엔드 연동 준비
- 배포

## 레포 사용법

1. `docs/curriculum.md`에서 현재 단계를 확인한다.
2. `docs/progress.md`에 진행 상태를 기록한다.
3. 각 단계 작업 전 `logs/`에 학습 로그를 남긴다.
4. 구현 코드는 단계별 폴더에 직접 작성한다.
5. 단계 완료 후 `docs/review-request-template.md` 형식으로 Codex에게 점검을 요청한다.

## 권장 폴더 구조

```text
.
├── README.md
├── docs
│   ├── curriculum.md
│   ├── progress.md
│   ├── understanding-map.md
│   └── review-request-template.md
├── logs
│   └── 000-template.md
├── stage-01-java-console
├── stage-02-http-rest
├── stage-03-spring-crud
├── stage-04-sql-db
├── stage-05-jpa
├── stage-06-validation-exception
├── stage-07-auth
├── stage-08-test
├── stage-09-frontend-ready-api
└── stage-10-deploy
```

## Codex에게 점검 요청하는 법

예시:

```text
[3단계 완료 점검 요청]

구현한 것:
- StudyLog 생성/조회/수정/삭제
- 메모리 Repository 사용
- Controller / Service / Repository 분리

봐줬으면 하는 것:
- 계층 분리가 맞는지
- DTO 설계가 어색하지 않은지
- 예외 처리를 어디까지 해야 하는지

직접 설명해볼 수 있는 것:
- Controller와 Service를 나눈 이유
- Repository가 필요한 이유
```

Codex는 기본적으로 코드를 대신 작성하지 않고, 리뷰와 힌트 중심으로 답합니다.
