package org.example.chapter7.array;

public class Book {
    private String bookName;
    private String author;

    public Book() {} // default

    public Book(String bookName, String author){
        this.bookName = bookName;
        this.author = author;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void showBookInfo(){
        System.out.println(bookName + ", " + author);
    }
}
