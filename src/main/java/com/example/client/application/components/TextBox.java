package com.example.client.application.components;

public class TextBox extends com.google.gwt.user.client.ui.TextBox implements HasId {

    private String id;

    public void setHtmlId(String id) {
        this.id = id;
        getElement().setId(id);
    }

    public String getId() {
        return id;
    }
}
