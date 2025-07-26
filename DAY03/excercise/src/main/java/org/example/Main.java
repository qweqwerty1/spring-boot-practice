package org.example;

import com.google.gson.Gson; // Gson 라이브러리를 import

// DAY 01에서 만들었던 Book 클래스가 있다고 가정
class Book {
    String title;
    String author;
    int pages;

    public Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }
}


public class Main {
    public static void main(String[] args) {
        // 1. Book 객체 생성
        Book myBook = new Book("Hello Spring", "Gemini", 150);

        // 2. Gson 객체 생성
        Gson gson = new Gson();

        // 3. toJson() 메서드를 사용해 Book 객체를 JSON 문자열로 변환
        String json = gson.toJson(myBook);

        // 4. 결과 출력
        System.out.println(json);
        // 출력 결과: {"title":"Hello Spring","author":"Gemini","pages":150}
    }
}