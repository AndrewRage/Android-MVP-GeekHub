package com.github.andreyrage.mvpgeekhub.models;

/**
 * Created by rage on 06.03.17.
 */

public class Note {
    private Long id;
    private String text;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
