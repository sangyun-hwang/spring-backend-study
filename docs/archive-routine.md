# Learning Archive Routine

이 문서는 `spring-backend-study`에서 공부하면서 생긴 질문을 `learning-archive`에 정리하는 루틴입니다.

참고 레포:

- https://github.com/sangyun-hwang/learning-archive

## 목적

코딩 레포에는 실제 실습 코드와 진행 상황을 남기고, `learning-archive`에는 개념 질문과 이해 내용을 정리한다.

분리 기준:

- `spring-backend-study`: 직접 작성한 코드, 단계별 과제, 리뷰 요청, 진행 상태
- `learning-archive`: 개념 정리, 질문과 답변, 헷갈렸던 표현, 나중에 다시 볼 설명

## 기록 타이밍

아래 상황이 생기면 학습 아카이브에 기록한다.

- 처음 듣는 개념을 질문했을 때
- 기존에 알던 개념과 Java/Spring의 차이를 알게 되었을 때
- IntelliJ, Git, Java 문법처럼 반복해서 헷갈릴 수 있는 설정을 해결했을 때
- 한 단계가 끝났고, 배운 내용을 말로 정리할 수 있을 때

## 권장 위치

`learning-archive`에는 아래 위치를 권장한다.

```text
study/Java Spring Backend/
```

파일명은 날짜와 주제를 함께 적는다.

```text
2026-05-08-java-arraylist.md
2026-05-08-java-class-final.md
2026-05-08-intellij-java-setup.md
```

## 기록 포맷

```md
# 주제

날짜: YYYY-MM-DD
분류: Java / Spring / IntelliJ / Git / Backend
상태: 이해 중 / 정리 완료 / 다시 볼 것

## 질문

처음에 궁금했던 내용을 적는다.

## 짧은 답

한두 문장으로 결론을 적는다.

## 내가 이해한 내용

- 내 말로 다시 설명한다.
- 예시는 작게 적는다.
- 아직 헷갈리는 부분은 숨기지 않고 적는다.

## 예시 코드

```java
// 필요한 경우에만 짧게 작성
```

## 다시 볼 포인트

- 나중에 헷갈릴 만한 점
- 다음 단계에서 연결되는 개념
```

## 질문 기록 예시

```md
# 배열과 ArrayList의 차이

날짜: 2026-05-08
분류: Java
상태: 이해 중

## 질문

`int number[]` 같은 배열은 배웠는데 `ArrayList`는 무엇인가?

## 짧은 답

배열은 길이가 고정된 기본 자료구조이고, `ArrayList`는 크기가 자동으로 늘어나는 목록 객체다.

## 내가 이해한 내용

- 배열은 만들 때 크기를 정하면 기본적으로 그 크기를 바꾸기 어렵다.
- `ArrayList`는 `add()`로 값을 계속 추가할 수 있다.
- 객체 목록을 다룰 때는 `List<StudyLog>`처럼 많이 사용한다.

## 예시 코드

```java
List<StudyLog> logs = new ArrayList<>();
logs.add(log);
```

## 다시 볼 포인트

- 배열과 리스트의 차이
- `List<StudyLog>`에서 꺾쇠 안에 타입을 쓰는 이유
- `import java.util.List`가 필요한 이유
```

## Codex와 함께 쓰는 루틴

질문 후 아래처럼 요청한다.

```text
방금 질문한 내용을 learning-archive 포맷으로 정리해줘.
```

그러면 Codex는 다음 순서로 정리한다.

1. 질문의 핵심 개념을 한 줄로 제목화한다.
2. 짧은 답을 먼저 쓴다.
3. 내가 이해한 말로 다시 설명할 수 있게 정리한다.
4. 예시 코드는 최소한으로 넣는다.
5. `learning-archive`에 넣을 파일명까지 추천한다.

## 커밋 메시지

`learning-archive`에 기록할 때는 아래 형식을 권장한다.

```text
[study] Java ArrayList 개념 정리
[study] Java final 필드 개념 정리
[study] IntelliJ Java 실행 설정 정리
```
