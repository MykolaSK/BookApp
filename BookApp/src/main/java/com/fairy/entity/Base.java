package com.fairy.entity;

/**
 * Created by Mykola.Koshurenko on 11/21/13.
 */
public abstract class Base {
    protected String name;
    protected String description;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
