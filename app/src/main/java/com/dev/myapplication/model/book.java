package com.dev.myapplication.model;

public class book {
    private String bookname;
    private String title;
    private int image;

    public book(String bookname, String title, int image) {
        this.bookname = bookname;
        this.title = title;
        this.image = image;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }


}
