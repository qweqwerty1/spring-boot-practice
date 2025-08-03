# 📌 DAY 08: 구조화된 데이터(JSON) 반환하기 (Summary for GitHub)

## 학습 목표
* @RestController가 자바 객체를 JSON으로 자동 변환(직렬화)하는 원리를 이해한다.
* API 엔드포인트에서 단일 DTO 객체를 반환하여 JSON 객체로 응답하는 방법을 익힌다.
* API 엔드포인트에서 DTO의 리스트(List<DTO>)를 반환하여 JSON 배열로 응답하는 방법을 익힌다.
* 프론트엔드와 통신하는 실제 API의 응답 형식을 직접 구현한다.

## 핵심 개념
* JSON (JavaScript Object Notation)  
현대 웹에서 데이터를 주고받을 때 가장 널리 사용되는 표준 데이터 형식. {"key": "value"} 형태의 객체와 [{"key1": "value1"}, {"key2": "value2"}] 형태의 배열로 이루어져 있다.

* 직렬화 (Serialization)  
서버의 메모리에서 사용되던 자바 객체를 클라이언트가 이해할 수 있는 형태(JSON 문자열 등)로 변환하는 과정. @RestController는 이 과정을 자동으로 처리해준다.

* 객체 반환 → JSON 객체  
컨트롤러 메서드의 반환 타입을 DTO와 같은 자바 객체로 지정하면, 스프링 부트가 해당 객체의 필드와 값을 JSON 객체 {}로 변환하여 응답한다.

* 리스트 반환 → JSON 배열  
메서드의 반환 타입을 List<DTO> 와 같이 리스트로 지정하면, 스프링 부트가 리스트의 각 객체를 JSON 객체로 변환하고, 이를 전체 JSON 배열 []로 감싸서 응답한다.

## 최종 코드 예제
**ApiController.java**

```Java

package com.example.hello_spring;

import com.example.hello_spring.dto.PostDto;
import com.example.hello_spring.dto.UserDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ApiController {

    // ... user 관련 메서드 ...

    // 특정 게시글 조회 (단일 JSON 객체 반환)
    @GetMapping("/api/posts/{postId}")
    public PostDto getPost(@PathVariable String postId) {
        PostDto post = new PostDto();
        post.setTitle("hi " + postId);
        post.setContent(postId + " is good.");
        return post;
    }

    // 모든 게시글 조회 (JSON 배열 반환)
    @GetMapping("/api/posts")
    public List<PostDto> getAllPosts() {
        List<PostDto> postList = new ArrayList<>();
        PostDto post1 = new PostDto();
        post1.setTitle("hi gemini");
        post1.setContent("gemini is good");
        postList.add(post1);

        PostDto post2 = new PostDto();
        post2.setTitle("bye gemini");
        post2.setContent("gemini is gone");
        postList.add(post2);

        return postList;
    }
}
```
