package com.javacoban.oop;

public class Book extends Document{
    private String authorName;
    private int numberOfPages;

    public Book(String documentCode, String imprint, int releaseNumber, String authorName, int numberOfPages) {
        super(documentCode, imprint, releaseNumber);
        this.authorName = authorName;
        this.numberOfPages = numberOfPages;
    }

    public Book(){

    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }
}
