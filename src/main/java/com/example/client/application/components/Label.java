package com.example.client.application.components;


import com.example.client.application.utils.Console;
import com.google.gwt.dom.client.Document;

public class Label extends com.google.gwt.user.client.ui.Label {

    private Console console = new Console();

    public Label() {
        super(Document.get().createLabelElement());
    }

    public void setTarget(HasId target) {
        console.log("label.setTarget", target.toString());
        getElement().setAttribute("for", target.getId() );

    }
}
