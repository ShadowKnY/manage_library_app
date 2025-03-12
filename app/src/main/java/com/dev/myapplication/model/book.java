package com.dev.myapplication.model;

import android.net.Uri;

public class book {
    private String bookname;
    private String title;
    private String image;

    public book(String bookname, String title, String image) {
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

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }


}
