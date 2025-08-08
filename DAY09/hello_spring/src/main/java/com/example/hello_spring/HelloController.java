package com.example.hello_spring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello, Spring Boot!";
    }

    @GetMapping("/api/greeting")
    public String sayNtmy() {
        return "Nice to meet you!";
    }

    // ... 기존 코드 ...

    // {userId} 부분은 계속 바뀔 수 있는 변수임을 의미합니다.
    @GetMapping("/users/{userId}")
    public String getUserInfo(@PathVariable String userId) {
        // URL의 {userId} 자리에 있던 값이 String userId 변수로 들어옵니다.
        return "요청하신 유저의 아이디는 " + userId + " 입니다.";
    }

    // URL 예시:/search?keyword=java&page=1
    @GetMapping("/search")
    public String search(@RequestParam String keyword, @RequestParam int page) {
            // ?keyword= 의 값이 keyword 변수에, &page= 값이 page 변수에 들어옵니다.
            return "검색어: " + keyword + ", 페이지: " + page;
    }

    // 파라미터를 선택적으로 받고 싶을 때 (required = false)
    // URL 예시 : /products 또는 /products?category=books
    @GetMapping("/products")
    public String getProducts(@RequestParam(required = false, defaultValue = "전체") String category) {
        return category + " 카테고리의 상품을 조회합니다.";
    }

    // 아래부터 오늘의 과제
    @GetMapping("/posts/{postId}")
    public String getPostInfo(@PathVariable String postId) {
        return "Fetching blog post number: " + postId;
    }

    @GetMapping("/posts/{postId}/comments")
    public String seeComment(
            @PathVariable String postId,
            @RequestParam(required = false, defaultValue = "latest") String sortBy,
            @RequestParam(required = false, defaultValue = "1") int page
    ) {
        return "Viewing comments for post #"+ postId + ". (Sorted by: " + sortBy + ", Page: " + page + ")";
    }
}
