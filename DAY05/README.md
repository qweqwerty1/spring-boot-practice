# DAY 05: 첫 스프링 부트 애플리케이션 만들기 (Summary for GitHub)

## 학습 목표
* **스프링 이니셜라이저(Spring Initializr)**를 사용해 스프링 부트 프로젝트를 생성한다.

* 스프링 부트 프로젝트의 기본 구조와 시작점(@SpringBootApplication)을 이해한다.

* **@RestController**를 사용하여 API 요청을 처리하는 컨트롤러를 만든다.

* **@GetMapping**을 사용하여 특정 URL 경로와 메서드를 매핑한다.

* 내장된 웹 서버를 통해 애플리케이션을 실행하고, 웹 브라우저로 결과를 확인한다.

## 핵심 개념
* 스프링 이니셜라이저 (start.spring.io)  
필요한 설정과 의존성이 추가된 스프링 부트 프로젝트 뼈대를 자동으로 생성해주는 웹 도구.

* @SpringBootApplication  
스프링 부트의 핵심 설정 어노테이션. 이 어노테이션 하나로 자동 구성, 컴포넌트 스캔 등 수많은 기능이 활성화된다. 애플리케이션의 main 메서드가 있는 시작 클래스에 붙인다.

* 컨트롤러 (@RestController)  
HTTP 요청을 받아 해당 요청에 대한 비즈니스 로직 처리를 시작하는 "관문" 역할을 하는 클래스. @RestController가 붙은 클래스의 메서드는 반환 값을 바로 HTTP 응답 본문(response body)에 넣어 클라이언트에게 전달한다.

* 엔드포인트 매핑 (@GetMapping)  
HTTP GET 요청이 들어왔을 때 어떤 URL 경로를 어떤 자바 메서드가 처리할지 연결(매핑)해주는 어노테이션. 예를 들어 @GetMapping("/hello")는 /hello 경로로 들어오는 GET 요청을 담당한다.

* 내장 톰캣 (Embedded Tomcat)  
spring-boot-starter-web 의존성을 추가하면 톰캣(Tomcat)이라는 웹 서버가 내장되어 따라온다. 덕분에 별도의 서버 프로그램을 설치하고 설정할 필요 없이 main 메서드를 실행하는 것만으로 웹 서버를 띄울 수 있다.

## 최종 코드 예제

* HelloController.java

```Java
package com.example.hello_spring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello, Spring Boot!";
    }

    // 과제로 추가한 부분
    @GetMapping("/api/greeting")
    public String sayNtmy() {
        return "Nice to meet you!";
    }
}
```