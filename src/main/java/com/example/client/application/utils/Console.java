package com.example.client.application.utils;


public class Console {

    public native void log(String... toLog) /*-{
        console.log(toLog);
    }-*/;
}
