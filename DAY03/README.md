# DAY 03: 똑똑한 프로젝트 관리 비서, Maven & Gradle (Summary for GitHub)

---

## 학습 목표

* **빌드 도구(Build Tool)**의 역할과 필요성을 이해한다.

* 의존성(Dependency) 관리의 개념을 이해한다.

* 대표적인 빌드 도구인 Maven과 Gradle의 차이점을 안다.

* pom.xml (Maven) 파일의 기본 구조를 파악하고, 의존성을 어떻게 선언하는지 확인한다.

* **스프링 이니셜라이저(Spring Initializr)**를 통해 프로젝트를 생성하고 빌드 설정 파일이 어떻게 만들어지는지 경험한다.
---
## 핵심 개념
* 빌드 도구 (Build Tool)  
프로젝트의 생성, 테스트, 실행, 배포 등 전 과정을 자동화하는 도구. 특히, 프로젝트가 필요로 하는 외부 라이브러리(의존성)를 관리하는 역할을 핵심적으로 수행한다.


* 의존성 (Dependency)  
내 프로젝트가 정상적으로 동작하기 위해 필요한 외부 라이브러리나 모듈. 빌드 도구는 이러한 의존성을 자동으로 다운로드하고 프로젝트에 연결해 준다.


* Maven (pom.xml)  
XML을 기반으로 프로젝트의 정보를 정의하고 의존성을 관리하는 빌드 도구. pom.xml이라는 설정 파일을 사용하며, 안정적이고 오랫동안 널리 사용되어 왔다.


* Gradle (build.gradle)  
Groovy 또는 Kotlin 같은 프로그래밍 스크립트를 기반으로 하는 빌드 도구. Maven보다 유연하고 빌드 속도가 빠르다는 장점이 있다.


* 스프링 이니셜라이저 (start.spring.io)  
웹 UI를 통해 간단한 클릭만으로 스프링 부트 프로젝트의 기본 구조와 빌드 설정 파일(pom.xml 또는 build.gradle)을 자동으로 생성해 주는 도구.

---
## 최종 pom.xml 예제 (스프링 이니셜라이저 생성)
DAY 03 과제를 통해 생성한 pom.xml 파일입니다. 이 파일은 스프링 부트 프로젝트의 표준적인 구성을 잘 보여줍니다.

```XML
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
<modelVersion>4.0.0</modelVersion>

    <parent>
       <groupId>org.springframework.boot</groupId>
       <artifactId>spring-boot-starter-parent</artifactId>
       <version>3.5.4</version>
       <relativePath/> </parent>

    <groupId>com.example</groupId>
    <artifactId>demo</artifactId>
    <version>0.0.1-SNAPSHOT</version>
    <name>demo</name>
    <description>Demo project for Spring Boot</description>
    
    <properties>
       <java.version>24</java.version>
    </properties>
    
    <dependencies>
       <dependency>
          <groupId>org.springframework.boot</groupId>
          <artifactId>spring-boot-starter-data-jpa</artifactId>
       </dependency>
       <dependency>
          <groupId>org.springframework.boot</groupId>
          <artifactId>spring-boot-starter-web</artifactId>
       </dependency>
       <dependency>
          <groupId>org.projectlombok</groupId>
          <artifactId>lombok</artifactId>
          <optional>true</optional>
       </dependency>
       <dependency>
          <groupId>org.springframework.boot</groupId>
          <artifactId>spring-boot-starter-test</artifactId>
          <scope>test</scope>
       </dependency>
    </dependencies>

    <build>
       <plugins>
          <plugin>
             <groupId>org.springframework.boot</groupId>
             <artifactId>spring-boot-maven-plugin</artifactId>
          </plugin>
       </plugins>
    </build>

</project>
```