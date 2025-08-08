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

    @GetMapping("/api/users")
    public List<UserDto> getAllUsers() {
        // 더미 데이터로 사용자 2명이 담긴 리스트를 생성
        List<UserDto> userList = new ArrayList<>();

        UserDto user1 = new UserDto();
        user1.setUsername("userA");
        user1.setEmail("UserA@example.com");
        userList.add(user1);

        UserDto user2 = new UserDto();
        user2.setUsername("userB");
        user2.setEmail("userB@example.com");
        userList.add(user2);

        return userList; // List<UserDto>를 반환하면 JSON 배열로 변환됨
    }
    @GetMapping("/api/users/{userId}")
    public UserDto getUser (@PathVariable String userId) {
        // 실제로는 DB에서 userId에 해당하는 사용자 정보를 조회하겠지만,
        // 지금은 더미(dummy) 데이터를 만들어서 반환해 보겠습니다.
        UserDto user = new UserDto();
        user.setUsername(userId);
        user.setEmail(userId + "@example.com");

        // UserDto 객체를 반환하면, 스프링이 자동으로 JSON으로 변환해줍니다.
        return user;
    }

    @GetMapping("/api/posts/{postId}")
    public PostDto getPost (@PathVariable String postId) {
        PostDto post = new PostDto();
        post.setTitle("hi " + postId);
        post.setContent(postId + " is good.");

        return post;
    }

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
