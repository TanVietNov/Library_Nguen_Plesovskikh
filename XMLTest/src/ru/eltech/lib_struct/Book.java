package ru.eltech.lib_struct;

public class Book {
    private short book_id;
    private String title;
    private String author;
    private float rating;
    private short year;
    private short pgs;
    private String annotation;
    private short amount;

    public int getBook_id() {
        return book_id;
    }

    public void setBook_id(short book_id) {
        this.book_id = book_id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public int getYear() {
        return year;
    }

    public void setYear(short year) {
        this.year = year;
    }

    public int getPgs() {
        return pgs;
    }

    public void setPgs(short pgs) {
        this.pgs = pgs;
    }

    public String getAnnotation() {
        return annotation;
    }

    public void setAnnotation(String annotation) {
        this.annotation = annotation;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(short amount) {
        this.amount = amount;
    }
}
