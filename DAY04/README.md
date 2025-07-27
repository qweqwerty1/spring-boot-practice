# DAY 04: 웹 통신의 기본, HTTP와 REST API (Summary for GitHub)

## 학습 목표

* 웹의 통신 방식인 HTTP의 요청(Request)/응답(Response) 모델을 이해한다.

* GET, POST, PUT, DELETE 등 핵심 HTTP 메서드의 역할과 용도를 설명할 수 있다.

* REST API의 기본 개념과 설계 원칙을 이해한다.

* 자원(Resource)을 중심으로 URI를 설계하고, HTTP 메서드로 행위를 표현하는 방법을 익힌다.

## 핵심 개념

* HTTP (HyperText Transfer Protocol)  
클라이언트와 서버가 웹에서 데이터를 주고받기 위한 통신 규약(약속).

* 클라이언트 (Client)  
서버에 데이터를 요청하는 쪽 (예: 웹 브라우저, 스마트폰 앱).

* 서버 (Server)  
클라이언트의 요청을 받아 처리하고 결과를 응답하는 쪽 (우리가 만들 스프링 부트 애플리케이션).

* HTTP 메서드 (HTTP Methods)  
요청의 목적과 종류를 나타내는 동사.

   * GET: 리소스 조회

   * POST: 리소스 생성

   * PUT: 리소스 전체 수정

   * DELETE: 리소스 삭제

* REST (REpresentational State Transfer)  
API를 설계하는 디자인 스타일 중 하나. URI는 '자원(명사)'을 표현하고, 그 자원에 대한 행위는 'HTTP 메서드'로 표현하는 것이 핵심 원칙이다.

* REST API 설계 예시 (To-Do List)
| 목적 | HTTP 메서드 | 주소 (URI) |
|:----:|:----------:|:--------:|
| To-Do 전체 조회 | GET | /todos |
| 특정 To-Do 조회 | GET | /todos/{id} |
| To-Do 생성 | POST | /todos |
| To-Do 수정 | PUT | /todos/{id} |
| To-Do 삭제 | DELETE | /todos/{id} |