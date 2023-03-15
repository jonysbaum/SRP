package com.galvanize;

public class Book {

    private String title;
    private int year;
    private Author author;
    private Publisher publisher;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    public String getFormattedName() {
        return String.format(
                "%s (%s)\nWritten by %s\nPublished by %s",
                getTitle(),
                getYear(),
                author.getFormattedName(),
                publisher.getFormattedName()
        );
    }
}
