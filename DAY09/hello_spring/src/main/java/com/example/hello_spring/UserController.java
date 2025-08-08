package com.example.hello_spring;

import com.example.hello_spring.dto.PostDto;
import com.example.hello_spring.dto.UserDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @PostMapping("/users")
    public String createUser(@RequestBody UserDto userDto) {
        // @RequestBody가 JSON 데이터를 UserDto 객체로 변환해줍니다.
        System.out.println("전달받은 유저 이름: " + userDto.getUsername());
        System.out.println("전달받은 이메일:" + userDto.getEmail());

        return "유저 " + userDto.getUsername() + " 생성 완료!";
    }

    @PostMapping("/posts")
    public String createPost(@RequestBody PostDto postDto) {
        System.out.println("전달받은 제목: " + postDto.getTitle() +" 전달받은 내용: " + postDto.getContent());

        return "Post titled '" + postDto.getTitle() + "' created successfully!";
    }
}
