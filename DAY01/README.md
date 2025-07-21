# DAY 01: Java 기초 및 객체 지향 첫걸음 (Summary for GitHub)

## 1. 학습 목표

* 자바의 기본 문법인 변수, 조건문, 반복문을 이해하고 사용한다.

* **객체 지향 프로그래밍(OOP)**의 핵심 개념인 클래스와 객체의 관계를 이해한다.

* 클래스로부터 객체를 생성하고, 객체의 속성을 다루고 행동(메서드)을 실행하는 방법을 익힌다.

## 2. 주요 개념

* 변수 (Variable): 데이터를 저장하기 위한 메모리 공간. (예: int, String)

* 조건문 (If-else): 특정 조건의 참/거짓에 따라 프로그램의 실행 흐름을 제어.

* 반복문 (For): 정해진 횟수나 조건 동안 특정 코드를 반복 실행.

* 클래스 (Class): 객체를 만들기 위한 설계도. 객체의 속성(데이터)과 행동(메서드)을 정의. (붕어빵 틀)

* 객체 (Object): 클래스라는 설계도를 바탕으로 메모리에 실체화된 것. (붕어빵)

* 메서드 (Method): 클래스에 정의된 객체의 고유한 행동 또는 기능.

* 인스턴스 (Instance): 클래스로부터 객체를 만드는 과정을 '인스턴스화'라고 하며, 만들어진 객체를 '인스턴스'라고도 부른다. (예: myRobot은 Robot 클래스의 인스턴스)

## 3. 코드 예제

예제 1: 기본 문법

```JAVA
public class BasicSyntax {
    public static void main(String[] args) {
        // 변수 선언
        String message = "Hello, Java!";
        int count = 3;

        // 조건문
        if (count > 0) {
            System.out.println("카운트는 0보다 큽니다.");
        }

        // 반복문
        for (int i = 0; i < count; i++) {
            System.out.println((i + 1) + "번째 메시지: " + message);
        }
    }
}
```

예제 2: 클래스와 객체 (DAY 01 과제)

```JAVA
// Book.java
class Book {
    String title;
    String author;
    int pages;

    // 생성자: 객체가 생성될 때 호출되며, 속성을 초기화하는 역할을 합니다.
    public Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    // 메서드: 책 정보를 출력하는 기능
    void printInfo() {
        System.out.println("책 제목 : " + this.title);
        System.out.println("책 저자 : " + this.author);
        System.out.println("책 페이지 수 : " + this.pages);
    }
}

// Main.java
public class Main {
    public static void main(String[] args) {
        // 'Book' 클래스(설계도)로 'myBook' 객체(실체)를 생성합니다.
        Book myBook = new Book("Hello Spring", "Gemini", 150);

        // 객체의 메서드를 호출합니다.
        myBook.printInfo();
    }
}
```