# 📌 DAY 07: 클라이언트 데이터 받기 (DTO, @PostMapping) (Summary for GitHub)

## 학습 목표

* DTO(Data Transfer Object)의 개념과 역할을 이해하고 직접 만들 수 있다.
* HTTP POST 요청을 처리하기 위해 `@PostMapping` 어노테이션을 사용한다.
* 요청 본문(Request Body)에 담긴 JSON 데이터를 자바 객체(DTO)로 변환하기 위해 `@RequestBody` 어노테이션을 사용한다.
* Postman과 같은 API 클라이언트를 사용하여 POST 요청을 테스트한다.

## 핵심 개념
* **DTO (Data Transfer Object)**  
계층 간(특히 클라이언트-서버 간) 데이터를 주고받기 위해 사용하는 전용 객체. 관련된 데이터들을 하나의 '바구니'처럼 묶어서 깔끔하게 전달하는 역할을 한다.

* `@PostMapping`  
HTTP POST 메서드 요청을 처리하는 API 엔드포인트를 지정하는 어노테이션. 주로 새로운 리소스(데이터)를 생성하는 기능에 사용된다.

* `@RequestBody`  
HTTP 요청의 본문(Body)에 담겨 오는 데이터를 자바 객체로 변환(역직렬화, Deserialization)해 주는 매우 중요한 어노테이션. 클라이언트가 보낸 JSON 데이터를 우리의 DTO 객체에 자동으로 매핑해준다.

* **API 클라이언트 (Postman)**  
웹 브라우저 주소창만으로는 테스트하기 힘든 POST, PUT 등의 요청을 보내기 위한 전문 도구. 요청 메서드, URL, 헤더, 본문 등을 자유롭게 구성하여 서버에 전송하고 응답을 확인할 수 있다.

## 최종 코드 예제

**PostDto.java** 

```Java
package com.example.hello_spring.dto;

public class PostDto {
private String title;
private String content;

    // Getters and Setters ...
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
    public String getContent() { return content; }
    public void setContent(String content) { this.content = content; }
}
```

***UserController.java (추가된 메서드)***

```Java
// ...
import com.example.hello_spring.dto.PostDto;

@RestController
public class UserController {

    // ... 기존 createUser 메서드 ...

    @PostMapping("/posts")
    public String createPost(@RequestBody PostDto postDto) {
        System.out.println("전달받은 제목: " + postDto.getTitle());
        System.out.println("전달받은 내용: " + postDto.getContent());

        return "Post titled '" + postDto.getTitle() + "' created successfully!";
    }
}
```