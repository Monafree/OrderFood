package com.example.mona.orderfood;

/**
 * Created by mona on 16/4/19.
 */
public class Shop {

    public Shop(String title, String content, int show) {
        this.title = title;
        this.content = content;
        this.show = show;
    }

    private long id;
    private String title;
    private String content;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {

        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getShow() {
        return show;
    }

    public void setShow(int show) {
        this.show = show;
    }

    private int show;



}
