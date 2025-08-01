# 📌 DAY 06: 동적인 API 만들기 (Summary for GitHub)

## 학습 목표
* URL 경로의 일부를 변수로 사용하는 **@PathVariable**을 이해하고 적용한다.
* URL의 쿼리 스트링으로 데이터를 전달받는 **@RequestParam**을 이해하고 적용한다.
* 하나의 API 메서드에서 @PathVariable과 @RequestParam을 함께 사용해 복합적인 요청을 처리한다.
* @RequestParam의 required, defaultValue 속성을 사용해 선택적인 파라미터를 처리한다.

## 핵심 개념
* @PathVariable: URL 경로 자체에 포함된 값을 변수로 받아올 때 사용합니다. 특정 리소스를 명확하게 식별하는 데 주로 쓰입니다.
    * URL 예시: /users/123
    * 코드: @GetMapping("/users/{id}"), @PathVariable Long id
* @RequestParam: URL 경로 뒤 ? 다음에 오는 키-값 쌍(쿼리 파라미터)을 변수로 받아올 때 사용합니다. 데이터 정렬, 필터링, 검색 등 부가적인 옵션을 전달할 때 주로 쓰입니다.
    * URL 예시: /search?keyword=spring&page=1
    * 코드: @GetMapping("/search"), @RequestParam String keyword, @RequestParam int page

구분 : @PathVariable (경로 변수) @RequestParam (요청 파라미터)  
목적 : 특정 자원 식별 (주로 필수 정보) : 정렬, 필터링 등 부가적인 조건 (선택적)  
URL 형태 : 경로의 일부 (/posts/100)  ? 뒤의 키-값 (/posts?sort=newest)  
어노테이션 예시 : `@PathVariable Long postId` `@RequestParam String sort`  

## 최종 코드 예제

```Java
package com.example.hello_spring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    // ... 이전 코드 ...

    // 특정 게시글 조회 API
    @GetMapping("/posts/{postId}")
    public String getPostInfo(@PathVariable String postId) {
        return "Fetching blog post number: " + postId;
    }

    // 특정 게시글의 댓글 목록 조회 API (수정된 버전)
    @GetMapping("/posts/{postId}/comments")
    public String seeComment(
            @PathVariable String postId,
            @RequestParam(required = false, defaultValue = "latest") String sortBy,
            @RequestParam(required = false, defaultValue = "1") int page) {
        return "Viewing comments for post #"+ postId + ". (Sorted by: " + sortBy + ", Page: " + page + ")";
    }
}
```