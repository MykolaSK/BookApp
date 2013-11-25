package com.fairy.entity;

/**
 * Created by Mykola.Koshurenko on 11/21/13.
 */
public class Page extends Base {

    private Integer resPageImage;
    private Integer resText;

    public Page(int resImage, int resText) {
        super();
        this.resPageImage = resImage;
        this.resText = resText;
    }

    public Integer getPage() {
        return resPageImage;
    }

    public void setPage(Integer page) {
        this.resPageImage = page;
    }

    public Integer getResText() {
        return resText;
    }

    public void setResText(Integer resText) {
        this.resText = resText;
    }
}
