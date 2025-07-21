class Book {
    String title;
    String author;
    int pages;

    public Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    void printInfo() {
        System.out.println("책 제목 : " + this.title);
        System.out.println("책 저자 : " + this.author);
        System.out.println("책 페이지 수 : " +this.pages);
    }
}

public class Main {
    public static void main(String[] args) {
        Book book = new Book("Hellospring","Gemini",150);

        book.printInfo();
    }
}