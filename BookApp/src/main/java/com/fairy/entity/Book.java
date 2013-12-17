package com.fairy.entity;

import java.util.List;

/**
 * Created by Mykola.Koshurenko on 11/21/13.
 */
public class Book extends Base {

    private List<Page> pages;

    public Book(List<Page> pages) {
        super();
        this.pages = pages;
    }

    public List<Page> getPages() {
        return pages;
    }

    public void setPages(List<Page> pages) {
        this.pages = pages;
    }
}
