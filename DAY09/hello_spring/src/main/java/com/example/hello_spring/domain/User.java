package com.example.hello_spring.domain;

import jakarta.persistence.*;

@Entity // 이 클래스는 DB 테이블과 매핑되는 JPA 엔티티임을 선언합니다.
@Table(name = "users")
public class User {

    @Id // 이 필드가 테이블의 기본 키(Primary Key, PK)임을 나타냅니다.
    @GeneratedValue(strategy = GenerationType.IDENTITY) // DB가 ID를 자동으로 생성하도록 설정합니다.
    private Long id;

    private String username;

    private String email;

    // Getters and Setters...
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
}