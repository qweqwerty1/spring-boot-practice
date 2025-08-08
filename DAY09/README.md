# 📌 DAY 09: 데이터베이스 연동 및 JPA Entity (Summary for GitHub)

## 학습 목표
* JPA와 H2 데이터베이스 사용을 위해 pom.xml에 의존성을 추가한다.
* application.properties에 데이터소스 및 H2 콘솔 설정을 추가한다.
* @Entity를 사용하여 데이터베이스 테이블과 매핑되는 JPA 엔티티 클래스를 만든다.
* @Id, @GeneratedValue로 테이블의 기본 키(PK)를 설정한다.
* @Table(name = ...)을 사용하여 데이터베이스 예약어와의 충돌을 피하고 테이블 이름을 명시적으로 지정한다.
* @Column(nullable = false)를 사용하여 데이터베이스 컬럼에 NOT NULL 제약조건을 추가한다.

## 핵심 개념
* **JPA (Jakarta Persistence API)**: 자바 객체와 관계형 데이터베이스 테이블 간의 매핑을 처리하는 기술 표준.
* **Entity (@Entity)**: 데이터베이스의 테이블에 직접 대응되는 자바 클래스.
* `@Column(nullable = false)`: 엔티티의 필드와 매핑되는 테이블의 컬럼에 NOT NULL 제약조건을 설정한다. 데이터베이스 레벨에서 데이터 무결성을 보장하는 역할을 한다.

## 오늘의 문제점 및 해결
* 문제점: 엔티티 클래스의 Setter 메서드에 파라미터가 누락되어, 객체에 값을 설정할 수 없는 오류가 있었음.
* 해결: setTitle(String title)과 같이 각 Setter 메서드에 올바른 타입의 파라미터를 추가하여 수정함.

## 최종 코드 예제
**Post.java (수정 완료)**

```Java
package com.example.hello_spring.domain;

import jakarta.persistence.*;

@Entity
// @Table(name = "posts") // Post는 예약어가 아니므로 @Table은 필수가 아닙니다.
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;

    private String content;

    // Getters
    public Long getId() { return id; }
    public String getTitle() { return title; }
    public String getContent() { return content; }

    // Setters
    public void setId(Long id) { this.id = id; }
    public void setTitle(String title) { this.title = title; }
    public void setContent(String content) { this.content = content; }
}
```